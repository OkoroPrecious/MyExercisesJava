package chapterSix;

public class MethodOverLoad {
    public static int max(int num1, int num2){
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
    public static double max(double num1, double num2){
        if(num1 > num2)
            return  num1;
        else
            return num2;
    }
    public static double max(double num1, double num2, double num3){
        return max(max(num1, num2), num3);
    }
}
