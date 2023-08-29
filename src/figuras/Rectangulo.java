package figuras;

public class Rectangulo {

	private Double base, altura;

	public Rectangulo(Double base, Double altura) {
		this.base = base;
		this.altura = altura;
	}

	public Double getPerimetro() {
		return this.altura * 2 + this.base * 2;
	}

}
