create database agenda;
use agenda;

create table usuario(
	id_usuario int auto_increment not null,
	pnome varchar(15) not null, 
    snome varchar(15) not null, 
	dataNasc varchar(10),
    logradouro varchar(50),
    numero bigint(3),
    bairro varchar(50),
    cidade varchar(150),
    estado varchar(150),
    celular varchar(16) not null,
	telefone varchar(16),
	email_principal varchar(50),
	email_alternativo varchar(50),
    PRIMARY KEY(id_usuario)
);
create table compromissos(
	id_compromissos int auto_increment not null,
    id_usuario int not null,
    titulo varchar(30) not null,
	descricao varchar(250),
	tipo varchar(40),
    local varchar(50),	
    data_compromisso date,
    hora_inicial varchar(15),
    hora_final varchar(15),
	PRIMARY KEY(id_compromissos),
    FOREIGN KEY(id_usuario) REFERENCES usuario (id_usuario)
);

create table login(
	id_usuario int,
	usuario varchar(50) not null,
    senha varchar(150) not null,
    flag int(2),
    FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario)
);
create table logs_login(
	id_log int auto_increment not null,
	id_usuario int,
    con int(2),
    PRIMARY KEY(id_log),
    FOREIGN KEY (id_usuario) REFERENCES usuario (id_usuario)
);

create table grupo(
	id_grupo int auto_increment not null,
    nomec varchar(50) not null,
    tipo varchar(50) not null,
	PRIMARY KEY(id_grupo)
);

create table contato(
	id_contato int auto_increment not null,
	pnome varchar(15) not null, 
    snome varchar(15) not null, 
	dataNasc varchar(10),
    logradouro varchar(50),
    numero bigint(3),
    bairro varchar(50),
    cidade varchar(150),
    estado varchar(150),
    celular varchar(16) not null,
	telefone varchar(16),
	email_principal varchar(50),
	email_alternativo varchar(50),
    id_grupo varchar(50), 
	PRIMARY KEY(id_contato)
);

create table contatocompromisso(
	id_contato int,
    id_compromissos int,
	FOREIGN KEY (id_contato) REFERENCES contato (id_contato),
    FOREIGN KEY (id_compromissos) REFERENCES compromissos(id_compromissos)
);
