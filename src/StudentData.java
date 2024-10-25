
import java.util.Scanner;

class Student {

    public String name;
    public double matricNo;
    public String program;
    public double courseWorkMark;
    public double finalExamMark;
    public String grade;

    Student(String name, double matricNo, String program, double courseWorkMark, double finalExamMark) {
        this.name = name;
        this.matricNo = matricNo;
        this.program = program;
        this.courseWorkMark = courseWorkMark;
        this.finalExamMark = finalExamMark;
        this.calculateGrade();
    }

    private void calculateGrade() {
        double totalMark = courseWorkMark * 0.6 + finalExamMark * 0.4;

        if (totalMark >= 90) {
            grade = "A+";
        } else if (totalMark >= 85) {
            grade = "A";
        } else if (totalMark >= 80) {
            grade = "A-";
        } else if (totalMark >= 75) {
            grade = "B+";
        } else if (totalMark >= 70) {
            grade = "B";
        } else if (totalMark >= 65) {
            grade = "B-";
        } else if (totalMark >= 60) {
            grade = "C+";
        } else if (totalMark >= 55) {
            grade = "C";
        } else if (totalMark >= 50) {
            grade = "C-";
        } else if (totalMark >= 45) {
            grade = "D+";
        } else if (totalMark >= 40) {
            grade = "D";
        } else {
            grade = "F";
        }
    }

    String getName() {
        return name;
    }

    double getMatricNo() {
        return matricNo;
    }

    String getProgram() {
        return program;
    }

    double getCourseWorkMark() {
        return courseWorkMark;
    }

    double getFinalExamMark() {
        return finalExamMark;
    }

    String getGrade() {
        return grade;
    }

    void setProgram(String program) {
        this.program = program;
    }

    void setCourseWorkMark(double courseWorkMark) {
        this.courseWorkMark = courseWorkMark;
        this.calculateGrade();
    }

    void setFinalExamMark(double finalExamMark) {
        this.finalExamMark = finalExamMark;
        this.calculateGrade();
    }
}

public class StudentData {

    public static final int MAX_STUDENT = 100;
    public static Student[] students = new Student[MAX_STUDENT];
    public static int studentCount = 0;
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printMenu();
    }

    public static void printMenu() {

        int menuChoice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add student");
            System.out.println("2. Search student");
            System.out.println("3. Display all");
            System.out.println("4. Grade distribution");
            System.out.println("5. Edit student");
            System.out.println("6. Exit");
            System.out.print("Enter your choice (1-6): ");
            System.out.println("");
            menuChoice = scanner.nextInt();
            switch (menuChoice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    searchStudent();
                    break;
                case 3:
                    displayAll();
                    break;
                case 4:
                    gradeDistribution();
                    break;
                case 5:
                    editStudent();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (menuChoice != 6);
    }

    public static void addStudent() {
        System.out.print("Enter name: ");
        String name = scanner.next();
        double matricNo;
        while (true) {
            System.out.print("Enter matric no: ");
            matricNo = scanner.nextDouble();
            boolean exists = false;
            for (int i = 0; i < studentCount; i++) {
                if (students[i].matricNo == matricNo) {
                    exists = true;
                    break;
                }
            }
            if (!exists) {
                break;
            }
            System.out.println("Matric no already exists. Please enter a different matric no.");
        }
        System.out.print("Enter program: ");
        String program = scanner.next();
        System.out.print("Enter course work mark (out of 100): ");
        double courseWorkMark = -1;
        boolean validCourseWorkMark = false;
        while (!validCourseWorkMark) {
            System.out.print("Enter course work mark: ");
            courseWorkMark = scanner.nextDouble();
            if (courseWorkMark < 0 || courseWorkMark > 100) {
                System.out.println("Error: Course work mark must be between 0 and 100.");
            } else {
                validCourseWorkMark = true;
            }
        }
        double finalExamMark = -1;
        boolean validFinalExamMark = false;
        while (!validFinalExamMark) {
            System.out.print("Enter final exam mark: ");
            finalExamMark = scanner.nextDouble();
            if (finalExamMark < 0 || finalExamMark > 100) {
                System.out.println("Error: Final exam mark must be between 0 and 100.");
            } else {
                validFinalExamMark = true;
            }
        }
        students[studentCount] = new Student(name, matricNo, program, courseWorkMark, finalExamMark);
        studentCount++;
    }

    public static void searchStudent() {
        System.out.print("Enter matric no to search: ");
        int matricNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].getMatricNo() == matricNo) {
                System.out.println("Name: " + students[i].getName());
                System.out.println("Matric No: " + students[i].getMatricNo());
                System.out.println("Program: " + students[i].getProgram());
                System.out.println("Course Work Mark: " + students[i].getCourseWorkMark());
                System.out.println("Final Exam Mark: " + students[i].getFinalExamMark());
                System.out.println("Grade: " + students[i].getGrade());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

    public static void displayAll() {
        System.out.println("List of all students: ");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Name: " + students[i].getName());
            System.out.println("Matric No: " + students[i].getMatricNo());
            System.out.println("Program: " + students[i].getProgram());
            System.out.println("Course Work Mark: " + students[i].getCourseWorkMark());
            System.out.println("Final Exam Mark: " + students[i].getFinalExamMark());
            System.out.println("Grade: " + students[i].getGrade());
            System.out.println("---");
        }
    }

    public static void gradeDistribution() {
        int[] count = new int[10];
        for (int i = 0; i < studentCount; i++) {
            String grade = students[i].getGrade();
            switch (grade) {
                case "A+":
                    count[0]++;
                    break;
                case "A":
                    count[1]++;
                    break;
                case "A-":
                    count[2]++;
                    break;
                case "B+":
                    count[3]++;
                    break;
                case "B":
                    count[4]++;
                    break;
                case "B-":
                    count[5]++;
                    break;
                case "C+":
                    count[6]++;
                    break;
                case "C":
                    count[7]++;
                    break;
                case "C-":
                    count[8]++;
                    break;
                case "D+":
                    count[9]++;
                    break;
                default:
                    break;
            }
        }

        System.out.println("Grade Distribution: ");
        System.out.println("A+: " + count[0]);
        System.out.println("A: " + count[1]);
        System.out.println("A-: " + count[2]);
        System.out.println("B+: " + count[3]);
        System.out.println("B: " + count[4]);
        System.out.println("B-: " + count[5]);
        System.out.println("C+: " + count[6]);
        System.out.println("C: " + count[7]);
        System.out.println("C-: " + count[8]);
        System.out.println("D+: " + count[9]);
    }

    public static void editStudent() {
        System.out.print("Enter matric no to edit: ");
        int matricNo = scanner.nextInt();
        boolean found = false;
        for (int i = 0; i < studentCount; i++) {
            if (students[i].matricNo == matricNo) {
                System.out.print("Enter new program: ");
                students[i].setProgram(scanner.next());
                System.out.print("Enter new course work mark: ");
                students[i].setCourseWorkMark(scanner.nextDouble());
                System.out.print("Enter new final exam mark: ");
                students[i].setFinalExamMark(scanner.nextDouble());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student not found.");
        }
    }

}
