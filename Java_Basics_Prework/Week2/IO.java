import java.util.Scanner;

class IO{
    public static void main(String []args){
        int num1;
        float num2;
        char character;
        boolean bool;
        String str;
        double num3;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter int value: ");
        num1=scanner.nextInt();

        System.out.print("Enter float value: ");
        num2=scanner.nextFloat();

        System.out.print("Enter char value: ");
        character=scanner.next().charAt(0);

        System.out.print("Enter boolean value: ");
        bool=scanner.nextBoolean();

        System.out.print("Enter string value: ");
        str=scanner.next();

        System.out.print("Enter double value: ");
        num3=scanner.nextDouble();


        System.out.println("int -> " + num1);
        System.out.println("float -> " + num2);
        System.out.println("char -> " + character);
        System.out.println("boolean -> " + bool);
        System.out.println("String -> " + str);
        System.out.println("double -> " + num3);

        scanner.close();
    }
}