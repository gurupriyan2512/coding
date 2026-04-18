class Solution {
    public int reverse(int x) {
        int rev=0;
        while(x!=0){
            int unitdigit=x%10; //last digit aa print pannu
            if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10){
                return 0;
            }
            rev=rev*10+unitdigit;
            x=x/10;
        }
    
            return rev;
       
        }

        
    }
