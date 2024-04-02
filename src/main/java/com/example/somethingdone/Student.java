package com.example.somethingdone;

import jakarta.persistence.*;

@Entity
@Table(name = "Studentslist")

public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int RollNo;
    @Column(name = "Student_Name")
    private String Name;

    @Column(name = "Department")
    private String Department;
    @Column(name = "Date_Of_Birth")
    private String DOB;
    @Column(name = "Blood_Group")
    private String bloodGroup;

    public Student() {

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRollNo() {
        return RollNo;
    }

    public void setRollNo(String rollNo) {
        RollNo = Integer.parseInt(rollNo);
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(String bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public Student(int rollNo, String name, String department, String DOB, String bloodGroup) {
       this. RollNo = rollNo;
        this.Name = name;
       this. Department = department;
        this.DOB = DOB;
        this.bloodGroup = bloodGroup;
    }

    @Override
    public String toString() {
        return "Student{" +
                "RollNo=" + RollNo +
                ", Name='" + Name + '\'' +
                ", Department='" + Department + '\'' +
                ", DOB='" + DOB + '\'' +
                ", bloodGroup='" + bloodGroup + '\'' +
                '}';
    }
}


