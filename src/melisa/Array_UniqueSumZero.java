package melisa;

public class Array_UniqueSumZero {
    public static int[] sumZero(int N) {
        int[] result = new int[N];

        int value = 1;
        for (int i = 0; i < N / 2; i++) {
            result[i] = value;
            result[i + (N / 2)] = -value;
            value++;
        }

        // If N is odd, include 0
        if (N % 2 != 0) {
            result[N - 1] = 0;
        }

        return result;
    }

    public static void main(String[] args) {
        int N = 4;
        int[] arr = sumZero(N);

        for (int num : arr) {
            System.out.print(num + " ");
        }
        // Example output for N=4: 1 -1 2 -2
    }

}
