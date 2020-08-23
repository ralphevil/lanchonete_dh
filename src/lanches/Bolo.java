package lanches;

public class Bolo extends Lanche {
	private String massa;
	private String cobertura;
	private String recheio;
	private int tempoPadrao = 15;
	
	public String getMassa() {
		return massa;
	}
	public void setMassa(String massa) {
		this.massa = massa;
	}
	public String getCobertura() {
		return cobertura;
	}
	public void setCobertura(String cobertura) {
		this.cobertura = cobertura;
	}
	public String getRecheio() {
		return recheio;
	}
	public void setRecheio(String recheio) {
		this.recheio = recheio;
	}
	
	@Override
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + this.tempoPadrao;
	}
}
