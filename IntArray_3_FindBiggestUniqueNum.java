package javaMock;


public class IntArray_3_FindBiggestUniqueNum {
    int[] a = {45, 23, 44, 23, 25, 13};
    int[] b = {34, 56, 57, 57, 36, 12};
    int[] c = {67, 22, 70, 70, 45, 89};

    public static void main(String[] args) {
        IntArray_3_FindBiggestUniqueNum num = new IntArray_3_FindBiggestUniqueNum();
        int result = num.findBiggestUnique(num.a, num.b, num.c);
        System.out.println("The biggest unique number is: " + result);
    }

    public int findBiggestUnique(int[] aa, int[] bb, int[] cc) {
        int maxUnique = Integer.MIN_VALUE;
        for (int num : aa) {
            if (num > maxUnique && !isInArray(num, bb) && !isInArray(num, cc)) {
                maxUnique = num;
            }
        }
        for (int num : bb) {
            if (num > maxUnique && !isInArray(num, aa) && !isInArray(num, cc)) {
                maxUnique = num;
            }
        }
        for (int num : cc) {
            if (num > maxUnique && !isInArray(num, aa) && !isInArray(num, bb)) {
                maxUnique = num;
            }
        }
        return maxUnique;
    }

    private boolean isInArray(int num, int[] arr) {
        for (int value : arr) {
            if (value == num) {
                return true;
            }
        }
        return false;
    }
}
