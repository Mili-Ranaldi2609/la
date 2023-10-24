/*10 */
import java.util.ArrayList;

import java.util.Random;

public class tp9 {

    public static void main(String[] args) {
        //1
        ArrayList<Integer> matrizA=new ArrayList<>();
        matrizA.add(3);
        matrizA.add(4);
        
        for (int i: matrizA){
            int [][] matrizAnew= llenarMatrizRandom(i);
            int [][] matrizBnew=llenarMatrizRandom(i);
            System.out.println("La matriz A es: ");
            mostrarMatriz(matrizAnew);
            System.out.println("La matriz B es: ");
            mostrarMatriz(matrizBnew);
            int[][] matrizCActual = new int[matrizAnew.length][matrizAnew[0].length];
            sumarMatrices(matrizAnew, matrizBnew, matrizCActual);
            System.out.println("El resultado de la suma es: ");
            mostrarMatriz(matrizCActual);
        }   
        
        //2
        ArrayList<Integer> matriz1=new ArrayList<>();
        matriz1.add(3);
        matriz1.add(4);
        for(int i :matriz1){
            int [][] matriz1new= llenarMatrizRandom(i);
            int [][] matriz2new=llenarMatrizRandom(i);
            System.out.println("La matriz 1 es: ");
            mostrarMatriz(matriz1new);
            System.out.println("La matriz 2 es: ");
            mostrarMatriz(matriz2new);
            int [][]res=multiplicarMatrices(matriz1new, matriz2new);
            System.out.println("El resultado de multiplicar 2 matrices: ");
            mostrarMatriz(res);
        }
        
        //3
        
        //10
        ArrayList<Integer> matriz_identidad=new ArrayList<>();
        matriz_identidad.add(3);
        matriz_identidad.add(4);
        matriz_identidad.add(5);
        for( int n: matriz_identidad){
            int [][] res=matrizIdentidad(n);
            System.out.println("Matriz Identidad de "+n+"X"+n+" : ");
            mostrarMatriz(res);
        }

        //11
        ArrayList<Integer> matrizP_I = new ArrayList<>();
        matrizP_I.add(3);
        matrizP_I.add(3);
        for (int n: matrizP_I){
            int [][] ma=llenarMatrizRandom(n);
            System.out.println("La matriz se ve: ");
            mostrarMatriz(ma);
            ContParesImpares(ma);
            int[] resultado11 = ContParesImpares(ma);
            System.out.println("Cantidad de elementos pares: " + resultado11[0]);
            System.out.println("Cantidad de elementos impares: " + resultado11[1]);
        }

        //12
        ArrayList<int[]> matriz90 = new ArrayList<>();
        matriz90.add(new int[] {3, 3});
        matriz90.add(new int[] {4, 2});
        matriz90.add(new int[] {2, 4});

        for (int[] dimensiones : matriz90) {
            int filas = dimensiones[0];
            int columnas = dimensiones[1];
            int[][] matriz = llenarMatrizRandom_fc(filas, columnas);
            
            System.out.println("La matriz original:");
            mostrarMatriz(matriz);

            int[][] rotar90 = rotarMatriz90Grados(matriz);
            System.out.println("Matriz Rotada 90º:");
            mostrarMatriz(rotar90);
        }
    }
    public static void sumarMatrices(int[][] matrizA, int[][] matrizB, int[][] matrizC) {//funcion ejercicio 1
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
        }
        }
        }
    public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {//funcion ejercicio 2
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return resultado;}
    
    public static int[][] matrizIdentidad(int n){//funcion ejercicio 10
        int[][] matriz = new int[n][n];
        for(int f = 0; f < n; f++){
            for(int c = 0; c < n; c++){
                if(f == c){
                    matriz[f][c]= 1;
                }else{
                    matriz[f][c]=0;
                }
            }
        }
        return matriz;} 
    public static int[] ContParesImpares(int[][] matriz) {//funcion ejercicio 11
        int pares =0;
        int impares =0;
        for (int[] fila: matriz) {
            for (int elemento : fila) {
                if(elemento%2==0){
                    pares++;
                }else{
                    impares++;
                }
            }
            }
        int [] resultado={pares, impares};
        return resultado;}
    public static int[][] rotarMatriz90Grados(int[][] matriz) {//funcion ejercicio 12
        int filas = matriz.length;
        int columnas = matriz[0].length;
        //Invertimos filas y columnas
        int[][] matrizRotada = new int[columnas][filas];
        // Rellenamos la nueva matriz con los elementos rotados
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizRotada[j][filas - 1 - i] = matriz[i][j];
                }
            }
        return matrizRotada;}
/////////////////////////////////////
//funciones generales//
public static void mostrarMatriz(int[][] matriz) {
    for (int i = 0; i < matriz.length; i++) {
        for (int j = 0; j < matriz[0].length; j++) {
        System.out.print(matriz[i][j] + " ");
    }
        System.out.println();
    }
}
public static int[][] llenarMatrizRandom(int n) {
        int[][] matriz = new int[n][n];
        Random random = new Random();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

        return matriz;
}
    public static int[][] llenarMatrizRandom_fc(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Random random = new Random();

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matriz[i][j] = random.nextInt(50) + 1;
            }
        }

        return matriz;
    }}

