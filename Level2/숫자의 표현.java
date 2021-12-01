class Solution {
    public int solution(int n) {
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (sum == n) {
                    cnt++;
                } else if (sum > n) {
                    break;
                }
            }
        }
        return cnt;
    }
}
