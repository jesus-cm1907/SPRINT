
public class Usuario_Premium extends Usuario {
public String nombreusuariopremium;

public Usuario_Premium() {}

public Usuario_Premium(String nombre,String correo,int edad,String nombreUsuarioPremium) {
	super(nombre,correo,edad);
	this.nombreusuariopremium=nombreUsuarioPremium;
	
	
}

public void mostrarusuariopremium( String nombreusuariopremium ) {}

}
