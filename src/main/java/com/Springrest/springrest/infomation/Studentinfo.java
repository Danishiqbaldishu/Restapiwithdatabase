package com.Springrest.springrest.infomation;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Springrest.springrest.Stuinfo.Student;
import com.Springrest.springrest.dao.Studentdao;

@Service
public class Studentinfo implements Information {
	
	@Autowired
	private Studentdao studentDao;

	//private static final Stream<Student> Collerctors = null;
	//List<Student> list;
	
	public Studentinfo()
	{
	 // list = new ArrayList<>();
	  {
//		 list.add(new Student(123,"Danish","Noida")); 
//		 list.add(new Student(456,"Ashish","Hydrabad")); 
//		 list.add(new Student(789,"Pankaj","Ghazipur")); 
//		 list.add(new Student(111,"Anas","Delhi")); 
//		 list.add(new Student(222,"Arish","Mumbai")); 
	  }
	}
	
	
//	@Override
	public List<Student> getStudent() 
	{
		return studentDao.findAll();
	}


	@Override
	public Student getStudents(long studentId) {
//		Student c= null;
//		for (Student Student:list)
//		{
//			if(Student.getId() == studentId)
//			{
//				c= Student;
//				break;
//			}
//		}
		return studentDao.getOne(studentId);
	}


	@Override
	public String addStudent(Student student) {
	//	list.add(student);
		List<Student> stu1= studentDao.findByEmail(student.getEmail());
		if(stu1.isEmpty()) {
		studentDao.save(student);
		return "Data Save Successfully";
		}return "Email already exist";
	}


	@Override
	public String updateinfo(Student student) 
	{
//		list.forEach( e ->{
//			if(e.getId() == student.getId())
//			{
//				e.setId(student.getId());
//				e.setName( student.getName());
//				e.setAddress(student.getAddress());
//			}			
//		});
		List<Student> stu1= studentDao.findByEmail(student.getEmail());
		if(stu1.isEmpty()) {
		studentDao.save(student);
		return "Data update";
		}return "Email already exist";
	} 


	@Override
	public void deleteinfo(long ParseLong) {
	//	list=this.list.stream().filter(e->e.getId()!= ParseLong).collect(.toList());
		Student Entity = studentDao.getOne(ParseLong);
		studentDao.delete(Entity);
	}


	


	




	
	
	
	
	
	
	
	
	
	
	
	

}
