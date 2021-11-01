public class NumberSwap{
    public static void main(String []args){
        int num1=3,num2=4;
        System.out.println("Numbers before swapping: Number 1 = "+num1+"\tNumber 2 = "+num2);
        num2 +=num1;
        num1 = num2-num1;
        num2-=num1;
        System.out.println("Numbers after swapping: Number 1 = "+num1+"\tNumber 2 = "+num2);
    }
}