package com.homework.testSpring.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;

@Entity
@Table(name = "spring.lesson")
/*@Table(name = "spring.lesson")
@NamedQueries({
        @NamedQuery(
                name = "findAllLesson",
                query = "from Lesson l where l.id = :id"
        ),
})
 */
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "quantityHours")
    private int quantityHours;
    @Column(name = "form")
    private String form;
    @Column(name = "teacher")
    private String teacher;

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

    public int getQuantityHours() {
        return quantityHours;
    }

    public void setQuantityHours(int quantityHours) {
        this.quantityHours = quantityHours;
    }

    public String getForm() {
        return form;
    }

    public void setForm(String form) {
        this.form = form;
    }

    public String getTeacher() {
        return teacher;
    }

    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", quantityHours=" + quantityHours +
                ", form='" + form + '\'' +
                ", teacher='" + teacher + '\'' +
                '}';
    }
}
