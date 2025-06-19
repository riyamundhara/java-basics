public class ArraySearch {
    public static void main(String[] args) {
        String[] names = {"Rii", "Ayaan", "Nia", "Zara"};
        String search = "Nia";
        boolean found = false;

        for (String name : names) {
            if (name.equals(search)) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(search + " found!");
        } else {
            System.out.println(search + " not found.");
        }
    }
}
