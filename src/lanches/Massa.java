package lanches;

public class Massa extends Lanche {
	private String massa;
	private String molho;
	private int tempoPadrao = 30;
	
	public String getMassa() {
		return massa;
	}
	
	public void setMassa(int massaEscolhida) {
		switch(massaEscolhida) {
		case 1:
			this.massa = "Macarrão";
			super.setPreco(12);
			break;
		case 2:
			this.massa = "Pizza";
			super.setPreco(20);
			break;
		case 3:
			this.massa = "Lasanha";
			super.setPreco(25);
			break;
		}
	}
	
	public String getMolho() {
		return molho;
	}
	
	public void setMolho(String molho) {
		this.molho = molho;
	}
	
	@Override
	public int calculaTempo(int distancia) {
		return super.calculaTempo(distancia) + this.tempoPadrao;
	}
	
}
