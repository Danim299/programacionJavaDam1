drop database if exists futbol;
create database futbol;
use futbol;
create table equipos(
    ID int auto_increment not null,
    Nombre varchar(30) default null,
    Ciudad varchar(30) default null,
    primary key (ID)
)engine=innodb;
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 1','Ciudad 1');
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 2','Ciudad 2');
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 3','Ciudad 3');
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 4','Ciudad 4');
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 5','Ciudad 5');
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 6','Ciudad 6');
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 7','Ciudad 7');
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 8','Ciudad 8');
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 9','Ciudad 9');
INSERT INTO equipos (Nombre, Ciudad) VALUES ('Equipo 10','Ciudad 10');