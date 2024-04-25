-- creamos la bd
CREATE DATABASE Empresa_tuneza;
-- activamos la bd
USE Empresa_tuneza;

create table tb_clientes(
idcliente int not null primary key,
nombre varchar(15),
nom_apellido varchar(15),
direccion varchar(25),
telefono varchar(15),
Email varchar(25)
);

CREATE TABLE tb_conductores (
    idconductor INT PRIMARY KEY,
    Nombre VARCHAR(15),
    Apellido VARCHAR(25),
    Licencia VARCHAR(45),
    idcliente INT,
    idvehiculo int,
    CONSTRAINT fk_idcliente FOREIGN KEY (idcliente) REFERENCES tb_clientes(idcliente),
    CONSTRAINT fk_idconductor FOREIGN KEY (idvehiculo) REFERENCES tb_vehiculos(idvehiculo)
    
);
CREATE TABLE tb_vehiculos (
    idvehiculo INT AUTO_INCREMENT PRIMARY KEY,
    Marca VARCHAR(45) NOT NULL,
    Modelo VARCHAR(10),
    Placa VARCHAR(15)
);
