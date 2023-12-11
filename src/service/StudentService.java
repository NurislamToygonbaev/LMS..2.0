package service;

import model.Lesson;
import model.Student;

import java.util.List;

public interface StudentService {

    List<Student> addStudent(String groupName);

    String upDateStudentName(String email);

    Student findStudent(String studentName);

    List<Student> getAllStudentsByGroup(String groupName);

    String deleteStudent(String email);

    List<Lesson> getAllLessonsStudent(long id);
}
