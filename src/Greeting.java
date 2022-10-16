import java.util.*;
public class Greeting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        if(button==1)
            System.out.println("hello");
        else if (button==2)
            System.out.println("Namasthe");
        else
            System.out.println("bonjour");

        }
    }

