import java.util.Scanner;
import javax.print.DocFlavor.STRING;
import java.util.Random;
public class tp6 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        /*Ejercicio 1:  */
        System.out.println("Ejercicio 1 (Calcularemos la media de los numeros positivos y los numeros negativos )");
        int[] array1= new int[10];
        System.out.println("Le pediremos que ingrese 10 numeros enteros");
        for (int i=0;i<array1.length;i++){
            System.out.println("Ingrese el numero "+(i+1)+" : ");
            array1[i]=scanner.nextInt();
        }
    
        double  sumaPositivos=0;
        double sumaNegativos=0;
        int contadorP=0;
        int contadorN=0;

        for(int i : array1){/*este bucle for-each recorre el array, para cada num en el array */ 
            if(i>0){
                sumaPositivos+=i;
                contadorP++;
            }else if(i<0){
                sumaNegativos+=i;
                contadorN++;
            }
                
        }
        double promedioPositivos=sumaPositivos/contadorP;
        double promedioNegativos=sumaNegativos/contadorN;
        System.out.println("El promedio de numeros positivos es: "+promedioPositivos);
        System.out.println("El promedio de numeros negativos es: "+promedioNegativos);
        System.out.println(" ");
        
        /*Ejercicio 2: */
        System.out.println("Ejercicio 2 (Mostraremos los numeros pares)");
        int[] array2= new int[10];
        System.out.println("Ingrese 10 numeros enteros ");
        for(int i=0; i<array2.length;i++){
            System.out.print("Ingrese el numero "+(i+1)+": ");
            array2[i]=scanner.nextInt();
        }
        int sumaPares=0;
        int contador=0;
        for(int i=0; i<array2.length;i++){
            if(i%2==0){
                sumaPares+=array2[i];
                contador++;
            }
        }
        double promedio2pares=sumaPares/contador;
        System.out.println("El promedio de las posiciones pares es de "+promedio2pares);
        System.out.println(" ");

        /*Ejercicio 3:  */
        System.out.println("Ejercicio 3 (Calcularemos la nota media del grupo. También mostraremos los alumnos con notas superiores a la media)");
        System.out.println("Ingrese la catidad de alumnos: ");
        int cantA=scanner.nextInt();

        double [] array3= new double[cantA];

        System.out.println("Ingrese la nota de cada alumno");
        for (int i=0; i<array3.length;i++){
            System.out.print("Ingrese la nota del alumno "+(i+1)+" : ");
            array3[i]=scanner.nextDouble();}
        double  sumNotas=0;
        double contadorNotas=0;
        
        for(int i=0;i<array3.length;i++){
            sumNotas+=array3[i];
            contadorNotas++;
        }
        double promedioNotas=sumNotas/contadorNotas;
        System.out.println("El promedio de todas las notas es de : "+promedioNotas);
        System.out.println("Alumnos con notas superiores al promedio: ");
        for(int i=0;i<array3.length;i++){
            if(array3[i]>promedioNotas){
                System.out.println("Alumnoº"+(i+1)+ " Nota: "+array3[i]+" // ");
            }
        }

        /*Ejercicio 4: */ 
        System.out.println("Ejercicio 4 (20 primeros numeros pares)");
        int [] Pares= new int[20];
        int num=2;
        for (int i=0;i<Pares.length;i++){
            Pares[i]=num;
            num+=2;}

        for(int i=0;i<Pares.length;i++){
            System.out.println("El numero que esta en la posicion "+(i+1)+" en el array; es el Nº: "+Pares[i]);
        }

        /*Ejercicio 5:  */
        System.out.println("Ejercicio 5 (Contaremos los numeros que son 0, positivos y negativos)");
        int [] array5= new int[10];
        int contP=0;
        int contN=0;
        int contZ=0;
        for (int i=0;i<array5.length;i++){
            System.out.println("Ingrese el numero "+(i+1)+" : ");
            array5[i]=scanner.nextInt();
        }
        for( int i : array5){
            if(i>0){
                contP++;
            }else if(i<0){
                contN++;
            }else if(i==0){
                contZ++;
            }
        }
        System.out.println("La cantidad de numeros positivos es de: "+contP);
        System.out.println("La cantidad de numeros negativos es de: "+contN);
        System.out.println("La cantidad de numeros nulos es de: "+contZ);

        /*Ejercicio 6:  */
        System.out.println("Ejercicio 6 (Media de negativos y positivos)");
        int[] array = new int[10];
    
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
    }
    
        int sumaPositivos6 = 0;
        int sumaNegativos6 = 0;
        int contadorPositivos = 0;
        int contadorNegativos = 0;
    
        for (int i : array) {
            if (i> 0) {
                sumaPositivos6 += i;
                contadorPositivos++;}   
            else if (i < 0) {
                sumaNegativos6 += i;
                contadorNegativos++;
        }
    }
    
    double mediaPositivos = (double) sumaPositivos6 / contadorPositivos;
    double mediaNegativos = (double) sumaNegativos6 / contadorNegativos;
    
    System.out.println("La media de los valores positivos es: " + mediaPositivos);
    System.out.println("La media de los valores negativos es: " + mediaNegativos);
    

        /*Ejercicio 7:  */
        System.out.println("Ejercicio 7 (Calcularemos las alturas de las personas)");
        System.out.println("Escriba la cantidad de personas a calcular la altura");
        int N=scanner.nextInt();
        while(N<=0){
            System.out.println("El numero de la cantidad de personas debe ser positivo//Ingreselo nuevamente: ");
            N=scanner.nextInt();
        }
        double[] array7= new double[N];
        
        
        for(int i=0;i<array7.length;i++){
            if(array7[i]>=0){
                System.out.print("Ingrese la altura de la persona "+(i+1)+" : ");
                array7[i]=scanner.nextDouble();}
            else{
                System.out.println("El numero debe ser mayor a 0, vuelva a intentarlo");}}

        double sumAlturas=0;
        double contAlturas=0;
        for(int i=0;i<array7.length;i++){
            sumAlturas+=array7[i];
            contAlturas++;
        }
        double promedioAlturas=sumAlturas/contAlturas;
        System.out.println("La altura promedio es de: "+promedioAlturas);
        int superiorPromedio=0;
        int inferiorPromedio=0;

        
        for(int i=0;i<array7.length;i++){
            if(array7[i]>promedioAlturas){
                superiorPromedio++;
            }else if(array7[i]<promedioAlturas){
                inferiorPromedio++;
            }
        }
        System.out.println("La cantidad de personas con altura superior a la promedio son: "+superiorPromedio);
        System.out.println("La cantidad de personas con altura inferior a la promedio son: "+inferiorPromedio);
        
        /*Ejercicio 8 */
        System.out.println("Ejercicio 8 (Calcularemos los sueldos de los empleados)");
        String[] nombre_empleados= new String[20];
        double[] sueldo_empleados= new double[20];
        double mayorSueldo=sueldo_empleados[0];
        int indiceSueldoMayor=0;
        for (int i=0;i<20;i++){
            System.out.println("Ingrese el nombre del empleado "+(i+1));
            nombre_empleados[i]=scanner.next();
            System.out.println("Ahora ingrese su sueldo: ");
            sueldo_empleados[i]=scanner.nextDouble();
            if(sueldo_empleados[i]>mayorSueldo){
                mayorSueldo=sueldo_empleados[i];
                indiceSueldoMayor=i;
            }
        }
        System.out.println("El sueldo mayor es "+mayorSueldo+" y es del empleado: "+nombre_empleados[indiceSueldoMayor]);
    
        /*Ejercicio 9:  */ 
        System.out.println("Ejercicio 9 (Mostraremos numeros aleatorios de un array)");
        int desde = 1;
        int hasta = 10;
        int tamaño = 5;
    
        int[] array9 = generarArrayAleatorio(desde, hasta, tamaño);
    
        for (int numero : array9) {
            System.out.print(" ");
            System.out.println(numero);
            System.out.print(" ");}
        
        /*Ejercicio 10  */
        /*A */ 
        System.out.println("Ejercicio 10//A (Sumaremos dos matrices)");
        System.out.println("Ingrese el numero de filas de las matrices: ");
        int filas=scanner.nextInt();
        System.out.println("Ingrese el numero de columnas: ");
        int columnas=scanner.nextInt();
        int[][] matrizA = new int[filas][columnas];
        int[][] matrizB = new int[filas][columnas];
        int[][] matrizC = new int[filas][columnas];

        System.out.println("Ingrese los valores de la matriz A:");
        llenarMatriz(matrizA, scanner);
        System.out.println("Ingrese los valores de la matriz B:");
        llenarMatriz(matrizB, scanner);
    
        sumarMatrices(matrizA, matrizB, matrizC);
    
        System.out.println("La matriz suma es:");
        mostrarMatriz(matrizC);
        /*B */
        System.out.println("Ejercicio 10//B (Sumaremos las matrices A y B)");
        System.out.println("Ingrese el número de filas de las matrices:");
        int filasB = leerEntero_B(scanner);
    
        System.out.println("Ingrese el número de columnas de las matrices:");
        int columnasB = leerEntero_B(scanner);
        System.out.println("Llenando la matriz A");
        int[][] matrizA_2 = crearMatriz_B(filasB, columnasB);
        System.out.println("Llenando la matriz B");
        int[][] matrizB_2 = crearMatriz_B(filasB, columnasB);
            
        int[][] matrizC_2 = sumarMatrices_B(matrizA_2, matrizB_2);
    
        System.out.println("La matriz suma es:");
        mostrarMatriz_B(matrizC_2);
        /*Ejercicio 11 */
        System.out.println("Ejercicio 11 (Calcularemos la matriz traspuesta)");
        System.out.println("Ingrese el numero de filas de la matriz: ");
        int filas11=scanner.nextInt();
        System.out.println("Ahora el numero de columnas: ");
        int columnas11=scanner.nextInt();
        int[][] matriz11 = new int[filas11][columnas11];
        System.out.println("Ingrese los numeros para llenar la matriz");
        for (int i = 0; i < filas11; i++) {
            for (int j = 0; j < columnas11; j++) {
                System.out.println("Elemento: ("+i+", "+j+") ");
                matriz11[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matriz normal");
        for (int i = 0; i < filas11; i++) {
            for (int j = 0; j < columnas11; j++) {
            System.out.print(matriz11[i][j] + " ");
        }
            System.out.println();
        }
        
        System.out.println("Matriz Trasnpuesta");
        for (int i = 0; i < columnas11; i++) {
            for (int j = 0; j < filas11; j++) {
            
            System.out.print(matriz11[j][i] + " ");
        }
            System.out.println();
        }

    }
    /*Funcion ejercicio 9*/
    public static int[] generarArrayAleatorio(int desde, int hasta, int tamaño) {
        int[] array = new int[tamaño];
        Random random = new Random();
    
        for (int i = 0; i < tamaño; i++) {
            array[i] = random.nextInt(hasta - desde + 1) + desde;}
    
    return array;
    }
    /*Funciones ejercicios 10 */
    public static void llenarMatriz(int[][] matriz, Scanner scanner) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
        System.out.println("Ingrese el valor para la posición (" + i + ", " + j + "):");
        matriz[i][j] = scanner.nextInt();
        }}
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
    }
    
    public static int leerEntero_B(Scanner scanner) {
        System.out.println("Ingrese un número entero:");
        return scanner.nextInt();
        }
    
    public static int[][] crearMatriz_B(int filas, int columnas) {
        int[][] matriz = new int[filas][columnas];
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese los valores de la matriz:");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.println("Para la posicion ("+i+", "+j+") ");
            matriz[i][j] = leerEntero_B(scanner);
            }
        }
        
        return matriz;
        }
    
    public static void mostrarMatriz_B(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
            System.out.print(matriz[i][j] + " ");
        }
            System.out.println();
        }
    }
    
    public static int[][] sumarMatrices_B(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] matrizC = new int[filas][columnas];
        
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
            matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        
        return matrizC;
        }
}
