import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ejerExpReg {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        //Ejercicio 1 (VALIDACION TELEFONO)
        System.out.println("Ingrese su numero de telefono: ");
        String tel=scr.next();
        String patrontel = "[0-9]{7,10}";
        Pattern patternTEL = Pattern.compile(patrontel);
        Matcher matcherTEL = patternTEL.matcher(tel);
        if (matcherTEL.matches()){
            System.out.println("Telefono valido");
        }else{
            System.out.println("Telefono invalido");
        }

        //Ejercicio 2 (VALIDACION DE CUIL)
        System.out.println("Ingrese su cuil: ");
        String cuil=scr.next();
        String patroncuil = "[0-9]{11}";
        Pattern patternCUIL = Pattern.compile(patroncuil);
        Matcher matcherCUIL = patternCUIL.matcher(cuil);
        if(matcherCUIL.matches()){
            System.out.println("Cuil valido.");
        }else{
            System.out.println("Cuil invalido.");
        }

        //Ejercicio 3 (VALIDACION CORREO ELECTRONICO)
        System.out.println("Ingrese su correo electronico: ");
        String correo=scr.next();
        String patroncorreo = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
        Pattern patternCORREO = Pattern.compile(patroncorreo);
        Matcher matcherCORREO = patternCORREO.matcher(correo);
        if(matcherCORREO.matches()){
            System.out.println("El correo es valido.");
        }else{
            System.out.println("El correo no es valido.");
        }

        //Ejercicio 4 (VALIDACION NOMENCLATURA)
        System.out.println("Ingresa una nomenclatura: ");
        String nomenclatura=scr.next();
        String patronNomencla = "[0-9]{22}";
        Pattern patternNomencla = Pattern.compile(patronNomencla);
        Matcher matcherNomencla = patternNomencla.matcher(nomenclatura);
        if(matcherNomencla.matches()){
            System.out.println("Es una nomenclatura.");
        }else{
            System.out.println("No es una nomenclatura.");
        }

        //Ejercicio 5 (VALIDACION LETRAS)
        System.out.println("Ingresa solo letras: ");
        String letras=scr.next();
        String patronletras = "[A-Za-z]{7,10}"; //a-z minusculas A-Z Mayusculas
        Pattern patternLET = Pattern.compile(patronletras);
        Matcher matcherLET = patternLET.matcher(letras);
        if(matcherLET.matches()){
            System.out.println("Ingreso de solo letras validos.");
        }else{
            System.out.println("Ingreso de solo letras invalido.");
        }

        //Ejercicio 6 (VALIDACIONES COMBINADAS)
        System.out.println("Le pediremos que ingrese su tel, cuil, y mail: ");
        System.out.println("Tel: ");
        String tel6=scr.next();
        System.out.println("Cuil: ");
        String cuil6=scr.next();
        System.out.println("Mail: ");
        String mail6=scr.next();
        Pattern patternTEL6 = Pattern.compile(patrontel);//Se usa el mismo patron del ejerc 1
        Matcher matcherTEL6 = patternTEL6.matcher(tel6);
        Pattern patternCUIL6 = Pattern.compile(patroncuil);//Se usa el mismo patron del ejerc 2
        Matcher matcherCUIL6 = patternCUIL6.matcher(cuil6);
        Pattern patternMail6 = Pattern.compile(patroncorreo);//Se usa el mismo patron del ejerc 3
        Matcher matcherMail6= patternMail6.matcher(mail6);
        boolean telValido = matcherTEL6.matches();
        boolean cuilValido = matcherCUIL6.matches();
        boolean mailValido = matcherMail6.matches();
        if(telValido && cuilValido && mailValido){
            System.out.println("Los datos ingresados son validos.");
        }else{
            System.out.println("Los/Uno de los  datos ingresados no son validos");
            if (!telValido) {
                System.out.println("El Tel ingresado no es válido.");
            }
        
            if (!cuilValido) {
                System.out.println("El Cuil ingresado no es válido.");
            }
        
            if (!mailValido) {
                System.out.println("El Mail ingresado no es válido.");
            }
        }

        //Ejercicio 7 (VALIDACION CORREO MULTIPLE)
        System.out.println("Ingrese una lista de mails: ");
        String input = scr.nextLine();
        input += scr.nextLine();

        String[] correos = input.split(",");
        ArrayList<String> correosInvalidos = new ArrayList<>();

        for (String correo7 : correos) {
            String correoTrimmed = correo7.trim(); // Eliminar espacios en blanco
            String patronCorreo7= "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
            Pattern patternCorreo7 = Pattern.compile(patronCorreo7);
            Matcher matcherCorreo7 = patternCorreo7.matcher(correoTrimmed);
            
            if (!matcherCorreo7.matches()) {
                correosInvalidos.add(correoTrimmed);
            }
        }

        if (correosInvalidos.isEmpty()) {
            System.out.println("Todos los correos electrónicos son válidos.");
        } else {
            System.out.println("Los siguientes correos electrónicos son inválidos:");
            for (String correoInvalido : correosInvalidos) {
                System.out.println(correoInvalido);
            }
        }

        //Ejercicio 8 (VALIDACION TEL INTERNACIONAL)
        System.out.println("Ingrese el numero de telefono: ");
        String telInternacional=scr.next();
        String patrontelI = "\\+[0-9]{7,10}";
        Pattern patternTEL8 = Pattern.compile(patrontelI);
        Matcher matcherTEL8 = patternTEL8.matcher(telInternacional);
        if(matcherTEL8.matches()){
            System.out.println("Numero de telefono internacional.");
        }else{
            System.out.println("No es un numero internacional");
        }

        //Ejercicio 9 (VALIDACION CORREO PERSONALIZADO)
        System.out.println("Ingrese un correo valido: ");
        String correoPersonalizado=scr.next();
        String dominioPermitido = "miempresa.com";

        // Crear el patrón de expresión regular personalizado
        String patronMailP = "^[A-Za-z0-9+_.-]+@" + dominioPermitido + "$";
        Pattern patternCorreo9 = Pattern.compile(patronMailP);
        Matcher matcherCorreo9 = patternCorreo9.matcher(correoPersonalizado);

        if(matcherCorreo9.matches()){
            System.out.println("Correo valido");
        }else{
            System.out.println("Correo invalido debe tener el dominio especifico: 'miempresa.com'");
        }

        //Ejercicio 10 (VALIDACION CODIGO POSTAL)
        System.out.println("Ingrese su codigo postal");
        String cp=scr.next();
        String patronCodigoPostal = "[A-Za-z0-9]{4,7}";
        Pattern patternCP = Pattern.compile(patronCodigoPostal);
        Matcher matcherCP = patternCP.matcher(cp);

        if(matcherCP.matches()){
            System.out.println("CP valido.");
        }else{
            System.out.println("CP invalido.");
        }

        //Ejercicio 11 (VALIDACION DNI)
        System.out.println("Ingrese su DNI: ");
        String dni=scr.next();
        String patronDNI="[0-9]{7,8}";
        Pattern patternDni=Pattern.compile(patronDNI);
        Matcher matcherDni= patternDni.matcher(dni);
        if(matcherDni.matches()){
            System.out.println("Dni valido. ");
        }else{
            System.out.println("Dni invalido.");
        }

        //Ejercicio 12 (VALIDACION USUARIO)

        System.out.println("Ingrese un nombre de usuario (de 6 a 11 caracteres, solo letras, numeros y guiones bajos):");
        String usuario = scr.next();
        String patronUsuario = "^[A-Za-z0-9_]{6,11}$";
        Pattern patternUSUARIO = Pattern.compile(patronUsuario);
        Matcher matcherusuario = patternUSUARIO.matcher(usuario);

        if (matcherusuario.matches()) {
            System.out.println("Nombre de usuario válido.");
        } else {
            System.out.println("El nombre de usuario no es válido o no cumple con las restricciones de longitud.");
        }

        //Ejercicio 13 (VALIDACION FECHA)
        System.out.println("Ingrese una fecha con formato 'dd/mm/aaaa'");
        String fecha=scr.next();
        String patronFecha="^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/(\\d{4})$";
        Pattern patternFecha = Pattern.compile(patronFecha);
        Matcher matcherFecha = patternFecha.matcher(fecha);
        
        if (matcherFecha.matches()){
            System.out.println("Es una fecha valida.");
        }else{
            System.out.println("Fecha invalida el formato deberia ser 'dd/mm/aaaa' o fecha inexistente.");
        }

        //Ejercicio 14 (VALIDACION DOMINIO WEB)
        System.out.println("Ingrese un nombre de dominio web:");
        String dominioWEB = scr.next();

        String patronDominioweb = "^(www\\.)?[a-zA-Z0-9.-]+\\.[a-z]{2,}$";
        Pattern patternWEB = Pattern.compile(patronDominioweb);
        Matcher matcherWEB = patternWEB.matcher(dominioWEB);

        if (matcherWEB.matches()) {
            System.out.println("Nombre de dominio web válido.");
        } else {
            System.out.println("El nombre de dominio no es válido.");
        }

        //Ejercicio 15 (VALIDACION NOMBRES DE PRODUCTOS)
        System.out.println("Ingrese el nombre de un producto (mínimo 5 caracteres y solo letras):");
        String nombreProducto = scr.next();
        String patronNombreProducto = "^[A-Za-z]{5,}$";
        Pattern patternNP = Pattern.compile(patronNombreProducto);
        Matcher matcherNP = patternNP.matcher(nombreProducto);

        if (matcherNP.matches()) {
            System.out.println("Nombre de producto valido.");
        } else {
            System.out.println("El nombre de producto no es valido.");
        }

        //Ejercicio 16 (VALIDACION CONTRASEÑA)
        System.out.println("Ingrese una contraseña (debe tener al menos 8 caracteres, contener letras y números):");
        String contraseña = scr.next();
        String patronContraseña = "^(?=.*[A-Za-z])(?=.*\\d).{8,13}$";
        Pattern patternContraseña = Pattern.compile(patronContraseña);
        Matcher matcherContraseña = patternContraseña.matcher(contraseña);

        if (matcherContraseña.matches()) {
            System.out.println("Contraseña valida.");
        } else {
            System.out.println("La contraseña no es valida.");
        }
        scr.close();
    }
}
