package lanches;
import java.util.Scanner;
public class Programa {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		Lanche lanche;
		int opcao = 0;
		
		System.out.println("Selecione o tipo de lanche:");
		System.out.println("[1] Sanduiches - [2] Bolos");
		opcao = teclado.nextInt();
		switch(opcao) {
		case 1:
			lanche = new Sanduiche();
			menuSanduiche((Sanduiche) lanche);
			break;
		case 2:
			lanche = new Bolo();
			menuBolo((Bolo)lanche);
			break;
		}
	}
	
	public static void menuSanduiche(Sanduiche lanche) {
		String[] ingredientes = new String[10];
		String ingrediente = "";
		int i = 0;
		int distancia;
		
		System.out.println("Você escolheu a opção sanduíche");
		System.out.println("Escolha os ingredientes (Digite 0 para finalizar a escolha)");
		
		while(i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;
		}
		
		lanche.setIngredientes(ingredientes);
		System.out.println("Informe a sua distância: ");
		distancia = teclado.nextInt();
		System.out.println(lanche.calculaTempo(distancia));
	}
	
	public static void menuBolo(Bolo lanche) {
		
	}
}
