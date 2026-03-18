package com.training.Polymorphismassgn;
import java.util.*;

class OrganizationUnit {
    protected String name;

    public OrganizationUnit(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Department extends OrganizationUnit {

    private List<Professor> employees;

    public Department(String name) {
        super(name);
        employees = new ArrayList<>();
    }

    public void addProfessor(Professor p) {
        employees.add(p);
        System.out.println(p.getName() + " added to " + name);
    }

    public void removeProfessor(Professor p) {
        employees.remove(p);
        System.out.println(p.getName() + " removed from " + name);
    }

    public void showProfessors() {
        System.out.println("Professors in " + name + ":");
        for (Professor p : employees) {
            System.out.println("- " + p.getName());
        }
    }
}

class Professor {

    private String name;
    private Department department; 

    public Professor(String name) {
        this.name = name;
    }

    public void setDepartment(Department dept) {
        this.department = dept;
        System.out.println(name + " assigned to " + dept.getName());
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }
}
class Student {

    private String name;
    private Professor advisor;

    public Student(String name) {
        this.name = name;
    }

    public void setAdvisor(Professor p) {
        this.advisor = p;
        System.out.println(name + " is advised by " + p.getName());
    }

    public void showAdvisor() {
        if (advisor != null) {
            System.out.println(name + "'s advisor: " + advisor.getName());
        }
    }
}

public class University {
    public static void main(String[] args) {

        Department cs = new Department("Computer Science");
        Department math = new Department("Mathematics");
        Professor p1 = new Professor("Dr. Smith");
        Professor p2 = new Professor("Dr. John");
        p1.setDepartment(cs);
        p2.setDepartment(cs);

        cs.addProfessor(p1);
        cs.addProfessor(p2);

        cs.showProfessors();

        System.out.println("\n--- Reassign Professor (Aggregation) ---");
        cs.removeProfessor(p2);
        p2.setDepartment(math);
        math.addProfessor(p2);

        math.showProfessors();

        System.out.println("\n--- Association (Student & Professor) ---");
        Student s1 = new Student("Alice");
        Student s2 = new Student("Bob");

        s1.setAdvisor(p1);
        s2.setAdvisor(p2);

        s1.showAdvisor();
        s2.showAdvisor();
    }
}