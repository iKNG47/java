package convertor;

public class Convertor {
    //time
    static int hoursToMinute( int a){
        int result = a*60;
        return (result);
    }
    static int minuteToSecond( int a){
        int result = a*60;
        return (result);
    }
    static int secondToMsekond( int a){
        int result = a*1000;
        return (result);
    }
    //distance
    static void metersToCentimeters(int a){
        int result = a*100;
        System.out.println(result);

    }
    static void centimetersToMeters(double a){
        double result = a/100;
        System.out.println(result);
    }
    static void centimetersToMillimeter(int a){
        int result = a*10;
        System.out.println(result);
    }
}
