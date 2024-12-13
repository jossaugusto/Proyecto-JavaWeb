package servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DaoFactory;
import entidades.Votante;
import interfaces.VotanteInterface;

@WebServlet("/VotanteServlet")
public class VotanteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	 private DaoFactory daoFactory;
	    private VotanteInterface dao;

	    public VotanteServlet() {
	        super();
	    }

	    public void init(ServletConfig config) throws ServletException {
	        daoFactory = DaoFactory.getDaoFactory(DaoFactory.MYSQL);
	        dao = daoFactory.getVota();
	    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String nombreApellido = request.getParameter("txtNombreApellido");
		String tipoVotante = request.getParameter("cboTipoVotante");
		String correoVotante = request.getParameter("txtCorreoVotante");
		String codigoGeneradoVota = String.valueOf((int)(Math.random() * 1000000));
        String usuarioGeneradoVota = nombreApellido.toLowerCase().replace(" ", ".") + ".votan";
        
        // Llamar al método para agregar al votantE
        dao.agregarVota(new Votante(0,0, nombreApellido, tipoVotante,correoVotante,codigoGeneradoVota,usuarioGeneradoVota));
        request.getRequestDispatcher("portalAdminVotante.jsp").forward(request, response);
	}

}
