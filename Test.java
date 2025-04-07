
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
}
