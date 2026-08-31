package com.sms;

import java.util.Collection;
import java.util.LinkedHashMap;

public class StudentService {

    private LinkedHashMap<String, Student> students = new LinkedHashMap<>();

    // Register Student

    public void registerStudent(String id,String name,String department,
    							int semester,
                                double fee,
                                String type) {

        if (students.containsKey(id)) {

            System.out.println("Student ID already exists.");
            return;

        }

        Student student;

        if (type.equalsIgnoreCase("Regular")) {

            student = new RegularStudent(id, name, department, semester, fee);

        } else if (type.equalsIgnoreCase("Scholarship")) {

            student = new ScholarshipStudent(id, name, department, semester, fee);

        } else {

            System.out.println("Invalid Student Type.");
            return;

        }

        students.put(id, student);

        System.out.println("--------------------------------");
        System.out.println("Student Registered Successfully.");
        System.out.println("--------------------------------");

    }

    // Search Student

    public void searchStudent(String id) {

        if (students.containsKey(id)) {

            System.out.println(students.get(id));

        } else {

            System.out.println("Student Not Found.");

        }

    }

    // Pay Fee

    public void payFee(String id, double amount) {

        if (students.containsKey(id)) {

            students.get(id).payFee(amount);

        } else {

            System.out.println("Student Not Found.");

        }

    }

    // Calculate Scholarship

    public void calculateScholarship(String id) {

        if (students.containsKey(id)) {

            students.get(id).calculateScholarship();

        } else {

            System.out.println("Student Not Found.");

        }

    }

    // Check Fee Balance

    public void checkFeeBalance(String id) {

        if (students.containsKey(id)) {

            System.out.println("--------------------------------");
            System.out.println("Student ID : " + id);
            System.out.println("Remaining Fee : ₹"
                    + students.get(id).getFeeBalance());
            System.out.println("--------------------------------");

        } else {

            System.out.println("Student Not Found.");

        }

    }

    // Update Department

    public void updateDepartment(String id, String department) {

        if (students.containsKey(id)) {

            students.get(id).setDepartment(department);

            System.out.println("Department Updated Successfully.");

        } else {

            System.out.println("Student Not Found.");

        }

    }

    // Update Semester

    public void updateSemester(String id, int semester) {

        if (students.containsKey(id)) {

            students.get(id).setSemester(semester);

            System.out.println("Semester Updated Successfully.");

        } else {

            System.out.println("Student Not Found.");

        }

    }

    // Delete Student

    public void deleteStudent(String id) {

        if (students.containsKey(id)) {

            students.remove(id);

            System.out.println("Student Deleted Successfully.");

        } else {

            System.out.println("Student Not Found.");

        }

    }

    // Total Students

    public void totalStudents() {

        System.out.println("--------------------------------");
        System.out.println("Total Students : " + students.size());
        System.out.println("--------------------------------");

    }

    // View All Students

    public void viewStudents() {

        if (students.isEmpty()) {

            System.out.println("No Student Records Available.");
            return;

        }

        Collection<Student> values = students.values();

        for (Student s : values) {

            System.out.println(s);

        }

    }

}