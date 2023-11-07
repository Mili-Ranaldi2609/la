import java.util.Scanner;

public class parcial2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("////Menú////");
            System.out.println("(1) Detectar si un ADN es mutante");
            System.out.println("(2) Salir");
            System.out.print(": ");

            String option = scanner.nextLine();

            if (option.equals("1")) {
                char[][] adn = new char[6][6];
                for (int i = 0; i < 6; i++) {
                    while (true) {
                        System.out.print("Ingrese la fila " + (i + 1) + " de la secuencia de ADN (exactamente 6 letras): ");
                        String row = scanner.nextLine().toUpperCase();
                        
                        if (row.matches("^[ATCG]{6}$")) { // Utiliza una expresión regular para verificar la fila
                            adn[i] = row.toCharArray();
                            break;
                        } else {
                            System.out.println("Error: Debe ingresar exactamente 6 letras válidas (ATCG).");
                        }
                    }
                }

                if (isMutant(adn)) {
                    System.out.println("El humano es mutante (ºOº). Sera reclutado por MAGNETO.");
                } else {
                    System.out.println("El humano no es mutante (-_-). Prueba finalizada.");
                }
            } else if (option.equals("2")) {
                System.out.println("Programa finalizado (>u<)");
                break;
            } else {
                System.out.println("Opción inválida. Por favor, elija nuevamente.");
            }
        }
        scanner.close();
    }

    public static boolean isMutant(char[][] adn) {
        int filas = adn.length;
        int columnas = adn[0].length;

        // Definir los patrones a buscar para secuencias mutantes
        String[] patrones = {"AAAA", "TTTT", "CCCC", "GGGG"};
        
        int contadorMutante = 0; // Contador para el número de secuencias mutantes encontradas
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                // Verificar los patrones en todas las direcciones
                for (String patron : patrones) {
                    // Horizontal
                    if (j + patron.length() <= columnas) {
                        String secuencia = new String(adn[i], j, patron.length());
                        if (secuencia.equals(patron)) {
                            contadorMutante++;
                            
                        }
                    }

                    // Vertical
                    if (i + patron.length() <= filas) {
                        StringBuilder secuencia = new StringBuilder();
                        for (int k = 0; k < patron.length(); k++) {
                            secuencia.append(adn[i + k][j]);
                        }
                        if (secuencia.toString().equals(patron)) {
                            contadorMutante++;
                            
                        }
                    }

                    // Diagonal de izquierda a derecha
                    if (i + patron.length() <= filas && j + patron.length() <= columnas) {
                        StringBuilder secuencia = new StringBuilder();
                        for (int k = 0; k < patron.length(); k++) {
                            secuencia.append(adn[i + k][j + k]);
                        }
                        if (secuencia.toString().equals(patron)) {
                            contadorMutante++;
                            
                        }
                    }

                    // Diagonal de derecha a izquierda
                    if (i + patron.length() <= filas && j - patron.length() + 1 >= 0) {
                        StringBuilder secuencia = new StringBuilder();
                        for (int k = 0; k < patron.length(); k++) {
                            secuencia.append(adn[i + k][j - k]);
                        }
                        if (secuencia.toString().equals(patron)) {
                            contadorMutante++;
                            
                        }
                    }
                }
            }
        }
        if  (contadorMutante > 1){
            return true;
        }else{
            return false;
        }
        
    
        
}}