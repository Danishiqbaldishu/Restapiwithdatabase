package com.Springrest.springrest.infomation;

import java.util.List;
import com.Springrest.springrest.Stuinfo.Student;

public interface Information

{
 public List<Student>getStudent();

 public Student getStudents(long studentId);
 
 public String addStudent(Student student);
 
 public String updateinfo (Student student);
  
 public void deleteinfo (long ParseLong);
 
}
