package personas;

// tiene que escoger un metodo de ordenación principal, ya sea edad o nombre. 
// el que no se elija como prncipal se eligirá como secundario
// y se eligirá de mayor a menor o de menor a mayor 

import java.util.Comparator;

public class ComparadorPersonas implements Comparator<Persona>{
	
	public int metodoSecundario;
	protected int metodoPrimario;
	protected int comoOrdenarPrimario;
	protected int comoOrdenarSecundario;

	
	public ComparadorPersonas(int metodoPrimario, int metodoSecundario) {
		
		this.metodoPrimario = metodoPrimario;
		
		this.metodoSecundario = metodoSecundario;
		
		comoOrdenarSecundario = Comparadores.ASCENDENTE ;
		comoOrdenarPrimario = Comparadores.ASCENDENTE ;
		
		
	}
		
	public void ComodOrdenarPrimario(int como) {
		
		if(como == Comparadores.DESCENDENTE) {
			comoOrdenarPrimario = Comparadores.DESCENDENTE;
		}
		else 
			comoOrdenarPrimario = Comparadores.ASCENDENTE;		
	}
		
		public void ComodOrdenarSecundario(int como) {
			
			if(como == Comparacion.DESCENDENTE) {
				comoOrdenarSecundario = Comparadores.DESCENDENTE;
			}
			else 
				comoOrdenarSecundario = Comparadores.ASCENDENTE;		
		}
		
		
		public void cambiarMetodoPrimario(int metodoPrimario) {
					
			if(metodoPrimario == metodoSecundario) {
				this.metodoPrimario = metodoSecundario;
				metodoSecundario = this.metodoPrimario;
			}
			
			this.metodoPrimario = metodoPrimario;

		}
		public void cambiarMetodoSecundario(int metodoSecundario) {
			
			if(metodoSecundario == metodoPrimario) {
				this.metodoSecundario = metodoPrimario;
				metodoPrimario = this.metodoSecundario;
			}
			this.metodoSecundario = metodoSecundario;
		}
	
	@Override
	public int compare(Persona p1, Persona p2) {
		
		int devolver = 0;

		switch(metodoPrimario) {
		case(Comparadores.POR_EDAD): 
			
			devolver = Comparadores.comparadorEdad(p1, p2, comoOrdenarPrimario); 
			if(devolver == 0) {
					switch(metodoSecundario) {
					case(Comparadores.POR_NOMBRE): 
						devolver = Comparadores.comparadorNombre(p1, p2, comoOrdenarSecundario); 
					break;
					case(Comparadores.POR_PESO): 
						devolver = Comparadores.comparadorPeso(p1, p2, comoOrdenarSecundario); 
					break;
					case(Comparadores.POR_ALTURA): 
						devolver = Comparadores.comparadorAltura(p1, p2, comoOrdenarSecundario); 
					break;
					
					
					}
				}
			break;
			case(Comparadores.POR_NOMBRE): 
			
			devolver = Comparadores.comparadorNombre(p1, p2, comoOrdenarPrimario); 
			if(devolver == 0) {
				
					switch(metodoSecundario) {
					case(Comparadores.POR_EDAD): 
						devolver = Comparadores.comparadorEdad(p1, p2, comoOrdenarSecundario); 
					break;
					case(Comparadores.POR_PESO): 
						devolver = Comparadores.comparadorPeso(p1, p2, comoOrdenarSecundario); 
					break;
					case(Comparadores.POR_ALTURA): 
						devolver = Comparadores.comparadorAltura(p1, p2, comoOrdenarSecundario); 
					break;
					}
				}
			break;
			case(Comparadores.POR_PESO): 
				
				devolver = Comparadores.comparadorPeso(p1, p2, comoOrdenarPrimario); 
				if(devolver == 0) {
						switch(metodoSecundario) {
						case(Comparadores.POR_EDAD): 
							devolver = Comparadores.comparadorEdad(p1, p2, comoOrdenarSecundario); 
						break;
						case(Comparadores.POR_NOMBRE): 
							devolver = Comparadores.comparadorNombre(p1, p2, comoOrdenarSecundario); 
						break;
						case(Comparadores.POR_ALTURA): 
							devolver = Comparadores.comparadorAltura(p1, p2, comoOrdenarSecundario); 
						break;
						}
					}
				break;
			case(Comparadores.POR_ALTURA): 
				
				devolver = Comparadores.comparadorAltura(p1, p2, comoOrdenarPrimario); 
				if(devolver == 0) {
						switch(metodoSecundario) {
						case(Comparadores.POR_EDAD): 
							devolver = Comparadores.comparadorEdad(p1, p2, comoOrdenarSecundario); 
						break;
						case(Comparadores.POR_PESO): 
							devolver = Comparadores.comparadorPeso(p1, p2, comoOrdenarSecundario); 
						break;
						case(Comparadores.POR_NOMBRE): 
							devolver = Comparadores.comparadorNombre(p1, p2, comoOrdenarSecundario); 
						break;
						}
					}
				break;
		
		}
		
		return devolver;
	}
	
	
	

	public int getMetodoSecundario() {
		return metodoSecundario;
	}

	public int getMetodoPrimario() {
		return metodoPrimario;
	}

	public int getComoOrdenarPrimario() {
		return comoOrdenarPrimario;
	}

	
	public int getComoOrdenarSecundario() {
		return comoOrdenarSecundario;
	}

	
	
	
	

	}
	
	

	
	



