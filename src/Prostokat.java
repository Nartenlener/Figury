// clasa odpowiedzialna za prostok¹t
public class Prostokat {

	static double a; // jeden bok
	static double b; // drugi bok
	static double pole; // pole
	
	static void obliczenia() {
		pole = a*b;
		System.out.println("Pole prostok¹ta o bokach " + a + " oraz " + b + " wynosi: " + pole);
	}
}
