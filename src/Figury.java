import java.util.Scanner;

public class Figury {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program obliczaj�cy pole kilku figur
		//tr�jk�t, prostokat, ko�o
		
		Scanner dane = new Scanner(System.in);
		int x = 0;
			
		int figura; //String musi by� z wielkiej litery bo jest to oddzielna KLASA!!!
				
		do{
			System.out.println("W celu wybrania figury dla kt�rje przeprowadzi� rachunki wybierz odpowiednio:");
			System.out.println("Dla prostok�tu: 1");
			System.out.println("Dla tr�jk�tu: 2");
			System.out.println("Dla ko�a: 3");
			figura = dane.nextInt();
			
		switch(figura) {
		
		case 1: //prostok�t	
			
			System.out.println("Podaj wymiar boku A");
			Prostokat.a = dane.nextDouble();
			
			System.out.println("Podaj wymiar boku B");
			Prostokat.b = dane.nextDouble();
			Prostokat.obliczenia();
			
			x = 1;
			break;
			
		case 2: //tr�jk�t
			
			System.out.println("Podaj wymiar podstawy:");
			Trojkat.a = dane.nextDouble();
			
			System.out.println("Podaj wysoko��:");
			Trojkat.h = dane.nextDouble();
			Trojkat.obliczenia();
			
			x = 1;
			break;
			
		case 3: //ko�o
			
			System.out.println("Podaj promie� ko�a:");
			Kolo.r = dane.nextDouble();
			
			Kolo.obliczenia();
			x = 1;
			break;
			
		case 4: //trapez
			
			System.out.println("Podaj wymiar dolnej podstawy trapezu:");
			Trapez.dolnaPodstawa = dane.nextDouble();
			
			System.out.println("Podaj wymiad g�rnej podstawy trapezu:");
			Trapez.gornaPodstawa = dane.nextDouble();
			
			System.out.println("Podaj wysokosc:");
			Trapez.wysokosc = dane.nextDouble();
			
			Trapez.obliczenia();
			x = 1;
			break;
			
		default:
			System.out.println("Podana warto�� jest b��dna. Chcesz zacz�� jeszcze raz?");
			x = dane.nextInt();
		}
		
		}while(x==1);

		System.out.println("Koniec programu");
	} // koniec metody main

} // koniec klasy Figury
