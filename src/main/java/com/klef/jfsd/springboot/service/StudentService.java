package com.klef.jfsd.springboot.service;

import com.klef.jfsd.springboot.model.Student;

public interface StudentService
{ 
  public String addstudent(Student s);
  public String updatestudent(Student s);
  public Student viewstudentbyid(int sid);  
  public Student checkstudentlogin(String email,String pwd);
  public String updatePasswordByEmail(String email, String newPassword);
  public Student findByEmail(String email);
  public String studentRegistraion(Student s);
  
}