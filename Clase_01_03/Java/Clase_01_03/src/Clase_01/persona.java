package Clase_01;
public class persona {
	
	private String nombre = (String) "";
	private int edad = (int) 0;
	private int dni = ((int) (Math.random()*(99999999-10000000)) + 10000000);
	private String sexo = (String) "h";
	private float peso = (float) 0.0;
	private float altura = (float) 0.0;
	
	public persona() {
		
	}
	
	public persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad  = edad;
		this.sexo = sexo;
	}
	
	public persona(String nombre, int edad, String sexo, float peso, float altura) {
		this.nombre = nombre;
		this.edad  = edad;
		this.sexo = sexo; 
		this.peso = peso;
		this.altura = altura;
	}
	
	public float calcularIMC(float peso, float altura) {
		this.peso = peso;
		this.altura = altura;
		float pesoIdeal = peso/(altura*altura);
		int pSI = 0;
		
		if(pesoIdeal <20) {
			pSI = -1;
		}
		else if(pesoIdeal >=20 && pesoIdeal >=25){
			pSI = 0;
		}
		
		else {
			pSI = 1;
		}
		return pSI;
	}
	
	public boolean esMayorEdad(int edad) {
		this.edad = edad;
		boolean mayMen = true;
		if(edad <18) {
			mayMen = false;
		}
		else {
			mayMen = true;
		}
		return mayMen;
	}
	
	
	public void comprobarSexo (String sexo) {
		this.sexo = sexo;
		
		switch(sexo){
		
			case "h":
				
				sexo="h";
				
				break;
				
			case "f":
				
				sexo="f";
					
				break;
				
			default:
				
				sexo="h";
				
				break;
		}
	};
	
//		int value = (int) (Math.random()*(99999999 -10000000)) + 10000000;
//		dni = ((int) (Math.random()*(99999999-10000000)) + 10000000);
	
	

	@Override
	public String toString() {
		return "Nombre: " + this.nombre +", Edad: " + this.edad + ", DNI: " + dni + ", Sexo: " + this.sexo+ ", Peso: " + this.peso+ ", Altura: " + this.altura+ " ";
	}
	
//	public String getNombre() {
//		return nombre; ---------------------  ", DNI: " + this.dni+ 
//	}
	
	public void setTitular(String n) {
		nombre = n;
	}
	
//	public int getEdad() {
//		return edad;
//	}
	
	public void setCantidad(int e) {
	 edad = e;
	}
	
//	public String getDni() {
//		return dni;
//	}
	
//	public void setDni(String d) {
//		dni = d;
//	}
	
//	public String getSexo() {
//		return sexo;
//	}
	
	public void setSexo(String s) {
		sexo = s;
	}
	
//	public float getPeso() {
//		return peso;
//	}
	
	public void setPeso(float p) {
		peso = p;
	}
	
//	public float getAltura() {
//		return altura;
//	}
	
	public void setAltura(float a) {
		altura = a;
	}
	
	
}
