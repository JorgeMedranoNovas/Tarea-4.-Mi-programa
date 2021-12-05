package clsprocye;

public class Usuario {
		private String Usuario; 
		private String contraseña;
		private String Nombre; 
		private String apellidos;
		private String número_de_teléfono;
		private String correo_electrónico;
		private String confirmar_contraseña;
		
		
		
		public Usuario(String usuario, String contraseña, String nombre, String apellidos, String número_de_teléfono,String correo_electrónico,String confirmar_contraseña) {
			
			this.Usuario = usuario;
			this.Nombre = nombre;
			this.contraseña = contraseña;
			this.apellidos = apellidos;
			this.número_de_teléfono=número_de_teléfono;
			this.correo_electrónico= correo_electrónico;
			this.confirmar_contraseña=confirmar_contraseña;
		}
		public String getContraseña() {
			return contraseña;
		}
		public void setContraseña(String contraseña) {
			this.contraseña = contraseña;
		}
		public String getNúmero_de_teléfono() {
			return número_de_teléfono;
		}
		public void setNúmero_de_teléfono(String número_de_teléfono) {
			this.número_de_teléfono = número_de_teléfono;
		}
		public String getCorreo_electrónico() {
			return correo_electrónico;
		}
		public void setCorreo_electrónico(String correo_electrónico) {
			this.correo_electrónico = correo_electrónico;
		}
		public String getConfirmar_contraseña() {
			return confirmar_contraseña;
		}
		public void setConfirmar_contraseña(String confirmar_contraseña) {
			this.confirmar_contraseña = confirmar_contraseña;
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
		public String getcontraseña() {
			return contraseña;
		}
		public void setcontraseña(String Contraseña) {
			contraseña = Contraseña;
			
		}
		public String getApellidos() {
			return apellidos;
		}
		public void setApellidos(String apellidos) {
			this.apellidos = apellidos;
		}
		
		
}


