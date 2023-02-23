package personas;

import java.util.Arrays;
import java.util.Comparator;

public class Start {

	public static void main(String[] args) {
		
		
		
		int[] numeros ={ 5, 34, 67 ,78 ,18 ,32, 19, 89, 90, 32};
		
		Persona[] personas = new Persona[5];
		personas[0] = new Persona("Abntón", 32, 180, 90);
		personas[1] = new Persona("Alntón", 26, 190, 90);
		personas[2] = new Persona("Akntón", 78, 160, 52);
		personas[3] = new Persona("Adntón", 28, 170, 70);
		personas[4] = new Persona("Afntón", 26, 190, 85);
		
	
		ComparadorPersonas cp = new ComparadorPersonas(Comparadores.POR_EDAD, Comparadores.POR_PESO);
		System.out.println("ARRAY SACADO DE FORMA NORMAL");
		System.out.println(Arrays.toString(personas));
		
		
		
		
		Arrays.sort(personas, cp);
		System.out.println("ARRAY ORDENADO POR PESO DE MANERA ASCENDENTE( DE Z A LA A)");
		System.out.println(Arrays.toString(personas));
		cp.ComodOrdenarPrimario(Comparadores.DESCENDENTE);
		cp.ComodOrdenarSecundario(Comparadores.DESCENDENTE);
		Arrays.sort(personas, cp);
		System.out.println("ARRAY ORDENADO POR PESO DE MANERA DESCENDENTE( DE A A LA Z)");
		System.out.println(Arrays.toString(personas));
		
		
		/*
		Arrays.sort(personas, cp);
		System.out.println("ARRAY ORDENADO POR NOMBRE DE MANERA ASCENDENTE( DE Z A LA A)");
		System.out.println(Arrays.toString(personas));
		cp.setComodOrdenarPrimario(Comparadores.DESCENDENTE);
		Arrays.sort(personas, cp);
		System.out.println("ARRAY ORDENADO POR NOMBRE DE MANERA DESCENDENTE( DE A A LA Z)");
		System.out.println(Arrays.toString(personas));
		*/
		/*
		System.out.println("ARRAY ORDENADO POR EDAD DE MANERA ASCENDENTE(MENOR A MAYOR)");
		System.out.println("ORDENADO POR EL METODO SECUNDARIO DE FORMA ASCENDENTE");
		Arrays.sort(personas, cp);
		System.out.println(Arrays.toString(personas));
		cp.setComodOrdenarPrimario(Comparadores.DESCENDENTE);
		System.out.println("ARRAY ORDENADO POR EDAD DE MANERA DESCENDENTE( MAYOR A MENOR)");
		cp.setComodOrdenarSecundario(Comparadores.DESCENDENTE);
		Arrays.sort(personas, cp);
		System.out.println(Arrays.toString(personas));
		
		
		/*
		ComparadorPersonas pc = new ComparadorPersonas(2);
		System.out.println(Arrays.toString(personas));
		Arrays.sort(personas, pc);
		System.out.println(Arrays.toString(personas));
		
		pc.setComodOrdenarPrimario(ComparadorPersonas.DESCENDENTE);
		Arrays.sort(personas, pc);
		System.out.println(Arrays.toString(personas));
		*/
		

	}

}
