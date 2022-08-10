package StudentGrades;

public class Student {
    private String name;
    private Subject subject;
    private Double gradeScore;

    public Student(String name, Subject subject, Double gradeScore) {
        this.name = name;
        this.subject = subject;
        this.gradeScore = gradeScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Subject getSubject() {
        return subject;
    }

    public Double getGradeScore() {
        return gradeScore;
    }

    public void setGradeScore(Double gradeScore) {
        this.gradeScore = gradeScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                ", gradeScore=" + gradeScore +
                '}';
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }
}
