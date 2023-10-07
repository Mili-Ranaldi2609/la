import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;
public class ejerPracticaArray {
    public static void main(String[] args) throws Exception{
        Scanner scr = new Scanner(System.in);

    /*Declaracion e inicializacion: */
    System.out.println("Declaracion e inicializacion:");
    /*(1) Deeclarar un array de 10 enteros e inicializarlo con los valores de los 10 primeros 
    numeros enteros naturales: */
    System.out.println("Ejercicio 1.1: ");
    int [] array1_1= new int[10];
    for(int i=0;i<array1_1.length;i++){
        array1_1[i]=i+1;

    }
    for( int i : array1_1){
        System.out.println("Los numeros son "+i);
    
    }

    /*(2) Declarar un array de 10 numeros reales e inicializarlo con los numeros 
    de los 10 primeros numeros primos */
    System.out.println("Ejercicio 1.2: ");
    double [] array2_1= {2.0, 3.0, 5.0, 7.0, 11.0, 13.0, 17.0, 19.0, 23.0, 29.0};
    for (int i=0;i<array2_1.length;i++){
        System.out.println("Los primeros numeros primos son: "+array2_1[i]);
    }

    /*(3) Declarar un array bidimensional de 10 filas y 10 columnas de numeros enteros */
    System.out.println("Ejercicio 1.3: ");
    int filas=10;
    int columnas=10;
    int [][] array3_1= new int[filas][columnas];
    int numero=1;
    for(int i=0; i<filas;i++){
        for (int j=0; j<columnas;j++){
            array3_1[i][j]=numero;
            numero++;
    }
    }
    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
        System.out.print(array3_1[i][j] + " ");
    }
        System.out.println();
    }

    /*(4) Declarar un array multidimensional de 3 dimensiones de numeros reales */
    System.out.println("Ejercicio 1.4: ");
    int [][][] array3d= new int[3][3][3];
    int numero4=1;
    for ( int i = 0; i < array3d.length; i++) {
        for (int j = 0; j < array3d.length; j++) {
            for (int k = 0; k < array3d.length; k++) {
                array3d[i][j][k]=numero4;
                numero4++;
            }
        }
    }

    for (int i = 0; i < array3d.length; i++) {
        for (int j = 0; j < array3d.length; j++) {
            for (int k = 0; k < array3d.length; k++) {
                System.out.print(array3d[i][j][k]+ " ");
            }
            System.out.println();
    }
    System.out.println();
    }

    /*Lectura y escritura: */
    System.out.println("Lectura y escritura: ");
    /*(1) Ingresar por teclado los valores de un array de 10 enteros */
    System.out.println("Ejercicio 2.1: ");
    int [] arrayE= new int[10];
    System.out.println("Llenaremos el array con 10 numeros enteros");
    for (int i=0;i<arrayE.length;i++){
        System.out.println("Ingrese el numero "+(i+1)+": ");
        arrayE[i]=scr.nextInt();
    }
    System.out.println("Valores ingresados:");
    System.out.println(Arrays.toString(arrayE));
    /*(2) Ingresar por teclado los valores de un array de 10 números reales */
    System.out.println("Ejercicio 2.2: ");
    double [] arrayR= new double[10];
    System.out.println("Llenaremos el array con 10 numeros reales");
    for (int i=0;i<arrayR.length;i++){
        System.out.println("Ingrese el numero "+(i+1)+": ");
        arrayR[i]=scr.nextDouble();
    }
    System.out.println("Valores ingresados:");
    System.out.println(Arrays.toString(arrayR));
    
    /*(3) Leer los datos de un array de caracteres y mostrarlos por pantalla */
    System.out.println("Ejercicio 2.3: ");
    char [] arrayC={'a','e','i','o','u'};
    System.out.println("Valores del array: ");
    System.out.println(Arrays.toString(arrayC));
    /*(4) Leer los datos de un array de booleanos y mostrarlos por pantalla. */
    System.out.println("Ejercicio 2.4: ");
    boolean [] arrayB={true,false,false,true,true};
    System.out.println("los valores del Array booleano son : ");
    System.out.println(Arrays.toString(arrayB));
    
    /*Operaciones aritmeticas*/
    /*(1) Sumar los elementos de un array de 10 enteros.*/
    System.out.println("Ejercicio 3.1: ");
    int [] arraySuma={1,2,4,5,7,56,43,8,0,86};
    int suma=0;
    System.out.println("Los numeros a sumar son: ");
    System.out.println(Arrays.toString(arraySuma));

    for(int i : arraySuma){
        suma+=i;
    }
    System.out.println("La suma de la lista es "+suma);

    /*(2) Multiplicar los elementos de un array de 10 números reales */
    System.out.println("Ejercicio 3.2: ");
    double[] arrayMultiplicacion = {1.0, 2.0, 3.0, 4.0, 5.0, 6.5, 1.23, 8.2, 9.0,11.1 };
    double multiplicacion = 1.0;
    System.out.println("Los numeros del array son");
    System.out.println(Arrays.toString(arrayMultiplicacion));

    for (double i : arrayMultiplicacion) {
            multiplicacion *= i;
        }
    System.out.println("La multiplicación de los elementos de la lista es: " + multiplicacion);

    /*(3) Ordenar un array de 10 enteros de menor a mayor*/
    System.out.println("Ejercicio 3.3: ");
    int[] numeros = {5, 2, 8, 1, 9, 3, 7, 4, 6, 10};
    System.out.println("Numeros del array desordenados");
    System.out.println(Arrays.toString(numeros));
    /* Ordenar el array de menor a mayor*/ 
    Arrays.sort(numeros);
    System.out.println("El array ordenado de menor a mayor es: " + Arrays.toString(numeros));
    
    /*(4) Ordenar un array de 10 cadenas de forma alfabética */
    System.out.println("Ejercicio 3.4: ");
    String[] cadena={"vaso","taza","cuchara","olla","tenedor","cuchillo","plato","bandeja","hornalla","batidora"};
    System.out.println("Valores del array de las 10 cadenas desordenadas");
    System.out.println(Arrays.toString(cadena));
    Arrays.sort(cadena);
    System.out.println("Cadenas ordenadas");
    System.out.println(Arrays.toString(cadena));

    /*Ejercicios adicionales */
    /*(1) Implementar un método que cuente el número de elementos pares en un array de enteros. */
    System.out.println("Ejercicio 4.1: ");
    int [] pares={2,36,34,5,78,21,23,9,8,10};
    System.out.println("El array es :");
    System.out.println(Arrays.toString(pares));
    int contador=0;
    for (int i: pares){
        if (i%2==0){
            contador++;
        }
    }
    System.out.println("La cantidad de elementos pares es: "+contador);

    /*(2) Implementar un método que cuente el número de elementos mayores que 10 en un array de números reales.*/
    System.out.println("Ejercicio 4.2: ");
    double [] mayores10={12.3,9.0,1.0,2.0,40.0,10.0,10.5,10.13,10.11,11.10};
    System.out.println("El array de numeros reales es: ");
    System.out.println(Arrays.toString(mayores10));
    int contadorM10=0;
    for(double i : mayores10){
        if (i>10){
            contadorM10++;
        }
    }
    System.out.println("La cantidad de numeros que son mayores a 10 son: "+contadorM10);

    /*(3) Implementar un método que calcule la suma de los elementos de
    un array de enteros que sean múltiplos de 3*/
    System.out.println("Ejercicio 4.3: ");
    int [] multiplos3={3,2,57,8,33,30,9,7,1,31};
    System.out.println("El array de numeros enteros es: ");
    System.out.println(Arrays.toString(multiplos3));
    int sumMultiplos3=0;
    for (int i: multiplos3){
        if(i%3==0){
            System.out.println(i+" es multiplo de 3");
            sumMultiplos3+=i;
        }
    }
    System.out.println("La suma de los numeros que son multiplos de 3 es: "+sumMultiplos3);

    /*(4) Implementar un método que encuentre el elemento máximo de un array de enteros. */
    System.out.println("Ejercicio 4.4: ");
    int [] maximo={12,3,4,5,6,78,9,0,1,56};
    System.out.println("El array de los numeros enteros es: ");
    System.out.println(Arrays.toString(maximo));
    int max=0;
    for (int i: maximo){
        if (i>max){
            max=i;
        }
    }
    System.out.println("El numero maximo es: "+max);

    /*(5) Implementar un método que encuentre el elemento mínimo de un array de cadenas */
    System.out.println("Ejercicio 4.5: ");
    String [] minimoC={"hola","chau","si","y","no"};
    System.out.println("El array de cadenas es : ");
    System.out.println(Arrays.toString(minimoC));
    String min=minimoC[0];
    for(String i: minimoC){
        if(i.length() < min.length()){
            min=i;
        }
    }
    System.out.println("El elemento minimo es: '"+min+"'");

    /*(6) Implementar un método que copie un array de enteros a otro array de enteros */
    System.out.println("Ejercicio 4.6: ");
    int [] arrayOriginal={55,23,57,12,89};
    int [] arrayCopia=new int[arrayOriginal.length];
    System.out.println("Los numeros del array original son: ");
    System.out.println(Arrays.toString(arrayOriginal));
    for(int i=0;i< arrayOriginal.length;i++){
        arrayCopia[i]=arrayOriginal[i];
    }
    System.out.println("El array original: "+Arrays.toString(arrayOriginal));
    System.out.println("El array copia: "+Arrays.toString(arrayCopia));


}}