// HAPPY NUMBER
class Solution {
    public:
        bool isHappy(int n){
    
      int sum = 0;
    
      while (n!= 0) {
        int digit = n % 10;
        sum += digit * digit;
        n /= 10;
      }
    
      if (sum == 1) {
        return true;
      } else if (sum == 4) {
        return false;
      } else {
        return isHappy(sum);
      }
    }

};