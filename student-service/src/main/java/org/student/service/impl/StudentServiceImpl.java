package org.student.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.student.bean.Student;
import org.student.service.StudentService;
import org.student.service.mapper.StudentMapper;

@Service("studentService")
public class StudentServiceImpl implements StudentService{

	@Resource
	private StudentMapper studentMapper;
	
	@Override
	public List<Student> listStudent() {
		List<Student> listStudent = studentMapper.listStudent();
		return listStudent;
	}

}
