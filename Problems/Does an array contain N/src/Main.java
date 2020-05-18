import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }
        int x = s.nextInt();
        boolean ans = false;
        for (int value : arr) {
            if (value == x) {
                ans = true;
                break;
            }
        }
        System.out.println(ans);
    }
}
