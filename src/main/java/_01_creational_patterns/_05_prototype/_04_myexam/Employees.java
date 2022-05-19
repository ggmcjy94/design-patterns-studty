package _01_creational_patterns._05_prototype._04_myexam;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<String> empList;

    public Employees() {
        this.empList = new ArrayList<>();
    }

    public Employees(List<String> empList) {
        this.empList = empList;
    }

    public List<String> getEmpList() {
        return empList;
    }

    public void loadData() {
        empList.add("test1");
        empList.add("test2");
        empList.add("test3");
        empList.add("test4");
        empList.add("test5");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        List<String> temp = new ArrayList<>();
        for (String s : this.empList) {
            temp.add(s);
        }
        return new Employees(temp);
    }
}
