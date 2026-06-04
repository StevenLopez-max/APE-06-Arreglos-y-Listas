#include <iostream> 
#include <list> 
#include <string> 
 
using namespace std; 
 
int main() { 
 
    list<string> listaTurnos; 
    int opcion; 
 
    do { 
        cout << "\n1. Agregar" << endl;
        cout << "2. Mostrar" << endl; 
    cout << "3. Salir" << endl; 
    cout << "Opcion: "; 
    cin >> opcion; 
    cin.ignore(); 
    if (opcion == 1) { 
    string nombre; 
        cout << "Nombre: "; 
    getline(cin, nombre); 
    listaTurnos.push_back(nombre); 
} 
    else if (opcion == 2) { 
    int i = 0; 
    for(list<string>::iterator it = listaTurnos.begin(); 
    it != listaTurnos.end(); 
    ++it) { 
    cout << i << " -> " << *it << endl; 
    i++; 
    } 
} 
    } while(opcion != 3); 
    return 0; 
} 
