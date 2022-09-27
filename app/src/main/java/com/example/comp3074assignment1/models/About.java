package com.example.comp3074assignment1.models;

public class About {
    private int imageId;
    private int studentNameId;
    private int studentId;

    public About() {
    }

    public About(int imageId, int studentNameId, int studentId) {
        this.imageId = imageId;
        this.studentNameId = studentNameId;
        this.studentId = studentId;
    }

    //region *** getter & setter ***
    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getStudentNameId() {
        return studentNameId;
    }

    public void setStudentNameId(int studentNameId) {
        this.studentNameId = studentNameId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    //endregion
}
