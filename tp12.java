import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class tp12 {

    public static void main(String[] args) {
        /////////////////////////////////////////
        // Ejercicio (2)y(3)
        ArrayList<String[]> datos = new ArrayList<>();

        // Agrega los datos al ArrayList
        datos.add(new String[] { "Juan Gonzales", "juan123gonz@gmail.com", "2614567890", "1990-05-15"});
        datos.add(new String[] { "Maria Rivas", "mariarivas12.com", "2611234567", "1985/02/10"});
        datos.add(new String[] { "Carlos Benegas", "carlos.benegas123@gmail.com", "7890", "2000-09-30" });
        datos.add(new String[] { "Laura Lopez", "laura12lopez@gmail.com", "2611234567", "1998-12-31" });
        for (String[] dato : datos) {
            String nombre = dato[0];
            String email = dato[1];
            String telefono = dato[2];
            String fechaNacimiento = dato[3];

            if (validarNombre(nombre) && validarEmail(email) && validarTelefono(telefono) && validarFecha(fechaNacimiento)) {
                System.out.println("Datos válidos para " + nombre);
            } else {
                System.out.println("Datos no válidos para " + nombre);
            }
        }
        //////////////////////////////////////
        //Ejercicio (5)
        //Comprobar si el String cadena no acaba con un dígito.
        //(5.1)
        ArrayList<String> terminaDigit = new ArrayList<>();
        terminaDigit.add("Hola");
        terminaDigit.add("12 Chau");
        terminaDigit.add("1234");
        terminaDigit.add("HOLA 1");
        for (String i: terminaDigit){
            if(noTerminaConDigito(i)){
                System.out.println("'"+i+"' : No termina en digito");
            }else{
                System.out.println("'"+i+"' : Termina en digito");
            }
            
        }
        //Comprobar si el String cadena no empieza por un dígito.
        //(5.2)
        ArrayList<String> empiezaDigit = new ArrayList<>();
        empiezaDigit.add("12345");
        empiezaDigit.add("1 si");
        empiezaDigit.add("Gracias! De 10");
        empiezaDigit.add("Son 20");
        for (String i: empiezaDigit){
            if(noEmpiezaConDigito(i)){
                System.out.println("'"+i+"' : No empieza en digito");
            }else{
                System.out.println("'"+i+"' : Empieza en digito");
            }
            
        }
        //Comprobar si el String cadena está formado por un mínimo de 5 
        //letras mayúsculas o minúsculas y un máximo de 10.
        //(5.3)
        ArrayList<String> formatoLetras = new ArrayList<>();
        formatoLetras.add("AffAkkkkkkkkkkkkkkkkkkkkkkkkk");
        formatoLetras.add("A");
        formatoLetras.add("AgaTTQTWTW");
        formatoLetras.add("hahqyyyw");
        for(String i : formatoLetras){
            if(cumpleRequisitos(i)){
                System.out.println("{"+i+"} Contiene entre 5 y 10 letras mayúsculas o minúsculas");
            }else{
                System.out.println("{"+i+"} No cumple los requisitos");
            }
        }
        //Validar el ingreso de un DNI (xx-xxx-xxx).
        //(5.4)
        ArrayList<String> dni = new ArrayList<>();
        dni.add("44-437-603");
        dni.add("321-11-123");
        dni.add("12345678");
        dni.add("31-747-179");
        for(String i:dni){
            if(validarDNI(i)){
                System.out.println("("+i+") Dni valido");
            }else{
                System.out.println("("+i+") Dni no valido o formato de dni invalido");
            }
        }
        //Guardar en un arraylist una serie de mails, 
        //pero antes de ser guardados deben cumplir con 
        //las condiciones de las expresiones regulares.
        //(5.5)
        ArrayList<String> correosValidos = new ArrayList<>();
        ArrayList<String> correosInvalidos = new ArrayList<>();

        ArrayList<String> listaCorreos = new ArrayList<>();
        listaCorreos.add("gonz123@gmail.com");
        listaCorreos.add("@hotmail.com");
        listaCorreos.add("ale.gonz123@gmail.com");
        listaCorreos.add("ale.gonzalesgmail.com");

        for (String correo : listaCorreos) {
            if (emailValido(correo)) {
                correosValidos.add(correo);
            } else {
                correosInvalidos.add(correo);
            }
        }

        System.out.println("Correos válidos:");
        for (String valido : correosValidos) {
            System.out.println(valido);
        }

        System.out.println("Correos inválidos:");
        for (String invalido : correosInvalidos) {
            System.out.println(invalido);
        }
        //Comprobar si el String cadena contiene “abc”.
        //(5.6)
        ArrayList<String> abc = new ArrayList<>();
        abc.add("El abecedario empieza por abc...");
        abc.add("abcdefg");
        abc.add("Hola bien, como estas?");
        abc.add("aajbcjdjdj");
        for(String i:abc){
            if(contieneABC(i)){
                System.out.println("//"+i+"// Contiene 'abc'");
            }else{
                System.out.println("//"+i+"// No contiene 'abc'");
            }
        }
    }

    ////////////////////////////////////////////////
    //FUNCIONES EJ(2)(3)
    //Funcion para validar el Nombre y Apellido
    public static boolean validarNombre(String nombre) {
        // Utiliza una expresión regular para validar el formato del nombre (Nombre Apellido)
        String regex = "^[A-Z][a-zA-Z]+\\s[A-Z][a-zA-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(nombre);
        return matcher.matches();
    }
    // Función para validar una dirección de correo electrónico
    public static boolean validarEmail(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(regex, email);
    }

    // Función para validar un número de teléfono
    public static boolean validarTelefono(String telefono) {
        String regex =  "^(\\+\\d{1,2})?\\d{10}$";
        return Pattern.matches(regex, telefono);
    }

    // Función para validar una fecha en formato YYYY-MM-DD
    public static boolean validarFecha(String fecha) {
        String regex = "^\\d{4}-\\d{2}-\\d{2}$";
        return Pattern.matches(regex, fecha);
    }
    //Funciones ejercicio (5)
    //(5.1)
    public static boolean noTerminaConDigito(String cadena) {
        String regex = ".*\\d$";  
        return !Pattern.matches(regex, cadena);
    }
    //(5.2)
    public static boolean noEmpiezaConDigito(String cadena) {
        String regex = "^[^\\d].*";
        return Pattern.matches(regex, cadena);
    }
    //(5.3)
    public static boolean cumpleRequisitos(String cadena) {
        String regex = "^[A-Za-z]{5,10}$";
        return Pattern.matches(regex, cadena);
    }
    //(5.4)
    public static boolean validarDNI(String dni) {
        String regex = "^[0-9]{2}-[0-9]{3}-[0-9]{3}$";
        return Pattern.matches(regex, dni);
    }
    //(5.5)
    public static boolean emailValido(String email) {
        String regex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        return Pattern.matches(regex, email);
    }
    //(5.6)
    public static boolean contieneABC(String cadena) {
        String regex = ".*abc.*";
        return Pattern.matches(regex, cadena);
    }
}