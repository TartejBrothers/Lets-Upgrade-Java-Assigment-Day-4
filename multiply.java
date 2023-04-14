import java.util.Scanner;

class multiply {
    public static void main(String[] args) {
        int i;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter Number:");
        int num = obj.nextInt();
        for (i = 1; i <= 10; i++) {
            int x = num * i;
            System.out.println(num + "*" + i + "=" + x);
        }
        return;
    }
}
