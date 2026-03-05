
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Grades {
    private int grade;
    private int passingGrade;
    private ArrayList<Integer> grades;
    private ArrayList<Integer> passingGrades;
    
    public Grades() {
        this.grade = 0;
        this.passingGrade = 0;
        this.grades = new ArrayList<>();
        this.passingGrades = new ArrayList<>();
    }
    
    public void add(int grade) {
        if (grade >= 50) {
            this.passingGrades.add(grade);
            this.passingGrade += grade;
        }
        this.grades.add(grade);
        this.grade += grade;
    }
    
    public double average() {
        if (this.grades.size() == 0) {
            return 0;
        }
        return 1.0 * this.grade / this.grades.size();
    }
    
    public double passingAverage() {
        if (this.passingGrades.size() == 0) {
            return 0;
        }
        return 1.0 * this.passingGrade / this.passingGrades.size();
    }
    
    public double passPercentage() {
        if (this.passingGrades.size() == 0) {
            return 0.0;
        }
        return 100.0 * this.passingGrades.size() / this.grades.size();
    }
}
