import java.awt.*;
import java.util.Date;

public class Reference_Datatype {
    public static void main(String[] args) {
        int a = 10;
        int b = a;
        a=5;
        System.out.println(a);
        System.out.println(b);

        Point p1 = new Point(5,7);
        Point p2 = p1;
        System.out.println(p2);

        p1.x=7;

        System.out.println(p1);
        System.out.println(p2);


    }
}
