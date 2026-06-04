#include <iostream> 
#include <vector> 
#include <string> 
#include <algorithm> // Librería para funciones como 'find'
 using namespace std; 
int main() { 
// 1. Declaración e inicialización rápida 
vector<string> productos = {"Laptop", "Mouse", "Teclado", "Monitor"}; 
string buscado; 
// 2. Captura de datos del usuario
cout << "Ingrese el producto a buscar: "; cin >> buscado; 
// 3. Búsqueda utilizando iteradores de la STL (Standard Template Library) 
auto it = find(productos.begin(), productos.end(), buscado); 
// 4. Validación del resultado 
if (it != productos.end()) { 
cout << "Resultado: El producto '" << buscado << "' SI se encuentra en stock." << endl; 
} else { 
    cout << "Resultado: Producto NO encontrado." << endl; 

}
return 0;
}