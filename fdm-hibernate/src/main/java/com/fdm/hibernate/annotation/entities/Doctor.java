package com.fdm.hibernate.annotation.entities;

import javax.persistence.*;
import java.util.Objects;

public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Embedded
    private PersonName name;

    @Column(name = "SPECIALISATION")
    private String specialisation;

    public Doctor() {
    }

    public Doctor(int id, PersonName name, String specialisation) {
        this.id = id;
        this.name = name;
        this.specialisation = specialisation;
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

    public String getSpecialisation() {
        return specialisation;
    }

    public void setSpecialisation(String specialisation) {
        this.specialisation = specialisation;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Doctor)) return false;
        Doctor doctor = (Doctor) o;
        return getId() == doctor.getId() && getName().equals(doctor.getName()) && getSpecialisation().equals(doctor.getSpecialisation());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getSpecialisation());
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "id=" + id +
                ", name=" + name +
                ", specialisation='" + specialisation + '\'' +
                '}';
    }
}
