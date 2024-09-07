import java.util.Date;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stopwatch stopwatch = new Stopwatch();
        Date date = new Date();
        System.out.println(date.getTime());
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        if (s==1){
            stopwatch.stop();
            System.out.println(stopwatch.getElapsedTime());
        }else {
            stopwatch.start();
        }


        /*Invoice invoice1 = new Invoice("1","2",1,1);
        Invoice invoice2 = new Invoice("1","2",1,1);
        System.out.println("This is invoice 1 = " + invoice1);
        System.out.println("This is invoice 2 = " + invoice2);
        /*Rectangle r = new Rectangle(0.0F,0.0F);
        System.out.println("Area of a rectangle = " + r.area());
        System.out.println("Perimeter of a rectangle =" + r.perimeter());*/
    }
}