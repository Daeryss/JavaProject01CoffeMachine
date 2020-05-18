import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = s.nextInt();
        }
        int  ans = 1;
        int k = 1;
        for (int i = 1; i < num; i++) {
            if (arr[i] > arr[i - 1]) {
                k++;
                if (k > ans) {
                    ans = k;
                }
            } else {
                k = 1;
            }
        }
        System.out.println(ans);
    }
}