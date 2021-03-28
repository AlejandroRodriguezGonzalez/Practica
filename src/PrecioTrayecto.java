import java.util.Scanner;

public class PrecioTrayecto {
	public static final double PKMMOTO=0.2;
	public static final double PKMCOCHE=0.28;

	public static void main(String[] args) {

	Coche();
		
		
	}

	public static double kilometros() {
		System.out.println("Escriba la distancia en Kilómetros");
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		return km;
	}

	public static double precioCoche() {
		return PKMCOCHE*kilometros();
	}
	
	public static void mostrar(double p) {
		System.out.println("El coste del trayecto sería de: "+String.format("%.2f", p)+" euros");
	}
	public static void Coche() {
		mostrar(precioCoche());
	}
}
