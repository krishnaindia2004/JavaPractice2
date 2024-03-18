public class Rev {

    public static void main(String[] args) {
        int num = 12345678;
        int reversed = 0;
        while (num != 0) {
            int digit = num % 10; 
            reversed = reversed * 10 + digit; 
            num /= 10; 
        }

        System.out.println("The reversed number is: " + reversed);
    }
}
