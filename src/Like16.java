import java.util.Arrays;
public class Like16 {
    class MinMax {
        public static int[] minMax(int[] a) {
            Arrays.sort(a);
            return new int[]{a[0], a[a.length - 1]};
        }
    }
}
