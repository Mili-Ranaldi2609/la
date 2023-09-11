
import java.util.Scanner;

import javax.print.DocFlavor.STRING;

public class tp4 {
    public static void main(String[] args) throws Exception {
        /*Ejercicio1 */
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.println("Ingrese el primer numero:");
        number1=scanner.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        number2=scanner.nextInt();
        System.out.println("Los numeros enteros ingresados son: "+number1+" y "+number2);

        /*Ejercicio2 */
        String name;
        System.out.println("Ingrese un nombre: ");
        name=scanner.next();

        System.out.println("El nombre ingresado es: "+name);
        /*Ejercicio3 */
        int number3;
        System.out.println("Ingrese un numero entero: ");
        number3=scanner.nextInt();
        int doble, triple;
        doble=number3*2;
        triple=number3*3;
        System.out.println("El doble del numero "+number3+" seria "+doble+" y el triple seria "+triple);
        
        /*Ejercicio4 */

        double celsius, fahre;
        System.out.println("Ingrese los grados en celsius: ");
        celsius=scanner.nextDouble();
        fahre=32 +( 9 * celsius / 5);
        System.out.println("Los grados Celsius pasados a Fahrenheit som: "+fahre);
        
        /*Ejercicio5 */
        float radio;
        System.out.println("Ingrese el radio del circulo: ");
        radio=scanner.nextFloat();
        double area = Math.PI * Math.pow(radio,2);
        double longitud = 2* Math.PI*radio;
        System.out.println("El área del círculo  es: " +area+" y la longitud es: "+longitud);

        /*Ejercicio 6 */
        int velocidadkm;
        System.out.println("Ingrese la velocidad en kilometros: ");
        velocidadkm=scanner.nextInt();
        double velocidadms=velocidadkm/3.6;
        System.out.println("La velocidad: "+velocidadkm+" km/h pasada a m/s es: "+velocidadms);

        /*Ejercicio7 */
        float cateto1, cateto2;
        System.out.println("Ingrese el primer cateto");
        cateto1=scanner.nextFloat();
        System.out.println("Ingrese el segundo cateto: ");
        cateto2=scanner.nextFloat();
        double hipotenusa=Math.sqrt( Math.pow(cateto2, 2)+Math.pow(cateto1, 2)) ;
        long resultado=Math.round(hipotenusa);
        System.out.println("El valor de la hipotenusa seria: "+resultado);

        /*Ejercicio8 */
        float radioEsfera;
        System.out.println("Ingrese la longitud del radio de la esfera: ");
        radioEsfera=scanner.nextFloat();
        double volumenEsfera=(4.0/3)* Math.PI * Math.pow(radioEsfera, 3);
        System.out.println("El volumen de la esfera es: "+volumenEsfera);

        /*Ejercicio9 */
        
        System.out.println("Ingrese el lado 'a' del triangulo: ");
        double la= scanner.nextDouble();
        System.out.println("Ingrese el lado 'b' del triangulo: ");
        double lb=scanner.nextDouble();
        System.out.println("Ingrese el lado 'c' del triangulo: ");
        double lc=scanner.nextDouble();
        double p= (la+lb+lc)/2;
        double areat=Math.sqrt(p*(p-la)*(p-lb)*(p-lc));
        System.out.println("El area del triangulo seria: "+areat);

        /*Ejercicio10 */

        int num3c;
        System.out.println("Ingrese el numero de 3 cifras: ");
        num3c=scanner.nextInt();
        int cifra1=num3c/100;
        num3c=num3c%100;
        int cifra2=num3c/10;
        num3c=num3c%10;
        int cifra3=num3c;
        System.out.println("El numero escrito por separado seria:");
        System.out.println(cifra1+"\n"+cifra2+"\n"+cifra3);

        /*Ejercicio11 */

        int num5c;
        
        do{
            System.out.println("Ingrese un numero de 5 cifras: ");
        num5c=scanner.nextInt();
        }while(num5c<=10000 && num5c>=99999);
        String numString=String.valueOf(num5c);
        for(int i=0;i<5;i++){
            for(int u=0;u<=i;u++){
                System.out.print(numString.charAt(u));

            }
            System.out.println(" ");
        }

        /*Ejercicio12 */
        int num6c;
        
        do{
            System.out.println("Ingrese un numero de 5 cifras: ");
        num6c=scanner.nextInt();
        }while(num6c<=10000 && num5c>=99999);
        String num6String=String.valueOf(num6c);
        for(int i=0;i<5;i++){
                System.out.println(numString.substring(4-i));

            }

        /*Ejercicio13 */
        System.out.println("Vamos a calcular su numero de la suerte con su fecha de nacimiento: ");
        System.out.println("Dia: ");
        int dia=scanner.nextInt();
        System.out.println("Mes: ");
        int mes=scanner.nextInt();
        System.out.println("Año: ");
        int año=scanner.nextInt();
        int suma=dia+mes+año;
        int numsuerte=0;

        String fecha=Integer.toString(suma);
        for(int i=0;i<fecha.length();i++){
            numsuerte+= Character.getNumericValue(fecha.charAt(i));
        }
        System.out.println("Su numero de la suerte es: "+numsuerte);

        /*Ejercicio14 */
        System.out.println("Vamos a calcular el precio de un producto: ");
        double lapiz=150.5;
        System.out.println("Por ejemplo el precio unitario de un lapiz es de: "+lapiz+"$.");
        int cantlapiz=50;
        System.out.println("Suponiendo que se compra la cantidad de "+cantlapiz+" lapices.");
        double lapices=cantlapiz*lapiz;
        System.out.println("El precio sin Iva seria: "+lapices+"$");
        double iva=15.0;
        System.out.println("El porcentaje del Iva es del: "+iva+"%");
        double total=lapices+(lapices*iva/100);
        System.out.println("El precio final con Iva incluido seria: "+total+"$");

        /*Ejercicio15 */
    
        System.out.println("Variable entera N: ");
        int N=scanner.nextInt();
        System.out.println("Variable m, cifras que se le quitaran a N: ");
        int m=scanner.nextInt();

        String resultado1=String.valueOf(N);
        if (m<=resultado1.length()){
            String num=resultado1.substring(0, resultado1.length()-m);
            int numfinal=Integer.parseInt(num);
            System.out.println("El numero final es: "+numfinal);
        }else{
            System.out.println("La cantidad de cifras a restar es mayor a la longitud del numero");
        }
        
        /*Ejercicio16 */
        System.out.println("Ingrese la cantidad de grados centigrados: ");
        double c=scanner.nextDouble();
        double r=c*0.8;
        double k=c+273.15;
        System.out.println("Los grados pasados a Reamur seria: "+r+"ºR");
        System.out.println("Los grados pasados a Kelvin seria: "+k+"ºK");

    }



}  
