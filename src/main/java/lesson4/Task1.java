package lesson4;

public class Task1 {
    public static void main(String[] args) {

        System.out.println("Dublicate elements is: ");
        int[] v1 = {100, 2, 3, 47, 55, 173};
        int[] v2 = {47, 5, 3, 7, 88, 173};

        for (int num1 : v1) {
            for (int num2 : v2 ) {
                if (num1 == num2) {
                    System.out.println(num1 );
                    break;
                }
            }
        }
    }
}
