package com.homework.testSpring.entity;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "spring.exercise")
/*@Table(name = "spring.exercise")
@NamedQueries({
        @NamedQuery(
                name = "findAllExercise",
                query = "from Exercise e where e.id = :id"
        ),
})

 */
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "idlesson")
    private int idlesson;
    @Column(name = "dateOfTheLesson")
    private Date dateOfTheLesson;
    @Column(name = "topic")
    private String topic;
    @Column(name = "formOfOccupation")
    private String formOfOccupation;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdlesson() {
        return idlesson;
    }

    public void setIdlesson(int idlesson) {
        this.idlesson = idlesson;
    }

    public Date getDateOfTheLesson() {
        return dateOfTheLesson;
    }

    public void setDateOfTheLesson(Date dateOfTheLesson) {
        this.dateOfTheLesson = dateOfTheLesson;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getFormOfOccupation() {
        return formOfOccupation;
    }

    public void setFormOfOccupation(String formOfOccupation) {
        this.formOfOccupation = formOfOccupation;
    }

    @Override
    public String toString() {
        return "Exercise{" +
                "id=" + id +
                ", idlesson=" + idlesson +
                ", dateOfTheLesson=" + dateOfTheLesson +
                ", topic='" + topic + '\'' +
                ", formOfOccupation='" + formOfOccupation + '\'' +
                '}';
    }
}
