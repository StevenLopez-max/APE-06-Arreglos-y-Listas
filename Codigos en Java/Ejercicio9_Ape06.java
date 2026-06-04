import java.util.LinkedList; 
import java.util.Scanner; 
public class Ejercicio9_Ape06 {
    public static void main(String[] args) { 
 
        LinkedList<String> listaTurnos = new LinkedList<>(); 
        Scanner leer = new Scanner(System.in); 
        int opcion; 
 
        do { 
            System.out.println("\n====================================="); 
            System.out.println("   SISTEMA DE TURNOS (LinkedList)   "); 
            System.out.println("====================================="); 
 System.out.println("1. Registrar Turno"); 
            System.out.println("2. Atender Turno"); 
            System.out.println("3. Insertar Turno Prioritario"); 
            System.out.println("4. Mostrar Lista de Turnos"); 
            System.out.println("5. Salir"); 
            System.out.print("Seleccione una opcion: "); 
 
            opcion = leer.nextInt(); 
            leer.nextLine(); 
 
            switch (opcion) { 
 
                case 1: 
                    System.out.print("Ingrese el nombre del cliente: "); 
                    String nombre = leer.nextLine(); 
 
                    listaTurnos.add(nombre); 
 
                    System.out.println("-> Turno guardado exitosamente."); 
                    break; 
 
                case 2: 
                    if (!listaTurnos.isEmpty()) { 
 
                        String atendido = listaTurnos.removeFirst(); 
 
                        System.out.println("-> Atendiendo al cliente: " + atendido); 
 
                    } else { 
 
                        System.out.println("[!] No hay turnos pendientes."); 
                    } 
                    break; 
 
                case 3: 
                    System.out.print("Ingrese el nombre prioritario: "); 
                    String prioritario = leer.nextLine(); 
 
                    System.out.print("Ingrese el indice (0 a " 
                            + listaTurnos.size() + "): "); 
 
                    int posicion = leer.nextInt(); 
                    leer.nextLine(); // Limpiar buffer 
                    if (posicion >= 0 && posicion <= listaTurnos.size()) { 
 
                        listaTurnos.add(posicion, prioritario); 
 
                        System.out.println("-> Turno prioritario insertado."); 
 
                    } else { 
 
                        System.out.println("[!] Indice invalido."); 
                    } 
                    break; 
 
                case 4: 
                    if (!listaTurnos.isEmpty()) { 
 
                        System.out.println("\n--- LISTA DE TURNOS ---"); 
 
                        int i = 0; 
 
                        for (String turno : listaTurnos) { 
                            System.out.println("[" + i + "] " + turno); 
                            i++; 
                        } 
 
                        System.out.println("Total de turnos: " 
                                + listaTurnos.size()); 
 
                    } else { 
 
                        System.out.println("[!] La lista esta vacia."); 
                    } 
                    break; 
 
                case 5: 
                    System.out.println("Saliendo del sistema..."); 
                    break; 
 
                default: 
                    System.out.println("[!] Opcion no valida."); 
            } 
 
        } while (opcion != 5);
        leer.close(); 
} 
} 

