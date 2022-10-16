import java.util.*;
public class Circle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int radius=sc.nextInt();
        float pi=sc.nextFloat();
        float area=pi*radius*radius;
        System.out.println(area);
    }
}
