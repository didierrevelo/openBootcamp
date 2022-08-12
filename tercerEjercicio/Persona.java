
public class Persona {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.setEdad(34);
		persona.setNombre("Didier");
		persona.setTelefono(1234567890);
		System.out.println("Hola mi nombre es " + " " + persona.getNombre() + " " + "tengo" + " " + persona.getEdad()
				+ " " + "años de edad" + " " + "y mi telefono es" + " " + persona.getTelefono());

	}

	private int edad;
	private String nombre;
	private long telefono;

	public Persona() {
		super();
	}

	public Persona(int edad, String nombre, long telefono) {
		super();
		this.edad = edad;
		this.nombre = nombre;
		this.telefono = telefono;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public long getTelefono() {
		return telefono;
	}

	public void setTelefono(long telefono) {
		this.telefono = telefono;
	}

}
