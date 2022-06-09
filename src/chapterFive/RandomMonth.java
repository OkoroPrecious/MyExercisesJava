package chapterFive;

//(Random month) Write a program that randomly generates an integer between 1
//        and 12 and displays the English month name January, February, …, December for
//        the number 1, 2, …, 12, accordingly

public class RandomMonth {
    public static void main(String[] args) {
        int month = 1 + (int)(Math.random() * 12);

        switch (month) {
            case 1 -> System.out.print("January");
            case 2 -> System.out.print("February");
            case 3 -> System.out.print("March");
            case 4 -> System.out.print("April");
            case 5 -> System.out.print("May");
            case 6 -> System.out.print("June");
            case 7 -> System.out.print("July");
            case 8 -> System.out.print("August");
            case 9 -> System.out.print("September");
            case 10 -> System.out.print("october");
            case 11 -> System.out.print("November");
            case 12 -> System.out.print("December");
        }

    }
}
