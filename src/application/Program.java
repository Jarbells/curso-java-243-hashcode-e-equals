package application;

import entities.Client;

public class Program {

	public static void main(String[] args) {
	
		// Usando como critério de comparação nome e email.
		
		Client c1 = new Client("Maria", "maria@gmail.com");
		Client c2 = new Client("Alex", "alex@gmail.com");
		Client c3 = new Client("Maria", "maria31@gmail.com");
		
		String s1 = "teste";
		String s2 = "teste";
		String s3 = new String("teste");
		String s4 = new String("teste");
		
		System.out.println("s1 == s2? " + (s1 == s2)); // Comparou o valor interno por ser literal.
		System.out.println("s3 == s2? " + (s3 == s4)); // Assim vai forçar a comparar as referências.
		
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());
		System.out.println("-------------------------");
		System.out.println("C1 é igual a C2? " + c1.equals(c2));
		System.out.println("C1 é igual a C3? " + c1.equals(c3));
		System.out.println("C2 é igual a C1? " + c2.equals(c1));
		System.out.println("C2 é igual a C3? " + c2.equals(c3));
		System.out.println("C3 é igual a C1? " + c3.equals(c1));
		System.out.println("C3 é igual a C2? " + c3.equals(c2));

	}
}
