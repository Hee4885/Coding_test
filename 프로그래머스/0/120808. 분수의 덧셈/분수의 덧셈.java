class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        
        int denomTemp = (denom1*denom2)/gcd(denom1, denom2);
        numer1 *= (denomTemp/denom1);
        numer2 *= (denomTemp/denom2);
        int numerTemp = numer1 + numer2;
        
        int lastGCD = gcd(numerTemp,denomTemp);
        
        denomTemp /= lastGCD;
        numerTemp /= lastGCD;
        
        int[] answer = {numerTemp ,denomTemp};
        return answer;
    }
        public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,(a%b));
    }
}