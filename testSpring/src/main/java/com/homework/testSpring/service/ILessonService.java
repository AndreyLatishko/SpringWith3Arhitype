package com.homework.testSpring.service;

import com.homework.testSpring.entity.Lesson;

import java.util.List;

public interface ILessonService {
    List<Lesson> findAll();
}
