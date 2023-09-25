create table usuario (id number(19,0) generated as identity, email varchar2(255 char), nome varchar2(255 char), senha varchar2(255 char), primary key (id));

create table conta (id number(19,0) generated as identity, nome varchar2(255 char), ingredientes varchar2(255 char), modoPreparo varchar2(255 char), imagem varchar2(255 char),  primary key (id));