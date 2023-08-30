//hacer la serie de fibonachi recursivamente

#include <iostream>
using namespace std;

int fibonachi(int n){
    if(n==0){
        return 0;
    }else if(n==1){
        return 1;
    }else{
        return fibonachi(n-1)+fibonachi(n-2);
    }
}


int main(){
    int n;
    cout<<"ingrese el numero de la serie de fibonachi que desea: ";
    cin>>n;
    cout<<"el numero de la serie de fibonachi es: "<<fibonachi(n)<<endl;
    return 0;
}