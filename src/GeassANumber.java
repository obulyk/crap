import java.util.Random;
import java.util.Scanner;

public class GeassANumber {
    public static Integer StaleChislo;
    public static Integer numb;
    public static void main(String[] args){
        Random random = new Random();
        StaleChislo = random.nextInt(1000);
        System.out.println(StaleChislo);
        System.out.println("Ану вгадай цифру від 0 до 10. Введи:");
        do {
            Scanner Chislo = new Scanner(System.in);
            numb = Chislo.nextInt();
            if (numb > StaleChislo-StaleChislo*1/5 || numb < StaleChislo+StaleChislo*1/5) {System.out.println("Гаряче");}
            if (numb > StaleChislo-StaleChislo*2/5 || numb < StaleChislo+StaleChislo*2/5) {System.out.println("Тепло");}
            if (numb > StaleChislo-StaleChislo*3/5 || numb < StaleChislo+StaleChislo*3/5) {System.out.println("Холодно");}
            if (numb > StaleChislo-StaleChislo*4/5 || numb < StaleChislo*4/5) {System.out.println("Дуже холодно");}

            if (numb == StaleChislo) {System.out.println("ти вгадала!");}
        }while(numb !=StaleChislo);
    }
}
