#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main() {
    vector<string> productos;
    vector<int> cantidades;

    int numProductos;

    cout << "¿Cuántos productos desea registrar? ";
    cin >> numProductos;
    cin.ignore();

    for (int i = 0; i < numProductos; i++) {
        string producto;
        int cantidad;

        cout << "\nProducto " << i + 1 << endl;

        cout << "Nombre del producto: ";
        getline(cin, producto);
        productos.push_back(producto);

        cout << "Cantidad disponible: ";
        cin >> cantidad;
        cin.ignore();
        cantidades.push_back(cantidad);
    }

    cout << "\n===== INVENTARIO REGISTRADO =====" << endl;

    for (int i = 0; i < productos.size(); i++) {
        cout << "Producto: " << productos[i]
             << " | Cantidad: " << cantidades[i]
             << endl;
    }

    return 0;
}