import java.util.Arrays;

public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        Arrays.sort(args);
        return args[0];
    }

    public static void main(String[] args) {
        int[] a = new int[]{78,56,232,12,11,43};
        System.out.println(findSmallestInt(a));
    }
}