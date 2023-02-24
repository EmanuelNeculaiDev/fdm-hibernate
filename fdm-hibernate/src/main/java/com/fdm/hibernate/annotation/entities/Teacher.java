package com.fdm.hibernate.annotation.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "TEACHER")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Embedded
    private PersonName name;

    @Column(name = "SCHOOL_NAME")
    private String schoolName;

    public Teacher() {
    }

    public Teacher(int id, PersonName name, String schoolName) {
        this.id = id;
        this.name = name;
        this.schoolName = schoolName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public PersonName getName() {
        return name;
    }

    public void setName(PersonName name) {
        this.name = name;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Teacher)) return false;
        Teacher teacher = (Teacher) o;
        return getId() == teacher.getId() && getName().equals(teacher.getName()) && getSchoolName().equals(teacher.getSchoolName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSchoolName());
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name=" + name +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
