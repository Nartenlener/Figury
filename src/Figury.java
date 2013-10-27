import java.util.Scanner;

public class Figury {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Program obliczaj¹cy pole kilku figur
		//trójk¹t, prostokat, ko³o
		
		Scanner dane = new Scanner(System.in);
		int x = 0;
			
		int figura; //String musi byæ z wielkiej litery bo jest to oddzielna KLASA!!!
				
		do{
			System.out.println("W celu wybrania figury dla którje przeprowadziæ rachunki wybierz odpowiednio:");
			System.out.println("Dla prostok¹tu: 1");
			System.out.println("Dla trójk¹tu: 2");
			System.out.println("Dla ko³a: 3");
			figura = dane.nextInt();
			
		switch(figura) {
		
		case 1: //prostok¹t	
			
			System.out.println("Podaj wymiar boku A");
			Prostokat.a = dane.nextDouble();
			
			System.out.println("Podaj wymiar boku B");
			Prostokat.b = dane.nextDouble();
			Prostokat.obliczenia();
			
			x = 1;
			break;
			
		case 2: //trójk¹t
			
			System.out.println("Podaj wymiar podstawy:");
			Trojkat.a = dane.nextDouble();
			
			System.out.println("Podaj wysokoœæ:");
			Trojkat.h = dane.nextDouble();
			Trojkat.obliczenia();
			
			x = 1;
			break;
			
		case 3: //ko³o
			
			System.out.println("Podaj promieñ ko³a:");
			Kolo.r = dane.nextDouble();
			
			Kolo.obliczenia();
			x = 1;
			break;
			
		case 4: //trapez
			
			System.out.println("Podaj wymiar dolnej podstawy trapezu:");
			Trapez.dolnaPodstawa = dane.nextDouble();
			
			System.out.println("Podaj wymiad górnej podstawy trapezu:");
			Trapez.gornaPodstawa = dane.nextDouble();
			
			System.out.println("Podaj wysokosc:");
			Trapez.wysokosc = dane.nextDouble();
			
			Trapez.obliczenia();
			x = 1;
			break;
			
		default:
			System.out.println("Podana wartoœæ jest b³êdna. Chcesz zacz¹æ jeszcze raz?");
			x = dane.nextInt();
		}
		
		}while(x==1);

		System.out.println("Koniec programu");
	} // koniec metody main

} // koniec klasy Figury
