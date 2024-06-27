package edu.cjc.main.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.cjc.main.model.Student;
import edu.cjc.main.repository.StudentRepository;
import edu.cjc.main.service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {

	@Autowired private StudentRepository sr;
	
	@Override
	public void saveStudentDetails(Student st) {
		
		sr.save(st);
	}

}
