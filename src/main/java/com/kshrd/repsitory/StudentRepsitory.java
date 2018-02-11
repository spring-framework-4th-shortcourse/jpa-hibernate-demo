package com.kshrd.repsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.kshrd.entity.Student;

@Repository
public interface StudentRepsitory extends JpaRepository<Student, Integer>{
	
}
