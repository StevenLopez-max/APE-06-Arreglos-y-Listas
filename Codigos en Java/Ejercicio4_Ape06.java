import 
java.util.ArrayList; import 
java.util.Scanner; public 
class Ejercicio4_Ape06 { 
public static void main(String[] args) { 
ArrayList<String> items = new ArrayList<>(); Scanner scan = new 
Scanner(System.in); 
int opcion = 0; 
do { 
System.out.println("\n--- MENU CRUD ---"); 
System.out.println("1. Crear\n2. Leer\n3. Actualizar\n4. Eliminar\n5. Salir"); 
System.out.print("Seleccione: "); 
opcion = scan.nextInt(); 
scan.nextLine(); // Limpiar el buffer 
switch (opcion) { 
case 1: // CREATE 
System.out.print("Ingrese nuevo item: "); 
items.add(scan.nextLine()); // [cite: 26] 
System.out.println("Guardado."); 
break; 
case 2: // READ 
System.out.println("- Lista de Items -"); for (int i = 0; i < items.size(); 
i++) { 
System.out.println("[" + i + "] " + items.get(i)); // [cite: 26] 
}break; 
case 3: // UPDATE 
System.out.print("Indice a actualizar: "); int idxU = 
scan.nextInt(); scan.nextLine(); 
if(idxU >= 0 && idxU < items.size()){ 
System.out.print("Nuevo valor: "); 
items.set(idxU, scan.nextLine()); // set() para actualizar en Java 
System.out.println("Actualizado."); 
} 
break; 
case 4: // DELETE 
System.out.print("Indice a eliminar: "); int idxD = scan.nextInt(); 
if(idxD >= 0 && idxD < items.size()){ 
items.remove(idxD); // [cite: 26] 
System.out.println("Eliminado."); 
} 
break; 
} 
} while (opcion != 5); 
scan.close(); 
} 
}