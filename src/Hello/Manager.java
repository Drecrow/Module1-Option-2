package Hello;

class Manager extends Employee {
    private String department;

    
    public void setDepartment(String department) {
        this.department = department;
    }

   
    
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Department: " + department);
    }
}