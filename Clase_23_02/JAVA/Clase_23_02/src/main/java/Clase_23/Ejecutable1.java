package Clase_23;

import 	Clase_23.Clase_28_2;
import static Clase_23.Clase_28_2.Estmayordesquimica;
import static Clase_23.Clase_28_2.Llenarmatriz;
import static Clase_23.Clase_28_2.Matexamreprobados;
import static Clase_23.Clase_28_2.Sacarpromedio;
import static Clase_23.Clase_28_2.calmaypromycantexamregul;
import java.util.Scanner;


public class Ejecutable1 {
	
	public static void main(String[] args) {
		float notas[][];
		float promedio = 0;
		notas= Llenarmatriz();
		promedio=Sacarpromedio(notas);
		
		calmaypromycantexamregul(notas,promedio);
		
		Matexamreprobados(notas);
		
		Estmayordesquimica(notas);
	}
}
