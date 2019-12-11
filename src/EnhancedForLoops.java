public class EnhancedForLoops {

    public static String printStandardFor(String[] arr) {
        String returnArr = "";

        for (int i=0; i<arr.length; i++)
            returnArr += arr[i] + " ";


        return returnArr;
    }

    public static String printStandardFor(int[] arr) {

        String returnArr = "";
        for (int i=0; i<arr.length; i++)
            returnArr += arr[i] + " ";


        return returnArr;
    }

    public static String printStandardFor(double[] arr) {
        String returnArr = "";
        for (int i=0; i<arr.length; i++)
            returnArr += arr[i] + " ";


        return returnArr;
    }

    public static String printEnhancedFor(String[] arr) {
        String returnArr = "";

        for (String str: arr)
            returnArr += str + " ";


        return returnArr;
    }

    public static String printEnhancedFor(int[] arr){
        String returnArr = "";

        for (int num: arr)
            returnArr += num + " ";


        return returnArr;
    }

    public static String printEnhancedFor(double[] arr) {
        String returnArr = "";

        for (double num: arr)
            returnArr += num + " ";


        return returnArr;
    }

    public static String printStandardWhile(String[] arr) {
        String returnArr = "";
        int i = 0;
        while (i < arr.length) {
            returnArr += arr[i] + " ";
            i++;
        }


        return returnArr;
    }

    public static String printStandardWhile(int[] arr) {
        String returnArr = "";
        int i = 0;
        while (i < arr.length) {
            returnArr += arr[i] + " ";
            i++;
        }


        return returnArr;
    }

    public static String printStandardWhile(double[] arr) {
        String returnArr = "";
        int i = 0;
        while (i < arr.length) {
            returnArr += arr[i] + " ";
            i++;
        }


        return returnArr;
    }

    public static void main(String[] args) {

    }
}
