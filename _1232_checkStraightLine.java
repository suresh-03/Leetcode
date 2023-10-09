public class _1232_checkStraightLine {
    public boolean checkStraightLine(int[][] co) {
        int X = co[1][0]-co[0][0];
        int Y = co[1][1] - co[0][1];

        for(int i = 1; i < co.length; i++){
            int x = co[i][0]-co[i-1][0];
            int y = co[i][1]-co[i-1][1];

            if(X * y != Y * x) return false;
        }
        return true;
    }
}
