/*import java.util.Scanner;

public class DoYouWantSomeTea {
    public static void main(String[] args){
        System.out.println("Do you want some tea?y/n");
        Scanner answer = new Scanner(System.in);
        /////do{
        ////    if (answer==y)
          //      brake
        //}while (answer.equ);

    }
}
*/
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class DoYouWantSomeTea {
    public static Integer number;
    public static ArrayList MyArrayList = new ArrayList();
    public static Comparable temp=0;
    public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args){
        do{
            System.out.println("Enter a number:");
            number = scan.nextInt();
            MyArrayList.add(number);
        }while(number != 17);
        temp = Collections.max(MyArrayList);

        System.out.println("Bigger number is: "+  temp);
    }
}