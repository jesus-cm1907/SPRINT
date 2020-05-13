
public class Mensaje_del_var extends Menu_Principal {
	public String Usuario_Var;
	public String Mensaje;

	public Mensaje_del_var() {
	}

	public Mensaje_del_var(String Usuariovar, String mensaje, String Perfil, String mensajevar, String Futbol_Premium,
			String Foro) {

		super(Perfil, mensajevar, Futbol_Premium, Foro);
		this.Usuario_Var = Usuariovar;
		this.Mensaje = mensaje;

	}

	public void Mostrarmensaje() {
	}

}
