package entidades;

public class Votante {
	private int idVota;
	private int idInst;
	private String nombreApellido;
	private String tipoVota;
	private String correoVota;
	private String codigoGeneradoVota;
	private String usuarioGeneradoVota;
	
	public Votante(int idVota, int idInst, String nombreApellido, String tipoVota, String correoVota,
			String codigoGeneradoVota, String usuarioGeneradoVota) {
		super();
		this.idVota = idVota;
		this.idInst = idInst;
		this.nombreApellido = nombreApellido;
		this.tipoVota = tipoVota;
		this.correoVota = correoVota;
		this.codigoGeneradoVota = codigoGeneradoVota;
		this.usuarioGeneradoVota = usuarioGeneradoVota;
	}

	public int getIdVota() {
		return idVota;
	}

	public void setIdVota(int idVota) {
		this.idVota = idVota;
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

	public String getTipoVota() {
		return tipoVota;
	}

	public void setTipoVota(String tipoVota) {
		this.tipoVota = tipoVota;
	}

	public String getCorreoVota() {
		return correoVota;
	}

	public void setCorreoVota(String correoVota) {
		this.correoVota = correoVota;
	}

	public String getCodigoGeneradoVota() {
		return codigoGeneradoVota;
	}

	public void setCodigoGeneradoVota(String codigoGeneradoVota) {
		this.codigoGeneradoVota = codigoGeneradoVota;
	}

	public String getUsuarioGeneradoVota() {
		return usuarioGeneradoVota;
	}

	public void setUsuarioGeneradoVota(String usuarioGeneradoVota) {
		this.usuarioGeneradoVota = usuarioGeneradoVota;
	}
	
	
	
	
}
