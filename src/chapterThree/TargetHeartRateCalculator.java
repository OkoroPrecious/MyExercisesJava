package chapterThree;

import java.time.LocalDate;

public class TargetHeartRateCalculator {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private Integer birthYear;
    private Integer birthMonth;
    private Integer birthDay;


    public TargetHeartRateCalculator(String firstName, String lastName, LocalDate dob, Integer birthYear, Integer birthMonth, Integer birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        dob = LocalDate.of(birthYear, birthMonth, birthDay);
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Integer getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(Integer birthYear) {
        this.birthYear = birthYear;
    }

    public Integer getBirthMonth() {
        return birthMonth;
    }

    public void setBirthMonth(Integer birthMonth) {
        this.birthMonth = birthMonth;
    }

    public Integer getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Integer birthDay) {
        this.birthDay = birthDay;
    }

    @Override
    public String toString() {
        return "HeartRates{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear='" + birthYear + '\'' +
                ", birthMonth='" + birthMonth + '\'' +
                ", birthDay='" + birthDay + '\'' +
                '}';
    }
}
