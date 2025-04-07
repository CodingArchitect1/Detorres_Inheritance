
public class Staff extends Person {

    String department;

    public Staff(String name, int id, String department) {
        super(name, id);
        this.department = department;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Department: " + department);
    }

    @Override
    public String getDetails() {
        return super.getDetails() + "Department: " + department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStaffDetails() {
        return super.getDetails() + "Department: " + department;
    }

    public String getStaffDetailsWithID() {
        return super.getDetails() + ", ID: " + super.getId() + ", Department: " + department;
    }

    public String getStaffDetailsWithIDAndName() {
        return super.getName() + ", ID: " + super.getId() + ", Department: " + department;
    }
}
