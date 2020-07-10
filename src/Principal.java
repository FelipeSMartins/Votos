
public class Principal {

	public static void main(String[] args) {

		Calculadora cal = new Calculadora();
		System.out.println("Votos Validos " + cal.PercentualVotosValidos(1000, 150, 50) + "%");
		System.out.println("Votos Brancos " + cal.PercentualVotosBrancos(1000, 150) + "%");
		System.out.println("Votos Nulos " + cal.PercentualVotosNulos(50, 1000) + "%");
	}

}
