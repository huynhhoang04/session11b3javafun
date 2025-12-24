public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        
        employees[0] = new FullTimeEmployee(1, "ba van sau", 15000000);
        
        employees[1] = new PartTimeEmployee(2, "thanh van hoa", 50, 25000);
        
        employees[2] = new FullTimeEmployee(3, "cc", 20000000);

        System.out.println("=== EMPLOYEE SALARY SYSTEM ===");
        
        for (Employee e : employees) {
            System.out.println("---------------------------");
            e.showInfo();
            System.out.printf("Salary: %.0f VND\n", e.calculateSalary());

            if (e instanceof BonusEligible) {
                double bonus = ((BonusEligible) e).calculateBonus();
                System.out.printf("Bonus: %.0f VND\n", bonus);
                System.out.printf("Total Income: %.0f VND\n", (e.calculateSalary() + bonus));
            } else {
                System.out.println("(No bonus available)");
            }
        }
    }
}
