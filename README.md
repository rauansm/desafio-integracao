# 📽 Desafio Integrações

## 📑 Sobre o Projeto
Eu gostaria de sugestões de filmes em cartaz baseado no meu ânimo. O meu ânimo varia de acordo com a temperatura atual de onde estou. Siga as seguintes diretrizes para as sugestões:

- Se a temperatura está acima de 40 graus, sugira filmes de ação.
- Se a temperatura está entre 36 e 40 graus, está bem quente, então prefira filmes de comédia.
- Se a temperatura está entre 20 e 35 graus, está agradável, então sugira animações.
- Se a temperatura está entre 0 e 20 graus, está frio, então gostaria de ver filmes de suspense.
- Se a temperatura está abaixo de 0 grau, está um frio glacial, nesse caso, sugira documentários.

### Requisitos
- Crie uma API RESTful em Java para fornecer essas sugestões de filmes.
- Forneça um guia (Readme.md) explicando como utilizar a API.
- O desafio é opcionalmente aprimorado com testes unitários e documentação OpenAPI 3.0.
- Evite o uso de ifs/switch case na lógica de temperatura.

Você pode utilizar as seguintes APIs para obter os dados necessários:
- Obtenção do clima: https://openweathermap.org/api
- Obtenção de filmes: https://api.themoviedb.org

## 📂 Pré-Requisitos
- Java 17
- Maven

## 💻  Como Executar o Projeto
1. Clone o repositório: git clone https://github.com/rauansm/desafio-integracao
2. Executar a aplicação Spring Boot
3. O sistema estará rodando e acessível.

## Testando a Aplicação
- Importe a collection do Postman fornecida para testar as APIs.

[<img src="https://run.pstmn.io/button.svg" alt="Run In Postman" style="width: 128px; height: 32px;">](https://god.gw.postman.com/run-collection/30868128-10fcc4de-8c04-41ee-b50e-7cf09935dae9?action=collection%2Ffork&source=rip_markdown&collection-url=entityId%3D30868128-10fcc4de-8c04-41ee-b50e-7cf09935dae9%26entityType%3Dcollection%26workspaceId%3D6ced4b21-8a5f-447b-8899-8f2ca3d8893a)


