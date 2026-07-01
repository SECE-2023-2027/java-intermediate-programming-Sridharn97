import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String name = scanner.nextLine();
        System.out.print("Enter number of marks: ");
        int count = scanner.nextInt();
        int[] marks = new int[count];
        System.out.println("Enter marks one by one:");
        for (int i = 0; i < count; i++) {
            marks[i] = scanner.nextInt();
        }
        Student student = new Student(name, marks);
        System.out.println(student.calculateAverage());
        scanner.close();
    }
}
