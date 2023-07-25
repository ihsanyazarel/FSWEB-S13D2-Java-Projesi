public class Main {
    public static void main(String[] args) {
        System.out.println("isPalindrome(-1221)= " + isPalindrome(-1221));
        System.out.println("isPalindrome(707)= " + isPalindrome(707));
        System.out.println("isPalindrome(11212)= " + isPalindrome(11212));

        System.out.println("-------------------");

        System.out.println("isPerfectNumber(6)= " + isPerfectNumber(6));
        System.out.println("isPerfectNumber(28)= " + isPerfectNumber(28));
        System.out.println("isPerfectNumber(5)= " + isPerfectNumber(5));
        System.out.println("isPerfectNumber(-1)= " + isPerfectNumber(-1));

        System.out.println("-------------------");

        System.out.println("numberToWords(123)= " + numberToWords(123));
        System.out.println("numberToWords(1010)= " + numberToWords(1010));
        System.out.println("numberToWords(-12)= " + numberToWords(-12));
    }
    public static boolean isPalindrome(int num){
        if (num < 0){
            num *= -1;
        }
        String numStr = String.valueOf(num);
        StringBuilder reversedStr = new StringBuilder();
        for (int i = 0; i < numStr.length(); i++){
            reversedStr.insert(0, numStr.charAt(i));
        }
        return numStr.contentEquals(reversedStr);
    }
    public static boolean isPerfectNumber(int num){
        if (num < 0){
            return false;
        }
        int sum = 0;
        for (int i = 1; i < num; i++){
            if (num % i == 0){
                sum += i;
            }
        }
        return num == sum;
    }
    public static String numberToWords(int num){
        if (num < 0){
            return "Invalid Value";
        }
        char[] numArr = String.valueOf(num).toCharArray();
        String[] words = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
        String[] wordArr = new String[numArr.length];
        for (int i = 0; i<numArr.length; i++){
            wordArr[i] = words[Integer.parseInt(String.valueOf(numArr[i]))];
        }
        return String.join(" ", wordArr);
    }
}