class Operators{
    public static void main(String[] args){
        float num1=10f,num2=4f,result=0f;

System.out.println("Num1 = "+num1+"\tNum2 = "+num2);
        result = num1+num2;
        System.out.println("Addition = "+result);

        result = num1-num2;
        System.out.println("Subtraction = "+result);

        result = num1*num2;
        System.out.println("Multiplication = "+result);


        result = num1/num2;
        System.out.println("Division = "+result);


        result = num1%num2;
        System.out.println("Modulas = "+result);


        System.out.println((num1%2==0)?"even":"odd");

    }
}