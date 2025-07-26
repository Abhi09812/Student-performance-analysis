package com.klef.jfsd.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.klef.jfsd.springboot.model.Teacher;

@Repository
public interface TeacherRepository extends JpaRepository<Teacher, Integer> {
	@Query("select a from Teacher a where a.username=?1 and a.password=?2 ")
	public Teacher checkteacherlogin(String uname, String pwd);

	@Modifying
	@Transactional // commit changes
	@Query("update Student s set s.status=?2 where s.id=?1")
	public int updatestatus(int sid, String status);

}