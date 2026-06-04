#include <iostream> 
#include <vector> 
#include <string> 
using namespace std; int 
main() { 
vector<string> items;
int opcion, indice; string 
dato; 
do { 
// Renderizado del Menú 
cout << "\n--- MENU CRUD ---" << endl; 
cout << "1. Crear (Add)\n2. Leer (Read)\n3. Actualizar (Update)\n4. Eliminar (Delete)\n5. Salir" << 
endl; 
cout << "Seleccione: "; cin >> 
opcion; 
switch (opcion) { case 1: // CREATE 
cout << "Ingrese nuevo item: "; cin >> dato; 
items.push_back(dato); // [cite: 26] 
cout << "Guardado." << endl; break; 
case 2: // READ 
cout << "- Lista de Items -" << endl; for (size_t i = 
0; i < items.size(); i++) { 
cout << "[" << i << "] " << items[i] << endl; // [cite: 26] 
} 
break; 
case 3: // UPDATE 
cout << "Indice a actualizar: "; cin >> 
indice; 
if(indice >= 0 && indice < items.size()) { cout <<"Nuevo valor: "; 
cin >> dato; 
items[indice] = dato; // Sobreescritura directa 
cout << "Actualizado." << endl; 
} 
break; 
case 4: // DELETE 
cout << "Indice a eliminar: "; cin >> indice; 
if(indice >= 0 && indice < items.size()) { 
items.erase(items.begin() + indice); // [cite: 26] 
cout << "Eliminado." << endl; 
} 
break; case 5: 
cout << "Saliendo..." << endl; break; 
} 
} while (opcion != 5); 
return 0; 
}