import java.util.Scanner;
import javax.print.DocFlavor.STRING;
public class calculadora {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        
        /*Seccion 4 */
        System.out.println("Realizaremos operaciones basicas: ");
        int opcion_4=0;
        double r=0;
        
        
            
                System.out.println("1er Numero: ");
                double num4_1=scanner.nextDouble();
                System.out.println("2do Numero: ");
                double num4_2=scanner.nextDouble();   
                do{
                System.out.println("Elija la operacion que desea realizar: //(1)Suma//(2)Resta//(3)Multiplicacion//(4)Division//(5)Salir");
                opcion_4=scanner.nextInt();
                
                }while(opcion_4!=1 && opcion_4!=2 && opcion_4!=3 && opcion_4!=4);
                    if(opcion_4==1){
                    r=num4_1+num4_2;
                    System.out.println(num4_1+"+"+num4_2+"="+r);
                    }else if(opcion_4==2){
                        r=num4_1-num4_2;
                    System.out.println(num4_1+"-"+num4_2+"="+r);
                }else if(opcion_4==3){
                    r=num4_1*num4_2;
                    System.out.println(num4_1+"*"+num4_2+"="+r);
                }else if(opcion_4==4){
                    r=num4_1/num4_2;
                    if(num4_2==0){
                        System.out.println("No se puede dividir por cero. //Reinicie el programa");
                    }else{
                        System.out.println(num4_1+"/"+num4_2+"="+r);}      
                }else if(opcion_4==5){
                    System.out.println("");
                    break;
                }
        
        


}
}
