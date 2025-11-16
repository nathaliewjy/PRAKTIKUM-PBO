import java.util.Scanner;

class NegativeNumberException extends Exception {
    int num;

    public NegativeNumberException(String mess, int num) {
        super("From neg num ex : " + mess);
        this.num= num;
    }
}
public class Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Num : ");
        int num = sc.nextInt();

        try {
            if (num < 0) {
                throw new NegativeNumberException("Negative num ", num);
            }

            System.out.println("Positive num " + num);
        } catch (NegativeNumberException e) {
            System.out.println(e.getMessage());
            System.out.println("Num : " + e.num);
        }
    }
}