package lesson4;

public class Task2 {
    public static void main(String[] args) {

        int [] massive = {10, 20, 30, 40, 50};

        int count= massive.length;

        int sum=0;
        for (int i=0; i<massive.length; i++) {

        }

        int maxEl= massive[0];
        for (int i=1; i<massive.length; i++) {
            if (massive[i] > maxEl){
                maxEl= massive[i];
            }

        }
        int minEl= massive[0];
        for (int i = 1; i< massive.length; i++){
            if (massive[i] < minEl){
                minEl= massive[i];

            }
        }

        System.out.println("amout " + count);
        System.out.println("sum" + sum);
        System.out.println("max elements" + maxEl);
        System.out.println("min elements" + minEl);

    }


}
