public class EvenDigitSum {

    public static int getEvenDigitSum(int number) {
        int sumOfOddNumbers = 0;

        if (number >= 0) {
            while (number != 0) {
                if ((number % 10) % 2 == 0) {
                    sumOfOddNumbers += (number % 10);
                }
                number /= 10;
            }
            return sumOfOddNumbers;
        } else {
            return -1;
        }
    }

}