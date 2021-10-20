package geometria;

public class Geometria1 {

	private static final double Pi = 3.14;
	private static int radio;

	public static void main(String[] args) {
		radio = 13;

		double perimetro = 2 * Pi * radio;
		System.out.println("El perímetro del círculo es " + perimetro);

		double superficie = Pi * radio * radio;
		System.out.println("La superficie del círculo es " + superficie);
	}

}