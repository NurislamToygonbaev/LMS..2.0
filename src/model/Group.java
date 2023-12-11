package model;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Group {
    private long id;
    private String groupName;
    private String groupDescription;
    public List<Lesson> lessons = new LinkedList<>();
    public List<Student> students = new LinkedList<>();

    public Group() {
    }

    public Group(long id, String groupName, String groupDescription, List<Lesson> lessons, List<Student> students) {
        this.id = id;
        this.groupName = groupName;
        this.groupDescription = groupDescription;
        this.lessons = lessons;
        this.students = students;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getGroupDescription() {
        return groupDescription;
    }

    public void setGroupDescription(String groupDescription) {
        this.groupDescription = groupDescription;
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public void setLessons(List<Lesson> lessons) {
        this.lessons = lessons;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Group: " +
                "id=" + id +
                " groupName='" + groupName + '\'' +
                " groupDescription='" + groupDescription + '\'' + "\n"+
                " lessons=" + lessons + "\n" +
                " students=" + students + "\n\n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Group group = (Group) o;
        return id == group.id && Objects.equals(groupName, group.groupName) && Objects.equals(groupDescription, group.groupDescription) && Objects.equals(lessons, group.lessons) && Objects.equals(students, group.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupName, groupDescription, lessons, students);
    }
}
