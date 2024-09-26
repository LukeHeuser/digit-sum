public class DigitSum {
    public static void main(String[] args) {

        System.out.println(sumDigits(1234));
        System.out.println(sumDigits(-454));
        System.out.println(sumDigits(1));
        System.out.println(sumDigits(34));
        System.out.println(sumDigits(-54));


    }

    // Method that tests for negative numbers and returns the sum of each digit in an integer.
    public static int sumDigits(int number) {

        // tests if the integer is grater than 0.
        if (number < 0 ){
            System.out.print("Number can not be negative. ");
            return -1;
        }

        // the below do-while loop adds each digit of an integer.
        int nextDigit = 0;
        do {
            nextDigit += number % 10;
            number = number / 10;
        } while (number > 0);

        return (nextDigit);
    }

}
