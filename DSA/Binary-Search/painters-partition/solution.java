import java.util.*;

class Solution {
    private boolean canPaint(int[] C, int A, long maxLen) {
        long total = 0;
        int painters = 1;
        for (int len : C) {
            if (total + len > maxLen) {
                painters++;
                total = len;
                if (painters > A) return false;
            } else {
                total += len;
            }
        }
        return true;
    }

    public int paint(int A, int B, int[] C) {
        long low = Arrays.stream(C).max().getAsInt();
        long high = 0;
        for (int x : C) high += x;
        long ans = high;
        int MOD = 10000003;

        while (low <= high) {
            long mid = (low + high) / 2;
            if (canPaint(C, A, mid)) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int)((ans * B) % MOD);
    }
}