import java.util.Locale;
import java.util.Scanner;

public class java {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String sexo = "Masculino";
		String nome = "Francisnei";
		int idade = 51;
		double renda = 150000;
		String conhecimento = "Android Studio, JAVA, LINUX, C, C#";
		
	
		System.out.printf(" %s\n tem : %d anos\n ganha: R$ %.2f reais %n %s sexo:\n  Experiência %s\n", nome, idade, renda, sexo, conhecimento);
		
		Locale.setDefault(Locale.US);
	
		
		sc.close();
	}

}
