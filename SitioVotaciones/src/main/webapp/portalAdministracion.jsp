<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- Bootstrap -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
      rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
      crossorigin="anonymous">
<title>Portal Administrativo</title>
<style>
    body {
        font-family: Arial, sans-serif;
    }
    .sidebar {
        height: 100vh;
        background-color: #f8f9fa;
        padding-top: 20px;
        border-right: 1px solid #ddd;
    }
    .content {
        margin-left: 250px;
        padding: 20px;
    }
    .sidebar a {
        display: block;
        padding: 10px 20px;
        color: #333;
        text-decoration: none;
        transition: background-color 0.3s;
    }
    .sidebar a:hover {
        background-color: #ffc107;
        color: #fff;
    }
    .active {
        background-color: #ffc107 !important;
        color: white !important;
    }
</style>
</head>
<body>

<div class="d-flex">
    <!-- Barra lateral -->
    <div class="sidebar">
        <h4 class="text-center text-warning">Menú</h4>
        <a href="#" id="inicio-tab" class="active" onclick="mostrarSeccion('inicio')">Inicio</a>
        <a href="portalAdminVotantes.jsp" id="votantes-tab" onclick="mostrarSeccion('votantes')">Votantes</a>
        <a href="#" id="candidatos-tab" onclick="mostrarSeccion('candidatos')">Candidatos</a>
        <a href="#" id="reportes-tab" onclick="mostrarSeccion('reportes')">Reportes</a>
        <a href="portalIngreso.jsp" class="text-danger mt-5">Cerrar sesión</a>
    </div>

    <!-- Contenido -->
    <div class="content">
        <div id="inicio" class="seccion">
            <h3>Bienvenido al Portal Administrativo</h3>
            <p>Esta es la sección de inicio. Selecciona una opción en el menú.</p>
        </div>

        <div id="votantes" class="seccion d-none">
            <h3>Registro de Votantes</h3>
            <p>Formulario o información relacionada con los votantes.</p>
        </div>

        <div id="candidatos" class="seccion d-none">
            <h3>Registro de Candidatos</h3>
            <p>Formulario o información relacionada con los candidatos.</p>
        </div>

        <div id="reportes" class="seccion d-none">
            <h3>Reportes</h3>
            <p>Estadísticas y reportes del sistema de votación.</p>
        </div>
    </div>
</div>

<!-- JavaScript -->
<script>
    function mostrarSeccion(seccionId) {
        // Ocultar todas las secciones
        document.querySelectorAll('.seccion').forEach(function(seccion) {
            seccion.classList.add('d-none');
        });

        // Quitar clase activa del menú
        document.querySelectorAll('.sidebar a').forEach(function(link) {
            link.classList.remove('active');
        });

        // Mostrar la sección seleccionada y marcar el menú como activo
        document.getElementById(seccionId).classList.remove('d-none');
        document.getElementById(seccionId + '-tab').classList.add('active');
    }
</script>

</body>
</html>
