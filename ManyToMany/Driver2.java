package ManyToMany;

import java.util.Scanner;

public class Driver2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Predefined students and subjects
        Students[] students = new Students[10];
        Subjects[] subjects = new Subjects[10];
        
        students[0] = new Students("Soham");
        students[1] = new Students("Uday");
        students[2] = new Students("Ankan");
        
        subjects[0] = new Subjects("Java");
        subjects[1] = new Subjects("Python");
        subjects[2] = new Subjects("C++");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Admin");
            System.out.println("2. Student");
            System.out.println("3. Display all students");
            System.out.println("4. Display all subjects");
            System.out.println("5. Display subjects under each student");
            System.out.println("6. Display students under each subject");
            System.out.println("7. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // Admin menu
                    System.out.println("Available subjects:");
                    for (int i = 0; i < subjects.length && subjects[i] != null; i++) {
                        System.out.println((i + 1) + ". " + subjects[i].getName());
                    }
                    
                    System.out.println("Enter subject number to add a student:");
                    int subjectIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    
                    if (subjectIndex >= 0 && subjectIndex < subjects.length && subjects[subjectIndex] != null) {
                        System.out.println("Enter student name:");
                        String studentName = scanner.nextLine();
                        Students newStudent = new Students(studentName);
                        subjects[subjectIndex].addStudent(newStudent);
                        System.out.println("Student " + studentName + " added to " + subjects[subjectIndex].getName());
                    } else {
                        System.out.println("Invalid subject selection.");
                    }
                    break;
                
                case 2:
                    // Student menu
                    System.out.println("Enter student name:");
                    String studentName = scanner.nextLine();
                    Students selectedStudent = null;
                    
                    for (Students s : students) {
                        if (s != null && s.getName().equalsIgnoreCase(studentName)) {
                            selectedStudent = s;
                            break;
                        }
                    }
                    
                    if (selectedStudent == null) {
                        System.out.println("Student not found.");
                        break;
                    }
                    
                    System.out.println("Available subjects:");
                    for (int i = 0; i < subjects.length && subjects[i] != null; i++) {
                        System.out.println((i + 1) + ". " + subjects[i].getName());
                    }
                    
                    System.out.println("Enter subject number to add to your profile:");
                    int studentSubjectIndex = scanner.nextInt() - 1;
                    scanner.nextLine();
                    
                    if (studentSubjectIndex >= 0 && studentSubjectIndex < subjects.length && subjects[studentSubjectIndex] != null) {
                        selectedStudent.addSubjects(subjects[studentSubjectIndex]);
                        System.out.println("Subject " + subjects[studentSubjectIndex].getName() + " added to " + selectedStudent.getName());
                    } else {
                        System.out.println("Invalid subject selection.");
                    }
                    break;
                
                case 3:
                    // Display all students
                    System.out.println("List of students:");
                    for (Students s : students) {
                        if (s != null) {
                            System.out.println(s.getName());
                        }
                    }
                    break;
                
                case 4:
                    // Display all subjects
                    System.out.println("List of subjects:");
                    for (Subjects sub : subjects) {
                        if (sub != null) {
                            System.out.println(sub.getName());
                        }
                    }
                    break;
                
                case 5:
                    // Display subjects under each student
                    System.out.println("Subjects under each student:");
                    for (Students s : students) {
                        if (s != null) {
                            System.out.println(s.getName() + " is enrolled in:");
                            s.display();
                            System.out.println();
                        }
                    }
                    break;
                
                case 6:
                    // Display students under each subject
                    System.out.println("Students under each subject:");
                    for (Subjects sub : subjects) {
                        if (sub != null) {
                            System.out.println("Students enrolled in " + sub.getName() + ":");
                            sub.display();
                            System.out.println();
                        }
                    }
                    break;
                
                case 7:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
