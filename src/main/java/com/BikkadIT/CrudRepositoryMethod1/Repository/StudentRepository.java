package com.BikkadIT.CrudRepositoryMethod1.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadIT.CrudRepositoryMethod1.Entites.Student;
@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	@Query("from Student")
	public List<Student> getAllStudent();
	
	@Query(value="select * From  student_dlts ",nativeQuery = true)
	public List<Student> getAllStudentssql();
	
	@Query("from Student where rollno = :rollno")
	public Student getStudentByRollnoHql(int rollno);
	
	@Query(value="select * From  student_dlts where stu_rollno =:rollno",nativeQuery = true)
	public Student getStudentByRollnosql(int rollno);
	
}
