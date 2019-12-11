public class ArrayAlgorithms {

    public static String printArray(int[] nums) {
        String blank = "";
        for (int number: nums) {
            blank += number + " ";
        }
        return blank;
    }

    public static boolean checkForAllNegatives(int[] nums) {

        for (int number: nums) {
            if (number >= 0)
                return false;
        }
        return true;
    }

    public static boolean hasDupes(int[] nums) {

        for (int i=0; i< nums.length-1; i++) {
            for (int j=i+1; j<nums.length; j++)
                if (nums[i] == nums[j])
                    return true;
        }
        return false;
    }

    public static int countEvens(int[] arr) {
        int numEvens = 0;

        for (int number: arr) {
            if (number % 2 == 0)
                    numEvens++;
        }
        return numEvens;
    }

    public static int[] leftShift(int[] nums, int shift) {
        int newLength = nums.length + shift;
        int[] newArr = new int[newLength];

        for (int i=0; i<nums.length; i++) {
            newArr[i] = nums[i];
        }

        for (int j=nums.length; j<newLength; j++) {
            newArr[j] = 0;
        }
        return newArr;
    }

    public static String reverseArray(int[] nums) {
        int start = 0;
        int end = nums.length-1;

        while (end >= start) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;

        }

        return printArray(nums);
    }
}
