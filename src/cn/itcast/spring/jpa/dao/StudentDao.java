package cn.itcast.spring.jpa.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import cn.itcast.spring.jpa.entity.Student;

// 因为不需要继承  xxxDaoSupport 类，所以这里可以直接使用 @Repository 注解
@Repository
public class StudentDao {
	// 注意： spring 并没有为 jpa 提供模板对象，因为 jpa 本身就可以算是一个统一的模板了
	// 我们需要在 dao 层注入一个 entityManager 对象
	// 注入的思路有两种：
	//   第一种： 注入 EntityManagerFactory 对象，再通过这个对象去创建 entityManager 对象【了解一下就好】
	//   第二种： 直接声明一个 entityManager 成员变量，然后在上面添加 @PersistenceContext 注解【推荐】
	@PersistenceContext
	private EntityManager entityManager;
	
	public void saveStudent(Student stu) {
		entityManager.persist(stu);
	}
}
