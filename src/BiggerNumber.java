import java.util.Scanner;

public class BiggerNumber {
    public static String YNanswer;
    public static Integer temp;
    public static void main(String[] args){
        System.out.println("Enter a number:");
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt();
        do{
            System.out.println("Enter a next number:");
            int number2 = scan.nextInt();
            if (number1>number2) temp=number1;
            else temp=number2;
            System.out.println("Do you want proceed? or you want to know bigger number now?y/n");
            Scanner scan3 = new Scanner(System.in);
            YNanswer = scan3.nextLine();
        }while(YNanswer.equalsIgnoreCase ("y"));
        System.out.println("Bigger number is: "+temp);
    }
}
