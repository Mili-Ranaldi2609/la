import java.util.Scanner;
public class repasoParcial {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);

        /*Ejercicio A */
        System.out.println("Ejercicio A: ");
        System.out.println("Ingrese el primer nº entero ");
        int nA=scanner.nextInt();
        System.out.println("Ingrese el segundo nº entero");
        int nA_2=scanner.nextInt();
        int cA=nA%10;
        int cA_2=nA_2%10;
        if(cA==cA_2){
            System.out.println("Terminan con la misma cifra");
        }else{
            System.out.println("Su ultima cifra es diferente");
        }

        /*Ejercicio B */
        System.out.println("Ejercicio B");
        System.out.println("Ingrese un numero de 3 cifras: ");
        int numb=scanner.nextInt();
        if (numb>=100 && numb<=999){
        int numOriginal=numb;
        int numReverso=0;
        int aux;
        
        aux=numb%10;
        numReverso=numReverso*10+aux;
        numb/=10;

        aux=numb%10;
        numReverso=numReverso*10+aux;
        numb/=10;

        aux=numb%10;
        numReverso=numReverso*10+aux;
        numb/=10;

        if (numOriginal==numReverso){
            System.out.println("El numero es capicua");
        }else{
            System.out.println("El numero "+numOriginal+" no es capicua");
        }}else{
            System.out.println("El numero ingresado no es de tres cifras. Reinicie el programa y vuelva a intentarlo");
        }
        


}
}