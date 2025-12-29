package tools;

public class Main{
    public static void main(String[] args){
        Calc calculator = new Calc();
        int result = calculator.add(5, 10);
        System.out.println("The sum is: " + result);
    }
}