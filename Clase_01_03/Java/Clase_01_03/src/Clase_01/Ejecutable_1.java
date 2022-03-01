package Clase_01;

public class Ejecutable_1 {
	
	public static void main (String[] args) {

		cuenta cuenta1 = new cuenta("Juan",200);
		cuenta cuenta2 = new cuenta("Jairo",100);
		
		cuenta1.ingresarC(500);
		cuenta2.ingresarC(400);
		cuenta1.ingresarC(200);
		cuenta2.ingresarC(0);
		
		cuenta1.retirarC(650);
		cuenta2.retirarC(200);
		
		System.out.print(cuenta1);
		System.out.print(cuenta2);
	}
}
