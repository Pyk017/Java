class Student {
    int id;
    String name;

    public void insertData(int roll, String n) {
        id = roll;
        name = n;
    }

    public void displayInfo() {
        System.out.println(id + " " + name);
    }

}

public class OOPs {
    public static void main(String args[]) {

        Student student = new Student();

        student.id = 101; // Initialization of objects using reference variables.
        student.name = "Prakhar";

        student.insertData(102, "Kashyap"); // Initialization of objects using methods.
        student.displayInfo();

    }
}
