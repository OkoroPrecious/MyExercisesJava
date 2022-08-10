package ChapterSeven;

public class Array_trial {
    public static void main(String[] args) {
        //Fill a 10-element array with numbers from 1 to 10:
     /* int[] numbers = new int[11];
       for(int i = 1; i < numbers.length; i++) {
            numbers[i] = i;
           System.out.println(numbers[i]);
       } */

        // OR

        /* int[] numbers = new int[10];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
         } */


        //Fill a 10-element array with numbers from 10 to 1:
      /* int[] numbers = new int[10];
            for (int i = 0; i < numbers.length; i++) {
              numbers[i] = 10 - i;
               System.out.println(numbers[i]);
        } */

        //Fill a 10-element array with numbers from 0 to 9:

        /* int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
            System.out.println(numbers[i]);
        }

         */

        //Add up the array elements:
        /* int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};
        // Calculate the sum
        int sum = 0;
        for (int i = 0; i < list.length; i++)
           // sum = sum + list[i];
            sum += list[i];

        System.out.println("Sum is " + sum);

         */

       // Find the smallest element in an array:
        int[] list = {5, 6, 7, 8, 1, 2, 5, -7, -9, 2, 0};

        int min = list[0];
        for (int i = 1; i < list.length; i++)
        {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println ("Min is " + min);


    }
}


