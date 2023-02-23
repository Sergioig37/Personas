package personas;

public class Comparadores implements Comparacion{


	public static int comparadorNombre(Persona p1, Persona p2, int como) {

		int devolver = 0;
		
		if(como == ASCENDENTE) {
			
			devolver = p1.getNombre().compareTo(p2.getNombre());
		}
		else if(como == DESCENDENTE) {
				devolver =  p2.getNombre().compareTo(p1.getNombre());
			}
		return devolver; 
		}
	
	public static int comparadorEdad(Persona p1, Persona p2, int como) {
		 
		int devolver = 0;
		
		if(como == ASCENDENTE) {
			
			devolver =  p1.getEdad()-p2.getEdad();
		}
		else if(como == DESCENDENTE){
				devolver =  p2.getEdad()-p1.getEdad();
		}
		return devolver;

	}
	public static int comparadorPeso(Persona p1, Persona p2, int como) {
		 
		int devolver = 0;
		
		if(como==ASCENDENTE) {
			
			devolver =  p1.getPeso()-p2.getPeso();
		}
		else if(como == DESCENDENTE){
				devolver =  p2.getPeso()-p1.getPeso();
		}
		return devolver;
	}
	
	public static int comparadorAltura(Persona p1, Persona p2, int como) {
		 
		int devolver = 0;
		
		if(como==ASCENDENTE) {
			
			devolver =  p1.getAltura()-p2.getAltura();
		}
		else if(como == DESCENDENTE){
				devolver =  p2.getAltura()-p1.getAltura();
		}
		return devolver;
	}
}
