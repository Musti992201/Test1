import java.time.chrono.MinguoChronology;

public class HelloDemo {

    public static void main(String[] args) {

        System.out.println(Add(5,6));
        System.out.println(Sub(5,6));

    }

    public static double Add(double a, int b){
        double Ergebnis=a+b;
        return Ergebnis;
    }
    public static double Sub(double a, double b){
        double Ergebnis=a-b;
        return  Ergebnis;

    }
}
