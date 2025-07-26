package com.klef.jfsd.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "reports") // Defines the table name in the database
public class Reports {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the primary key
    @Column(name = "report_id") // Maps to the report_id column in the table
    private Long reportId;

    @ManyToOne
    @JoinColumn(name = "sid", nullable = false) // Foreign key to the students table
    private Student student;

    @ManyToOne
    @JoinColumn(name = "cid", nullable = false) // Foreign key to the courses table
    private Course course;

    @ManyToOne
    @JoinColumn(name = "mid", nullable = false) // Foreign key to the marks table
    private Marks marks;

    @Column(name = "remarks") // General remarks for the report
    private String remarks;

    @Column(name = "teacher_remarks") // Teacher-specific comments/remarks
    private String teacherRemarks;

    @Column(name = "percentage") // Percentage calculated based on marks
    private Double percentage;

    // Default constructor
    public Reports() {}

    // Parameterized constructor
    public Reports(Student student, Course course, Marks marks, String remarks, String teacherRemarks) {
        this.student = student;
        this.course = course;
        this.marks = marks;
        this.remarks = remarks;
        this.teacherRemarks = teacherRemarks;
        this.percentage = calculatePercentage(marks.getMarksObtained(), marks.getTotalMarks());
    }

    // Method to calculate percentage
    private Double calculatePercentage(Double marksObtained, Double totalMarks) {
        if (totalMarks != 0) {
            return (marksObtained / totalMarks) * 100;
        }
        return 0.0;
    }

    // Getters and Setters
    public Long getReportId() {
        return reportId;
    }

    public void setReportId(Long reportId) {
        this.reportId = reportId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Marks getMarks() {
        return marks;
    }

    public void setMarks(Marks marks) {
        this.marks = marks;
        this.percentage = calculatePercentage(marks.getMarksObtained(), marks.getTotalMarks());
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getTeacherRemarks() {
        return teacherRemarks;
    }

    public void setTeacherRemarks(String teacherRemarks) {
        this.teacherRemarks = teacherRemarks;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    // Override toString for debugging and better output
    @Override
    public String toString() {
        return "Reports{" +
                "reportId=" + reportId +
                ", student=" + student +
                ", course=" + course +
                ", marks=" + marks +
                ", remarks='" + remarks + '\'' +
                ", teacherRemarks='" + teacherRemarks + '\'' +
                ", percentage=" + percentage +
                '}';
    }
}
