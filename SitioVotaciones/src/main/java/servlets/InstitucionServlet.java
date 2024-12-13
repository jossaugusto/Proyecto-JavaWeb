package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoFactory;
import entidades.Institucion;
import interfaces.InstitucionInterface;

@WebServlet("/InstitucionServlet")
public class InstitucionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private DaoFactory daoFactory;
    private InstitucionInterface dao;

    public InstitucionServlet() {
        super();
    }

    public void init(ServletConfig config) throws ServletException {
        daoFactory = DaoFactory.getDaoFactory(DaoFactory.MYSQL);
        dao = daoFactory.getInsti();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los parámetros del formulario
        String nombreApellido = request.getParameter("txtNombreApellido");
        String cargoUsuario = request.getParameter("cboCargoUsuario");
        String telefonoInst = request.getParameter("txtTelefonoInst");
        String correoInst = request.getParameter("txtCorreoInst");
        String nombreInst = request.getParameter("txtNombreInst");
        String codigoGeneradoAdmi = String.valueOf((int)(Math.random() * 1000000));
        String usuarioGeneradoAdmi = nombreApellido.toLowerCase().replace(" ", ".") + ".admin";
        
        // Llamar al método para agregar al administrador
        dao.agregarAdmin(new Institucion(0, nombreApellido, cargoUsuario, telefonoInst, 
                                          correoInst, nombreInst, codigoGeneradoAdmi, 
                                          usuarioGeneradoAdmi));
        
        // Pasar los atributos al JSP para mostrar las credenciales
        request.setAttribute("codigoAdmi", codigoGeneradoAdmi);
        request.setAttribute("usuarioAdmi", usuarioGeneradoAdmi);
        request.setAttribute("nombreInst", nombreInst);

        // Redirigir a un JSP para mostrar la información del registro
        request.getRequestDispatcher("index.jsp").forward(request, response);
    }
}
