class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if(b==c){
            if(a==c){
                answer = (a+b+c)*(a*a+b*b+c*c)*(a*a*a+b*b*b+c*c*c);//삼차까지
            } else {
                answer = (a+b+c)*(a*a+b*b+c*c);//이차까지
            }
        } else {
            if(a==c||a==b){
                answer = (a+b+c)*(a*a+b*b+c*c);//이차까지
            } else {
                answer = a+b+c;
            }
        }
        return answer;
    }
}