package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import entidades.Votante;
import interfaces.VotanteInterface;
import utilidades.MySQLConexion;

public class VotanteModelo implements VotanteInterface {

	@Override
	public int agregarVota(Votante votante) {
		// TODO Auto-generated method stub
		int value = 0;
		Connection cn = null;
		PreparedStatement psm = null;
		
		try {
			cn= MySQLConexion.getConexion();
			if (cn == null) {
				System.out.print("Error: No se pudo establecer la conexión con la base de datos.");
				return 0;
			}
			
			String mysql = "INSERT INTO votanteRegis (nombreApellidoUsua, tipoVota, correoVota) VALUES (?, ? ,?,)";
			psm  = cn.prepareStatement(mysql);
			psm.setString(1, votante.getNombreApellido());
			psm.setString(2, votante.getTipoVota());
			psm.setString(3, votante.getCorreoVota());
			
			value = psm.executeUpdate();
			// Verificación de si la consulta fue exitosa
            if (value > 0) {
                System.out.println("Inserción exitosa. Se insertaron " + value + " fila(s).");
            } else {
                System.out.println("No se insertaron filas. La consulta no tuvo efecto.");
            }
			
		} catch (SQLException e) {
            System.out.println("Error SQL: " + e.getMessage());
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error general: " + e.getMessage());
            e.printStackTrace();
        } finally {
            try {
                if (psm != null) psm.close();
                if (cn != null) cn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar recursos: " + e.getMessage());
                e.printStackTrace();
            }
        }
		
		return value;
	}

	@Override
	public boolean eliminarVota(int id) {
	    boolean eliminado = false; 
	    Connection cn = null;
	    PreparedStatement psm = null;

	    try {
	        cn = MySQLConexion.getConexion(); 
	        if (cn == null) {
	            System.out.print("Error: No se pudo establecer la conexión con la base de datos.");
	            return false; // Si no hay conexión, devuelve false
	        }

	        String mysql = "DELETE FROM votanteRegis WHERE id = ?";
	        psm = cn.prepareStatement(mysql);
	        psm.setInt(1, id); 

	        int filasAfectadas = psm.executeUpdate();
	        if (filasAfectadas > 0) {
	            eliminado = true; // Se eliminó correctamente
	        }
	    } catch (SQLException e) {
	        System.out.println("Error SQL: " + e.getMessage());
	        e.printStackTrace();
	    } catch (Exception e) {
	        System.out.println("Error general: " + e.getMessage());
	        e.printStackTrace();
	    } finally {
	        try {
	            if (psm != null) psm.close(); 
	            if (cn != null) cn.close();   
	        } catch (SQLException e) {
	            System.out.println("Error al cerrar recursos: " + e.getMessage());
	            e.printStackTrace();
	        }
	    }

	    return eliminado; 
	}


	@Override
	public int editarVota(Votante votante) {
		// TODO Auto-generated method stub
		int value = 0;
		Connection cn = null;
		PreparedStatement psm = null;

		try {
		    cn = MySQLConexion.getConexion();
		    if (cn == null) {
		        System.out.print("Error: No se pudo establecer la conexión con la base de datos.");
		        return 0;
		    }

		    String mysql = "UPDATE votanteRegis SET nombreApellidoUsua = ?, tipoVota = ?, correoVota = ? WHERE idVota = ?";
		    psm = cn.prepareStatement(mysql);
		    
		    psm.setString(1, votante.getNombreApellido()); 
		    psm.setString(2, votante.getTipoVota());      
		    psm.setString(3, votante.getCorreoVota());    
		    psm.setInt(4, votante.getIdVota());            
		    
		    value = psm.executeUpdate();
		    
		    if (value > 0) {
		        System.out.println("Actualización exitosa. Se actualizaron " + value + " fila(s).");
		    } else {
		        System.out.println("No se actualizó ninguna fila. La consulta no tuvo efecto.");
		    }

		} catch (SQLException e) {
		    System.out.println("Error SQL: " + e.getMessage());
		    e.printStackTrace();
		} catch (Exception e) {
		    System.out.println("Error general: " + e.getMessage());
		    e.printStackTrace();
		} finally {
		    try {
		        if (psm != null) psm.close();
		        if (cn != null) cn.close();
		    } catch (SQLException e) {
		        System.out.println("Error al cerrar recursos: " + e.getMessage());
		        e.printStackTrace();
		    }
		}

		return value;
	}

	@SuppressWarnings("null")
	@Override
	public List<Votante> vot() {
		// TODO Auto-generated method stub
		List<Votante> lisVota = new ArrayList<Votante>(); 
		Connection cn = null;
		PreparedStatement psm = null;
		ResultSet rs = null;
		
		try {
			String mysql = "SELECT * FROM votanteRegis";
			psm =cn.prepareStatement(mysql);
			rs = psm.executeQuery();
 			
			 while (rs.next()) {
	            int idVota = rs.getInt("idVota");
	            int idInst = rs.getInt("idInst");
	            String nombreApellido = rs.getString("nombreApellido");
	            String tipoVota = rs.getString("tipoVota");
	            String correoVota = rs.getString("correoVota");
	            String codigoGeneradoVota = rs.getString("codigoGeneradoVota");
	            String usuarioGeneradoVota = rs.getString("usuarioGeneradoVota");
	            
	            lisVota.add(new Votante(idVota, idInst, nombreApellido, tipoVota, correoVota, codigoGeneradoVota, usuarioGeneradoVota));
	        }
		} catch (Exception e) {
 			e.printStackTrace();
 		} finally {
 			try {
 				if (rs != null) rs.close();
 				if (psm != null) psm.close();
 				if (cn != null) cn.close();
 			} catch (Exception e) {
 				e.printStackTrace();
 			}
 		}
		
		return lisVota;
	}

}