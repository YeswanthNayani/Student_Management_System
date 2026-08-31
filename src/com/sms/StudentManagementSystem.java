package com.sms;

import java.util.Scanner;

public class StudentManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StudentService service = new StudentService();

        while (true) {

            System.out.println("\n=======================================================");
            System.out.println("          STUDENT MANAGEMENT SYSTEM");
            System.out.println("=========================================================");
            System.out.println("================1. Register Student======================");
            System.out.println("================2. Search Student=======================");
            System.out.println("================3. Pay Fee==============================");
            System.out.println("================4. Calculate Scholarship================");
            System.out.println("================5. Check Fee Balance====================");
            System.out.println("================6. Update Department====================");
            System.out.println("================7. Update Semester======================");
            System.out.println("================8. Delete Student=======================");
            System.out.println("================9. View All Students====================");
            System.out.println("===============10. Total Students=======================");
            System.out.println("===============11. Exit=================================");
            System.out.println("========================================================");
            System.out.print("Enter Your Choice : ");

            int choice = sc.nextInt();

            switch (choice) {

            case 1:

                System.out.print("Enter Student ID : ");
                String id = sc.next();

                System.out.print("Enter Student Name : ");
                sc.nextLine();
                String name = sc.nextLine();

                System.out.print("Enter Department : ");
                String dept = sc.nextLine();

                System.out.print("Enter Semester : ");
                int sem = sc.nextInt();

                System.out.print("Enter Total Fee : ");
                double fee = sc.nextDouble();

                System.out.print("Enter Student Type (Regular/Scholarship): ");
                String type = sc.next();

                service.registerStudent(id, name, dept, sem, fee, type);

                break;

            case 2:

                System.out.print("Enter Student ID : ");
                id = sc.next();

                service.searchStudent(id);

                break;

            case 3:

                System.out.print("Enter Student ID : ");
                id = sc.next();

                System.out.print("Enter Amount : ");
                double amount = sc.nextDouble();

                service.payFee(id, amount);

                break;

            case 4:

                System.out.print("Enter Student ID : ");
                id = sc.next();

                service.calculateScholarship(id);

                break;

            case 5:

                System.out.print("Enter Student ID : ");
                id = sc.next();

                service.checkFeeBalance(id);

                break;

            case 6:

                System.out.print("Enter Student ID : ");
                id = sc.next();

                sc.nextLine();

                System.out.print("Enter New Department : ");
                dept = sc.nextLine();

                service.updateDepartment(id, dept);

                break;

            case 7:

                System.out.print("Enter Student ID : ");
                id = sc.next();

                System.out.print("Enter New Semester : ");
                sem = sc.nextInt();

                service.updateSemester(id, sem);

                break;

            case 8:

                System.out.print("Enter Student ID : ");
                id = sc.next();

                service.deleteStudent(id);

                break;

            case 9:

                service.viewStudents();

                break;

            case 10:

                service.totalStudents();

                break;

            case 11:

                System.out.println("\n===========================================");
                System.out.println(" Thank You For Using");
                System.out.println(" STUDENT MANAGEMENT SYSTEM");
                System.out.println("===========================================");
                sc.close();
                System.exit(0);

            default:

                System.out.println("Invalid Choice!");

            }

        }

    }

}