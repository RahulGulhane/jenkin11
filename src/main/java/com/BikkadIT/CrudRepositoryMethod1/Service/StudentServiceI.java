package com.BikkadIT.CrudRepositoryMethod1.Service;

import java.util.List;

import org.springframework.data.domain.Page;

import com.BikkadIT.CrudRepositoryMethod1.Entites.Student;

public interface StudentServiceI {

	public Student saveStudent(Student stu);
	
	public List<Student> saveAllstudent(List<Student> student);
	
	public List<Student> getAllRecords();
	
	public Student getstuById(int sid);
	
	public List<Student> getRecordsMPK(List<Integer>sid);
	
	public boolean RecordExistOrNot(int sid);
	
	public long CountnoOfRecords();
	
	public boolean deleterecordById(int sid);
	
	public boolean deleterecordsusingMPK(List<Integer> ids); 
	
	public boolean deleterecordsByObject(Student stu);
	
	public boolean deleteAllrecords();
	
	public Page<Student> Pagination();
	
	public List<Student> sortingStudent();
	
	public List<Student> getAllstuCustomQueryHql();
	
	public List<Student> getAllstuCustomQuerysql();
	
	public Student getStudentByIdHql(int Sid);

	public Student getStudentByIdsql(int Sid);
} 	
