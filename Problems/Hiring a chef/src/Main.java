import java.util.Scanner;

class tetsting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        int age = scanner.nextInt();
        String education = scanner.next();
        int expirinse = scanner.nextInt();
        String cuisine = scanner.next();
        System.out.println("The form for " + name + " is completed. We will contact you if we need a chef that cooks " + cuisine + " dishes.");
    }
}
