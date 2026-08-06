class Solution {
     public int fun(int n){
        int sum=0;
            while(n>0){
                int d=n%10;
                n=n/10;
                sum+=d*d;
            }
            return sum;
        }
     public boolean isHappy(int n) {
        int fast=n,slow=n;
       
        while(fast!=1){
            slow=fun(slow);
            fast=fun(fast);
            fast=fun(fast);

            if(fast==slow && slow!=1){
                return false;
            }
        }
        return true;
    }
}