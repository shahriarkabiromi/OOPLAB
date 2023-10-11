import java.util.Scanner;

class Employee {

    int employee_id;
    String name;
    int salary;

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(int salary) throws IllegalArgumentException {
        if (salary < 50000 || salary > 80000) {
            throw new IllegalArgumentException("Salary must be between 50k-80k tk");
        }
        this.salary = salary;
    }

    public int getEmployee_id() {
        return employee_id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee id: ");
        int employee_id = scanner.nextInt();

        System.out.println("Enter the employee name: ");
        String name = scanner.nextLine();

        System.out.println("Please enter an integer for the salary: ");
        scanner.nextInt();
        int salary = scanner.nextInt();

        Employee employee = new Employee();

        employee.setEmployee_id(employee_id);
        employee.setName(name);
        employee.setSalary(salary);

        System.out.println("Employee ID: " + employee.getEmployee_id());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Salary: " + employee.getSalary());
    }
}
