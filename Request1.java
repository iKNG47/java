package firstHomework;
import java.util.Random;

public class Request1 {
    public static void main(String[] args) {
        Random rnd=new Random();
        int x= rnd.nextInt(10);
        System.out.println(x);
        int y= rnd.nextInt(10);
        System.out.println(y);
        int c;
        boolean result;
        result=x<y;
        System.out.println("x<y "+result);
        c=x*2;
        System.out.println(c);
        result=c>y;
        System.out.println("2x>y "+result );
        c=x+3;
        System.out.println(c);
        result=y<c;
        c=x/2;
        System.out.println(c);
        System.out.println("y<x+3 && x/2<y " +( result && c<y));
        x=(x*y)%2;
        result=(x==0);

        System.out.println(result);

    }
}
