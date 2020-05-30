
public class Profesor extends PERSONA {
	public String Nombre;
	public String Apellidos;
	public int curso;
	public String Asignatura;

	public Profesor() {
	}

	public Profesor(String Nombre, String Apellidos, int curso, String Fecha_nacimiento, int dni) {
		super(Nombre, Apellidos, Fecha_nacimiento, dni);

		this.curso = curso;

	}

	public void mostrardatos(String Nombre, String Apellidos, int curso, String asignatura) {

	}
}
