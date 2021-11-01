class Main {
public static void main(String[] args) {

int i = 1;
//GL Version
//infinite for loop
for (;; i++) {
    //int no = i*2;
//continue if no doesn't come in table of 2
if((i%2)!=0){continue;}
//break if no exceeds 20
if(i>20){break;}
//print loop variable
System.out.println(i);
}
}
}