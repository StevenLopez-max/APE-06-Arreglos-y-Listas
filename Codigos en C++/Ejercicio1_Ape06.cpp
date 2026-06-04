#include <iostream> 
#include <vector> 
#include <string> 
using namespace std; 
int main() { 
vector<string> estudiantes; 
estudiantes.push_back("Ana García"); 
estudiantes.push_back("Luis Martínez"); 
estudiantes.push_back("María López"); 
estudiantes.push_back("Carlos Pérez"); 
estudiantes.push_back("Sofía Ramírez"); 
cout << "Lista de estudiantes:" << endl; 
for (const string& nombre : estudiantes) { 
cout << "  - " << nombre << endl; 
} 
cout << "Total: " << estudiantes.size() << endl; 
return 0; 
}