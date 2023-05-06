package com.springboot.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
//pawan
@Entity
@Table(
        name = "posts", uniqueConstraints = {@UniqueConstraint(columnNames = {"title"})}
)
public class Post {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Long id;
        //private Long id;
      //  private Long id;

    @Column(name = "title", nullable = false)
    private String title;
    //System.out.println("janu");
    @Column(name = "description", nullable = false)
    private String description;
    //System.out.println("janu");
    //System.out.println("manu");

    @Column(name = "content", nullable = false)
    private String content;
}
