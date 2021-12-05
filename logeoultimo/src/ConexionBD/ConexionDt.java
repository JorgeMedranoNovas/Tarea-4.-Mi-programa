package ConexionBD;
import java.sql.*;
public class ConexionDt {
    public static Connection  getConexion() {
		
    	Connection con = null; 
    	try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/usuariobd?useUnicode=true$use "
					+ "JDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&"
					+ "serverTimezone=UTC";
			String usuario = "root";
			String contraseña = "1234";
			
			con =  DriverManager.getConnection(url,usuario,contraseña);
		
		} catch (ClassNotFoundException e) {
			System.out.println("Error --> al cargar el Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Error --> con la BD");
			e.printStackTrace();
		}
		return con;
	}

/*    public static ResultSet getTabla(String Consulta) {
    	Connection cn = getConexion();
    	Statement st; 
    	ResultSet datos = null; 
       try {
    	    st = cn.createStatement();
    	    datos = st.executeQuery(Consulta);
    	    
       }catch(Exception e) {
    	   System.out.println(e.toString());
       }
    	
    	return datos;	
    }
	/

	 */
	
	
	
}
