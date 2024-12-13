<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap-icons/font/bootstrap-icons.css" rel="stylesheet">

<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous">
<title>Portal de Ingreso</title>
<style>
    .settings-icon {
        position: absolute;
        top: 20px;
        right: 20px;
        font-size: 1.5rem;
        cursor: pointer;
    }
    .dropdown-menu {
        min-width: 150px;
    }
    .login-form {
        background-color: #fff;
        border-radius: 8px;
        padding: 20px;
        box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
    }
    body {
        background: url('Imagenes/fondo.jpg') no-repeat center center fixed;
        background-size: cover;
    }
</style>
</head>
<body>
    <!-- Ícono de configuración con menú desplegable -->
    <div class="position-relative">
        <div class="dropdown">
            <i class="bi bi-gear settings-icon" id="settingsDropdown" data-bs-toggle="dropdown" aria-expanded="false"></i>
            <ul class="dropdown-menu dropdown-menu-end" aria-labelledby="settingsDropdown">
                <li><a class="dropdown-item" href="#" target="_blank">Facebook</a></li>
                <li><a class="dropdown-item" href="#" target="_blank">Twitter</a></li>
                <li><a class="dropdown-item" href="#" target="_blank">Instagram</a></li>
            </ul>
        </div>
    </div>

    <div class="container">
        <div class="row align-items-center min-vh-100">
            <!-- Columna para el formulario -->
            <div class="col-md-6">
                <div class="login-form">
                    <h3 class="text-center">Bienvenido a la institución</h3>
                    <h5 class="text-center text-secondary">
                        <c:out value="${nombreInst}" />
                    </h5>

                    <!-- Formulario de ingreso -->
                    <form action="IngresoPortal" method="post">
                        <div class="mb-3">
                            <label for="usuario" class="form-label">Usuario:</label>
                            <input type="text" id="usuario" name="txtUsuarioGeneradoAdmi" class="form-control" required>
                        </div>
                        <div class="mb-3">
                            <label for="codigo" class="form-label">Código:</label>
                            <input type="password" id="codigo" name="txtCodigoGeneradoAdmi" class="form-control" required>
                        </div>
                        <div class="text-center mt-3">
                            <button type="submit" class="btn btn-primary w-100">Ingresar</button>
                        </div>
                    </form>
                </div>
            </div>

            <!-- Columna para las imágenes -->
            <div class="col-md-6 text-center">
                <!-- Espacio para las imágenes -->
                <img src="Imagenes/votaciones.jfif" alt="Logo de la institución" class="img-fluid mb-4" style="max-width: 200px;">
                <img src="Imagenes/votaciones.jfif" alt="Votaciones" class="img-fluid">
            </div>
        </div>
    </div>

    <!-- Bootstrap JS -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
            integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
            crossorigin="anonymous"></script>
</body>
</html>
