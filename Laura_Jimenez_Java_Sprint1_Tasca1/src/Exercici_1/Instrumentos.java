package Exercici_1;

public abstract class Instrumentos { //definicion de la superclase
	
/*Atributos comunes*/
	private String name;
	private float price;
	
/*constructores*/
	public Instrumentos() {
		super();
	}

	public Instrumentos(String name, float price) {
		super();
		
		this.name = name;
		this.price = price;
	}

	/*getters y setters que se utilizaran el las clases*/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getPrice() {
		return price;
	}

	public void setPrice(float price) {
		this.price = price;
	} 
	
	public abstract void tocar ();
	
	
	
	
}
