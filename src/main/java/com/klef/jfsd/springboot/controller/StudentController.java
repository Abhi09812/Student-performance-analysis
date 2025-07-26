package com.klef.jfsd.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.service.StudentService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class StudentController {
  
  @Autowired
  private StudentService studentService;
  
  @GetMapping("/studenthome")
  public ModelAndView studentHome() {
    ModelAndView mv = new ModelAndView("student-dashboard");
    return mv;
  }
  @GetMapping("/studentregister")
  public String showStudentRegisterPage() {
      return "student-registration-form"; // The JSP file name (without .jsp)
  }

 
 @PostMapping("insertstudent")
  public ModelAndView insertstudent(HttpServletRequest request)
  {
   String name = request.getParameter("sname");
   String gender = request.getParameter("sgender");
   String dob = request.getParameter("sdob");
   String email = request.getParameter("semail");
   String password = request.getParameter("spwd");
   String contact = request.getParameter("scontact");
   String status = "Registered";
   String gradeLevel = request.getParameter("sgradelevel");
   
     Student student = new Student();
     student.setName(name);
     student.setGender(gender);
     student.setDateofbirth(dob);
     student.setEmail(email);
     student.setPassword(password);
     student.setContact(contact);
     student.setStatus(status);
     student.setGradeLevel(gradeLevel);
     String msg = studentService.studentRegistraion(student);
     if (gradeLevel == null || gradeLevel.isEmpty()) {
         gradeLevel = "Grade 1"; // Default value
     }
     student.setGradeLevel(gradeLevel);


     ModelAndView mv = new ModelAndView("student-login");
     mv.addObject("message", msg);
   
     return mv;

  }
 
  
  @GetMapping("studentlogin")
  public ModelAndView studentLogin() {
    ModelAndView mv = new ModelAndView();
    mv.setViewName("student-login");
    return mv;
  }
  
  @PostMapping("checkStudentLogin")
  public ModelAndView checkStudentLogin(HttpServletRequest request) {
    ModelAndView mv = new ModelAndView();
    String email = request.getParameter("email");
    String password = request.getParameter("password");
    
    Student student = studentService.checkstudentlogin(email, password);
    
    if (student != null) {
      mv.setViewName("student-dashboard");
    } else {
      mv.setViewName("studentloginfail");
      mv.addObject("message", "Login Failed! Please try again.");
    }
    return mv;
  }
  
  @GetMapping("viewStudentDetails")
  public ModelAndView viewStudentDetails(HttpServletRequest request) {
    ModelAndView mv = new ModelAndView("student-details");
    String email = request.getParameter("email");
    Student student = studentService.findByEmail(email);
    if (student != null) {
      mv.addObject("student", student);
    } else {
      mv.addObject("message", "No student found with the given email.");
    }
    return mv;
  }
}

