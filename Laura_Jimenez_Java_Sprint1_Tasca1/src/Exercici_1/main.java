package Exercici_1;

import java.util.Scanner;

public class main { //abre la clase main, donde situaremos el codigo principal 

	public static void main(String[] args) {
		System.out.println("escribe el tipo de instrumento: 1. Viento; 2. cuerda; 3. percusión");
		Scanner entrada = new Scanner (System.in); //abrimos el escaner
		
		/*lecturas del escaner*/
		int tipo = entrada.nextInt();
		entrada.nextLine();
		System.out.println("escribe el nombre del instrumento");
		String nombre = entrada.nextLine();
		System.out.println("escribe el precio del instrumento");
		int precio = entrada.nextInt();
		
		/*Decision del tipo de instrumento*/
		if (tipo==1) // 1 tipo
		{
		Vent viento = new Vent(); //creacion del objeto
		viento.setName(nombre); //se pone el nombre al objeto
		viento.setPrice(precio); //se pone el precio al objeto
		viento.tocar(); //llamada al metodo
		System.out.println("Nombre del instrumento: " + viento.getName() + " con un precio de: " + viento.getPrice()); //con los getters obtenemos los atributos seteados en el objeto
		}
		
		if (tipo==2) //2 tipo (mismo proceso que en el 1)
		{
		Corda cuerda = new Corda();
		cuerda.setName(nombre);
		cuerda.setPrice(precio);
		cuerda.tocar();
		System.out.println("Nombre del instrumento: " + cuerda.getName() + " con un precio de: " + cuerda.getPrice());	
		}
		
		if (tipo==3) //3 tipo (mismo proceso que en el 3)
		{
		Percussio percusion = new Percussio();
		percusion.setName(nombre);
		percusion.setPrice(precio);
		percusion.tocar();
		System.out.println("Nombre del instrumento: " + percusion.getName() + " con un precio de: " + percusion.getPrice());	
		}
		
	}

	
}
