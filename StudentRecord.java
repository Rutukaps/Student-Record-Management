package studentmanagement;
import java.util.ArrayList;
import java.util.Scanner;

class Student {
    private int id;
    private String name;
    private float marks;

    public Student(int id, String name, float marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Marks: " + marks);
    }
}

public class StudentRecord {
    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine(); 

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Marks: ");
                    float marks = sc.nextFloat();

                    students.add(new Student(id, name, marks));
                    System.out.println("Student Added Successfully!");
                    break;

                case 2: 
                    System.out.println("\n--- Student List ---");
                    if (students.isEmpty()) {
                        System.out.println("No students found!");
                    } else {
                        for (Student s : students) {
                            s.display();
                        }
                    }
                    break;

                case 3: 
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine(); 
                    boolean found = false;

                    for (Student s : students) {
                        if (s.getId() == uid) {
                            System.out.print("Enter new Name: ");
                            String newName = sc.nextLine();

                            System.out.print("Enter new Marks: ");
                            float newMarks = sc.nextFloat();

                            s.setName(newName);
                            s.setMarks(newMarks);

                            System.out.println("Student Updated Successfully!");
                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Student not found!");
                    }
                    break;

                case 4: 
                    System.out.print("Enter ID to delete: ");
                    int did = sc.nextInt();

                    Student toRemove = null;

                    for (Student s : students) {
                        if (s.getId() == did) {
                            toRemove = s;
                            break;
                        }
                    }

                    if (toRemove != null) {
                        students.remove(toRemove);
                        System.out.println("Student Deleted Successfully!");
                    } else {
                        System.out.println("Student not found!");
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 5);

        sc.close();
    }
}

			
			
			
			
			
		
		
		
		
		
		
		
		
	



