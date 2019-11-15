package com.profitsoft.trainee.drozdov.entity.employee;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.util.Objects;
@Entity
@DiscriminatorValue("devel")
public class Developer extends Employee {

    @Column(name = "programming_language")
    private String programmingLanguage;

    public Developer(){
    }

    public Developer(String first_name, String last_name, String programmingLanguage) {
        super(first_name, last_name);
        this.programmingLanguage = programmingLanguage;
    }

    public String getProgrammingLanguage() {
        return programmingLanguage;
    }

    public void setProgrammingLanguage(String programmingLanguage) {
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public String toString() {
        return "Developer{" + super.toString()+
                "programmingLanguage='" + programmingLanguage + '\'' +
                '}';
    }
    public boolean fullEquals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Developer developer = (Developer) o;
        return Objects.equals(programmingLanguage, ((Developer) o).programmingLanguage) && ((Developer) o).getAddress().equals(this.getAddress());
    }
}
