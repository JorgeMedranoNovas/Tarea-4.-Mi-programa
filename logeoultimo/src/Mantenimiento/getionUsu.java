package Mantenimiento;
import clsprocye.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import ConexionBD.ConexionDt;


public class getionUsu {
	public Usuario obtenerUsuario(Usuario usu) { 
		Usuario usuario = null;
		Connection con = null; 
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			
			con = ConexionDt.getConexion();
			String Sql = "select * From bd_Usuario where Usuario = ? and contraseña = ?";
			pst = con.prepareStatement(Sql);
			pst.setString(1, usu.getUsuario());
			pst.setString(2, usu.getcontraseña());
			
			
			rs = pst.executeQuery();
			while(rs.next()) {
				usuario = new Usuario(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7));
			}
		
		}catch(Exception e) {
		 System.out.println("Error en obtener usuario");	
		}
		return usuario;
		
	}


}
  
