//SUM OF NUMBER IN C++
#include <iostream>
using namespace std;
int sum(int a,int b){
  int s=a+b;
  return s;
}
int main() {
  int a,b,m,n;
  cin >> a >> b >> m >> n;
  cout << sum(a,b);
  cout << sum(m,n);
}