package es.Studium.tema3TabEjer18;

import java.util.Scanner;

/**
Antisimétrica - Realizar un programa en JAVA que lea una matriz 3x3 y diga por pantalla si es una matriz antisimétrica o no. NOTA: Antisimétrica si a[i][j]=-a[j][i]
 */
public class Antisimetrica 
{
	public static void main(String[] args) 
	{
		
		int tabla[][] = new int[3][3];
		boolean simetrica=true;
		Scanner teclado = new Scanner(System.in);
		//Metodo para introduccir datos a la matriz
		introducirDatos(tabla, teclado);
		//Metodo para comprobar si es simetrica la matriz
		simetrica = comprobarSimetria(tabla, simetrica);
		//Mostramos por pantalla el resultado
		imprimirResultado(simetrica);
		teclado.close();
	}

// Metodo para imprimir si es simetrica o no la matriz
	private static void imprimirResultado(boolean simetrica) {
		if(simetrica)
		{
			System.out.print("La matriz introducida es simetrica");
		}
		else
		{
			System.out.print("La matriz introducida no es simetrica");
		}
	}

// funcion para comparar si es simetrica la matriz
	private static Boolean comprobarSimetria(int[][] tabla, Boolean simetrica) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;(i<3)&&(simetrica);i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//Realizamos la comprobacion de si no es simetrica
				if(tabla[i][e]!=tabla[e][i])
				{
					//si no es simetrica cambiamos el valor a false
					simetrica=false;
				}
			}
		}
		return simetrica;
	}

	// Metodo para introducir los Datos de la matriz por el teclado
	private static void introducirDatos(int[][] tabla, Scanner teclado) {
		int i;
		int e;
		//ponemos un for para recorrer la fila del array
		for(i=0;i<3;i++)
		{
			//Ponemos un segundo for para recorrer la columna del array
			for(e=0;e<3;e++)
			{
				//pedimos que se introduzcan los datos, y leemos por teclado
				System.out.print("Escribir valor " + i + " , " + e + " : ");
	            tabla [i][e] = teclado.nextInt();
			}
		}
	}

}
