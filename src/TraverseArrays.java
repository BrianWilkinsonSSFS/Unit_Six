public class TraverseArrays {

    public static int countEven(int[] nums) {
        int totalEvens = 0;

        for (int i=0; i<nums.length; i++) {
            if (nums[i] % 2 == 0)
                totalEvens++;
        }
        return totalEvens;
    }

    public static int[] buildArray(int desiredLength) {
        int[] newArray = new int[desiredLength];
        for (int i=0; i<desiredLength; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public static boolean sum28(int[] numbers) {
        int sum2 = 0;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] == 2)
                sum2 += 2;
        }
        return sum2 == 8;
    }

    public static int[] zeroMax(int[] original) {
        int[] newArray = new int[original.length];

        for (int i=0; i<original.length; i++) {
            if (original[i] == 0) {
                int largestOdd = 0;
                for (int j=i+1; j<original.length; j++) {
                    if (original[j] %2 == 1 && original[j] > largestOdd)
                        largestOdd = original[j];
                }
                newArray[i] = largestOdd;
            }
            else
                newArray[i] = original[i];
        }
        return newArray;

    }
}
