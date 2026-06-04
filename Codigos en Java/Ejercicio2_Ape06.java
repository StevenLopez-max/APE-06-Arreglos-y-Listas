import java.util.ArrayList; 
import java.util.Collections; 
public class Ejercicio2_Ape06 { 
public static void main(String[] args) { 
ArrayList<Double> notas = new ArrayList<>(); 
notas.add(8.5);  notas.add(7.0);  notas.add(9.2); 
notas.add(6.4);  notas.add(10.0); notas.add(5.8); 
System.out.println("Notas registradas:"); 
for (double nota : notas) 
System.out.println("  " + nota); 
double maximo = Collections.max(notas); 
double minimo = Collections.min(notas); 
double suma = 0;
for (double n : notas) suma += n; 
double promedio = suma / notas.size(); 
System.out.println("Nota más alta : " + maximo); 
System.out.println("Nota más baja : " + minimo); 
System.out.printf("Promedio       : %.2f%n", promedio); 
} 
} 