package Exercici_1;

public class Percussio extends Instrumentos {
		public Percussio () {
			super ();
		}
		
		public Percussio (String name, float price)
		{
			super (name, price);
		}
		
		public void tocar()
		{
			System.out.println("estas tocando un instrumento de percusión");
		}
}
