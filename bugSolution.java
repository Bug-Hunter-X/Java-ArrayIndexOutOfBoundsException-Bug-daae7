public class MyClass {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 5;

        try {
            if (index >= 0 && index < array.length) {
                System.out.println(array[index]);
            } else {
                System.out.println("Error: Index out of bounds");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
        }
    }
}