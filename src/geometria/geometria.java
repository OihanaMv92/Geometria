package geometria;

public class geometria
{


	private static final double pi = 3.14;

	public static void main(String[] args) {
		int radio = 13; // radio del c�rculo;

		extracted(radio);

		longitud(radio);
	}

	private static void longitud(int radio)
	{
		double superficie = pi * radio * radio;
		System.out.println("La superficie del c�rculo es " + superficie);
	}

	private static void extracted(int radio)
	{
		double longitud = 2 * pi * radio;
		System.out.println("El per�metro del c�rculo es " + longitud);
	}


}
