public class Main {
    public static int finalPrice(int N, int C) {
        int[] cycle = {1, 1, 1, -2, -2, -2, 3, 3, 3, -4, -4, -4};
        int cycleLength = 12;
        int cycleEffect = -6;

        int fullCycles = N / cycleLength;
        C += fullCycles * cycleEffect;

        int remainingDays = N % cycleLength;
        for (int i = 0; i < remainingDays; i++) {
            C += cycle[i];
        }

        return C;
    }

    public static void main(String[] args) {
        System.out.println(finalPrice(4, 3));
    }
}

