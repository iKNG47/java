package Calc_v2;

public class Calculator {
    static double add(double ... arg){
        double sum = 0;
        for (int i = 0;i< arg.length;i++){
            sum += arg[i];
        }
        return (sum);
    }
    static double sub(double ... arg){
        double sub = arg[0];
        for (int i = 1;i< arg.length;i++){
            sub -= arg[i];
        }
        return (sub);
    }
    static double multiply(double ... arg){
        double mult = arg[0];
        for (int i = 1;i< arg.length;i++){
            mult *= arg[i];
        }
        return (mult);
    }
    static double div(double ... arg){
        double div = arg[0];
        for (int i = 1;i< arg.length;i++){
            div /= arg[i];
        }
        return (div);
    }

}
