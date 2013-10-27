
public class Trapez {
	
	static double dolnaPodstawa;
	static double gornaPodstawa;
	static double wysokosc;
	
	static void obliczenia()
	{
		double wynik;
		wynik = ((dolnaPodstawa+gornaPodstawa)/2)*wysokosc;
		System.out.println("Pole trapezu o d³ugoœci dolnej podstawy " + dolnaPodstawa + ", d³ugoœci górnej podstawy " + gornaPodstawa + " i wynosi: " + wysokosc + "/n wynosi" + wynik);
	}

}
