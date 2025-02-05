import java.util.ArrayList;
import java.util.Scanner;
class Student {
int id;
String name;
int age;
public Student(int id, String name, int age) {
this.id = id;
this.name = name;
this.age = age;
}
public void display() {
System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
}
}
public class StudentManagement {
static ArrayList<Student> students = new ArrayList<>();
static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
while (true) {
System.out.println("\nStudent Management System");
System.out.println("1. Add Student");
System.out.println("2. View Students");
System.out.println("3. Delete Student");
System.out.println("4. Exit");
System.out.print("Enter your choice: ");
int choice = scanner.nextInt();
scanner.nextLine(); // Consume newline
switch (choice) {
case 1:
addStudent();
break;
case 2:
viewStudents();
break;case 3:
deleteStudent();
break;
case 4:
System.out.println("Exiting...");
System.exit(0);
break;
default:
System.out.println("Invalid choice! Try again.");
}
}
}
static void addStudent() {
System.out.print("Enter Student ID: ");
int id = scanner.nextInt();
scanner.nextLine(); // Consume newline
System.out.print("Enter Name: ");
String name = scanner.nextLine();
System.out.print("Enter Age: ");
int age = scanner.nextInt();
students.add(new Student(id, name, age));
System.out.println("Student added successfully!");
    }
static void viewStudents() {
if (students.isEmpty()) {
System.out.println("No students available.");
return;
}
System.out.println("\nList of Students:");
for (Student s : students) {
s.display();
}
}
static void deleteStudent() {
System.out.print("Enter Student ID to delete: ");
int id = scanner.nextInt();
boolean found = false;
for (int i = 0; i < students.size(); i++) {
if (students.get(i).id == id) {
students.remove(i);
found = true;
System.out.println("Student deleted successfully!");
break;
}
}

if (!found) {
System.out.println("Student not found!");
}
}
}
