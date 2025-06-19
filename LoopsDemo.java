public class LoopsDemo {
    public static void main(String[] args) {
        // for loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("i = " + i);
        }

        // while loop
        int j = 1;
        while (j <= 3) {
            System.out.println("j = " + j);
            j++;
        }

        // do-while loop
        int k = 1;
        do {
            System.out.println("k = " + k);
            k++;
        } while (k <= 2);
    }
}
