package Chapter4;

public class SumEvenAndOdd {
    public static void main(String[] args){
        int i = 1;
        int sumOfEvenNumbers = 0;
        int sumOfOddNumbers = 0;

        while( i <= 10){
            if(i %2 == 0){
                sumOfEvenNumbers += i;
            }
            else{
                sumOfOddNumbers += i;
            }
            i++;

        }

        System.out.println(sumOfEvenNumbers);
        System.out.println(sumOfOddNumbers);

    }
}
