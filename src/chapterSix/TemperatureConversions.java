package chapterSix;

import java.util.Scanner;

public class TemperatureConversions {
//    a) Method Kelvin returns the Kelvin equivalent of a Celsius temperature, using the calculation
//    Kelvin = Celsius + 273.15;
//    b) Method Celsius returns the Celsius equivalent of a Kelvin temperature, using the calculation
//    Celsius = Kelvin - 273.15;
//    c) Use the methods from parts (a) and (b) to write an application that enables the user to
//    enter a Kelvin temperature and display the Celsius equivalent, or, to enter a Celsius
//    temperature and display the Kelvin equivalent.

    // convert temperatures
    public int convertTemperatures() {


        Scanner input = new Scanner(System.in);

        int choice;

        String prompt = """
                1 --> Fahrenheit to Celsius
                2 --> Celsius to Fahrenheit
                3 --> Exit
                """;
        System.out.print(prompt);
        choice = input.nextInt();

            if (choice != 3) {
                System.out.print("Enter temperature: ");
                int oldTemperature = input.nextInt();

                switch (choice) {
                    case 1:
                        System.out.printf("%d Fahrenheit is %d Celsius\n",
                                oldTemperature, celsius(oldTemperature));
                        break;

                    case 2:
                        System.out.printf("%d Celsius is %d Fahrenheit\n",
                                oldTemperature, fahrenheit(oldTemperature));
                        break;
                }
            }
        return choice;
    }




    public int celsius ( int fahrenheitTemperature ){
     return ((int) (5.0 / 9.0 * (fahrenheitTemperature - 32)));
    }


    public int fahrenheit( int celsiusTemperature ){
        return ((int) (9.0 / 5.0 * celsiusTemperature + 32));
    }
}

