
public class Trapez {
	
	static double dolnaPodstawa;
	static double gornaPodstawa;
	static double wysokosc;
	
	static void obliczenia()
	{
		double wynik;
		wynik = ((dolnaPodstawa+gornaPodstawa)/2)*wysokosc;
		System.out.println("Pole trapezu o d�ugo�ci dolnej podstawy " + dolnaPodstawa + ", d�ugo�ci g�rnej podstawy " + gornaPodstawa + " i wynosi: " + wysokosc + "/n wynosi" + wynik);
	}

}
