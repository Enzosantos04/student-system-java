public class Students {
    private final String name;
    private final String email;
    private final double grade1;
    private final double grade2;
    private final double average;

    public Students(String name, String email, double grade1, double grade2) {
        this.name = name;
        this.email = email;
        this.grade1 = grade1;
        this.grade2 = grade2;
        this.average = (grade1 + grade2) / 2;

    }


    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public double getGrade1(){
        return grade1;
    }

    public double getGrade2() {
        return grade2;
    }

    public double getAverage() {
        return average;
    }


}
