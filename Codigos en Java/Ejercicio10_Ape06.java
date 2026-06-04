import java.util.LinkedList;
import java.util.Scanner;
public class Ejercicio10_Ape06 {
   public static void main(String[] args) { 
 
        LinkedList<String> filaAtencion = new LinkedList<>(); 
        Scanner leer = new Scanner(System.in); 
        int menuSelect = 0; 
 
        do { 
            System.out.println("\n========================================="); 
            System.out.println("     SIMULACION DE FILA FIFO (JAVA)      "); 
            System.out.println("========================================="); 
            System.out.println("1. Agregar Cliente"); 
            System.out.println("2. Atender Siguiente"); 
            System.out.println("3. Ver Proximo Cliente"); 
            System.out.println("4. Visualizar Fila"); 
            System.out.println("5. Salir"); 
            System.out.print("Ingrese opcion: "); 
 
            if (leer.hasNextInt()) { 
                menuSelect = leer.nextInt(); 
                leer.nextLine(); 
                 } else { 
                System.out.println("[!] Debe ingresar un numero."); 
                leer.nextLine(); 
                continue; 
            } 
 
            switch (menuSelect) { 
 
                case 1: 
                    System.out.print("Ingrese identificacion del cliente: "); 
                    String id = leer.nextLine(); 
 
                    filaAtencion.add(id); 
 
                    System.out.println("[OK] Cliente agregado a la fila."); 
                    break; 
 
                case 2: 
                    if (!filaAtencion.isEmpty()) { 
 
                        String procesado = filaAtencion.remove(); 
 
                        System.out.println("[ATENCION] Cliente atendido: " 
                                + procesado); 
 
                    } else { 
 
                        System.out.println("[!] No hay clientes en espera."); 
                    } 
                    break; 
 
                case 3: 
                    if (!filaAtencion.isEmpty()) { 
 
                        System.out.println("Proximo cliente: " 
                                + filaAtencion.peek()); 
 
                    } else { 
 
                        System.out.println("[!] La fila esta vacia."); 
                    } 
                    break; 
                    case 4: 
                    if (!filaAtencion.isEmpty()) { 
 
                        System.out.println("\n--- FILA ACTUAL ---"); 
 
                        int pos = 1; 
 
                        for (String cliente : filaAtencion) { 
                            System.out.println(pos + ". " + cliente); 
                            pos++; 
                        } 
 
                        System.out.println("Total de clientes: " 
                                + filaAtencion.size()); 
 
                    } else { 
 
                        System.out.println("[!] La fila esta vacia."); 
                    } 
                    break; 
 
                case 5: 
                    System.out.println("Programa finalizado."); 
                    break; 
 
                default: 
                    System.out.println("[!] Opcion no valida."); 
            } 
 
        } while (menuSelect != 5); 
 
        leer.close(); 
    } 
} 
 


