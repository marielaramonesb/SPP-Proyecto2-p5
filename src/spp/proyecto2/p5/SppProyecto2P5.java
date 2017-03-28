/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.proyecto2.p5;
import java.util.Scanner;
/**
 *
 * @author marielaramonesbalvoa
 */
public class SppProyecto2P5 {
//Mariela Ramones Balvoa
//Catalina Guadalupe Domínguez Garza
//Kevin Gerardo Hinojosa Castellanos
//Alejandro García Monroy
//Lisdy Rohmann
static Scanner entrada = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
    int n = 0,m = 0;
		
		while (m<1) {
			System.out.println("Filas de la matriz: ");
			m = entrada.nextInt();
			if (m<1)
				System.out.println("Debe ser un valor entero");
		}
		while (n<1) {
			System.out.println("Columnas de la matriz: ");
			n = entrada.nextInt();
			if (n<1)
				System.out.println("Debe ser un valor entero");
		}
		
		pedir_numeros(n,m);
	}
	
	public static void pedir_numeros (int n, int m) {
		
		int[][] matriz = new int[m][n];
		int[] sumas = new int[m];
		int suma_fila;
		
		for (int i = 0; i < m; i++) {
			suma_fila = 0;
			for (int j = 0; j < n; j++) {
				System.out.println("Numero en posicion [" + (i+1) + "] [" + (j+1) + "]:");
				matriz[i][j] = entrada.nextInt();
				if (matriz[i][j]<1) {
					j--;
					System.out.println("Debe ser un valor entero");
				} else {
					suma_fila+=matriz[i][j];
				}
			}
			sumas[i] = suma_fila;
		}
		
		imprimir_resultados(sumas,m);
		
	}
	
	public static void imprimir_resultados (int sumas[], int m) {
		for (int i = 0; i < m; i++) {
			System.out.println("Suma fila [" + (i+1) + "]: " + sumas[i]);
		}
	}

}
