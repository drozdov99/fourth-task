package com.profitsoft.trainee.drozdov.entity.employee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Objects;
@Entity
@DiscriminatorValue("manag")
public class Manager extends Employee {

    @Column(name = "hobby")
    private String hobby;

    public Manager(String first_name, String last_name, String hobby) {
        super(first_name, last_name);
        this.hobby = hobby;
    }

    public Manager() {
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public boolean fullEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Manager manager = (Manager) o;
        return Objects.equals(hobby, manager.hobby) && ((Manager) o).getAddress().equals(this.getAddress());
    }

    @Override
    public String toString() {
        return "Manager{" + super.toString()+
                "hobby='" + hobby + '\'' +
                '}';
    }
}

