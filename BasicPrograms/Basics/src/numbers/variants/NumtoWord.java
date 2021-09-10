package numbers.variants;

public class NumtoWord {

    public static String[] oneDigit = new String[] { "Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven",
            "Eight", "Nine" };

    public static String[] twoDigit = new String[] { "", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen",
            "Sixteen", "Seventeen", "Eighteen", "Nineteen" };

    public static String[] multipleOfTens = new String[] { "", "", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
            "Seventy", "Eighty", "Ninty" };

    public static String[] powerOfTens = new String[] { "Hundred", "Thousand" };

    public static String numberToWord(char[] num) {
        String wordString = "";
        int len = num.length;

        if (len == 0) {
            System.out.println("The String is empty!");
            return null;
        }

        if (len > 4) {
            System.out.println("The given number has more than 4 digits.");
            return null;
        }

        if (len == 1) {
            return oneDigit[num[0] - '0'];
        }

        int x = 0;

        while (x < num.length) {

            if (len >= 3) {

                if (num[x] - '0' != 0) {
                    wordString += oneDigit[num[x] - '0'] + " " + powerOfTens[len - 3] + " ";
                }
                --len;

            } else {

                if (num[x] - '0' == 1) {

                    int sum = num[x] - '0' + num[x + 1] - '0';
                    wordString += twoDigit[sum];

                } else if (num[x] - '0' == 2 && num[x + 1] - '0' == 0) {

                    wordString += "Twenty";

                } else {

                    int i = num[x] - '0';

                    if (i > 0) {
                        wordString += multipleOfTens[i] + " ";
                    } else {
                        wordString += "";
                        ++x;
                    }
                    if (num[x] - '0' != 0) {
                        wordString += oneDigit[num[x] - '0'];
                    }

                }
            }
            ++x;
        }

        return wordString;
    }

    public static String numToWord(String number) {
        String result = numberToWord(number.toCharArray());
        return result;
    }
}
