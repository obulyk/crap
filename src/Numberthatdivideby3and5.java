public class Numberthatdivideby3and5 {
    public static void main(String[] args) {
        Integer CountNumber = 0;
        for (int i = 1; i <= 30; i++) {
            if(i%3 == 0) {
                if (i%5 !=0) {
                 CountNumber = CountNumber+1;

                }
            }

        }
        System.out.println(CountNumber);
    }
}
