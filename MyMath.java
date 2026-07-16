public class MyMath {
    int number1;
    int number2;
    int number3;

    public MyMath (int number1 , int number2, int number3){
        this.number1=number1;
        this.number2=number2;
        this.number3=number3;
    }
    public int add(){
        return number1 + number2 +number3 ;
    }
    public double divide () {
        return (double) (number1+number2)/number3 ;
    }
    public int multiply() {
        return number1 * number2 * number3 ;
    }
}
