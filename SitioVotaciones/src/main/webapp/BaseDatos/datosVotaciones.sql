CREATE DATABASE votos;
USE votos;

-- Tabla para registrar instituciones
CREATE TABLE institucionRegistro (
    idInst INT AUTO_INCREMENT PRIMARY KEY,
    nombreApellidoUsua VARCHAR(100) NOT NULL,
    cargoUsua ENUM('Director', 'Subdirector', 'Experto en tecnología', 'Docente', 'Alumno', 'Decano', 'Soporte', 'Rector') NOT NULL,
    telefonoInst VARCHAR(20) NOT NULL,
    correoInst VARCHAR(100) NOT NULL CHECK (correoInst LIKE '%@%'),
    nombreInst VARCHAR(100) NOT NULL,
    codigoGeneradoAdmi VARCHAR(50) NOT NULL,
    usuarioGeneradoAdmi VARCHAR(50) NOT NULL
);

-- Tabla para registrar votantes
CREATE TABLE votanteRegis (
    idVota INT AUTO_INCREMENT PRIMARY KEY,
	idInst INT NOT NULL,
    nombreApellido VARCHAR(100) NOT NULL,
    tipoVota ENUM('Docente', 'Alumno', 'Personal administrativo', 'Personal de limpieza', 'Padre de familia', 'Tutor del alumno') NOT NULL,
    correoVota VARCHAR(100) NOT NULL CHECK (correoVota LIKE '%@%'),
    codigoGeneradoVota VARCHAR(50) NOT NULL,
    usuarioGeneradoVota VARCHAR(50) NOT NULL,
    FOREIGN KEY (idInst) REFERENCES institucionRegis(idInst)
);
