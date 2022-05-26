package chapterThree;

import java.time.LocalDate;
import java.util.Scanner;

public class TargetHeartRateCalculator {
    public static void main(String[] args) {

        HeartRates profile = new HeartRates(null,null,null, 1, 1,1);
        Scanner keyboardInput = new Scanner(System.in);
        System.out.println("Whats your first name?: ");
        String firstName = keyboardInput.nextLine();
        profile.setFirstName(firstName);

        System.out.print("Whats your last name?: ");
        String lastName = keyboardInput.nextLine();
        profile.setLastName(lastName);

        System.out.print("What year were you born?: ");
        Integer birthYear = keyboardInput.nextInt();
        profile.setBirthYear(birthYear);

        System.out.print("What month were you born?: ");
        Integer birthMonth = keyboardInput.nextInt();
        profile.setBirthMonth(birthMonth);

        System.out.print("What day were you born?: ");
        Integer birthDay = keyboardInput.nextInt();
        profile.setBirthDay(birthDay);

        System.out.print(profile);
        System.out.println(calculateAge(birthYear));
        System.out.println(calculateMaximumHeartRate(birthYear));
        calculateTargetHeartRate(birthYear);

    }

    private static void calculateTargetHeartRate(Integer birthYear) {
        LocalDate currentTime = LocalDate.now();
        Integer age = currentTime.getYear() - birthYear;
        Integer maxHeartRate = 220 - age;
        double maxHeartRateLow = 0.5 * maxHeartRate;
        double maxHeartRateHigh = 0.85 * maxHeartRate;
        System.out.printf("Your maximum heart rate is between %.2f and %.2f", maxHeartRateLow, maxHeartRateHigh);
    }

    private static Integer calculateMaximumHeartRate(Integer birthYear) {
        LocalDate currentTime = LocalDate.now();
        Integer age = currentTime.getYear() - birthYear;
        return 220 - age;
    }

    private static Integer calculateAge(Integer birthYear) {
        LocalDate currentTime = LocalDate.now();
        Integer age = currentTime.getYear() - birthYear;
        return age;
    }
}
