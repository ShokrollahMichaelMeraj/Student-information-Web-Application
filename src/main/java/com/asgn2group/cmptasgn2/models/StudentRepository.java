package com.asgn2group.cmptasgn2.models;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Integer>{
    List<Student> findByUid(int uid);
    List<Student> findByName(String name);
    List<Student> findByHeight(float height);
}
