package com.sms;

public class ScholarshipStudent extends Student {

    private static final double SCHOLARSHIP_PERCENT = 50;

    public ScholarshipStudent(String studentId,
                              String studentName,
                              String department,
                              int semester,
                              double feeBalance) {

        super(studentId, studentName, department, semester, feeBalance);

    }

    @Override
    public void calculateScholarship() {

        double scholarship =
                getFeeBalance() * SCHOLARSHIP_PERCENT / 100;

        System.out.println("--------------------------------");
        System.out.println("Student Type      : Scholarship");
        System.out.println("Scholarship       : 50%");
        System.out.println("Scholarship Amt   : ₹" + scholarship);
        System.out.println("Fee To Pay        : ₹" + (getFeeBalance() - scholarship));
        System.out.println("--------------------------------");

    }

}