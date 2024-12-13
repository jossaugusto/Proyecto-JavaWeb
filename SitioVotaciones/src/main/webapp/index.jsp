<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Página principal de votaciones</title>

<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">

</head>
<body>
    <!-- Formulario -->
    <form action="InstitucionServlet" method="post" class="container-md mt-3">
        <div class="form-group">
            <label for="nombreApellido">Nombres y Apellidos:</label>
            <input class="form-control" id="nombreApellido" type="text" name="txtNombreApellido" required>
        </div><br>
        
        <div class="form-group">
            <label for="cargo">Cargo:</label>
            <select id="cargo" name="cboCargoUsuario" class="form-select" required>
                <option value="">Seleccione el cargo</option>
                <option value="Director">Director</option>
                <option value="Subdirector">Subdirector</option>
                <option value="Experto en tecnologia">Experto en tecnología</option>
                <option value="Docente">Docente</option>
                <option value="Alumno">Alumno</option>
                <option value="Decano">Decano</option>
                <option value="Soporte">Soporte</option>
                <option value="Rector">Rector</option>
            </select>
        </div><br>
        
        <div class="form-group">
            <label for="telefonoInst">Teléfono de la institución:</label>
            <input class="form-control" id="telefonoInst" type="tel" name="txtTelefonoInst" required>
        </div><br>
        
        <div class="form-group">
            <label for="correoInst">Correo de la institución:</label>
            <input class="form-control" id="correoInst" type="email" name="txtCorreoInst" required>
        </div><br>
        
        <div class="form-group">
            <label for="nombreInst">Nombre de la institución:</label>
            <input class="form-control" id="nombreInst" type="text" name="txtNombreInst" required>
        </div><br>
    
        <div class="form-group text-center">
            <button type="submit" class="btn btn-primary w-10">Registrar</button>
        </div>
    </form>
    
    <!-- Modal de Bootstrap -->
    <c:if test="${not empty codigoAdmi and not empty usuarioAdmi}">
        <div class="modal fade" id="modalInfo" tabindex="-1" aria-labelledby="modalInfoLabel" aria-hidden="true">
            <div class="modal-dialog">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="modalInfoLabel">Información del Administrador</h5>
                        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                    </div>
                    <div class="modal-body">
                        <h4>Usuario generado: <c:out value="${usuarioAdmi}" /></h4>
                        <h4>Contraseña generada: <c:out value="${codigoAdmi}" /></h4>
                    </div>
                    <div class="modal-footer">
                        <a href="portalIngreso.jsp" class="btn btn-primary">Bienvenido al portal</a>
                    </div>
                </div>
            </div>
        </div>

        <!-- Script para mostrar el modal automáticamente -->
        <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>
        <script>
            var modal = new bootstrap.Modal(document.getElementById('modalInfo'));
            modal.show();
        </script>
    </c:if>
</body>
</html>
