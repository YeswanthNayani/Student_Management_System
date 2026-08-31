package com.sms;

public abstract class Student {

    private String studentId;
    private String studentName;
    private String department;
    private int semester;
    private double feeBalance;

    public Student(String studentId, String studentName,
                   String department, int semester,
                   double feeBalance) {

        this.studentId = studentId;
        this.studentName = studentName; 
        this.department = department;
        this.semester = semester;
        this.feeBalance = feeBalance;
    }

    

    // Pay Fee

    public String getStudentId() {
		return studentId;
	}



	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}



	public String getStudentName() {
		return studentName;
	}



	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}



	public String getDepartment() {
		return department;
	}



	public void setDepartment(String department) {
		this.department = department;
	}



	public int getSemester() {
		return semester;
	}



	public void setSemester(int semester) {
		this.semester = semester;
	}



	public double getFeeBalance() {
		return feeBalance;
	}



	public void setFeeBalance(double feeBalance) {
		this.feeBalance = feeBalance;
	}



	public void payFee(double amount) {

        if(amount <= 0) {
            System.out.println("Invalid Amount!");
            return;
        }

        if(amount > feeBalance) {
            System.out.println("Amount exceeds remaining fee.");
            return;
        }

        feeBalance -= amount;

        System.out.println("--------------------------------");
        System.out.println("Fee Paid Successfully.");
        System.out.println("Remaining Fee : ₹" + feeBalance);
        System.out.println("--------------------------------");
    }

    // Abstract Method

    public abstract void calculateScholarship();

    @Override
    public String toString() {

        return "\n--------------------------------------"
                + "\nStudent ID      : " + studentId
                + "\nStudent Name    : " + studentName
                + "\nDepartment      : " + department
                + "\nSemester        : " + semester
                + "\nFee Balance     : ₹" + feeBalance
                + "\n--------------------------------------";
    }

}