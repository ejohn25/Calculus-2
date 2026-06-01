public class Calculus2 {
    private String courseName;
    private String instructor;
    private int credits;
    private double currentGrade;

    // Constructor
    public Calculus2(String courseName, String instructor, int credits) {
        this.courseName = courseName;
        this.instructor = instructor;
        this.credits = credits;
        this.currentGrade = 0.0;
    }

    // Getters
    public String getCourseName() {
        return courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getCredits() {
        return credits;
    }

    public double getCurrentGrade() {
        return currentGrade;
    }

    // Setter
    public void setCurrentGrade(double currentGrade) {
        this.currentGrade = currentGrade;
    }

    // Method to calculate letter grade
    public String calculateLetterGrade() {
        if (currentGrade >= 90) {
            return "A";
        } else if (currentGrade >= 80) {
            return "B";
        } else if (currentGrade >= 70) {
            return "C";
        } else if (currentGrade >= 60) {
            return "D";
        } else {
            return "F";
        }
    }

    // Display course information
    public void displayCourseInfo() {
        System.out.println("Course: " + courseName);
        System.out.println("Instructor: " + instructor);
        System.out.println("Credits: " + credits);
        System.out.println("Current Grade: " + currentGrade);
        System.out.println("Letter Grade: " + calculateLetterGrade());
    }

    // Main method for testing
    public static void main(String[] args) {
        Calculus2 calc = new Calculus2(
            "Calculus II",
            "Dr. Johnson",
            4
        );

        calc.setCurrentGrade(92.5);
        calc.displayCourseInfo();
    }
}

