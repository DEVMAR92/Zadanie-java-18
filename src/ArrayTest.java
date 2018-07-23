public class ArrayTest {
    public static void main(String[] args) {
        int[] table1 = {1, 5, 5, 4};
        int[] table2 = {1, 5, 5, 4};
        ArrayComparator arrayComparator = new ArrayComparator();

        boolean result = arrayComparator.compare(table1, table2);

        System.out.println(result);

    }
}
