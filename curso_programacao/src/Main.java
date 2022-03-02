import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");
		
		int y = 32;
		
		System.out.println(y);
		
		double x = 10.37784;
		
		System.out.println(x);
		
	
		System.out.printf("%.2f%n", x); //quebra de casas decimais
		System.out.printf("%.4f%n", x); //quebra de casas decimais
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f%n", x); //quebra de casas decimais
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f METROS%n", x);
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		


	}

}
