
public class Alumno extends PERSONA {
public int curso;
public String Nombre;
public String Apellidos;
public int edad;

public Alumno() {}
public Alumno(int curso,String Nombre,String apellidos,int edad,String Fecha_Nacimiento,int dni) {
	
	super(Nombre,apellidos,Fecha_Nacimiento,dni);
	this.edad=edad;
	this.curso=curso;
	
}

public void darclase() {}


}
