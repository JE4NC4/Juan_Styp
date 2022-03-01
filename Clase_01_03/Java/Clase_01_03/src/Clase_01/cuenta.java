package Clase_01;

public class cuenta {
	
	private String titular;
	private float cantidad = (float) 50.5;
	
	public cuenta (String titular, float cantidad) {
		this.titular = titular;
		this.cantidad = cantidad;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
		
	}
	public float getCantidad() {
		return cantidad;
	}
	
	public void setCantidad(float cantidad) {
		this.cantidad = cantidad;
	}
	
	public float ingresarC(float cantidad) {
		if(this.cantidad < 0) {
			this.cantidad = 0;
		}
		else {
			this.cantidad = this.cantidad + cantidad;
		}
		
		return this.cantidad;
	}
	
	public float retirarC(float cantidad) {
		this.cantidad = this.cantidad-cantidad;
		if(this.cantidad < 0) {
			this.cantidad = 0;
		}
		return this.cantidad;
	}
	
	
	@Override
	public String toString() {
		return "Titular: " + this.titular +" con cantidad: " + this.cantidad + " ";
	}	
}
