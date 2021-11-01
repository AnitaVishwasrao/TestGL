import java.util.Scanner;

class Calculator{
    public static void main(String[] args){
        double num1, num2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number 1: ");
        num1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        num2 = scanner.nextDouble();
        System.out.print("Choose operation-\n1->Addition\n2->Subtraction\n3->Multiplication\n4->Division: ");
        int operation = scanner.nextInt();

        switch(operation){
            case 1:
            System.out.println("Result = "+(num1+num2));
            break;
            case 2:
            System.out.println("Result = "+(num1-num2));
            break;
            case 3:
            System.out.println("Result = "+(num1*num2));
            break;
            case 4:
            if(num2>0){System.out.println("Result = "+(num1/num2));}
            else{System.out.println("Cannot be divided");}
            break;
            default: 
            System.out.println("Invalid operation");
        }
    }
}