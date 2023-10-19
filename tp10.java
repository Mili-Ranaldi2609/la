import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Random;
/*EJERCICIOS (1)(2)(3)*/
class Perro{
    private String nombre;
    private String raza;
    private int edad;

    public Perro(String nombre, String raza, int edad){
        this.nombre=nombre;
        this.raza=raza;
        this.edad=edad;
}   
    public String getNombre()  {
        return nombre;

}
    public String getRaza(){
        return raza;
}
    public int getEdad(){
        return edad;
}
    public void ladrar() {
        System.out.println("Guau, guau");

}}
/*EJERCICIOS (4)(5) */
class Circulo{
    private double radio;
    public Circulo(double radio){
        this.radio=radio;
}
    public double getRadio(){
        return radio;
}
    public double calcularArea(){
        return Math.PI * Math.pow(radio, 2);
}
    public double calcularCircunferencia(){
        return 2 * Math.PI * radio;
}
    
}
/*EJERCICIOS (6)(7) */
class Estudiante{
    private String nombre;
    private int edad;
    private String EId;
    /*constructor*/
    public Estudiante(String nombre,int edad, String Eid){
        this.nombre=nombre;
        this.edad=edad;
        this.EId=Eid;
}
    public String getNombre(){
        return nombre;
}
    public int getEdad(){
        return edad;
}
    public String getEid(){
        return EId;
}
}
/*EJERCICIOS (8)(9) */
class Libro{
    private String titulo;
    private String autor;
    private int fechaP;
    public Libro(String titulo, String autor, int fechaP){
        this.titulo=titulo;
        this.autor=autor;
        this.fechaP=fechaP;
}
    public void mostrarInformacion() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Fecha de Publicación: " + fechaP);
}
}
/*EJERCICIOS (10)(11) */
class CuentaBancaria{
    private String numCuenta;
    private double saldo;
    public CuentaBancaria(String numCuenta, double saldo){
        this.numCuenta=numCuenta;
        this.saldo=0.0;
}
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("El monto del depósito debe ser mayor que cero.");
        }
}
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro exitoso. Nuevo saldo: " + saldo);
        } else {
            System.out.println("Monto de retiro no válido o saldo insuficiente.");
        }
}
    public double getSaldo(){
        return saldo;
}
    public String getNumCuenta(){
        return numCuenta;
}

}
/*EJERCICIO (12) */
class Rectangulo{
    private double ancho;
    private double alto;
    public Rectangulo(double ancho, double alto){
        this.ancho= ancho;
        this.alto=alto;
}
    public double getAncho(){
        return ancho;
}
    public double getAlto(){
        return alto;
}
    public double calcularAreaR() {
        return ancho * alto;
}
    // Método para calcular el perímetro del rectángulo
    public double calcularPerimetroR() {
        return 2 * (ancho + alto);
}
}
/*EJERCICIOS (13)(14) */
class Coche{
    private String marca;
    private String modelo;
    private int añoFabricacion;
    private int velocidad;
    public Coche(String marca, String modelo, int añoFabricacion){
        this.marca=marca;
        this.modelo=modelo;
        this.añoFabricacion=añoFabricacion;
        this.velocidad=0;
}
    public String getMarca(){
        return marca;
}
    public String getModelo(){
        return modelo;
}
    public int getAñoFabricacion(){
        return añoFabricacion;
}
    public int getVelocidad(){
        return velocidad;
}
    // Método para acelerar el coche
    public void acelerar(int incremento) {
        if (incremento > 0) {
            velocidad += incremento;
            System.out.println("El coche ha acelerado a " + velocidad + " km/h.");
        } else {
            System.out.println("El incremento de velocidad debe ser mayor que cero.");
        }
}
    // Método para frenar el coche
    public void frenar(int decremento) {
        if (decremento > 0 && decremento <= velocidad) {
            velocidad -= decremento;
            System.out.println("El coche ha frenado a " + velocidad + " km/h.");
        } else {
            System.out.println("Decremento de velocidad no válido o velocidad insuficiente.");
        }
}
}
/*EJERCICIO (15) */
class Pelicula{
    private String tituloP;
    private String director;
    private int duracion;
    public Pelicula(String titulo, String director, int duracion) {
        this.tituloP = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    // Método para mostrar la información de la película
    public void mostrarInformacion() {
        System.out.println("Título: " + tituloP);
        System.out.println("Director: " + director);
        System.out.println("Duración (minutos): " + duracion);
    }

}
public class tp10{
    public static void main(String[] args) throws Exception{
    /*Ejercicios (1)(2)(3) */
    ArrayList<Perro> perros= new ArrayList<>();
    perros.add(new Perro("Lucas","Gran Danes", 10));
    perros.add(new Perro("Chocolate", "Shih Tzu", 4));
    perros.add(new Perro("Negro", "Bulldog Frances", 7));
    for (Perro perro: perros){
        System.out.println(perro.getNombre()+" - "+ perro.getRaza()+" - "+perro.getEdad());
        perro.ladrar(); 
    }
    /*Ejercicios (4)(5) */
    ArrayList<Circulo> circulos= new ArrayList<>();
    circulos.add(new Circulo(23));
    circulos.add(new Circulo(33));
    circulos.add(new Circulo(2));
    for (Circulo circulo : circulos) {
            System.out.println("Radio del círculo: " + circulo.getRadio());
            System.out.println("Su área es: " + circulo.calcularArea());
            System.out.println("Su circunferencia es: "+circulo.calcularCircunferencia());
        }
    /*Ejercicios (6)(7) */
    ArrayList<Estudiante> estudiantes= new ArrayList<>();
    estudiantes.add(new Estudiante("Jose Hernandez", 18, "JH1947"));
    estudiantes.add(new Estudiante("Maria Gonzalez", 21, "MG09382"));
    estudiantes.add(new Estudiante("Nicolas Flores", 19, "NF1929"));
    for (Estudiante estudiante: estudiantes){
        System.out.println("Nombre: "+estudiante.getNombre()+"---Edad: "+estudiante.getEdad()+"---ID: "+estudiante.getEid());
    }
    /*Ejercicios (8)(9) */
    Libro miLibro = new Libro("El Gran Gatsby", "F. Scott Fitzgerald", 1925);
    miLibro.mostrarInformacion();
    /*Ejercicios (10)(11)*/
    CuentaBancaria miCuenta = new CuentaBancaria("1234567890",0.0);
    // Realizar depósitos y retiros
    miCuenta.depositar(1000.0);
    miCuenta.retirar(200.0);
    // Obtener el saldo actual
    double saldoActual = miCuenta.getSaldo();
    System.out.println("Numero de cuenta: "+miCuenta.getNumCuenta()+"//Saldo actual: " + saldoActual);
    System.out.println(" ");
    /*Ejercicio (12) */
    ArrayList<Rectangulo> rectangulos= new ArrayList<>();
    rectangulos.add(new Rectangulo(13.0,6.6));
    rectangulos.add(new Rectangulo(7.0,3.4));
    rectangulos.add(new Rectangulo(1.0,2.1));
    for (Rectangulo rectangulo: rectangulos){
        System.out.println("------------------------------------------");
        System.out.println("Ancho: "+rectangulo.getAncho()+"--Alto: "+rectangulo.getAlto());
        System.out.println("Area: "+rectangulo.calcularAreaR()+"--Perimetro: "+rectangulo.calcularPerimetroR());
    }
    /*Ejercicios (13)(14) */
    System.out.println("**************************");
    Random rand = new Random();
    ArrayList<Coche> coches= new ArrayList<>();
    coches.add(new Coche("Peugeot", "308", 2013));
    coches.add(new Coche("Chevrolet", "Onix", 2012));
    coches.add(new Coche("Ford", "Fiesta", 2023));
    for(Coche coche: coches){
        System.out.println("Marca: "+coche.getMarca()+"//Modelo: "+coche.getModelo()+"//Año Fabricacion: "+coche.getAñoFabricacion());
        int aceleracion = rand.nextInt(50); // Genera un número aleatorio entre 0 y 49
        coche.acelerar(aceleracion);
        int frenado = rand.nextInt(coche.getVelocidad()); // Genera un número aleatorio entre 0 y la velocidad actual del coche
        coche.frenar(frenado);
        
        System.out.println("------------------------------------------");
    }
    /*Ejercicio (15) */
    ArrayList<Pelicula> peliculas= new ArrayList<>();
    peliculas.add(new Pelicula("Titanic", "James Cameron", 194));
    peliculas.add(new Pelicula("La vida es bella", "Roberto Benigni", 116));
    peliculas.add(new Pelicula("Mi pobre angelito", "Chris Columbus", 103));
    for(Pelicula pelicula: peliculas){
        pelicula.mostrarInformacion();
        System.out.println("___________________________________________________");
    }
    }
}