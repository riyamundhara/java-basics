public class ArraysDemo {
    public static void main(String[] args) {
        int[] marks = {85, 90, 78, 88, 95};

        System.out.println("Subject marks:");
        for (int i = 0; i < marks.length; i++) {
            System.out.println("Subject " + (i+1) + ": " + marks[i]);
        }

        // Calculate average
        int sum = 0;
        for (int mark : marks) {
            sum += mark;
        }

        double avg = sum / (double) marks.length;
        System.out.println("Average = " + avg);
    }
}
