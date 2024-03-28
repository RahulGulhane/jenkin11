package com.BikkadIT.CrudRepositoryMethod1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.web.servlet.mvc.Controller;

import com.BikkadIT.CrudRepositoryMethod1.Controller.StudentController;
import com.BikkadIT.CrudRepositoryMethod1.Entites.Student;

@SpringBootApplication
public class CrudRepositoryMethods1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(CrudRepositoryMethods1Application.class, args);
	//****************SaveMetnod**********************//
		
		StudentController controller = context.getBean(StudentController.class);
//	    Student stu = new Student();
//		stu.setRollno(11);
//	    stu.setName("Santosh");
//		stu.setAddr("lonavla");
//		stu.setPanNo("123545");
//		
//		Student saveStudent = controller.saveStudent(stu);
//		System.out.println(saveStudent);
//		
		//***************SaveALLMethod*******************?//
	
		
//		Student stu1 = new Student();
//		stu1.setRollno(123);
//		stu1.setName("Anurag");
//		stu1.setAddr("pune");
//		stu1.setPanNo("1235sdf");
//		
//		Student stu2 = new Student();
//		stu2.setRollno(134);
//		stu2.setName("dhrvu");
//		stu2.setAddr("Amravati");
//		stu2.setPanNo("123545fszdc");
//		
//		Student stu3 = new Student();
//		stu3.setRollno(1433);
//		stu3.setName("Anikets");
//		stu3.setAddr("Lonavala");
//		stu3.setPanNo("123545dfdfg");
//		
//		List list = new ArrayList<>();
//		list.add(stu1);
//		list.add(stu2);
//		list.add(stu3);
//
//		List<Student> list1 = controller.saveAllstu(list);
//		System.out.println(list1);
		
		//*************FindByIdMethod  ***************??
	
//	List<Student> allStudent = controller.getAllStudent();
//		
//		System.out.println(allStudent);
//		
//		for(Student stu:allStudent) {
//			System.out.println(stu);
//		}
		
		
		//********************FindBYIDMethod*******************//
			
		
//				Student stuById = controller.getstuById(11);
//				System.out.println(stuById);
//	}
		//****************findAllBYID*****************************//
		
//		List list = new ArrayList();
//		list.add(123);
//		list.add(11);
//		list.add(12);
//		
//		List<Student>allRecordsMPK = controller.getAllRecordsMPK(list);
//		System.out.println(allRecordsMPK);
//	}
	//	******************RecordsExistOrNot***************************//
		
//		boolean recordExistOrNot = controller.RecordExistOrNot(11);
//		System.out.println(recordExistOrNot);
//   }
		
		//***********************CountMethod**************************//
//		
//		long countnoOfRecords = controller.CountnoOfRecords();
//		System.out.println(countnoOfRecords);
		
		//*********************DeleteMethod*************************//
		
//		 boolean deleterecordById = controller.deleterecordById(123);
//		 System.out.println(deleterecordById);
//		
	
	//*******************DeleteALLByID****************************//
		
//		List list = new ArrayList();
//	
//		list.add(11);
//		list.add(12);
//		
//		
//		
//		boolean deleterecordsusingMPK = controller.deleterecordsusingMPK(list);
//		System.out.println(deleterecordsusingMPK);
//	
	//***********************Delete StudentById******************//
		
		
//		Student stu = new Student();
//		stu.setRollno(14);
//		
//		
//	boolean deleterecordsByObject = controller.deleterecordsByObject(stu);
//	System.out.println(deleterecordsByObject);
		
	//**********************DeleteAllRecordsMethods*******************//
		
//		boolean deleteAllrecords = controller.deleteAllrecords();
//		System.out.println(deleteAllrecords);
	
	//************************pagenation oprationMethod of JPA Repository**************//
//		
//		Page<Student> pagination = controller.Pagination();
//		
//		for(Student stu: pagination.getContent()) {
//			System.out.println(stu);
//		}
	
		
		//**************************SortingOperation*********************//
//		
//		List<Student> sortingStudent = controller.sortingStudent();
//		for(Student stu:sortingStudent) {
//			System.out.println(stu);
//		}
	
//	List<Student> allstuCustomQueryHql = controller.getAllstuCustomQueryHql();
//	System.out.println(allstuCustomQueryHql);
//	
//	
//		
//	List<Student> allstuCustomQuerysql = controller.getAllstuCustomQuerysql();
//	System.out.println(allstuCustomQuerysql);

		
		Student studentByIdHql = controller.getStudentByIdHql(1);
		System.out.println(studentByIdHql);
		
		
		Student studentByIdsql = controller.getStudentByIdsql(2);
		System.out.println(studentByIdsql);
		
	}	    
}
	