package com.desafio.indicadorfilmes.handler;

import lombok.Getter;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.time.LocalDateTime;
import java.util.Optional;

@Getter
@Log4j2
public class APIException extends RuntimeException {
	private HttpStatus statusException;
	private ErrorApiResponse bodyException;
	
	private APIException(HttpStatus statusException, String message, Exception e, ProblemType title) {
		super(message, e);
		this.statusException = statusException;
		this.bodyException = ErrorApiResponse.builder()
				.status(statusException.value())
				.type(title.getUri())
				.title(title.getTitle())
				.message(message)
				.description(getDescription(e))
				.timestamp(LocalDateTime.now())
				.build();}

		private APIException(HttpStatus statusException, String message, ProblemType title) {
			super(message);
			this.statusException = statusException;
			this.bodyException = ErrorApiResponse.builder()
					.status(statusException.value())
					.type(title.getUri())
					.title(title.getTitle())
					.message(message)
					.timestamp(LocalDateTime.now())
					.build();
		}

	public static APIException recursoNaoEncontrado(String message) {
		return new APIException(HttpStatus.NOT_FOUND, message, ProblemType.RECURSO_NAO_ENCONTRADO);
	}
	public static APIException build(String message,Exception e) {
		log.error("Exception: ", e);
		return new APIException(HttpStatus.INTERNAL_SERVER_ERROR, message, e ,ProblemType.ERRO_DE_SISTEMA);
	}
	public static APIException negocio(String message) {
		return new APIException(HttpStatus.BAD_REQUEST, message, ProblemType.ERRO_NEGOCIO);
	}

	private String getDescription(Exception e) {
		return Optional.ofNullable(e)
				.map(APIException::getMessageCause).orElse(null);
	}

	private static String getMessageCause(Exception e) {
		return e.getCause() != null ? e.getCause().getMessage() : e.getMessage();
	}
	
	

	public ResponseEntity<ErrorApiResponse> buildErrorResponseEntity() {
		return ResponseEntity
				.status(statusException)
				.body(bodyException);

	}
	
	private static final long serialVersionUID = 1L;
}
