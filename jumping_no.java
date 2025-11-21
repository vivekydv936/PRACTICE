
public class jumping_no {
    public static void main(String[] args) {
        int limit = 50; // upper bound
        boolean first = true;
        for (int i = 0; i <= limit; i++) {
            if (isJumping(i)) {
                if (!first) System.out.print(",");
                System.out.print(i);
                first = false;
            }
        }
        System.out.println();
    }

    static boolean isJumping(int x) {
        if (x < 10) return true;
        int prev = -1;
        int temp = x;
        while (temp > 0) {
            int d = temp % 10;
            if (prev != -1) {
                if (Math.abs(prev - d) != 1) return false;
            }
            prev = d;
            temp /= 10;
        }
        return true;
    }
}
