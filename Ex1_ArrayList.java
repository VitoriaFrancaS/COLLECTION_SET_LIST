package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Ex1_ArrayList {

	public static void main(String[] args) {
		
		List<String> listaCor = new ArrayList<String>();
		String cor;
		
		Scanner input = new Scanner(System.in);
		 
		System.out.println("\n Digite o nome de uma cor: ");
		cor = input.next();
		listaCor.add(cor);

		System.out.println("\n Digite o nome de uma cor: ");
		cor = input.next();
		listaCor.add(cor);

		System.out.println("\n Digite o nome de uma cor: ");
		cor = input.next();
		listaCor.add(cor);

		System.out.println("\n Digite o nome de uma cor: ");
		cor = input.next();
		listaCor.add(cor);

		System.out.println("\n Digite o nome de uma cor: ");
		cor = input.next();
		listaCor.add(cor);
		
		System.out.println("Lista de cores: ");
		System.out.println(listaCor);
		
		Collections.sort(listaCor);
		
		System.out.println("\n Lista de cores em ordem crescente");
		System.out.println(listaCor);

		
	}

}
