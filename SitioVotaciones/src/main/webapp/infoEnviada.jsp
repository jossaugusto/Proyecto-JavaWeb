<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>info del admin</title>
<!-- Bootstrap CSS para estilizar el modal -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <!-- Modal (ventana emergente) -->
    <div class="modal fade" id="modalInfo" tabindex="-1" aria-labelledby="modalInfoLabel" aria-hidden="true">
        <div class="modal-dialog">
            <div class="modal-content">
                <div class="modal-header">
                    <h5 class="modal-title" id="modalInfoLabel">Información del Administrador(copiar y guardar)</h5>
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

    <!-- Bootstrap JS para funcionalidad del modal -->
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.6/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js"></script>

    <!-- Mostrar el modal automáticamente al cargar la página -->
    <script>
        window.onload = function() {
            var modal = new bootstrap.Modal(document.getElementById('modalInfo'));
            modal.show();
        }
    </script>

</body>
</html>
