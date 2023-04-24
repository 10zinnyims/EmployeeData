import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeData {
    public static void main(String[] args) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader("EmployeeData.txt"));
        try {
            String input;
            while ((input = bufReader.readLine()) != null) {
                String[] field = input.split("\\|");
                int employeeId = Integer.parseInt(field[0]);
                String name = field[1];
                double hoursWorked = Double.parseDouble(field[2]);
                double payRate = Double.parseDouble(field[3]);
                Employee employee = new Employee(employeeId, name, hoursWorked, payRate);
                double grossPay = employee.getGrossPay();
               // System.out.println("Employee ID: " + employee.getEmployeeId() + " Employee Name " + employee.getName() + " Gross Pay: " + grossPay);
                System.out.println("Employee ID: " + employee.getEmployeeId());
                System.out.println("Name: " + employee.getName());
                System.out.println("Hours worked: " + employee.getHoursWorked());
                System.out.println("Gross pay: " + grossPay);
                System.out.println();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}