package com.homework.testSpring.service;

import com.homework.testSpring.entity.Exercise;
import com.homework.testSpring.repository.ExerciseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ExerciseService implements IExerciseService{

    @Autowired
    private ExerciseRepository repository;
    @Override
    public List<Exercise> findAll() {
        return (List<Exercise>) repository.findAll();
    }
}
