package com.fdm.hibernate.annotation.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity(name = "STUDENT")
public class Student {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private int age;

    @Column(name = "class")
    private String className;

    @Transient
    private boolean loggedIn;

    public Student() {
    }

    public Student(String name, int age, String className) {
        this.name = name;
        this.age = age;
        this.className = className;
    }

    public Student(int id, String name, int age, String className, boolean loggedIn) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.className = className;
        this.loggedIn = loggedIn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getId() == student.getId() && getAge() == student.getAge() && getName().equals(student.getName()) && getClassName().equals(student.getClassName()) && loggedIn == student.loggedIn;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getAge(), getClassName(), loggedIn);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", loggedIn=" + loggedIn +
                '}';
    }
}
