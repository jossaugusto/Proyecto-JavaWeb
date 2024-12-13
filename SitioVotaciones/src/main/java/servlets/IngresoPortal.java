package servlets;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoFactory;
import interfaces.PortalIngresoInterface;


@WebServlet("/IngresoPortal")
public class IngresoPortal extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private DaoFactory daoFactory;
    private PortalIngresoInterface dao;

    public IngresoPortal() {
    	super();	
    }

    public void init(ServletConfig config) throws ServletException {
        daoFactory = DaoFactory.getDaoFactory(DaoFactory.MYSQL);
        dao = daoFactory.getInsti1();
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String usuario = request.getParameter("txtUsuarioGeneradoAdmi");
        String codigo = request.getParameter("txtCodigoGeneradoAdmi");

        boolean validacionExitosa = dao.validarCredenciales(usuario, codigo);

        if (validacionExitosa) {
            response.sendRedirect("portalAdministracion.jsp");
        } else {
            request.setAttribute("error", "Usuario o código incorrecto");
            request.getRequestDispatcher("portalIngreso.jsp").forward(request, response);
        }
    }
}



