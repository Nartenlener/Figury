// Klasa odpowiedzialna za pole ko�a
public class Kolo {

	static double r; //promie� ko�a
	static double pole; // pole ko�a
	
	static void obliczenia() {
		pole = Math.PI*Math.pow(r, 2);
		System.out.println("Pole ko�a o promieniu " + r + " wynosi: " + pole);
	}
}
