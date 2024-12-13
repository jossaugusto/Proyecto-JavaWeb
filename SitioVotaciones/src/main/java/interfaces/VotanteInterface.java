package interfaces;

import java.util.List;

import entidades.Votante;

public interface VotanteInterface {
	public int agregarVota(Votante votante);
	public List<Votante> vot();
	public boolean eliminarVota(int id);
	public int editarVota(Votante votante);
}
