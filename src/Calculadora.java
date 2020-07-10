public class Calculadora {

	float totalEleitores;
	float validos;
	float votosBrancos;
	float nulos;
	float total;

	public float PercentualVotosValidos(float totalEleitores, float votosBrancos, float nulos) {
		return total = (totalEleitores - votosBrancos - nulos) / 10;
	}

	public float PercentualVotosBrancos(float totalEleitores, float votosBrancos) {
		return total = (votosBrancos / totalEleitores);
	}

	public float PercentualVotosNulos(float totalEleitores, float nulos) {
		return total = (totalEleitores / nulos);
	}

}
