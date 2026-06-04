import java.util.ArrayList; 
import java.util.Scanner;
public class Ejercicio3_Ape06 { 
public static void main(String[] args) { 
ArrayList<String> productos = new 
ArrayList<>(); 
Scanner scanner = new Scanner(System.in); // Objeto para lectura de teclado 
// 1. Población de datos 
productos.add("Laptop"); 
productos.add("Mouse"); 
productos.add("Teclado"); 
productos.add("Monitor"); 
// 2. Interacción con el usuario 
System.out.print("Ingrese el producto a buscar: "); String buscado = 
scanner.nextLine(); 
// 3. Verificación rápida usando el método nativo contains() 
if (productos.contains(buscado)) { 
System.out.println("Resultado: El producto '" + buscado + "' SÍ se encuentra en stock."); 
} else { 
System.out.println("Resultado: Producto NO encontrado."); 
} 
scanner.close(); // Liberación del recurso 
} 
}