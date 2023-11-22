create database db_empresa_divos;
use db_empresa_divos;
create table funcionarios (
id_funcionarios int auto_increment not null,
nome varchar(255) not null,
cargo varchar(255) not null, 
salario double not null,
departamento varchar(255),
primary key(id_funcionarios)

);

insert into funcionarios (id_funcionarios, nome, cargo, salario, departamento) values
(0, "Ryan", "Dev", 100000, "T.I"),
(0, "Loira", "Dev", 10000, "T.I"),
(0, "Igor", "Dev", 10500, "T.I"),
(0, "Luan", "Dev", 1000, "T.I");

create table departamento(
id_departamento int not null auto_increment,
nome varchar(255) not null,
sigla varchar(255) not null,

primary key (id_departamento)
);

insert into departamento (nome, sigla) values
("Desenvolvimento", "DEV"),
("Qualidade","QA"),
("Engenharia","ENG");

select * from funcionarios;