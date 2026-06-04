#include <iostream> 
#include <vector> 
#include <algorithm> 
#include <numeric> 
#include <iomanip> 
using namespace std; 
int main() { 
vector<double> notas = {8.5, 7.0, 9.2, 6.4, 10.0, 5.8}; 
cout << "Notas registradas:" << endl; 
for (double nota : notas) 
cout << "  " << nota << endl;
double maximo = *max_element(notas.begin(), notas.end()); 
double minimo = *min_element(notas.begin(), notas.end()); 
double suma   = accumulate(notas.begin(), notas.end(), 0.0); 
double promedio = suma / notas.size(); 
cout << "Nota más alta : " << maximo << endl; 
cout << "Nota más baja : " << minimo << endl; 
cout << fixed << setprecision(2); 
cout << "Promedio      : " << promedio << endl; 
return 0; 
}         