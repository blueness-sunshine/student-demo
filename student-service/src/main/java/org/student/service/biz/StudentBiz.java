package org.student.service.biz;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.student.api.StudentApi;
import org.student.api.dto.StudentDTO;
import org.student.bean.Student;
import org.student.service.StudentService;

import com.google.common.collect.Lists;

@Service("studentApi")
public class StudentBiz implements StudentApi{
	private Logger logger = LoggerFactory.getLogger(StudentBiz.class);
	
	@Autowired
	private StudentService studentService;
	
	@Override
	public List<StudentDTO> listStudents() {
		List<Student> listStudent = studentService.listStudent();
		List<StudentDTO> listStudentDTO = Lists.newArrayList();
		for(Student student: listStudent){
			StudentDTO studentDTO = new StudentDTO();
			studentDTO.setId(student.getId());
			studentDTO.setAge(student.getAge());
			studentDTO.setName(student.getName());
			listStudentDTO.add(studentDTO);
		}
		return listStudentDTO;
	}

}
