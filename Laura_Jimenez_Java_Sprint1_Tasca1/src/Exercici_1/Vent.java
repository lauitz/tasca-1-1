package Exercici_1;

public class Vent extends Instrumentos { //clase hija derivada de instrumentos (clase padre o superclase)
	
/*constructores*/
	public Vent () {
		super ();
	}
	
	public Vent (String name, float price)
	{
		super (name, price);
	}


/*metodos*/	
	public void tocar()
	{
		System.out.println("estas tocando un instrumento de viento");
	}
	
	
}
