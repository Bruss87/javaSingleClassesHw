public class Calculator {
    private int num1;
    private int num2;

    public Calculator (int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addNum() {
        return  num1 + num2;
    }

    public int substractNum() {
        return  num1 - num2;
    }

    public int multiplyNum() {
        return  num1 * num2;
    }

    public double divideNum(){
        return num1/num2;
    }
}

