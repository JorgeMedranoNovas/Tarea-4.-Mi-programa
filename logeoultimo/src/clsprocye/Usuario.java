package clsprocye;

public class Usuario {
		private String Usuario; 
		private String contrase�a;
		private String Nombre; 
		private String apellidos;
		private String n�mero_de_tel�fono;
		private String correo_electr�nico;
		private String confirmar_contrase�a;
		
		
		
		public Usuario(String usuario, String contrase�a, String nombre, String apellidos, String n�mero_de_tel�fono,String correo_electr�nico,String confirmar_contrase�a) {
			
			this.Usuario = usuario;
			this.Nombre = nombre;
			this.contrase�a = contrase�a;
			this.apellidos = apellidos;
			this.n�mero_de_tel�fono=n�mero_de_tel�fono;
			this.correo_electr�nico= correo_electr�nico;
			this.confirmar_contrase�a=confirmar_contrase�a;
		}
		public String getContrase�a() {
			return contrase�a;
		}
		public void setContrase�a(String contrase�a) {
			this.contrase�a = contrase�a;
		}
		public String getN�mero_de_tel�fono() {
			return n�mero_de_tel�fono;
		}
		public void setN�mero_de_tel�fono(String n�mero_de_tel�fono) {
			this.n�mero_de_tel�fono = n�mero_de_tel�fono;
		}
		public String getCorreo_electr�nico() {
			return correo_electr�nico;
		}
		public void setCorreo_electr�nico(String correo_electr�nico) {
			this.correo_electr�nico = correo_electr�nico;
		}
		public String getConfirmar_contrase�a() {
			return confirmar_contrase�a;
		}
		public void setConfirmar_contrase�a(String confirmar_contrase�a) {
			this.confirmar_contrase�a = confirmar_contrase�a;
		}
		public Usuario() {
			// TODO Auto-generated constructor stub
		}
		public String getUsuario() {
			return Usuario;
		}
		public void setUsuario(String usuario) {
			Usuario = usuario;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String nombre) {
			Nombre = nombre;
		}
		public String getcontrase�a() {
			return contrase�a;
		}
		public void setcontrase�a(String Contrase�a) {
			contrase�a = Contrase�a;
			
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		
		
}


