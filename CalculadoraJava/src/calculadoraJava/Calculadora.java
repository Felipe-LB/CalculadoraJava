package calculadoraJava;

import java.util.Scanner;

public class Calculadora {
	static public void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	Numero n1 = new Numero();
	Numero n2 = new Numero();
	Numero resultado = new Numero();
	String opc = "S";
	
	while (opc.equalsIgnoreCase("S")) {
		System.out.println("Digite um valor: ");
		n1.setValor(sc.nextDouble());
		System.out.println("Digite outro valor: ");
		n2.setValor(sc.nextDouble());
		resultado.setValor(n1.getValor() + n2.getValor());
		System.out.println("A soma de " + n1.getValor() + " com " + n2.getValor() + " é: " + resultado.getValor());
		System.out.println("Deseja somar outra valor? ");
		opc = sc.next();
	}
	
	}
}
