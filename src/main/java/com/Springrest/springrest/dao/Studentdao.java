package com.Springrest.springrest.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.Springrest.springrest.Stuinfo.Student;

@Repository
public interface Studentdao extends JpaRepository<Student, Long> 
{
 List<Student>findByEmail(String email);
}