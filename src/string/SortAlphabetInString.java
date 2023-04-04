package string;

public class SortAlphabetInString {
    static void sortAlphabet() {

        String name = "ggsgkjgaaaasfg";

        char[] abt = name.toCharArray();

        String first = "";
        String second = "";
        char temp;


        for (int i = 0; i < abt.length; i++) {

            for (int j = i + 1; j < abt.length; j++) {

                if (abt[i] > abt[j]) {

                    temp = abt[i];
                    abt[i] = abt[j];
                    abt[j] = (char) temp;

                }
            }


        }

        for (int i = 0; i < abt.length; i++) {
            System.out.println(abt[i]);
        }

    }

    public static void main(String[] args) {

        sortAlphabet();
    }
}
