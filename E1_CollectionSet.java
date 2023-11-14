package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class E1_CollectionSet {

	public static void main(String[] args) {
		
		Set<Integer> ordemNumerica = new HashSet <Integer>();
		int n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n1 = input.nextInt();
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n2 = input.nextInt();
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n3 = input.nextInt();
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n4 = input.nextInt();
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n5 = input.nextInt();
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n6 = input.nextInt();
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n7 = input.nextInt();
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n8 = input.nextInt();
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n9 = input.nextInt();
		System.out.println("\nDigite um valor inteiro sem repetir os números: ");
		n10 = input.nextInt();
		
		ordemNumerica.add(n1);
		ordemNumerica.add(n2);
		ordemNumerica.add(n3);
		ordemNumerica.add(n4);
		ordemNumerica.add(n5);
		ordemNumerica.add(n6);
		ordemNumerica.add(n7);
		ordemNumerica.add(n8);
		ordemNumerica.add(n9);
		ordemNumerica.add(n10);
		
		System.out.println(ordemNumerica);
		
		Iterator <Integer> iOrdemNumerica = ordemNumerica.iterator();
		
		while(iOrdemNumerica.hasNext()) {
			System.out.println(iOrdemNumerica.next());
		}
	}

}
