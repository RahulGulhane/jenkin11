package com.BikkadIT.CrudRepositoryMethod1.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;

import com.BikkadIT.CrudRepositoryMethod1.Entites.Student;
import com.BikkadIT.CrudRepositoryMethod1.Service.StudentServiceI;

@Controller
public class StudentController {

	@Autowired
	private StudentServiceI studentServiceI;
	
	public Student saveStudent(Student stu) {
		
		 Student student = studentServiceI.saveStudent(stu);
		
		 return student;
	}
	
	
	public List<Student> saveAllstu(List<Student>list){
		
		List<Student> saveAllstudent = studentServiceI.saveAllstudent(list);
		
		return saveAllstudent;
		
	}
	
	public List<Student> getAllStudent(){
		
		List<Student> allRecords = studentServiceI.getAllRecords();
		
		return allRecords;
		
	}
	public Student getstuById(int sid) {
		
		Student stuById = studentServiceI.getstuById(sid);
		
		return stuById;
		
	}
	public List<Student> getAllRecordsMPK(List<Integer> ids){
		
		List<Student> allRecords = studentServiceI.getRecordsMPK(ids);
		
		return allRecords;
		
	}
	public boolean RecordExistOrNot(int sid) {
		boolean recordExistOrNot = studentServiceI.RecordExistOrNot(sid);
		return recordExistOrNot;
		
	}
	public long CountnoOfRecords() {
		long countnoOfRecords = studentServiceI.CountnoOfRecords();  
		return countnoOfRecords;
		
	}
	public boolean deleterecordById(int sid) {
		boolean deleterecordById = studentServiceI.deleterecordById(sid);
		return deleterecordById;
		
	}
	public boolean deleterecordsusingMPK(List<Integer> ids) {
		boolean deleterecordsusingMPK = studentServiceI.deleterecordsusingMPK(ids);
		return deleterecordsusingMPK ;
		
	}
	public boolean deleterecordsByObject(Student stu) {
		
		boolean deleterecordsByObject = studentServiceI.deleterecordsByObject(stu);
		return deleterecordsByObject;
		
	}
	public boolean deleteAllrecords() {
		boolean deleteAllrecords = studentServiceI.deleteAllrecords();
		return deleteAllrecords ;
		
	}
	public Page<Student> Pagination(){
		Page<Student> findAll = studentServiceI.Pagination();
		return findAll;
		
	}
	public List<Student> sortingStudent(){
		List<Student> sortingStudent = studentServiceI.sortingStudent();
		return sortingStudent;
		
	}
	
	public List<Student> getAllstuCustomQueryHql(){
		
		List<Student> allstuCustomQueryHql = studentServiceI.getAllstuCustomQueryHql();
		
		return allstuCustomQueryHql;
		
	}
	
	public List<Student> getAllstuCustomQuerysql(){
		
		List<Student> allstuCustomQuerysql = studentServiceI.getAllstuCustomQuerysql();
		return allstuCustomQuerysql ;
		
	}
	
	public Student getStudentByIdHql(int rollno) {
		Student studentByIdHql = studentServiceI.getStudentByIdHql(rollno);
		return studentByIdHql;
		
		
	}
	public Student getStudentByIdsql(int rollno) {
		
		Student studentByIdsql = studentServiceI.getStudentByIdsql(rollno);
		return studentByIdsql;
		
	}
	
}
