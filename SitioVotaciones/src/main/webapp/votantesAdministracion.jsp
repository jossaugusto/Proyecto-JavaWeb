<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous">
<title>Registrar votantes</title>
</head>
<body>

	<div class="container mt-5">
        <h3 class="text-center btn-warning">Registrar votantes</h3>
		
		<form action="" method="post" class="container-md mt-3">
			<div class="form-group">
            	<label for="nombreApellido">Nombres y Apellidos:</label>
            	<input class="form-control" id="nombreApellido" type="text" name="txtNombreApellido" required>
        	</div><br>
        	
        	<div class="form-group">
            	<label for="tipoUsuario">Tipo de usuario:</label>
            	<select id="tipoUsuario" name="cboTipoUsuario" class="form-select" required>
                	<option value="">Seleccione Tipo de usuario</option>
                	<option value="Docente">Docente</option>
                	<option value="Alumno">Alumno</option>
                	<option value="Personal Administrativo">Personal administrativo</option>
                	<option value="Personal de limpieza">Personal de limpieza</option>
                	<option value="Padre de familia">Padre de familia</option>
                	<option value="Tutor del alumno">Tutor del alumno</option>
            	</select>
        	</div><br>
        	
        	<div class="form-group">
            	<label for="correo">Correo electrónico:</label>
            	<input class="form-control" id="correo" type="email" name="txtCorreo" required>
        	</div><br>
        
        	<div class="form-group text-center">
    			<button type="submit" class="btn btn-primary w-10 " name="accion" value="registrar">Registrar</button>
			</div>
		</form>

		<div class="mt-5">
			<table class="table table-bordered table-striped">
				<thead>
					<tr>
						<th>Código</th>
						<th>Nombre</th>
						<th>Año estreno</th>
						<th>Autor</th>
						<th>País origen</th>
						<th>Idioma original</th>
						<th>Acciones</th>
					</tr>
				</thead>
				<tbody>
					<!-- Aquí irán los datos de la tabla -->
				</tbody>
			</table>
		</div>

	</div>

</body>
</html>
