package JavaBasicPrograms;

public class FibonacciSeries {

    public static void main(String[] args) {

        int n1 = 1;
        int n2 = 2;
        int n3;

        System.out.println(n1);
        System.out.println(n2);

        for (int i = 0; i <= 5; i++) {
            n3 = n1 + n2;
            System.out.println(n3);

            n1 = n2;
            n2 = n3;
            n3 = n1;
        }
    }
}
