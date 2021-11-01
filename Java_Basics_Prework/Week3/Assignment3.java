import java.util.Scanner;

class Main {

//performAddition method
public int performAddition(int num1, int num2) {
return (num1+num2);
}

//main method
public static void main(String[] args) {

//create object of main class
Main main = new Main();
int num1,num2,result;

//take input of num1, num2
Scanner scanner = new Scanner(System.in);

System.out.print("Enter number 1 = ");
num1=scanner.nextInt();

System.out.print("Enter number 2 = ");
num2=scanner.nextInt();

//call performAddition method and store result in a variable
result = main.performAddition(num1,num2);

//display the result.
System.out.println(num1+" + "+num2+" = "+result);
}
}