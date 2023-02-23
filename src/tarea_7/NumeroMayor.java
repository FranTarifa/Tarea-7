package tarea_7;

import java.util.Scanner;

public class NumeroMayor {

	public static void main(String[] args) {
		int [] numerosAleatorios;
		
		numerosAleatorios = new int [10];
		int mayor = numerosAleatorios[0];
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Ingrese 10 numeros aleatorios:");
        for(int i=1; i < numerosAleatorios.length ; i++) {
        	numerosAleatorios[i] = scanner.nextInt();
        	if(numerosAleatorios[i] > mayor) {
        		mayor = numerosAleatorios [i];
        	}
        }
        System.out.println("El numero mayor es:" + mayor);

	}

}
