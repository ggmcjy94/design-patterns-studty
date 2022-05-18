package _01_creational_patterns._05_prototype._04_myexam;

import java.util.List;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employees emps = new Employees();
        emps.loadData();

        Employees empsNew1 = (Employees) emps.clone();
        Employees empsNew2 = (Employees) emps.clone();
        List<String> list = empsNew1.getEmpList();
        list.add("test6");
        List<String> list1 = empsNew2.getEmpList();
        list1.remove("test1");

        System.out.println("emps List: "+emps.getEmpList());
        System.out.println("empsNew List: "+list);
        System.out.println("empsNew1 List: "+list1);
    }
}
