package modelos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import entidades.Institucion;
import interfaces.InstitucionInterface;
import interfaces.PortalIngresoInterface;
import utilidades.MySQLConexion;

public class InstitucionModelo implements InstitucionInterface, PortalIngresoInterface {

	@Override
	public int agregarAdmin(Institucion institucion) {
		// TODO Auto-generated method stub
		int value = 0;
        Connection cn = null;
        PreparedStatement psm = null;

        try {
            cn = MySQLConexion.getConexion();
            if (cn == null) {
                System.out.println("Error: No se pudo establecer la conexión con la base de datos.");
                return 0;
            }

            String mysql = "INSERT INTO institucionRegis (nombreApellidoUsua, cargoUsua, telefonoInst, correoInst, nombreInst, codigoGeneradoAdmi, UsuarioGeneradoAdmi) VALUES (?,?,?,?, ?, ?, ?)";
            psm = cn.prepareStatement(mysql);
            psm.setString(1, institucion.getNombreApellido());
            psm.setString(2, institucion.getCargoUsuario());
            psm.setString(3, institucion.getTelefonoInst());
            psm.setString(4, institucion.getCorreoInst());
            psm.setString(5, institucion.getNombreInst());
            psm.setString(6, institucion.getCodigoGeneradoAdmi());
            psm.setString(7, institucion.getUsuarioGeneradoAdmi());


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
	    public boolean validarCredenciales(String usuario, String codigo) {
	        boolean esValido = false;
	        String sql = "SELECT COUNT(*) FROM institucionRegis WHERE usuarioGeneradoAdmi = ? AND codigoGeneradoAdmi = ?";
	        try (Connection cn = MySQLConexion.getConexion();
	             PreparedStatement ps = cn.prepareStatement(sql)) {
	            ps.setString(1, usuario);
	            ps.setString(2, codigo);
	            try (ResultSet rs = ps.executeQuery()) {
	                if (rs.next()) {
	                    esValido = rs.getInt(1) > 0;
	                }
	            }
	        } catch (SQLException e) {
	            e.printStackTrace(); // Manejar errores adecuadamente
	        }
	        return esValido;
	    }

	

}
