public class Calculator {
    //计算器
    //1、编写一个类Calculator,有两个属性num1,num2,这两个数据的值，不能在定义的同时初始化，最后实现加减乘
    //除四种运算
     private int num1;
     private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int add() {
        return this.num1 + this.num2;
    }
    public int minus() {
        return this.num1 - this.num2;
    }
    public int mult() {
        return this.num1 * this.num2;
    }
    public double div() {
        return this.num1 * 1000 / this.num2/1000.0;
    }
}
