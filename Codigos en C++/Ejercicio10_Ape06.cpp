#include <iostream> 
#include <list> // Estructura idonea para implementar el comportamiento FIFO de colas 
#include <string> 
using namespace std; 
int main() { 
// Equivalencia de LinkedList en C++ para colas eficientes 
list<string> filaAtencion; 
int menuSelect; 
string idCliente; 
do { 
cout << "\n=========================================" << endl; 
cout << "      SIMULACION DE FILA FIFO (C++)      " << endl; 
cout << "=========================================" << endl; 
cout << "1. Agregar Cliente (push_back)\n"; 
cout << "2. Atender Siguiente (pop_front)\n"; 
cout << "3. Ver Proximo Cliente en Linea (front)\n"; 
cout << "4. Visualizar Fila Completa\n"; 
cout << "5. Apagar Simulador\n"; 
cout << "Ingrese opcion: "; 
cin >> menuSelect; 
cin.ignore(); 
switch (menuSelect) { 
case 1: 
cout << "Ingrese el codigo/nombre del cliente: "; 
getline(cin, idCliente); 
// El elemento entra obligatoriamente por la cola de la estructura 
filaAtencion.push_back(idCliente); 
cout << "[Ok] Cliente encolado de forma correcta." << endl; 
break; 
case 2: 
if (!filaAtencion.empty()) { 
// El elemento que primero entro es el primero atendido (FIFO) 
cout << "[Atencion] Procesando salida de: " << filaAtencion.front() << endl; 
filaAtencion.pop_front(); // Desvinculacion del nodo frontal 
} else { 
cout << "[Aviso] Fila sin solicitudes pendientes." << endl; 
} 
break;
case 3: 
if (!filaAtencion.empty()) { 
// Consulta de la cabecera sin alterar la estructura 
cout << "Proximo cliente en modulo: " << filaAtencion.front() << endl; 
} else { 
cout << "[Aviso] Fila vacia. Modulo inactivo." << endl; 
} 
break; 
case 4: 
if (!filaAtencion.empty()) { 
cout << "\n--- MAPA DE NODOS DE LA FILA ACTUAL ---" << endl; 
int pos = 1; 
for (const string& cliente : filaAtencion) { 
cout << " Turno Fila [" << pos++ << "] -> " << cliente << endl; 
} 
} else { 
cout << "[Aviso] Ningun cliente se halla en cola." << endl; 
} 
break; 
case 5: 
cout << "Simulacion dada por terminada con exito." << endl; 
break; 
default: 
cout << "[!] Comando invalido." << endl; 
} 
} while (menuSelect != 5); 
return 0; 
}