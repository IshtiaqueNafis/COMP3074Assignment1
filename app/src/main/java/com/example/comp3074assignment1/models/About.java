package com.example.comp3074assignment1.models;

public class About {

    //region ***properties ***
    private int imageId;
    private int studentNameId;
    private int studentId;
    private Choice githubChoice;
    private Choice schoolWebChoice;
    private Choice schoolMapChoice;
    //endregion

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

    public Choice getGithubChoice() {
        return githubChoice;
    }

    public void setGithubChoice(Choice githubChoice) {
        this.githubChoice = githubChoice;
    }

    public Choice getSchoolWebChoice() {
        return schoolWebChoice;
    }

    public void setSchoolWebChoice(Choice schoolWebChoice) {
        this.schoolWebChoice = schoolWebChoice;
    }

    public Choice getSchoolMapChoice() {
        return schoolMapChoice;
    }

    public void setSchoolMapChoice(Choice schoolMapChoice) {
        this.schoolMapChoice = schoolMapChoice;
    }
    //endregion

    //region ***Constructors ***
    public About() {
    }

    public About(int imageId, int studentNameId, int studentId) {
        this.imageId = imageId;
        this.studentNameId = studentNameId;
        this.studentId = studentId;
    }

    public About(int imageId, int studentNameId, int studentId, Choice githubChoice, Choice schoolWebChoice, Choice schoolMapChoice) {
        this.imageId = imageId;
        this.studentNameId = studentNameId;
        this.studentId = studentId;
        this.githubChoice = githubChoice;
        this.schoolWebChoice = schoolWebChoice;
        this.schoolMapChoice = schoolMapChoice;
    }
    //endregion


}
