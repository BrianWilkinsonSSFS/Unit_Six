public class ArrayCreation {

    public static double getAverage(double[] numbers) {
        if (numbers.length < 3) {
            return 0.0;
        } else {
            double first = numbers[0];
            double last = numbers[numbers.length - 1];
            int index = numbers.length / 2;
            double middle = numbers[index];
            double average =  (first + middle + last) / 3;
            average *= 100;
            average = (int)(average + 0.5);
            average /= 100;
            return average;
        }
    }

    public static String stringArray(String[] friends) {
        String blank = "";
        if (friends.length != 5)
            return blank;

        blank += friends[0].length() + " ";
        blank += friends[1].length() + " ";
        blank += friends[2].length() + " ";
        blank += friends[3].length() + " ";
        blank += friends[4].length() + " ";

        return blank;
    }

    public static String countryData() {
        String[] countries = {"China", "Egypt", "France", "South Korea", "Germany", "India", "Japan", "Ghana", "Kenya",
                "Mexico", "United Kingdom", "Burkina Faso", "United States"};

        String[] capitals = {"Beijing", "Cairo", "Paris", "Seoul", "Berlin", "New Delhi", "Tokyo", "Accra", "Nairobi",
                "Mexico City", "London", "Ouagadougou", "Washington D.C."};

        String[] languages = {"Mandarin", "Arabic", "French", "Korean", "German", "Hindi", "Japanese", "Akuapem Twi",
                "Swahili", "Spanish", "English", "French", "English"};

        int index = (int)(Math.random() * countries.length);


        return "The capital of " + countries[index] + " is " + capitals[index] + " and the primary language is " +
                languages[index];

    }

    public static void main(String[] args) {
        double[] numbers = {89, 75, 100};
        String[] names = {"Fred", "Barney", "Betty", "Wilma", "Pebbles"};
        //System.out.println(getAverage(numbers));
        System.out.println(stringArray(names));
        System.out.println(countryData());
    }
}
