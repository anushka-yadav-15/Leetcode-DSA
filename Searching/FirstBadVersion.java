
class VersionControl {
    int bad;   

    VersionControl(int bad) {
        this.bad = bad;
    }

    boolean isBadVersion(int version) {
        return version >= bad;
    }
}

class Solution extends VersionControl {

    Solution(int bad) {
        super(bad);
    }

    public int firstBadVersion(int n) {

        int left = 1;
        int right = n;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}

public class FirstBadVersion {
    public static void main(String[] args) {

        int n = 10;        
        int firstBad = 4; 

        Solution solution = new Solution(firstBad);

        int result = solution.firstBadVersion(n);

        System.out.println("First bad version: " + result);
    }
}
