package com.swu.service.impl;

import com.swu.cache.Cachestu;
import com.swu.dao.IStudentDao;
import com.swu.domain.Student;
import com.swu.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("studentService")
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    @Override
    public void saveStu(Student student) {
        studentDao.saveStu(student);
    }

    @Override
    public void deleteStu(Integer integer) {
        studentDao.deleteStu(integer);
    }

    @Override
    public void updateStu() {
        studentDao.updateStu();
    }

    @Override
    @Cachestu
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    //@Cachestu
    public Student findById(Integer integer) {
        return studentDao.findById(integer);
    }
}
