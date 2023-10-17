import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
public class tp8Practica {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        /*Ejercicio 1 */
        System.out.println("Ejercicio 1 (sumando 2 matrices)");
        int[][] matrizA = new int[3][3];
        int[][] matrizB = new int[3][3];
        int[][] matrizC = new int[3][3];

        System.out.println("Ingrese los valores de la matriz A:");
        llenarMatriz(matrizA, scanner);
        System.out.println("Ingrese los valores de la matriz B:");
        llenarMatriz(matrizB, scanner);
    
        sumarMatrices(matrizA, matrizB, matrizC);
    
        System.out.println("La matriz suma es:");
        mostrarMatriz(matrizC);
        /*Ejercicio 2*/
        System.out.println("Ejercicio 2 (Multiplicando dos matrices:) ");
        int [][] matriz1= new int[3][3];
        int [][] matriz2= new int[3][3];
        llenarMatrizrandom(matriz1);
        System.out.println("Matriz 1: ");
        mostrarMatriz(matriz1);
        llenarMatrizrandom(matriz2);
        System.out.println("Matriz 2: ");
        mostrarMatriz(matriz2);
        int[][] resultadoMulti = multiplicarMatrices(matriz1, matriz2);
        System.out.println("El resultado de multiplicar 2 matrices: ");
        mostrarMatriz(resultadoMulti);

        /*Ejercicio 3 */
        System.out.println("Ejercicio 3 (matriz traspuesta)");
        int [][] matrizt= new int[3][3];
        llenarMatrizrandom(matrizt);
        System.out.println("La matriz original se ve: ");
        mostrarMatriz(matrizt);
        System.out.println("La matriz transpuesta se ve:");
        int [][] resultado=matrizTranspuesta(matrizt);
        mostrarMatriz(resultado);
        /*Ejercicio 4 */
        System.out.println("Ejercicio 4 (matriz simetrica, debe ser igual a su traspuesta)");
        int [][] matrizOriginal4= new int[3][3];
        llenarMatrizrandom(matrizOriginal4);
        System.out.println("La matriz original se ve: ");
        mostrarMatriz(matrizOriginal4);
        System.out.println("La matriz transpuesta se ve:");
        int [][] resultado4=matrizTranspuesta(matrizOriginal4);
        mostrarMatriz(resultado4);
        boolean iguales4=igualdadMatricesTranspuestas(matrizOriginal4, resultado4);
        if(iguales4){
            System.out.println("Las matrices ingresadas son iguales");
        }else{
            System.out.println("Las matrices ingresadas no son iguales");
        }
        /*Ejercicio 5 */
        System.out.println("Ejercicio 5(producto escalar )");
        int [] array5= new int[3];
        llenarArrayrandom(array5);
        System.out.println("Array unidimensional: ");
        System.out.println(Arrays.toString(array5));
        System.out.println("Escribe un numero:");
        int num5=scanner.nextInt();
        int [] product=productoEscalar(array5, num5);
        System.out.println("El resultado de su producto escalar es: ");
        System.out.println(Arrays.toString(product));

        /*Ejercicio 6 */
        System.out.println("Ejercicio 6 (sumando todos los  elementos de una matriz)");
        int [][] matriz6= new int[3][3];
        llenarMatrizrandom(matriz6);
        System.out.println("Elementos a sumar");
        mostrarMatriz(matriz6);
        int resSuma6=sumarElementosMatriz(matriz6);
        System.out.println("La suma da: "+resSuma6);

        /*Ejercicio 7 */
        System.out.println("Ejercicio 7 (encontrando el numero maximo de una matriz)");
        int [][] matriz= new int[4][4];
        Random random = new Random();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=random.nextInt(50 - 1 + 1) + 1;
            }
        }
        System.out.println("Llenando el array: ");
        mostrarMatriz(matriz);
        int maximo = matriz[0][0];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] > maximo) {
                    maximo = matriz[i][j];
                }
            }
        }
        System.out.println("El numero maximo de la matriz es : "+maximo);
        /*Ejercicio 8 */
        System.out.println("Ejercicio 8 (creando la  funcion para escribir una fila especifica)");
        int [][] matriz8= new int [3][3];

        for (int i = 0; i < matriz8.length; i++) {
            for (int j = 0; j < matriz8.length; j++) {
                matriz8[i][j]=random.nextInt(15 - 1 + 1) + 1;
            }
        }
        System.out.println("Llenando la matriz");
        mostrarMatriz(matriz8);
        int rowToSum=0;
        System.out.println("Ingrese la fila que desea sumar.");
        rowToSum =scanner.nextInt(); 
        int sum = sumRow(matriz8, rowToSum);

        System.out.println("La suma de la fila " + rowToSum + " es: " + sum);

        /*Ejercicio 9 */
        System.out.println("Ejercicio 9 (determinar si una matriz es diagonal o no )");
        int[][] matriz9 = new int[3][3];
        llenarMatriz(matriz9, scanner);
        System.out.println("La matriz se ve: ");
        mostrarMatriz(matriz9);
        boolean isDiagonal = isDiagonalMatrix(matriz9);

        if (isDiagonal) {
            System.out.println("La matriz es diagonal.");
        } else {
            System.out.println("La matriz no es diagonal.");
        }
        /*Ejercicio 10 */
        System.out.println("Ejercicio 10 (creando una matriz identidad)");
        int tamano = 4;//definir tamaño de la matriz identidad a crear
        int[][] resultadoMatrizIdentidad = matrizIdentidad(tamano);
        System.out.println("Matriz Identidad de tamaño "+ tamano);
        mostrarMatriz(resultadoMatrizIdentidad);
        /*Ejercicio 11 */
        System.out.println("Ejercicio 11 (contar elementos pares e impares de una matriz)");
        int [][] matriz11= new int[3][3];
        llenarMatrizrandom(matriz11);
        System.out.println("La matriz es: ");
        mostrarMatriz(matriz11);
        ContParesImpares(matriz11);
        int[] resultado11 = ContParesImpares(matriz11);
        System.out.println("Cantidad de elementos pares: " + resultado11[0]);
        System.out.println("Cantidad de elementos impares: " + resultado11[1]);
        /*Ejercicio 12 */
        System.out.println("Ejercicio 12(invertir matriz 90º)");
        int [][] matriz12= new int[3][2];
        llenarMatrizrandom(matriz12);
        System.out.println("Matriz ORIGINAL");
        mostrarMatriz(matriz12);
        int [][] rotar90=rotarMatriz90Grados(matriz12);
        System.out.println("Matriz Invertida 90º:");
        mostrarMatriz(rotar90);
        /*Ejercicio 13 */
        System.out.println("Ejercicio 13 (buscar valor en la matriz)");
        int [][] matriz13= new int[3][3];
        llenarMatrizrandom(matriz13);
        System.out.println("Ingresa un numero para buscar en la matriz");
        int num13=scanner.nextInt();
        System.out.println("Matriz : ");
        mostrarMatriz(matriz13);
        int numrepeticiones=CantAparicionesNum(matriz13,num13);
        System.out.println("El número "+ num13+" aparece "+numrepeticiones+" en la matriz");
        /*Ejercicio 14 */
        System.out.println("Ejercicio 14 (invertir filas de la matriz)");
        int [][] matriz14= new int[3][3];
        llenarMatrizrandom(matriz14);
        System.out.println("Matriz original");
        mostrarMatriz(matriz14);
        int[][] cambiarFilas = invertirFilas(matriz14);
        System.out.println("Resultado de invertir las filas de la matriz: ");
        mostrarMatriz(cambiarFilas);
        /*Ejercicio 15 */
        System.out.println("Ejercicio 15 (sumar elementos de las diagonales)");
        int [][] matriz15= new int[3][3];
        llenarMatrizrandom(matriz15);
        System.out.println("La matriz es: ");
        mostrarMatriz(matriz15);
        int SumElementosDiagonal = sumarDiagonales(matriz15);
        System.out.println("La suma de los elementos ubicados en las diagonales es: "+ SumElementosDiagonal);
        /*Ejercicio 16 */
        System.out.println("Ejercicio 16 (verificar si una matriz es ortogonal)");
        int [][] matriz16= new int[3][3];
        System.out.println("Ingresa los valores de la matriz");
        llenarMatriz(matriz16, scanner);
        System.out.println("La matriz se ve ");
        mostrarMatriz(matriz16);
        if (esMatrizOrtogonal(matriz16)){
            System.out.println("Es ortogonal");
        }else{
            System.out.println("No es ortogonal");
        }
        /*Ejercicio 17 */
        System.out.println("Ejercicio 17 (minimo de la fila)");
        int [][] matriz17= new int[3][3];
        llenarMatrizrandom(matriz17);
        System.out.println("La matriz se ve ");
        mostrarMatriz(matriz17);
        int[] minimos = minimoPorFila(matriz17);
        for (int i = 0; i < minimos.length; i++) {
            System.out.println("Mínimo de la fila " + (i+1) + ": " + minimos[i]);
        }
        /*Ejercicio 18 */
        System.out.println("Ejercicio 17 (minimo de la fila)");
        int [][] matriz18= new int[3][3];
        llenarMatrizrandom(matriz18);
        System.out.println("La matriz se ve ");
        mostrarMatriz(matriz18);
        int [][] matriz18_2= new int[3][3];
        llenarMatrizrandom(matriz18_2);
        System.out.println("La matriz se ve ");
        mostrarMatriz(matriz18_2);
        System.out.println("El producto de matrices es: ");
        int [][] prodMatriz = productoMatrices(matriz18, matriz18_2);
        mostrarMatriz(prodMatriz);
        /*Funcion ejercicio 2 */
    }public static int[][] multiplicarMatrices(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matriz1[i][j] * matriz2[i][j];
            }
        }
        return resultado;
        /*funcion ejercicio 3 */
    } public static int[][] matrizTranspuesta(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        //Cambio filas por columnas y columnas por filas
        int[][] resultado = new int[columnas][filas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                //Intercambio los valores
                resultado[j][i] = matriz[i][j];
            }
        }
        return resultado;
        /*Funcion ejercicio 4 */
    }public static boolean igualdadMatricesTranspuestas(int[][] matriz1, int[][] matriz2) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (matriz1[i][j] != matriz2[i][j]) {
                return false; // Si hay alguna diferencia, retorna false
                }
            }
        }
    return true; // Si no se encontraron diferencias, retorna true
    }/*Funcion ejercicio 5 */
    public static int [] productoEscalar(int []vector, int escalar){
        int [] res= new int[vector.length];
        for (int i=0; i<vector.length;i++){
            res[i]=vector[i]*escalar;
        }
        return res;
    }

    /*funcion ejercicio 6 */
    public static int sumarElementosMatriz(int[][] matriz1) {
        int filas = matriz1.length;
        int columnas = matriz1[0].length;
        int resultado = 0;
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado += matriz1[i][j];
            }
        }
        return resultado;
    }
    public static int sumRow(int[][] matrix, int rowIndex) {/*funcion ejercicio 8 */
        if (matrix == null || rowIndex < 0 || rowIndex >= matrix.length) {
            return 0; // Si la matriz es nula o el índice de fila está fuera de rango, devolvemos 0.
        }

        int sum = 0;
        for (int i = 0; i < matrix[rowIndex].length; i++) {
            sum += matrix[rowIndex][i];
        }
        return sum;
        /*funcion ejercicio 9 */
    } public static boolean isDiagonalMatrix(int[][] matrix) {
        if (matrix == null || matrix.length != matrix[0].length) {
            return false; // La matriz no es cuadrada, por lo tanto, no puede ser diagonal.
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i != j && matrix[i][j] != 0) {
                    return false; // Si hay un elemento distinto de cero fuera de la diagonal, no es diagonal.
                }
            }
        }

        return true; // Si no se encontró ningún elemento distinto de cero fuera de la diagonal, es diagonal.
    }/*Funcion ejercicio 10 */
    public static int[][] matrizIdentidad(int n){
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
        return matriz;
    }/*funcion ejercicio 11 */
    public static int[] ContParesImpares(int[][] matriz) {
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
        return resultado;
    }/*Funcion ejercicio 12 */
    public static int[][] rotarMatriz90Grados(int[][] matriz) {
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
        return matrizRotada;
    }/*funcion ejercicio 13 */
    public static int CantAparicionesNum(int[][] matriz,int numRpetido) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int repeticiones =0;
        for (int f = 0; f < filas; f++) {
            for (int c = 0; c < columnas; c++) {
                if(matriz[f][c]== numRpetido){
                    repeticiones+= 1;
                }
            }
        }
        return repeticiones;
    }
    /*funcion ejercicio 14 */
    public static int[][] invertirFilas(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[][] matrizFilas = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizFilas[i][j]=  matriz[filas-1-i][j];
            }
        }
        return matrizFilas;
    }/*Funcion ejercicio 15 */
    public static int sumarDiagonales(int[][] matriz) {
        int dimension = matriz.length;
        int sumaDiagonales = 0;
        // Sumar la diagonal principal
        for (int i = 0; i < dimension; i++) {
            sumaDiagonales += matriz[i][i];
        }
        // Sumar la diagonal secundaria
        for (int i = 0; i < dimension; i++) {
            sumaDiagonales += matriz[i][dimension - 1 - i];
        }
        return sumaDiagonales;
    }/*Funcion ejercicio 16 */
    public static boolean esMatrizOrtogonal(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;
    
        // Asegurarse de que la matriz sea cuadrada
        if (filas != columnas) {
            return false; // La matriz no es cuadrada, no puede ser ortogonal.
        }
        // Calcular la matriz traspuesta
        int[][] traspuesta = matrizTranspuesta(matriz);
    
        // Multiplicar la matriz original por su traspuesta
        int[][] producto = multiplicarMatrices16(matriz, traspuesta);
    
        // Verificar si el resultado es una matriz identidad
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                if (i == j && producto[i][j] != 1) {
                    return false;
                } else if (i != j && producto[i][j] != 0) {
                    return false;
                }
            }
        }
    
        return true;
    }/*funcion ejercicio 17 */
    public static int[] minimoPorFila(int[][] matriz) {
        int min = matriz[0][0];
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int[] minimos = new int[filas]; //para almacenar los mínimos por fila
        for (int i = 0; i < filas; i++) {
            for (int j = 1; j < columnas; j++) {
                if (matriz[i][j] < min) {
                    min = matriz[i][j]; 
                }
            }
            //Dentro de for
            minimos[i] = min; //Guarda el valor en el array
        }
        return minimos;
    }/*Funcion ejercicio 18 */
    public static int[][] productoMatrices (int[][] matriz, int[][]matriz2){
        int filas = matriz.length;
        int columnas = matriz[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
        int[][] resultado = new int[filas][columnas];

        if (filas!=columnas2 || columnas!=filas2){
            return null;
        }else{
            for (int i = 0; i < filas; i++) {
                for (int j = 0; j < columnas; j++) {
                    resultado[i][j] = matriz[i][j]*matriz2[j][i];
                }
            }
        }
        return resultado;
    }////////////////////////////////////////////////////////////////////////////////////////
    public static int[][] multiplicarMatrices16(int[][] matriz1, int[][] matriz2) {
        int filas1 = matriz1.length;
        int columnas1 = matriz1[0].length;
        int filas2 = matriz2.length;
        int columnas2 = matriz2[0].length;
    
        if (columnas1 != filas2) {
            return null; // Las matrices no se pueden multiplicar.
        }
    
        int[][] resultado = new int[filas1][columnas2];
    
        for (int i = 0; i < filas1; i++) {
            for (int j = 0; j < columnas2; j++) {
                int sum = 0;
                for (int k = 0; k < columnas1; k++) {
                    sum += matriz1[i][k] * matriz2[k][j];
                }
                resultado[i][j] = sum;
            }
        }
    
        return resultado;
    }
    public static int[][] calcularInversa(int[][] matriz) {
        int filas = matriz.length;
        int columnas = matriz[0].length;

        // Asegurarse de que la matriz sea cuadrada
        if (filas != columnas) {
            return null; // La matriz no es cuadrada, no tiene inversa.
        }

        // Calcular la matriz adjunta
        int[][] adjunta = new int[filas][columnas];
        // Implementa aquí el cálculo de la matriz adjunta. Puede ser un proceso largo y con fracciones.

        // Calcular el determinante de la matriz original
        int determinante = 0;
        // Implementa aquí el cálculo del determinante. Puede ser un proceso largo y con fracciones.

        // Calcular la matriz inversa aproximada
        int[][] inversa = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                inversa[i][j] = adjunta[j][i] / determinante;
            }
        }

        return inversa;
    }
    public static void llenarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
        System.out.println("Ingrese el valor para la posición (" + i + ", " + j + "):");
        matriz[i][j] = scanner.nextInt();
        }}
    }public static void llenarMatrizrandom(int[][] matriz) {
        Random random = new Random();
        for(int i=0;i<matriz.length;i++){
            for(int j=0;j<matriz.length;j++){
                matriz[i][j]=random.nextInt(50 - 1 + 1) + 1;
            }
        }

    } public static void llenarArrayrandom(int[]array) {
        Random random = new Random();
        for(int i=0;i<array.length;i++){
                array[i]=random.nextInt(50 - 1 + 1) + 1;
            
        }
    }

    public static void sumarMatrices(int[][] matrizA, int[][] matrizB, int[][] matrizC) {
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA[0].length; j++) {
            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
        }
        }
        }
    
    public static void mostrarMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
            System.out.println();
        }
    }public static void mostrarArray(int[]array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
}}