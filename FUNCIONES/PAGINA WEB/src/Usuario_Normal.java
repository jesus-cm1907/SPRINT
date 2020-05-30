
public class Usuario_Normal extends Usuario {
	
public 	String nick_usuario;

public Usuario_Normal() {}

public Usuario_Normal(String nombre,String correo,int edad,String nick_usuario) {
	
	super(nombre,correo,edad);
	this.nick_usuario=nick_usuario;
}
public void MostrarUsuarioNormal(String nick_usuario) {}
}
