import java.util.ArrayList; 
public class Ejercicio1_Ape06 { 
public static void main(String[] args) { 
ArrayList<String> estudiantes = new ArrayList<>(); 
estudiantes.add("Ana García"); 
estudiantes.add("Luis Martínez"); 
estudiantes.add("María López"); 
estudiantes.add("Carlos Pérez"); 
estudiantes.add("Sofía Ramírez"); 
System.out.println("Lista de estudiantes:"); 
for (String nombre : estudiantes) { 
System.out.println("  - " + nombre); 
} 
System.out.println("Total: " + estudiantes.size()); 
} 
}