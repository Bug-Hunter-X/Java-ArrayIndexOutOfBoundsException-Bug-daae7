public class MyClass {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int index = 5; // Index out of bounds

        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index out of bounds");
        }
    }
}