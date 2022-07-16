package chapterSix;

public class FloorAndCeil {
    public static int myFloor(double x){
        return (int)x;
    }
    public static int myCeil(double x){
        return(int)x +1;
    }
    public static void main(String[]args){
        System.out.println(myFloor(9.6));
        System.out.println(myCeil(18.9));
    }
}