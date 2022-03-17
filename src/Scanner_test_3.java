import java.util.Scanner; //import Scanner

public class Scanner_test_3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String phraze1 = scan.nextLine();
        System.out.println(phraze1);
    }
}
