#include <iostream>
using namespace std;

int factorial(int n){
  int f=1;
  for(int i=1;i<=n;i++){
    f=f*i;
  }
  return f;
}
bool prime(int v){
  if(v<2)
    return false;
  for(int i=2;i<v;i++){
    if(v % i==0)
    return false;
  }
    return true;
}
int main() {
  int a,b;
  cin >> a >> b;
  cout << factorial(a) << endl;
  cout << prime(a) <<endl;
  cout << factorial(b);
  cout << prime(b);
  cout << factorial(b-a);
  cout << prime(b-a);
  
}