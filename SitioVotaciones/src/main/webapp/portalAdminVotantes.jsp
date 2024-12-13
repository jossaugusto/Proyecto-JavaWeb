<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Portal Admin Votantes</title>
    <!-- Bootstrap -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body>
    <div class="container">
        <h3 class="text-center btn-warning py-3">Registro de Votantes</h3>
    </div>

    <!-- Formulario de Registro de Votantes -->
    <form action="" method="post" class="container-md mt-3">
        <div class="form-group">
            <label for="nombreApellido">Nombres y Apellidos:</label>
            <input class="form-control" id="nombreApellido" type="text" name="txtNombreApellido" required>
        </div><br>

        <div class="form-group">
            <label for="cargo">Cargo:</label>
            <select id="cargo" name="cboTipoVotante" class="form-select" required>
                <option value="">Tipo de Votante:</option>
                <option value="Docente">Docente</option>
                <option value="Alumno">Alumno</option>
                <option value="PesonalAdministrativo">Personal Administrativo</option>
                <option value="PersonalLimpieza">Personal de Limpieza</option>
                <option value="PadreFamilia">Padre de Familia</option>
                <option value="TutorAlumno">Tutor del Alumno</option>
            </select>
        </div><br>

        <div class="form-group">
            <label for="correoVota">Correo del Votante:</label>
            <input class="form-control" id="correoVota" type="email" name="txtCorreoVota" required>
        </div><br>

        <div class="form-group text-center">
            <button type="submit" class="btn btn-primary w-100">Registrar</button>
            <button type="submit" class="btn btn-primary w-100">Actualizar</button>
        </div>
    </form>

    <!-- Tabla de Votantes Registrados -->
    <div class="container mt-4">
        <table class="table table-bordered">
            <thead>
                <tr>
                    <th>ID Votante</th>
                    <th>ID Institución</th>
                    <th>Nombre y Apellido</th>
                    <th>Tipo Votante</th>
                    <th>Correo</th>
                    <th>Usuario Generado</th>
                    <th>Código Generado</th>
                    <th>Opciones</th>
                </tr>
            </thead>
            <tbody>
                <c:if test="${empty listaVotantes}">
                    <tr>
                        <td colspan="7" class="text-center">No hay votantes registrados.</td>
                    </tr>
                </c:if>

                <c:forEach var="votante" items="${listaVotantes}">
                    <tr>
                        <td>${votante.id}</td>
                        <td>${votante.idInstitucion}</td>
                        <td>${votante.nombreApellido}</td>
                        <td>${votante.tipoVotante}</td>
                        <td>${votante.correo}</td>
                        <td>${votante.usuarioGenerado}</td>
                        <td>
                            <a href="ServletVotante?accion=eliminar&id=${votante.id}" class="btn btn-danger">Eliminar</a>
                            <a href="ServletVotante?accion=actualizar&id=${votante.id}" class="btn btn-warning">Editar</a>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
