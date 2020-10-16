package com.homework.testSpring.repository;

import com.homework.testSpring.entity.Lesson;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonRepository  extends CrudRepository<Lesson,Long> {
}
