package Hello;

public class Test {
    public static void main(String[] args) {
        
        Employee emp = new Employee();
        emp.setFirstName("Jeancarlo");
        emp.setLastName("Valverde");
        emp.setEmployeeID(1001);
        emp.employeeSummary();
        
        
        Manager manager = new Manager();
        manager.setFirstName("Boss");
        manager.setLastName("Baby");
        manager.setEmployeeID(2001);
        manager.setDepartment("CSUGLOBAL");
        manager.employeeSummary();
    }
}