//Klasa odpowiedzialna za tr�jk�ty
public class Trojkat {
	static double h; //wysoko��
	static double a; //podstawa tr�jk�ta
	static double pole; //pole tr�jk�ta
	
	static void obliczenia() {
		pole = a*h;
		System.out.println("Pole tr�jk�ta o boku " + a + " oraz wysoko�ci " + h + " wynosi: " + pole);
		
	} // koniec metody obliczenia

} // koniec clasy Trojkat