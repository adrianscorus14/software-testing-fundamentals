package calculator;

public class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public int divide(int a, int b) {
        return a / b;
    }
    public int multiplyBy100(int a){
        return a*100;
    }
    public int powerOfN(int a,int n){
        int result =1;
        for(int i=1;i<=n;i++){
            result =result*a;
        }
        return result;
    }

}
