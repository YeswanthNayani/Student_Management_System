package com.sms;

public class RegularStudent extends Student {

    public RegularStudent(String studentId,
                          String studentName,
                          String department,
                          int semester,
                          double feeBalance) {

        super(studentId, studentName, department, semester, feeBalance);

    }

    @Override
    public void calculateScholarship() {

        System.out.println("--------------------------------");
        System.out.println("Student Type : Regular");
        System.out.println("Scholarship  : Not Eligible");
        System.out.println("Fee Payable  : ₹" + getFeeBalance());
        System.out.println("--------------------------------");

    }

}