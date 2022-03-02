package Clase_01;
import Clase_01.persona;
import java.util.Scanner;

public class Ejecutable_2 {
	public static void main (String[] args) {
		
		Scanner l, sex;
		l= new Scanner(System.in);
		sex= new Scanner(System.in);
		
		String nombre = l.nextLine();
		int edad = l.nextInt();
		String sexo = sex.nextLine();
		float peso = l.nextFloat();
		float altura = l.nextFloat();
		
		persona person1 = new persona();	
		persona person2 = new persona(nombre, edad, sexo);	
		persona person3 = new persona(nombre, edad, sexo, peso, altura);	
		System.out.print(person3);
		
	}
}
