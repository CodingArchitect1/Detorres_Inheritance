
public class Test {

    public static void main(String[] args) {

        Student student = new Student("De Torres Khrstan Mori S.", 1081484, "1st Year College");
        Teacher teacher = new Teacher("Sir. Archie Menesis", 243, "Object Oriented Programming");
        Staff staff = new Staff("Mrs. Adams", 301, "Administrative");

        System.out.println("Student Details:");
        student.displayInfo();
        System.out.println();

        System.out.println("Teacher Details:");
        teacher.displayInfo();
        System.out.println();

        System.out.println("Staff Details:");
        staff.displayInfo();
    }

    public static void displayDetails(Person person) {
        person.displayInfo();
    }

    public static void getDetails(Person person) {
        System.out.println(person.getDetails());
    }

    public static void setDepartment(Staff staff, String department) {
        staff.setDepartment(department);
    }

    public static String getDepartment(Staff staff) {
        return staff.getDepartment();
    }

    public static void getStaffDetails(Staff staff) {
        System.out.println(staff.getStaffDetails());
    }
}
