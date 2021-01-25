package com.example.demo.models;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "userId")
    private int userId;
    @Column(name="name")
    private String name;
    @Column(name = "position")
    private String position;
    @Column(name="salary")
    private int salary;



    @OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
    private List<Task> taskList;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "accountId")
    private Account account;
}
