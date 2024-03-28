package com.BikkadIT.CrudRepositoryMethod1.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.BikkadIT.CrudRepositoryMethod1.Entites.Student;
import com.BikkadIT.CrudRepositoryMethod1.Repository.StudentRepository;
// ***** saveMethod******//
@Service
public class StudentServiceImpl implements StudentServiceI {
	
	@Autowired
	 private StudentRepository studentRepository;


	@Override
	public Student saveStudent(Student stu) {
		Student student = studentRepository.save(stu);
		
		return student;
	}

		//******saveAllMethod******//
	@Override
	public List<Student> saveAllstudent(List<Student> student) {
		List<Student> saveAll = (List<Student>) studentRepository.saveAll(student);
		return saveAll;
	}
		//************ GetAllMethod*************//

		@Override
		public List<Student> getAllRecords() {
			
			List<Student> findAll = (List<Student>) studentRepository.findAll();
			
			return findAll;
		}
			//******************FindByIdMethod****************//

		@Override
		public Student getstuById(int sid) {
			
			Student findbyId = studentRepository.findById(sid).get();
			
				return findbyId ;
		}
		//****************FindAllByID*************************//
		@Override
		public List<Student> getRecordsMPK(List<Integer> sid) {
			List<Student> findallById = (List<Student>) studentRepository.findAllById(sid);
			return findallById;
		}
		//*************************ExistByID**************************************//

		@Override
		public boolean RecordExistOrNot(int sid) {
			boolean existsById = studentRepository.existsById(sid);
			return existsById;
		}
		//****************************CountMethod*****************************//

		@Override
		public long CountnoOfRecords() {
			long count = studentRepository.count();
			return count;
		}
		 //*****************************DeleteById*******************//

		@Override
		public boolean deleterecordById(int sid) {
		boolean existsById = studentRepository.existsById(sid);
			
		if( existsById) {
		studentRepository.deleteById(sid);
			return true;
		}else
		{
			return false;
		   }
		}
		//**************DeletAllBYID************************//

		@Override
		public boolean deleterecordsusingMPK(List<Integer> ids) {
			List<Student> findallById = (List<Student>) studentRepository.findAllById(ids);
			if(findallById.isEmpty())
			{
				return true;
		    }else
		    	{
			  studentRepository.deleteAllById(ids);
			  return true ;
		    	}
		
		}

		@Override
		public boolean deleterecordsByObject(Student stu) {
			int rollno = stu.getRollno();
			Student findbyId = studentRepository.findById(rollno).get(); 
			
			if(findbyId != null) {
			studentRepository.delete(stu);
			return true;
			}else
			{
				return false;
			}
		}
		//	**********************DeleteAllRecords**************//
		@Override
		public boolean deleteAllrecords() {
			
			List<Student> findall = (List<Student>) studentRepository.findAll();
			
			if(findall.isEmpty()) {
			
			return false;
			}else {
				studentRepository.delete(null);
				return true;
			}
		}
//************************PaginationOpration(JPA Repository Methods)*************************************

		@Override
		public Page<Student> Pagination() {
			PageRequest of = PageRequest.of(0, 3);
			Page<Student> findall = studentRepository.findAll(of);
			return findall;
		}
//***********************SortingOperaation(******||*******)****************//
		@Override
		public List<Student> sortingStudent() {
			List<Student> findall = studentRepository.findAll(Sort.by("panNo").descending());
			return findall;
		}
		//**************************who to Convert Hql Query****************//
		@Override
		public List<Student> getAllstuCustomQueryHql() {
			List<Student> allStudent = studentRepository.getAllStudent(); 
			return allStudent;
		}
		//***************************Who to Convert Sql Query*******************//
		
		@Override
		public List<Student> getAllstuCustomQuerysql() {
			List<Student> allStudentssql = studentRepository.getAllStudentssql();
			return allStudentssql;
		}
//*******************2nd example of Hql ***************************************
		@Override
		public Student getStudentByIdHql(int rollno) {
			Student studentByRollnoHql = studentRepository.getStudentByRollnoHql(rollno);
			return studentByRollnoHql;
		}
//************************2nd example of Sql***********************************
		@Override
		public Student getStudentByIdsql(int rollno) {
			Student studentByRollnosql = studentRepository.getStudentByRollnosql(rollno);
			return studentByRollnosql;
		}
		

				
}
