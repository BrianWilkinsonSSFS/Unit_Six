public class Birthday {

    public static void main(String[] args) {
        showPercent();
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

    public static int[] dates(int num) {
        int[] birthdays = new int[num];
        for (int x=0; x<num; x++) {
            birthdays[x] = (int)(Math.random() * 365);
        }

        return birthdays;
    }

    public static void showPercent() {
        int numDuplicateBirthdays = 0;
        for (int i=0; i<1000; i++) {
            int[] birthdays = dates(23);
            if (hasDupes(birthdays)) {
                numDuplicateBirthdays++;
            }
        }
        System.out.println("% of duplicate birthdays: " + numDuplicateBirthdays/1000.0);
    }

}
