import java.util.Locale;
import java.util.Scanner;

public class java {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String sexo = "Masculino";
		String nome = "Francisnei";
		int idade = 51;
		double renda = 150000;
		
	
		System.out.printf(" %s\n tem : %d anos\n ganha: R$ %.2f reais %n %s sexo:\n", nome, idade, renda, sexo);
		
		Locale.setDefault(Locale.US);
	
		
		sc.close();
	}

}
