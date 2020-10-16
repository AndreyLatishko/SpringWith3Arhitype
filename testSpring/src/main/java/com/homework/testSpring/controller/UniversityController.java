package com.homework.testSpring.controller;


import com.homework.testSpring.entity.Exercise;
import com.homework.testSpring.entity.Lesson;
import com.homework.testSpring.service.IExerciseService;
import com.homework.testSpring.service.ILessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UniversityController {
    @Autowired
    private ILessonService lessonService;
    @Autowired
    private IExerciseService exerciseService;

    @GetMapping("/exercises")
    public String findExercise(Model model){
        var exercises = (List<Exercise>) exerciseService.findAll();
        model.addAttribute("exercises", exercises);
        return "showExercise";
    }

    @GetMapping("/lessons")
    public String findLesson(Model model){
        var lessons = (List<Lesson>) lessonService.findAll();
        model.addAttribute("lessons", lessons);
        return "showLesson";
    }
}
