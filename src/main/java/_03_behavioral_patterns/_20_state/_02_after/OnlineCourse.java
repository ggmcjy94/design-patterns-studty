package _03_behavioral_patterns._20_state._02_after;

import java.util.List;

public class OnlineCourse {
    private State state;

    private List<Student> students;

    private List<String> reviews;

    public void addStudent(Student student) {
        this.state.addStudent(student);
    }

    public void addReview(String review, Student student) {
        this.state.addStudent(student);
    }


    public State getState() {
        return state;
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<String> getReviews() {
        return reviews;
    }
}
