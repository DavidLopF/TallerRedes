#include <iostream>
#include <vector>
#include <cmath>
#include <ctime>

using namespace std;

bool esPrimo(int n) {
    if (n <= 1) {
        return false;
    }
    for (int i = 2; i <= sqrt(n); i++) {
        if (n % i == 0) {
            return false;
        }
    }
    return true;
}

vector<int> primosEficientes(int tope) {
    vector<int> primos;
    for (int i = 2; i <= tope; i++) {
        if (esPrimo(i)) {
            primos.push_back(i);
        }
    }
    return primos;
}

vector<int> primosNoEficientes(int tope) {
    vector<int> primos;
    for (int i = 2; i <= tope; i++) {
        bool esPrimo = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            primos.push_back(i);
        }
    }
    return primos;
}

int main() {
    int tope = 1000000;
    clock_t startTime = clock();
    vector<int> res = primosEficientes(tope);
    clock_t endTime = clock();
    double duration = double(endTime - startTime) / CLOCKS_PER_SEC * 1000;
    cout << "Tiempo de ejecucion de primosEficientes: " << duration << " milisegundos" << endl;

    return 0;
}
