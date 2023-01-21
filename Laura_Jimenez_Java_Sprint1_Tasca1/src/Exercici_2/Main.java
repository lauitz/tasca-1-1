package Exercici_2;

public class Main {

	public static void main(String[] args) {
		Cotxe.frenar(); //llamada al metodo frenar
		Cotxe coche1 = new Cotxe ();
		coche1.acelerar(); //llamada al metodo acelelerar
		coche1.model = "X6"; //asi comprobamos que la variable static puede variar
		System.out.println("el coche 1 es un " + coche1.model);
		coche1.model = "Z3";
		System.out.println("el coche 1 es un " + coche1.model);
	}

}
