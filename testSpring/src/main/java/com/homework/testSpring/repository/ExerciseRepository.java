package com.homework.testSpring.repository;

import com.homework.testSpring.entity.Exercise;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExerciseRepository extends CrudRepository<Exercise,Long> {
}
