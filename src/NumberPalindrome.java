public class NumberPalindrome {

    public static void main(String[] args) {
        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(11212));
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int localNumber = number;

        while (true) {
            reverse += localNumber % 10;
            localNumber /= 10;
            if (localNumber == 0) {
                break;
            }
            reverse *= 10;
        }

        if (number == reverse) {
            return true;
        } else return false;

    }
}
