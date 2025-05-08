class Solution {
    public int solution(int n) {
        int squareRoot = (int)Math.sqrt(n);
        return n==squareRoot*squareRoot? 1: 2;
    }
}