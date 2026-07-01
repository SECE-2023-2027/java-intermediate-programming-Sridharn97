import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter employee base salary: ");
        double employeeBaseSalary = scanner.nextDouble();
        scanner.nextLine();
        System.out.print("Enter manager name: ");
        String managerName = scanner.nextLine();
        System.out.print("Enter manager base salary: ");
        double managerBaseSalary = scanner.nextDouble();
        System.out.print("Enter manager bonus: ");
        double managerBonus = scanner.nextDouble();
        Employee employee = new Employee(employeeName, employeeBaseSalary);
        Manager manager = new Manager(managerName, managerBaseSalary, managerBonus);
        System.out.println(employee.calculateSalary());
        System.out.println(manager.calculateSalary());
        scanner.close();
    }
}