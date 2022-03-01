package Clase_01;

public class persona {
	
	private String nombre = (String) "";
	private int edad = (int) 0;
	private String dni;
	private String sexo = (String) "H";
	private float peso = (float) 0.0;
	private float altura = (float) 0.0;
	
	public persona(String nombre, int edad, String sexo) {
		this.nombre = nombre;
		this.edad  = edad;
		this.sexo = sexo;
	}
	
	public persona(String nombre, int edad, String dni, String sexo, float peso, float altura) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad  = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
	}
	
	
	
	public String getNombre() {
		return nombre;
	}
	
	public void setTitular(String n) {
		nombre = n;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public void setCantidad(int e) {
	 edad = e;
	}
	
	public String getDni() {
		return dni;
	}
	
	public void setDni(String d) {
		dni = d;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String s) {
		sexo = s;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float p) {
		peso = p;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public void setAltura(float a) {
		altura = a;
	}
	
	
	public persona() {

	}
	
}
