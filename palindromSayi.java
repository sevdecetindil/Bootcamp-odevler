public class palindromSayi {
    static boolean isPalindrom(int num) {
        int temp = num, reverseNum = 0, mod;

        while (temp != 0) {
            mod = temp % 10;
            reverseNum = (reverseNum * 10) + mod;
            temp /= 10;
        }
        return num == reverseNum;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrom(929));
    }
}
