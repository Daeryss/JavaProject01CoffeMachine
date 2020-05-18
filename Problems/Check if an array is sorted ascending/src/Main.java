import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }
        boolean ans = true;
        for (int i = 1; i < num; i++) {
            if (arr[i] < arr[i - 1]) {
                ans = false;
                break;
            }
        }
        System.out.println(ans);
    }
}