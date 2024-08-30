import java.util.Scanner;

class Grader {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();

        for (int i = 0; i < numStudents; i ++) {
            System.out.print("Enter grade: ");
            int grade = scanner.nextInt();

            if (grade < 38) {
            }
            else if (grade % 5 > 2) {
                grade = (5- (grade % 5)) + grade;
            }
            
            System.out.println(grade);
        }
    }
}
