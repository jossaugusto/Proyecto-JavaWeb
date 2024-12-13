package dao;

import interfaces.InstitucionInterface;
import interfaces.PortalIngresoInterface;
import interfaces.VotanteInterface;
import modelos.InstitucionModelo;

public class MySQLDAOFactory extends DaoFactory{

	@Override
	public InstitucionInterface getInsti() {
		// TODO Auto-generated method stub
		return new InstitucionModelo();
	}

	@Override
	public PortalIngresoInterface getInsti1() {
		// TODO Auto-generated method stub
		return new InstitucionModelo();
	}

	@Override
	public VotanteInterface getVota() {
		// TODO Auto-generated method stub
		return null;
	}

}
