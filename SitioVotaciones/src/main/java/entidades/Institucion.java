package entidades;

public class Institucion {
	private int idInst;
	private String nombreApellido;
	private String cargoUsuario;
	private String telefonoInst;
	private String correoInst;
	private String nombreInst;
	private String codigoGeneradoAdmi;
	private String usuarioGeneradoAdmi;
	
	public Institucion(int idInst, String nombreApellido, String cargoUsuario, String telefonoInst, String correoInst,
			String nombreInst, String codigoGeneradoAdmi, String usuarioGeneradoAdmi) {
		super();
		this.idInst = idInst;
		this.nombreApellido = nombreApellido;
		this.cargoUsuario = cargoUsuario;
		this.telefonoInst = telefonoInst;
		this.correoInst = correoInst;
		this.nombreInst = nombreInst;
		this.codigoGeneradoAdmi = codigoGeneradoAdmi;
		this.usuarioGeneradoAdmi = usuarioGeneradoAdmi;
	}

	public int getIdInst() {
		return idInst;
	}

	public void setIdInst(int idInst) {
		this.idInst = idInst;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	public void setNombreApellido(String nombreApellido) {
		this.nombreApellido = nombreApellido;
	}

	public String getCargoUsuario() {
		return cargoUsuario;
	}

	public void setCargoUsuario(String cargoUsuario) {
		this.cargoUsuario = cargoUsuario;
	}

	public String getTelefonoInst() {
		return telefonoInst;
	}

	public void setTelefonoInst(String telefonoInst) {
		this.telefonoInst = telefonoInst;
	}

	public String getCorreoInst() {
		return correoInst;
	}

	public void setCorreoInst(String correoInst) {
		this.correoInst = correoInst;
	}

	public String getNombreInst() {
		return nombreInst;
	}

	public void setNombreInst(String nombreInst) {
		this.nombreInst = nombreInst;
	}

	public String getCodigoGeneradoAdmi() {
		return codigoGeneradoAdmi;
	}

	public void setCodigoGeneradoAdmi(String codigoGeneradoAdmi) {
		this.codigoGeneradoAdmi = codigoGeneradoAdmi;
	}

	public String getUsuarioGeneradoAdmi() {
		return usuarioGeneradoAdmi;
	}

	public void setUsuarioGeneradoAdmi(String usuarioGeneradoAdmi) {
		this.usuarioGeneradoAdmi = usuarioGeneradoAdmi;
	}
	
	
	
	

}
