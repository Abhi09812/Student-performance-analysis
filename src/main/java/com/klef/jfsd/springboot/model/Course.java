package com.klef.jfsd.springboot.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="course_table")
public class Course
{
  @Override
	public String toString() {
		return "Course [courseid=" + courseid + ", coursetitle=" + coursetitle + ", coursedescription="
				+ coursedescription + ", coursemarks=" + coursemarks + ", image=" + image + "]";
	}
@Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int courseid;
  public int getCourseid() {
	return courseid;
}
public void setCourseid(int courseid) {
	this.courseid = courseid;
}
public String getCoursetitle() {
	return coursetitle;
}
public void setCoursetitle(String coursetitle) {
	this.coursetitle = coursetitle;
}
public String getCoursedescription() {
	return coursedescription;
}
public void setCoursedescription(String coursedescription) {
	this.coursedescription = coursedescription;
}
public int getCoursemarks() {
	return coursemarks;
}
public void setCoursemarks(int coursemarks) {
	this.coursemarks = coursemarks;
}
public Blob getImage() {
	return image;
}
public void setImage(Blob image) {
	this.image = image;
}
@Column(name = "ctitle",length = 50,unique = true,nullable = false)
  private String coursetitle;
  @Column(name = "cdescription",length = 50,unique = true,nullable = false)
  private String coursedescription;
  @Column(name = "cmarks",length = 50,unique = true,nullable = false)
  private int coursemarks;
  @Column(name="cimage",nullable = false)
  private Blob image;
}
