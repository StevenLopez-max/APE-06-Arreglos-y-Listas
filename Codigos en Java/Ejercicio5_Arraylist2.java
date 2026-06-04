import java.util.ArrayList;
import java.util.Scanner;

 class SistemaInventario {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<String> productos = new ArrayList<>();
        ArrayList<Integer> cantidades = new ArrayList<>();

        System.out.print("¿Cuántos productos desea registrar? ");
        int numProductos = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < numProductos; i++) {

            System.out.println("\nProducto " + (i + 1));

            System.out.print("Nombre del producto: ");
            String producto = sc.nextLine();
            productos.add(producto);

            System.out.print("Cantidad disponible: ");
            int cantidad = sc.nextInt();
            sc.nextLine();
            cantidades.add(cantidad);
        }

        System.out.println("\n===== INVENTARIO REGISTRADO =====");

        for (int i = 0; i < productos.size(); i++) {
            System.out.println("Producto: " + productos.get(i)
                    + " | Cantidad: " + cantidades.get(i));
        }

        sc.close();
    }
}
