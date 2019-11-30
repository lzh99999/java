class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        int k1 = coordinates[1][0] - coordinates[0][0];
        int k2 = coordinates[1][1] - coordinates[0][1];
        for(int i = 0; i < coordinates.length - 1; i++) {
            if((coordinates[i + 1][0] - coordinates[i][0]) * k2 != (coordinates[i + 1][1] - coordinates[i][1]) * k1) {
                return false;
            }
        }
        return true;
    }

}