package main;

import funcionario.*;

// Classe principal para criar instâncias de funcionários e calcular os bônus
public class Main {
	public static void main(String[] args) {

		// Exibir o bônus do assalariado.
		Func assalariado = new Assalariado();
		System.out.println("Bônus do assalariado: R$" + assalariado.calcularBonus());

		// Exibindo o bônus do horista.
		Func horista = new Hora(80.0, 1750); // Exemplo: R$50/hora e 2000 horas por ano
		System.out.println("Bônus do horista: R$" + horista.calcularBonus());
	}
}
