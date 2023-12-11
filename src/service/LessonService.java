package service;

import model.Lesson;

import java.util.List;

public interface LessonService {

    List<Lesson> addLesson(String groupName);

    Lesson getLesson(String groupName);

    List<Lesson> getAllLessonByGroupName(String groupName);

    String deleteLessonById(long id);
}
