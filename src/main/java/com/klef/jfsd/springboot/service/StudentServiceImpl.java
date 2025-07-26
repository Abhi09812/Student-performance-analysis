 package com.klef.jfsd.springboot.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.jfsd.springboot.model.Student;
import com.klef.jfsd.springboot.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public String addstudent(Student s) {
		studentRepository.save(s);
		return "Enter OTP We Sent to Your Mail for Account Confirmation";
	}

	@Override
	public String updatestudent(Student s) {
		Student e = studentRepository.findById(s.getId()).get();

		e.setName(s.getName());
		e.setGender(s.getGender());
		e.setEmail(s.getEmail());
		e.setDateofbirth(s.getDateofbirth());
		e.setPassword(s.getPassword());
		e.setContact(s.getContact());
		e.setStatus(s.getStatus());
		
	

		// Check if a new profile image is provided

		studentRepository.save(e);

		return "Student Updated Successfully";
	}

	@Override
	public Student checkstudentlogin(String email, String pwd) {
		return studentRepository.checkstudentlogin(email, pwd);
	}

	@Override
	public Student viewstudentbyid(int sid) {
		Optional<Student> obj = studentRepository.findById(sid);

		if (obj.isPresent()) {
			Student s = obj.get();

			return s;
		} else {
			return null;
		}
	}
	
	@Override
	  public Student findByEmail(String email) {
	    return studentRepository.findByEmail(email);
	  }

	    @Override
	      public String updatePasswordByEmail(String email, String newPassword) {
	          Student student = studentRepository.findByEmail(email);
	          if (student != null) {
	              student.setPassword(newPassword);
	              studentRepository.save(student);
	              return "Student Updated Successfully";
	          } else {
	              return "Student with provided email not found";
	          }
	      }

		@Override
		public String studentRegistraion(Student s) {
			studentRepository.save(s);
			return "Student Registered Succesfully" ;
		}
}