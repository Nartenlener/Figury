// Klasa odpowiedzialna za pole ko³a
public class Kolo {

	static double r; //promieñ ko³a
	static double pole; // pole ko³a
	
	static void obliczenia() {
		pole = Math.PI*Math.pow(r, 2);
		System.out.println("Pole ko³a o promieniu " + r + " wynosi: " + pole);
	}
}
