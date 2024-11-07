import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Double number:");
        double x = sc.nextDouble();
        System.out.println("[ the floor of " + x + " is: "+Math.floor(x) + " ]");
        System.out.println("[ the ceil  of " + x + " is: "+Math.ceil(x) + " ]");

    }

}
