//DIVIDE TWO INTEGER
class Solution {
public:
    int divide(int dividend, int divisor) {
    if (dividend == INT_MIN && divisor == -1) {
  return INT_MAX; 
     } else {
         return dividend/divisor;
     }
    if(dividend<0 && divisor<0){
        return dividend/divisor;
    }else if(dividend <0 ){
        return -1;
    }
    return dividend/divisor;
}
};