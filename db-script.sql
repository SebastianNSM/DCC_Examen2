drop database if exists examen2;
create database examen2;

use examen2;

drop table if exists t_guionista;
create table if not exists t_guionista (
    id int(11) not null auto_increment,
    nombre varchar(100) not null,
    direccion varchar(100) not null,
    email varchar(100) not null,
    fecha_nacimiento date not null,
    primary key (id)
) engine=innodb auto_increment=1 default charset=utf8;

drop table if exists t_actor;
create table if not exists t_actor (
    id int(11) not null auto_increment,
    nombre varchar(100) not null,
    genero varchar(100) not null,
    estatura int not null,
    color_ojos varchar(100) not null,
    color_pelo varchar(100) not null,
    complexion_corporal varchar(100) not null,
    fecha_nacimiento date not null,
    primary key (id)
) engine=innodb auto_increment=1 default charset=utf8;

drop table if exists t_guion;
create table if not exists t_guion (
    id int(11) not null auto_increment,
    id_guionista int(11) NOT NULL,
    nombre varchar(100) not null,
    genero varchar(100) not null,
    idea_central varchar(100) not null,
    primary key (id),
    CONSTRAINT fk_guionista_guion
    FOREIGN KEY(id_guionista) REFERENCES t_guionista(id)
) engine=innodb auto_increment=1 default charset=utf8;
