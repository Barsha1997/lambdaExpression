package com.learn.assignment.arraylist;

public class Student {
    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", marksScore=" + marksScore +
                ", rollNo=" + rollNo +
                '}';
    }

    private int stdId;
    private String stdName;
    private float marksScore;
    private int rollNo;

    public Student(int stdId, String stdName, float marksScore, int rollNo) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.marksScore = marksScore;
        this.rollNo = rollNo;
    }



    public int getStdId() {
        return stdId;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public float getMarksScore() {
        return marksScore;
    }

    public void setMarksScore(float marksScore) {
        this.marksScore = marksScore;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }



}
