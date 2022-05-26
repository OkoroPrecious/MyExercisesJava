package chapterThree;

import java.time.LocalDate;

public class HealthRecord {
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dob;
    private Integer birthYear;
    private Integer birthMonth;
    private Integer birthDay;
    private Integer heightInInches;
    private Double weightInPounds;

    public HealthRecord(String firstName, String lastName, String gender, LocalDate dob, Integer birthYear, Integer birthMonth, Integer birthDay, Integer heightInInches, Double weightInPounds) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.birthYear = birthYear;
        this.birthMonth = birthMonth;
        this.birthDay = birthDay;
        this.heightInInches = heightInInches;
        this.weightInPounds = weightInPounds;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
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

    public Integer getHeightInInches() {
        return heightInInches;
    }

    public void setHeightInInches(Integer heightInInches) {
        this.heightInInches = heightInInches;
    }

    public Double getWeightInPounds() {
        return weightInPounds;
    }

    public void setWeightInPounds(Double weightInPounds) {
        this.weightInPounds = weightInPounds;
    }
}
