import java.util.Scanner;

/**
*@author Alejandro Rodriguez Gonzalez
*@version 3.0
*/
public class kilometros {
	/**
	 * @return devuelve los kilometros introducidos por el usuario
	 */
	public static double pedir() {
		System.out.println("Escriba la distancia en Kilómetros");
		Scanner sc = new Scanner(System.in);
		double km = sc.nextDouble();
		return km;
	}
}
