import java.util.Scanner;

	/**
	*@author Alejandro Rodriguez Gonzalez
	*@version 3.0
	*/
public class PrecioTrayecto {
	public static final double PKMMOTO=0.2;
	public static final double PKMCOCHE=0.28;
	public static final double PKMFURGONETA= 0.48;
	public static final double PKMCAMION=1.0285;

	public static void main(String[] args) {

		int op = menu();
		
		while (op != 5)
		{
			switch (op)
			{
			case 1: Moto(); break;
			case 2: Coche(); break;
			case 3: Furgoneta(); break;
			case 4: Camion(); break;
			}
			op = menu();
			
		}
		System.out.println("Fin de programa");	
	}
	
	/**
	 * @return devuelve la opcion elegida
	 */
	public static  int menu()
	{
		Scanner sc = new Scanner(System.in);
		int op = 0;
		while (op < 1 || op > 5)
		{
			System.out.println("1. Moto");
			System.out.println("2. Coche");
			System.out.println("3. Furgoneta");
			System.out.println("4. Camión");
			System.out.println("5. Salir");
				
			op = sc.nextInt();
		}
		return op;
	}
	
	public static void Moto() {
		mostrar.m(PKMMOTO*kilometros.pedir());
	}
	public static void Coche() {
		mostrar.m(PKMCOCHE*kilometros.pedir());
	}
	public static void Furgoneta() {
		mostrar.m(PKMFURGONETA*kilometros.pedir());
	}
	public static void Camion() {
		mostrar.m(PKMCAMION*kilometros.pedir());
	}	
}
