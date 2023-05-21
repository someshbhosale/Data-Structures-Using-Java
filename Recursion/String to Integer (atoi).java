class Solution {
    public static int myAtoiAfter(String str, long ans, int sign, int i, int max, int min) {
        if(i > str.length() - 1){
            return sign * (int)(ans);
        }
        if(str.charAt(i) == '-' || !Character.isDigit(str.charAt(i))){
                return sign * (int)(ans);
            }
        ans = ans * 10 + (str.charAt(i) - '0');
        if(sign == -1 && -1 * ans < min){
            return min;
        }
        if(sign == 1 && ans > max){
            return max;
        }
        return myAtoiAfter(str, ans, sign, i + 1, max, min);
    }

    public int myAtoi(String s) {

      if(s.length() == 0){
            return 0;
        }

        // Removing spaces from the front
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != ' '){
                s = s.substring(i, s.length());
                break;
            }
        }
        
        // taking maximum and minimum value;
        // this is for the long valuesa
        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;
        
        long ans = 0;
        int sign = 1;
        
        if(s.charAt(0) == '-'){
            sign = -1;
        }
        // If there will be a negative sign then index will start from 1st otherwise oth index.
        int i = (s.charAt(0) == '+' || s.charAt(0) == '-') ? 1 : 0;

        // calling the recursion for the first time
        return myAtoiAfter(s, ans, sign, i, max, min);   
    }
}