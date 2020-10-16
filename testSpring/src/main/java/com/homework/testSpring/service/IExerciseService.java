package com.homework.testSpring.service;

import com.homework.testSpring.entity.Exercise;

import java.util.List;

public interface IExerciseService {
    List<Exercise> findAll();
}
