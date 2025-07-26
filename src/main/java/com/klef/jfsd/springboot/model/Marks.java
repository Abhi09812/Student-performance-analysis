package com.klef.jfsd.springboot.model;


import jakarta.persistence.*;

@Entity
@Table(name = "marks") // Defines the table name in the database
public class Marks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the primary key
    @Column(name = "mid") // Maps to the marks_id column in the table
    private Long id;

    @Column(name = "mremarks") // Maps to the marks_id column in the table
    private String remarks;

    @ManyToOne
    @JoinColumn(name = "sid", nullable = false) // Foreign key to the students table
    private Student student;

    @ManyToOne
    @JoinColumn(name = "cid", nullable = false) // Foreign key to the courses table
    private Course course;

    @Column(name = "mobtained", nullable = false) // Column to store marks scored
    private Double marksObtained;

    @Column(name = "mtotal", nullable = false) // Column to store total marks
    private Double totalMarks;

    // Default constructor
    public Marks() {}

    // Parameterized constructor
    public Marks(Student s, Course c, String mremarks, Double mObtained, Double mtotal) {
        this.student = s;
        this.course = c;
        this.remarks = mremarks;
        this.marksObtained = mObtained;
        this.totalMarks = mtotal;
        
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
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

    public Double getMarksObtained() {
        return marksObtained;
    }

    public void setMarksObtained(Double marksObtained) {
        this.marksObtained = marksObtained;
    }

    public Double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(Double totalMarks) {
        this.totalMarks = totalMarks;
    }

    // Override toString for debugging
    @Override
    public String toString() {
        return "Marks{" +
        		"id=" + id +
                "remarks=" + remarks +
                ", student=" + student +
                ", course=" + course +
                ", marksObtained=" + marksObtained +
                ", totalMarks=" + totalMarks +
                '}';
    }
}
