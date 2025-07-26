package com.klef.jfsd.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.model.Teacher;
import com.klef.jfsd.springboot.repository.TeacherRepository;

@Service
public class TeacherServiceImpl implements TeacherService
{

	@Autowired
	private TeacherRepository teacherRepository;
	
	@Override
	public Teacher checkteacherlogin(String username, String password) {
		   return teacherRepository.checkteacherlogin(username, password);
		}

	

	
}