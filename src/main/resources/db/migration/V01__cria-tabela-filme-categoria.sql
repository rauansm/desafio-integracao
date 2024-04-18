create table filme_categoria (
id uuid not null,
categoria varchar(60) not null,
temperatura_minima double not null,
temperatura_maxima  double not null,

primary key (id));