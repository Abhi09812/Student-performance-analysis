package com.klef.jfsd.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.klef.jfsd.springboot.model.Teacher;
import com.klef.jfsd.springboot.service.TeacherService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
public class TeacherController<Student> {
  
  @Autowired
  private TeacherService teacherService;
  
  @GetMapping("/")
  public ModelAndView home()
  {
    ModelAndView mv=new ModelAndView("index");
    return mv;
  }
  
  @GetMapping("teacherhome")
  public ModelAndView teacherhome()
  {
    ModelAndView mv=new ModelAndView("teacher-dashboard");
    return mv;
  }
  
  @GetMapping("teacherlogin")
	public ModelAndView teacherlogin() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("teacherlogin");
		return mv;
	}
	@GetMapping("logout")
	public String teacherLogout(HttpServletRequest request) {
		// Invalidate the session
		request.getSession().invalidate();

		// Redirect to the login page
		return "redirect:/teacherlogin";
	}

	
	@PostMapping("checkteacherlogin")
	public ModelAndView checkteacherlogin(HttpServletRequest request) {
		String uname = request.getParameter("uname");
		String pwd = request.getParameter("pwd");

		Teacher a = teacherService.checkteacherlogin(uname, pwd);
		ModelAndView mv = new ModelAndView();
		if (a != null) {

			request.getSession().setAttribute("user", a);

			mv.setViewName("teacher-dashboard");

		} else {
			mv.setViewName("teacherlogin");
			mv.addObject("message", "Login Failed");
		}
		return mv;
	}
	

}