package com.homework.testSpring.service;

import com.homework.testSpring.entity.Lesson;
import com.homework.testSpring.repository.LessonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LessonService implements  ILessonService{

    @Autowired
    private LessonRepository repository;
    @Override
    public List<Lesson> findAll() {
        return (List<Lesson>) repository.findAll();
    }
}
