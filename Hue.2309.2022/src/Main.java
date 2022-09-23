public class Main {
    public static void main(String args[]) {
        NumberTest isEven = (n) -> (n % 2) == 0;
        NumberTest isPrime = (n) -> {
        if(n < 2) {
            return false;
        }
        for(int i = 2; i < n; i++) {
            if(n % i == 0)
                return false;
        }
        return true;
        };
        NumberTest isPalindrome = (n) ->
        {
            int rev_num = 0;
            while (n > 0) {
                rev_num = rev_num * 10 + n % 10;
                n = n / 10;
            }
            return n == rev_num;
        };
        NumberTester numberTester = new NumberTester("Numbers.txt");
        numberTester.setOddEvenTester(isEven);
        numberTester.setPrimeTester(isPrime);
        numberTester.setPalindromeTester(isPalindrome);
    }
}
