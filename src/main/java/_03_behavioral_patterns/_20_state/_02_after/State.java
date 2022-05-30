package _03_behavioral_patterns._20_state._02_after;


public interface State {

    public void addReview(String review, Student student);
    public void addStudent(Student student);
}
