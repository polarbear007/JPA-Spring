package cn.itcast.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.spring.jpa.dao.StudentDao;
import cn.itcast.spring.jpa.entity.Student;

@Service
public class StudentService {
	@Autowired
	private StudentDao studentDao;
	
	// 如果dao 的方法有涉及 增、删、改， 那么一定要在 service 层添加事务 
	@Transactional
	public void saveStudent(Student stu) {
		studentDao.saveStudent(stu);
	}
}
