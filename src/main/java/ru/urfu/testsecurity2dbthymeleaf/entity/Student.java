package ru.urfu.testsecurity2dbthymeleaf.entity;


import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "STUDENTS")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "name")
    private long name;

    @Column(name = "surname")
    private long surname;

    @Column(name = "faculty")
    private long faculty;

    @Column(name = "age")
    private long age;

}
