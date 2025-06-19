public class FunctionsDemo {
    
    // Function with parameters and return
    public static int square(int num) {
        return num * num;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        int result = square(5);
        System.out.println("Square of 5 is: " + result);

        greet("Riya");
    }
}
