package lanches;
import java.util.Scanner;
public class Programa {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		Lanche lanche;
		int opcao = 0;
		
		System.out.println("Selecione o tipo de lanche:");
		System.out.println("[1] Sanduiches - [2] Massas - [3] Bolos");
		opcao = teclado.nextInt();
		teclado.nextLine();
		switch(opcao) {
		case 1:
			lanche = new Sanduiche();
			menuSanduiche((Sanduiche) lanche);
			break;
		case 2:
			lanche = new Massa();
			menuMassa((Massa)lanche);
			break;
		case 3:
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
		System.out.println("Escolha os ingredientes (Digite 0 para finalizar a escolha): ");
		
		while(i < 10 && !ingrediente.equals("0")) {
			ingrediente = teclado.nextLine();
			ingredientes[i] = ingrediente;
			i++;
		}
		
		lanche.setIngredientes(ingredientes);
				
		System.out.println("Informe a sua distância: ");
		distancia = teclado.nextInt();
		
		lanche.setPreco(8.50);
		
		System.out.println("-----------LANCHONETE DH-----------");
		System.out.println("Informações do Pedido");
		System.out.println("Tipo de Lanche: Sanduíche");
		System.out.println("Ingredientes: ");
		for(int j=0; j < i ;j++) {
			if((!lanche.getIngredientes()[j].equals(""))&&(!lanche.getIngredientes()[j].equals(null))&&(!lanche.getIngredientes()[j].equals("0"))) {
				System.out.println("-"+lanche.getIngredientes()[j]);
			}			
		}
		System.out.println("Preço: R$"+lanche.getPreco());
		System.out.println("Tempo de Entrega: "+lanche.calculaTempo(distancia)+" min");
	}
	
	public static void menuMassa(Massa lanche) {
		int massaEscolhida;
		String molho;
		int distancia;
		
		System.out.println("Você escolheu a opção massa");
		System.out.println("Escolha a massa desejada ([1] - Macarrão, [2] - Pizza, [3] - Lasanha): ");
		massaEscolhida = teclado.nextInt();
		teclado.nextLine();
		
		switch(massaEscolhida) {
		case 1:
			lanche.setMassa(massaEscolhida);
			break;
		case 2:
			lanche.setMassa(massaEscolhida);
			break;
		case 3:
			lanche.setMassa(massaEscolhida);
			break;
		default:
			System.out.println("Massa escolhida indisponível");
			break;
		}
		
		System.out.println("Escolha o molho desejado: ");
		molho = teclado.nextLine();
		lanche.setMolho(molho);
		
		System.out.println("Informe a sua distância: ");
		distancia = teclado.nextInt();
		
		System.out.println("-----------LANCHONETE DH-----------");
		System.out.println("Informações do Pedido");
		System.out.println("Tipo de Lanche: Massa");
		System.out.println("Tipo de Massa Escolhida: "+lanche.getMassa());
		System.out.println("Molho Escolhido: "+lanche.getMolho());
		System.out.println("Preço: R$"+lanche.getPreco());
		System.out.println("Tempo de Entrega: "+lanche.calculaTempo(distancia)+" min");		
	}
	
	public static void menuBolo(Bolo lanche) {
		String massa;
		String recheio;
		String cobertura;
		int distancia;
		
		System.out.println("Você escolheu a opção bolo");
		System.out.println("Escolha a massa desejada: ");
		massa = teclado.nextLine();
		lanche.setMassa(massa);
		
		System.out.println("Escolha o recheio desejado: ");
		recheio = teclado.nextLine();
		lanche.setRecheio(recheio);
		
		System.out.println("Escolha a cobertura desejada: ");
		cobertura = teclado.nextLine();
		lanche.setCobertura(cobertura);
		
		System.out.println("Informe a sua distância: ");
		distancia = teclado.nextInt();
		
		lanche.setPreco(50);
		
		System.out.println("-----------LANCHONETE DH-----------");
		System.out.println("Informações do Pedido");
		System.out.println("Tipo de Lanche: Bolo");
		System.out.println("Massa Escolhida: "+lanche.getMassa());
		System.out.println("Recheio Escolhido: "+lanche.getRecheio());
		System.out.println("Cobertura Escolhida: "+lanche.getCobertura());
		System.out.println("Preço: R$"+lanche.getPreco());
		System.out.println("Tempo de Entrega: "+lanche.calculaTempo(distancia)+" min");
	}
	
}
