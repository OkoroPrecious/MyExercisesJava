package chapterSix;

import static chapterSix.MethodOverLoad.max;

public class MethodOverLoad_Main {
    public static void main(String[]args){
        System.out.println("The maximum number of 3 and 4 is " + max(3,4));
        System.out.println("The maximum number of 3.0 and 5.4 is " + max(3.0, 5.4));
        System.out.println("The maximum number of 3.0, 5.4 and 10.4 is " + max(3.0,5.4,10.4));
    }
}
