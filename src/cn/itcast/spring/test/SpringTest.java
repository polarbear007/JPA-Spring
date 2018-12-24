package cn.itcast.spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.spring.jpa.entity.Student;
import cn.itcast.spring.jpa.service.StudentService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class SpringTest {
	@Autowired
	private StudentService service;
	
	@Test
	public void test() throws Exception {
		Student stu = new Student();
		stu.setSname("eric");
		stu.setAge(12);
		service.saveStudent(stu);
	}
}
