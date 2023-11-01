#include <iostream>
using namespace std;

int main(){
    // using 3rd variable
  int x,c,v;
  cin >> c >> x;
  v=x;
  x=c;
  c=v;
  cout << x << endl << c << endl;

  //without using 3rd variable
  int a,b;
  cin >> a >> b;
  a=a+b;
  b=a-b;
  a=a-b;
  cout << a << endl << b << endl;
}