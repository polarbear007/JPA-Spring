package cn.itcast.spring.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;

import org.springframework.stereotype.Repository;

import cn.itcast.spring.jpa.entity.Student;

// 因为不需要继承  xxxDaoSupport 类，所以这里可以直接使用 @Repository 注解
@Repository
public class StudentDao {

	@PersistenceContext(type=PersistenceContextType.TRANSACTION)
	private EntityManager entityManager;
	
	public void saveStudent(Student stu) {
		entityManager.persist(stu);
		entityManager.close();
		System.out.println(entityManager.contains(stu));
		System.out.println(entityManager.isOpen());
	}
}
