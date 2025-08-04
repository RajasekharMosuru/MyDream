public class PalindromeNummber {
    public static void main(String[] args) {
        int num = 121;
        boolean givenNumber = palidromNum(num);
        if(givenNumber) {
            System.out.println("The given number is palindrome " + true);
        }else {
            System.out.println("The given number is not a palindrome ");
        }
    }

    private static boolean palidromNum(int num) {
        if(num < 0){
            return false;
        }
        int reverse =0;
        int originlNumber = num;
        while(num > 0){
            int n = num % 10;
            reverse = reverse * 10 + n;
            num = num/10;
        }
        return originlNumber == reverse;
    }
}
