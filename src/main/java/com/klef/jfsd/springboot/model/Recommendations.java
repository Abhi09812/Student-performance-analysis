package com.klef.jfsd.springboot.model;

import jakarta.persistence.*;

@Entity
@Table(name = "recommendations") // Defines the table name in the database
public class Recommendations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-generates the primary key
    @Column(name = "rid") // Maps to the recommendation_id column in the table
    private Long recommendationId;

    @ManyToOne
    @JoinColumn(name = "sid", nullable = false) // Foreign key to the students table
    private Student student;

    @Column(name = "ctitle", nullable = false)
    private String coursetitle;

    @Column(name = "rtext", nullable = false, length = 1000) // Detailed recommendation
    private String recommendationText;

    // Default constructor
    public Recommendations() {}

    // Parameterized constructor
    public Recommendations(Student s, String c, String r) {
        this.student = s;
        this.coursetitle = c;
        this.recommendationText = r;
    }

    // Getters and Setters
    public Long getRecommendationId() {
        return recommendationId;
    }

    public void setRecommendationId(Long recommendationId) {
        this.recommendationId = recommendationId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public String getCourse() {
        return coursetitle;
    }

    public void setCourse(String coursetitle) {
        this.coursetitle = coursetitle;
    }

    public String getRecommendationText() {
        return recommendationText;
    }

    public void setRecommendationText(String recommendationText) {
        this.recommendationText = recommendationText;
    }

    // Override toString for debugging
    @Override
    public String toString() {
        return "Recommendations{" +
                "recommendationId=" + recommendationId +
                ", student=" + student +
                ", coursetitle='" + coursetitle + '\'' +
                ", recommendationText='" + recommendationText + '\'' +
                '}';
    }
}