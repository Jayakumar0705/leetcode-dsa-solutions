
class Solution {
    public boolean isReachable(int targetX, int targetY) {

        int x = targetX;
        int y = targetY;

        while (x != 1 || y != 1) {

            if (x == y) {
                if (x % 2 == 0) {
                    x = x / 2;
                } else {
                    return false;
                }
            }

            else if (x > y) {
                if (x % 2 == 0) {
                    x = x / 2;
                } else {
                    x = x - y;
                }
            }

            else {
                if (y % 2 == 0) {
                    y = y / 2;
                } else {
                    y = y - x;
                }
            }
        }

        return true;
    }
}
