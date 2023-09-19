import java.util.Scanner;
import javax.print.DocFlavor.STRING;
public class tp5 {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        /*Ejercicio 1 */
        System.out.println("Ejercicio 1");
        System.out.println("Ingrese un numero entero para saber si es par o no: ");
        int num1=scanner.nextInt();
        if(num1%2==0){
            System.out.println("Es un numero par.");
        }else{
            System.out.println("Es un numero impar.");
        }

        /*Ejercicio 2 */
        System.out.println("Ejercicio 2 (Veremos si el numero es multiplo de 10)");
        System.out.println("Por favor, ingrese un numero entero: ");
        int num2=scanner.nextInt();
        if(num2%10==0){
            System.out.println("El numero ingresado es multiplo de 10");
        }else{
            System.out.println("El numero ingresado no es multiplo de 10");
        }

        /*Ejercicio 3 */
        System.out.println("Ejercicio 3 (Veremos si esta en mayuscula o no la letra que ingreses)");
        System.out.println("Ingrese una letra: ");
        char letra3=scanner.next().charAt(0);
        if(Character.isUpperCase(letra3)){
            System.out.println("La letra  esta en mayuscula");
        }else{
            System.out.println("La letra no esta en mayuscula");
        }

        /*Ejercicio 4 */
        System.out.println("Ejercicio 4 (Veremos si los numeros son iguales)");
        System.out.println("Ingrese el primer numero: ");
        int num4=scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        int num4_2=scanner.nextInt();
        if(num4==num4_2){
            System.out.println("Los numeros ingresados son iguales");
        }else{
            System.out.println("Los numeros ingresados no son iguales");
        }

        /*Ejercicio 5 */
        System.out.println("Ejercicio 5 (Veremos cual numero es mayor)");
        System.out.println("Ingrese un numero");
        int num5=scanner.nextInt();
        System.out.println("Ingrese otro numero");
        int num5_2=scanner.nextInt();
        if(num5>num5_2){
            System.out.println("El numero "+num5+" es mayor que "+num5_2);
        }else if(num5_2>num5){
            System.out.println("EL numero "+num5_2+" es mayor que "+num5);
        }else if(num5==num5_2){
            System.out.println("Los numeros son iguales.");
        }

        /*Ejercicio 6 */
        System.out.println("Ejercicio 6 (Veremos si los numeros terminan igual)");
        System.out.println("Ingrese un numero entero ");
        int num6=scanner.nextInt();
        System.out.println("Ingrese otro numero entero");
        int num6_2=scanner.nextInt();
        int cifra6=num6%10;
        int cifra6_2=num6_2%10;
        if(cifra6==cifra6_2){
            System.out.println("Terminan con la misma cifra");
        }else{
            System.out.println("Su ultima cifra es diferente");
        }

        /*Ejercicio 7 */
        System.out.println("Ejercicio 7 (Veremos si el numero que ingreses es multiplo de 3 y 5)");
        System.out.println("Ingrese un numero");
        int num7=scanner.nextInt();
        if(num7%3==0 && num7%5==0){
            System.out.println("Es multiplo de 3 y 5");
        }else{
            System.out.println("No es multiplo de 3 y 5");
        }

        /*Ejercicio 8 */
        System.out.println("Ejercicio 8 (Veremos si el numero que ingreses es multiplo de 3 o de 2)");
        System.out.println("Ingrese un numero entero ");
        int num8=scanner.nextInt();
        if(num8%2==0){
            System.out.println("El numero ingresado es multiplo de 2");
        }else if(num8%3==0){
            System.out.println("El numero ingresado es multiplo de 3");
        }else{
            System.out.println("No es multiplo ni de 2 ni de 3");
        }

        /*Ejercicio 9 */
        System.out.println("Ejercicio 9 (Veremos si las dos letras son iguales o no)");
        System.out.println("Ingrese una letra");
        char letra9=scanner.next().charAt(0);
        System.out.println("Ingrese otra letra");
        char letra9_2=scanner.next().charAt(0);
        if(letra9==letra9_2){
            System.out.println("Son iguales");
        }else{
            System.out.println("No son iguales");
        }

        /*Ejercicio 10 */
        System.out.println("Ejercicio 10 (Veremos si las dos letras estan en minuscula)");
        System.out.println("Ingrese un caracter");
        char caracter10=scanner.next().charAt(0);
        System.out.println("Ingrese un segundo caracter");
        char caracter10_2=scanner.next().charAt(0);
        if(Character.isLowerCase(caracter10) && Character.isLowerCase(caracter10_2)){
            System.out.println("Los dos caracteres estan en minuscula");

        }else{
            System.out.println("Uno de los caracteres no esta en minuscula");
        }
        
        /*Ejercicio 11 */
        System.out.println("Ejercicio 11 (veremos si el numero ingresado esta entre 0 y 9)");
        System.out.println("Ingrese un numero");
        String caracter11=scanner.next();
        if (caracter11.length()==1 && caracter11.charAt(0)>='0' && caracter11.charAt(0)<='9'){
            System.out.println("El numero ingresado se encuentra entre 0 y 9");
        }else{
            System.out.println("El numero ingresado no esta entre 0 y 9");
        }

        /*Ejercicio 12 */
        System.out.println("Ejercicio 12 (realizaremos una division)");
        System.out.println("Ingrese el numero a dividir");
        float num12=scanner.nextFloat();
        System.out.println("Ingrese el numero que dividira");
        float num12_2=scanner.nextFloat();
        if(num12_2==0){
            System.out.println("Error, no se puede dividir por 0");
        }else if(num12_2!=0){
            float div=num12/num12_2;
            System.out.println("La division da: "+div);
        }

        /*Ejercicio 13 */
        System.out.println("Ejercicio 13 (Veremos si el año es bisiesto o no)");
        System.out.println("Introduzca un año");
        int año=scanner.nextInt();
        if((año%4==0 && año%100!=0)||(año%400==0)){
            System.out.println("El año ingresado es bisiesto");
        }else{
            System.out.println("El año "+año+" no es bisiesto");
        }

        /*Ejercicio 14 */
        System.out.println("Ejercicio 14 (Veremos si el numero que ingreses es capicua)");
        System.out.println("Ingrese un numero de 3 cifras: ");
        int num14=scanner.nextInt();
        int numOriginal=num14;
        int numReverso=0;
        int aux;

        aux=num14%10;
        numReverso=numReverso*10+aux;
        num14/=10;

        aux=num14%10;
        numReverso=numReverso*10+aux;
        num14/=10;

        aux=num14%10;
        numReverso=numReverso*10+aux;
        num14/=10;

        if (numOriginal==numReverso){
            System.out.println("El numero es capicua");
        }else{
            System.out.println("El numero "+numOriginal+" no es capicua");
        }

        /*Ejercicio 15 */
        System.out.println("Ejercicio 15 (Debes ingresar un horario correcto)");
        System.out.println("Ingrese la hora: ");
        int H=scanner.nextInt();
        System.out.println("Ingrese los minutos: ");
        int M=scanner.nextInt();
        System.out.println("Ingrese los segundos: ");
        int S=scanner.nextInt();

        if(H>=0 && H<=23){
            if(M>=0 && M<=59){
                if(S>=0 && S<=59){
                    System.out.println("El horario ingresado es valido :)");
                }else{
                    System.out.println("Los segundos ingresados "+S+" no son validos");
                }
            }else{
                System.out.println("Los minutos ingresados "+M+" no son validos");
            }
        }else{
            System.out.println("La hora ingresada: "+H+" no es valida");
        }

        /*Ejercicio 16 */
        System.out.println("Ejercicio 16 (Le pediremos que ingrese un mes en formato numero 'Por ejemplo: mes=12 hace referencia a diciembre')");
        System.out.println("Ingrese el mes: ");
        int mes16=scanner.nextInt();
        if(mes16>=1 && mes16<=12){
            if(mes16==1 || mes16==3 || mes16==5 || mes16==7 || mes16==8 || mes16==10 || mes16==12 ){
                if(mes16==1){
                    System.out.println("El mes "+mes16+" corresponde a Enero y tiene 31 dias");
                }else if(mes16==3){
                    System.out.println("El mes "+mes16+" corresponde a Marzo y tiene 31 dias");
                }else if(mes16==5){
                    System.out.println("El mes "+mes16+" corresponde a Mayo y tiene 31 dias");
                }else if(mes16==7){
                    System.out.println("El mes "+mes16+" corresponde a Julio y tiene 31 dias");
                }else if(mes16==8){
                    System.out.println("El mes "+mes16+" corresponde a Agosto y tiene 31 dias");
                }else if(mes16==10){
                    System.out.println("El mes "+mes16+" corresponde a Octubre y tiene 31 dias");
                }else if(mes16==12){
                    System.out.println("El mes "+mes16+" corresponde a Diciembre y tiene 31 dias");
                }
            }else if(mes16==2){
                System.out.println("El mes "+mes16+" corresponde a Febrero y tiene 28 dias");
            }else if(mes16==4 || mes16==6 || mes16==9 || mes16==11){
                if(mes16==4){
                    System.out.println("El mes "+mes16+" corresponde a Abril y tiene 30 dias");
                }else if(mes16==6){
                    System.out.println("El mes "+mes16+" corresponde a Junio y tiene 30 dias");
                }else if(mes16==9){
                    System.out.println("El mes "+mes16+" corresponde a Septiembre y tiene 30 dias");
                }else if (mes16==11){
                    System.out.println("El mes "+mes16+" corresponde a Noviembre y tiene 30 dias");
                }
            }
        }else{
            System.out.println("El mes ingresado no es un valor correcto");
        }

        /*Ejercicio 17 */ 
        System.out.println("Ejercicio 17 (Mostraremos la equivalencia de la calificacion)");
        System.out.println("Ingrese la calificacion: ");
        double nota17=scanner.nextDouble();
        if(nota17>=0 && nota17<5 ){
            System.out.println("Nota insuficiente.");
        }else if(nota17>=5 && nota17<6){
            System.out.println("Nota suficiente.");
        }else if(nota17>=6 && nota17<7){
            System.out.println("Bien.");
        }else if(nota17>=7 && nota17<9){
            System.out.println("Notable.");
        }else if(nota17>=9 && nota17<=10){
            System.out.println("Sobresaliente.");
        }else{
            System.out.println("La nota ingresada no es valida, reinicie el programa. ");
        }

        /*Ejercicio 18 */
        System.out.println("Ejercicio 18 (Se usara un bucle while para contar del 1 al 100)");
        int contador18=1;
        while(contador18<=100){
            System.out.println("Nro: "+contador18);
            contador18++;
        }

        /*Ejercicio 19 */
        System.out.println("Ejercicio 19 (Se usara un bucle do-while para contar del 1 al 100)");
        int contador19=1;
        do{
            System.out.println("Numero: "+contador19);
            contador19++;
        }while(contador19<=100);

        /*Ejercicio 20 */
        System.out.println("Ejercicio 20 (Usaremos un bucle for para contar del 1 al 100)");
        
        for(int i=1; i<=100; i++){
            System.out.println("Number: "+i);
        }

        /*Ejercicio 21 */
        System.out.println("Ejercicio 21 (Veremos como contar de 100 a 1 con un bucle while)");
        int decrece21=100;
        while (decrece21<=100 && decrece21>=1){
            System.out.println("Nº: "+decrece21);
            decrece21--;
        }

        /*Ejercicio 22 */
        System.out.println("Ejercicio 22 (Se contara desde el 100 al 1 con un do-while)");
        int decrece22=100;
        do{
            System.out.println("nº: "+decrece22);
            decrece22--;
        }while(decrece22>=1);

        /*Ejercicio 23 */
        System.out.println("Ejercicio 23 (Se mostraran los numeros del 100 al 1 usando un for)");
        for (int i = 100; i>=1; i--) {
            System.out.println("n--"+i);
        }

        /*Ejercicio 24 */
        System.out.println("Ejercicio 24 (vamos a contar)");
        System.out.println("Ingrese un numero mayor a 0: ");
        int N=scanner.nextInt();
        
        /*(1) for: */
        System.out.println("Usando forma For: ");
        if(N>0){
            for(int i=1;i<=N;i++){
            System.out.println("Contando: "+i);}
        }else{
            System.out.println("Numero invalido reinicie eñ programa");
        }
        /*(2) while: */
        System.out.println("Usando forma While: ");
        int s=1;
        if(N>0){
            while(s<=N){
                System.out.println("Iterando---"+s);
                s++;}
        }else{
            System.out.println("Numero invalido reinicie el programa");
        }

        /*(3) do-while: */
        System.out.println("Usando forma Do-While: ");
        int c=1;
        if(N>0){
            do{
            System.out.println("--"+c+"--");
            c++;
            }while(c<=N);
        }else{
            System.out.println("Numero invalido reinicie el programa");
        }
        
        /*Ejercicio 25 */
        System.out.println("Ejercicio 25 (vamos a contar)");
        System.out.println("Ingrese un numero mayor a 0: ");
        int n=scanner.nextInt();

        /*(1) for: */
        System.out.println("Usando forma For: ");
        if(n>0){
            for(int i=n;i>=1;i--){
            System.out.println("Contando: "+i);}
        }else{
            System.out.println("Numero invalido reinicie eñ programa");
        }

        /*(2) while: */
        System.out.println("Usando forma While: ");
        s=n;
        if(n>0){
            while(s>=1){
                System.out.println("Decrece---"+s);
                s--;}
        }else{
            System.out.println("Numero invalido reinicie el programa");
        }

        /*(3) do-while: */
        System.out.println("Usando forma Do-While: ");
        int f=n;
        if(n>0){
            do{
            System.out.println("--"+f+"--");
            f--;
            }while(f>=1);
        }else{
            System.out.println("Numero invalido reinicie el programa");
        }
        
        /*Ejercicio 26 */
        System.out.println("Ejercicio 26 (Contando desde el menor al mayor) ");
        int num26_1, num26_2;
        do{
            System.out.println("Ingrese el primer nº: ");
            num26_1=scanner.nextInt();
            System.out.println("Ingrese el segundo nº: ");
            num26_2=scanner.nextInt();
            if(num26_1==num26_2){
                System.out.println("Los numeros son iguales vuelve a intentarlo: ");
            }
        }while(num26_1==num26_2);

        if (num26_1>num26_2){
            for(int i=num26_2;i<=num26_1;i++){
                System.out.println("Contando desde "+num26_2+" hasta "+num26_1);
                System.out.println("# "+i+" #");
            }
        }else if(num26_2>num26_1){
            for(int x=num26_1;x<=num26_2;x++){
                System.out.println("Contando desde "+num26_1+" hasta "+num26_2);
                System.out.println("# "+x+" #");
            }
        }

        /*Ejercicico 27 */
        System.out.println("Ejercicio 27 (Contando los pares) ");
        int num27_A, num27_B;
        do{
            System.out.println("Ingrese el primer nº: ");
            num27_A=scanner.nextInt();
            System.out.println("Ingrese el segundo nº: ");
            num27_B=scanner.nextInt();
            if(num27_A==num27_B){
                System.out.println("Los numeros son iguales vuelve a intentarlo: ");
            }else if( num27_A>num27_B){
                System.out.println("El primer numero es mayor que el segundo vuelve a intentarlo: ");
            }
        }while(num27_A>=num27_B);
        
        System.out.println("Los numeros pares entre "+num27_A+" y "+num27_B+" son: ");
        for(int i=num27_A; i<=num27_B;i++){
            if(i%2==0){
                System.out.println("<<< "+i+" >>>");
            }}
        
        /*Ejercicio 28 */
        System.out.println("Ejercicio 28 (Contando los multiplos) ");
        int n_28, m_28;
        do{
            System.out.println("Ingrese el primer nº: ");
            n_28=scanner.nextInt();
            System.out.println("Ingrese el segundo nº: ");
            m_28=scanner.nextInt();
            if(n_28==m_28){
                System.out.println("Los numeros son iguales vuelve a intentarlo: ");

            }else if( n_28>m_28){
                System.out.println("El primer numero es mayor que el segundo vuelve a intentarlo: ");
            }else if(n_28<1){
                System.out.println("El primer numero es negativo o 0, vuelve a intentarlo: ");
            }else if(m_28<1){
                System.out.println("El segundo numero es negativo o 0, vuelve a intentarlo: ");
            }
        }while(n_28>=m_28 && n_28<1 && m_28<1);

        System.out.println("Mostraremos los multiplos de "+n_28+" desde 1 hasta "+m_28);
        for(int i=1; i<=m_28;i++){
            if(i%n_28==0){
                System.out.println("|| "+i+" ||");
            }
        }

        /*Ejercicio 29*/
        System.out.println("Ejercicio 29 (Convertiremos millas a kilometros)");
        double milla, km;
        do{
            System.out.println(" ");
            System.out.println("Ingrese las millas a convertir: ");
            milla=scanner.nextFloat();
            km=milla*1.6093;
            System.out.println("Su equivalente a km es: ");
            System.out.printf("%.2f ",km);
        }while(milla>0);

}
}
