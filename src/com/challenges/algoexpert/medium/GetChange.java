public class GetChange {
    /**
     * 1c, 5c, 10c, 25c, 50c, and $1
     * getChange(5, 0.99) // should return [1,0,0,0,0,4]
     *
     * @param args
     */
    public static void main(String[] args) {
        int[] change = getChange(5, 0.99);
        System.out.print(change[0] + " " + change[1] + " " + change[2] + " " + change[3] + " " + change[4] + " " + change[5]);
    }

    private static int[] getChange(double M, double P) {
        int[] changeArray = new int[6];
        double change = M - P;
        if (change > 0) {
            changeArray[5] = (int) change;
        }
        int decimalPart = (int) (change - changeArray[5]) * 100; // 0.56
        while (decimalPart > 0) {
            if (decimalPart > 50) {
                changeArray[4] = 1;
                decimalPart = decimalPart - 50;
            } else if (decimalPart > 25) {
                changeArray[3] = 1;
                decimalPart = decimalPart - 25;
            } else if (decimalPart > 10) {
                changeArray[2] = 1;
                decimalPart = decimalPart - 10;
            } else if (decimalPart > 5) {
                changeArray[1] = 1;
                decimalPart = decimalPart - 5;
            } else {
                changeArray[0] = decimalPart;
                decimalPart = 0;
            }

        }

        return changeArray;
    }
}
