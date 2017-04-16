public class ArrayTest {
    public static void main(String[] args) {
        int[][] arr1 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int[][] arr3 = {
                {1, 1, 1},
                {2, 2, 2},
                {3, 3, 3}
        };

        ArrayComparator comparator = new ArrayComparator();
        System.out.println("arr1 == arr2 " + comparator.compare(arr1, arr2));
        System.out.println("arr2 == arr3 " + comparator.compare(arr2, arr3));
    }
}
