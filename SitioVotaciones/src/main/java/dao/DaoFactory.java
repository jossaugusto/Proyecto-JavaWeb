package dao;

import interfaces.InstitucionInterface;
import interfaces.PortalIngresoInterface;
import interfaces.VotanteInterface;

public abstract class DaoFactory {
	public static final int MYSQL = 1;
	public static final int SQLSERVER = 2;
	public static final int ORACLE = 3;
	
	//obtener institucion
	public abstract InstitucionInterface getInsti();
	public abstract PortalIngresoInterface getInsti1();
	//obtener votante
	public abstract VotanteInterface getVota();
	
	public static DaoFactory getDaoFactory(int tipo) {
		switch (tipo) {
		case MYSQL: {
			return new MySQLDAOFactory();
		}
		case SQLSERVER: {
			return null;
		}
		default:
			return null;
		}

	}

}
