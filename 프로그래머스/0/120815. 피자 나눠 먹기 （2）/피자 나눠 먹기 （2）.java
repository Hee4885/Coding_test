class Solution {
    public int solution(int n) {
        int piece = 6;
        
        if(n%piece==0){
            return n/piece;
        } else {
            return lcm(n,piece)/piece;
        }
    }
    
    public static int gcd(int a, int b){
        if(b==0)
            return a;
        return gcd(b,(a%b));
    }
    
    public static int lcm(int c, int d){
        return (c*d)/gcd(c,d);
    }
}