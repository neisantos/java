import java.util.Locale;
import java.util.Scanner;

public class java {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome = "Francisnei";
		int idade = 51;
		double renda = 50000;
	
		System.out.printf(" %s\n tem %d anos\n e ganha R$ %.2f reais %n", nome, idade, renda);
		
		Locale.setDefault(Locale.US);
	
		
		sc.close();
	}

}
