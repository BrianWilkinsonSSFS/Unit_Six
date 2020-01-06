public class ArrayAlgorithms {

    public static void main(String[] args){
        int[] list1 = {-2 , -9 , -6 , -8 , -9 , -3 , -1};
    }

    public static String printArray(int[] nums){
        String str = "";
        for(int a =0;a<nums.length;a++){
            str += nums[a]+" ";
        }
        return str;
    }

    public static boolean checkForAllNegatives(int[] list){
        boolean str = true;
        for(int a=0;a<list.length;a++){
            if(list[a]>=0) {
                str = false;
            }
        }
        return str;
    }

    public static boolean hasDupes(int[] list){
        boolean str = false;
        for(int a=0;a<list.length;a++){
            for(int j =a+1;j<list.length;j++){
                if(list[a]==list[j]) {
                    str = true;
                }
            }
        }
        return str;
    }

    public static int countEvens(int[] arr){
        int even = 0;
        for(int a=0;a<=arr.length-1;a++){
            if(arr[a]%2==0){
                even++;
            }
        }
        return even;
    }

    public static int[] leftShift(int[] nums, int shift){
        int[] num = new int[shift+nums.length];
        for(int a=0;a<num.length;a++){
            if(a<=nums.length-1) {
                num[a] = nums[a];
            }else{
                num[a]=0;
            }
        }
        return num;
    }

    public static String reverseArray(int[] arr){
        for(int a = 0; a < arr.length / 2; a++){
            int first = arr[a];
            int last = arr[arr.length - 1 - a];

            arr[a] = last;
            arr[arr.length - 1 - a] = first;
        }
        return printArray(arr);
    }


}
