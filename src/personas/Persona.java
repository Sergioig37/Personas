package personas;



public class Persona {

	
	private String nombre;
	private int edad;
	private int altura;
	private int peso;
	
	public Persona(String nombre, int edad, int altura, int peso) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura ;
		this.peso = peso;
	}

	
	@Override
	public String toString() {
		return "[ " + nombre + " (" + edad + ")"+"(" +altura +")" +"( "+peso +")"+" ]";
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}
	public int getPeso() {
		return peso;
	}
	public int getAltura() {
		return altura;
	}





	

	
	
	
}
