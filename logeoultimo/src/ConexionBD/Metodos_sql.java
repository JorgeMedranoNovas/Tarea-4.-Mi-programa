package ConexionBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import com.mysql.cj.protocol.Resultset;

public class Metodos_sql {
	String[] datos = new String[4];
	DefaultTableModel Model = new DefaultTableModel(); 
	
	
	public static ConexionDt Conexion = new ConexionDt();
	ConexionDt con = new ConexionDt();
	Connection cn; 
	Statement st;
	Resultset rs;
	
	public static PreparedStatement sentencia_preparada;
	public static String sql;
	public static int resultado_numero = 0;
	
	
	public int guardar(String Usuario,String Contraceña,String Nombre,String Apellido,String número_de_teléfono,String correo_eletrónico,String confirmar_contraseña) {
		
		int resultado = 0; 
		
		Connection conexion = null;
		
		String sentencia_guard = ("insert into bd_Usuario VAlUES(?,?,?,?,?,?,?)");
		try {
			conexion = ConexionDt.getConexion();
			sentencia_preparada = conexion.prepareStatement(sentencia_guard);
			sentencia_preparada.setString(1, Usuario);
			sentencia_preparada.setString(2, Contraceña);
			sentencia_preparada.setString(3, Nombre);
			sentencia_preparada.setString(4, Apellido);
			sentencia_preparada.setString(5, número_de_teléfono);
			sentencia_preparada.setString(6, correo_eletrónico);
			sentencia_preparada.setString(7, confirmar_contraseña);
			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return resultado;
		
		
	}
	
	
	public int eliminal(String Usuario) {
		int resultado = 0; 
		
		Connection conexion = null;
		String sentencia_Eliminal = ("delete from bd_Usuario where Usuario = ?");
		try {
			conexion = ConexionDt.getConexion();
			sentencia_preparada = conexion.prepareStatement(sentencia_Eliminal);
			sentencia_preparada.setString(1, Usuario);
			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		return resultado;


    }
     public int Actualizar(String Usuario,String Contraceña,String Nombre,String Apellido,String número_de_teléfono,String correo_eletrónico,String confirmar_contraseña,String Actualizar ) {
     
    	 int resultado = 0; 
    	 Connection conexion = null; 			 
     
	
     String sentencia_Actualizar = ("UPDATE bd_Usuario SET Usuario = ? ,contraseña = ?, Nombre= ?, apellidos = ?, número_de_teléfono = ?, correo_electrónico = ?,confirmar_contraseña= ? WHERE Usuario = ?");
		try {
			conexion = ConexionDt.getConexion();
			sentencia_preparada = conexion.prepareStatement(sentencia_Actualizar);
			sentencia_preparada.setString(1, Usuario);
			sentencia_preparada.setString(2, Contraceña);
			sentencia_preparada.setString(3, Nombre);
			sentencia_preparada.setString(4, Apellido);
			sentencia_preparada.setString(5, número_de_teléfono);
			sentencia_preparada.setString(6, correo_eletrónico);
			sentencia_preparada.setString(7, confirmar_contraseña);
			sentencia_preparada.setString(8, Actualizar);
			
			resultado = sentencia_preparada.executeUpdate();
			sentencia_preparada.close();}catch (Exception e) {
		System.out.println(e);
		}
		return resultado;

     }

    	 
     }	
	







/*public int eliminar(String Usuario) {
	Connection conexion = null;
	
	int resultado = 0;
	
	String sql ="delete form bd_Usuario where Usuario = '?';"; 
	try {
		sentencia_preparada = conexion.prepareStatement(sql);
		sentencia_preparada.setString(1, Usuario);
		resultado = sentencia_preparada.executeUpdate();
		
		sentencia_preparada.close();	
		cn= ConexionDt.getConexion();
	}catch (Exception e) {
	System.out.println(e);
		
		//JOptionPane.showMessageDialog(contentPane,e,"Error", JOptionPane.ERROR_MESSAGE);
	}
	return resultado;
	
}
	/*st = cn.createStatement();
	st.executeUpdate(sql);
	}catch (Exception e) {
	System.out.println(e);
		
		//JOptionPane.showMessageDialog(contentPane,e,"Error", JOptionPane.ERROR_MESSAGE);
	}
*/
	