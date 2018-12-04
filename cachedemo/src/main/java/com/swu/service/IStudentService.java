package com.swu.service;

import com.swu.domain.Student;

import java.util.List;

public interface IStudentService {
    /**
     * 增加保存学生操作
     */
    void saveStu(Student student);

    /**
     * 根据id删除学生操作
     */
    void deleteStu(Integer integer);

    /**
     * 修改学生操作
     */
    void updateStu();

    /**
     * 查询所有学生操作
     *
     * @return
     */
    List<Student> findAll();

    /**
     * 根据id查询学生操作
     *
     * @return
     */
    Student findById(Integer integer);
}
