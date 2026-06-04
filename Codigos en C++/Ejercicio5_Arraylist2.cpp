#include <iostream>
#include <vector>
using namespace std;

int main() {
    vector<string> nombres;
    vector<float> notas;

    int cantidad;

    cout << "¿Cuántos estudiantes desea registrar? ";
    cin >> cantidad;
    cin.ignore();// Limpiar el buffer de entrada

    for (int i = 0; i < cantidad; i++) {
        string nombre;
        float nota;

        cout << "\nEstudiante " << i + 1 << endl;

        cout << "Nombre: ";
        getline(cin, nombre);
        nombres.push_back(nombre);

        cout << "Nota: ";
        cin >> nota;
        cin.ignore(); // Limpiar el buffer de entrada
        notas.push_back(nota);
    }

    cout << "\n--- LISTA DE ESTUDIANTES ---\n";
    for (int i = 0; i < nombres.size(); i++) {
        cout << "Nombre: " << nombres[i]
             << " | Nota: " << notas[i] << endl;
    }

    return 0;
}