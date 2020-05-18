import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String type = s.next();
        switch (type) {
            case "triangle":
                double a = s.nextDouble();
                double b = s.nextDouble();
                double c = s.nextDouble();
                double p = 1.0 * (a + b + c) / 2;
                double result = Math.sqrt(p * (p - a) * (p - b) * (p - c));
                System.out.println(result);
                break;
            case "rectangle":
                int d = s.nextInt();
                int e = s.nextInt();
                int rect = d * e;
                System.out.println(rect);
                break;
            case "circle":
                double r = s.nextDouble();
                double circ = 3.14 * r * r;
                System.out.println(circ);
                break;
            default:
                System.out.println("error");
                break;
        }
    }
}