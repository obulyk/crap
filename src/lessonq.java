public class lessonq {
    public static void main(String[] args) {
    for (int i=1;i<=1000;i++)
    {
        for (int a=1;a<=1000;a++) {
            for (int c=1;c<=1000;c++) {
                if (i*i == c*c + a*a) {
                    System.out.println(c+" "+a+" "+ i);
                }
            }
        }

    }
    }

}
