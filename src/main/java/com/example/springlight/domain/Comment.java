package com.example.springlight.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;


@Entity
@Data
@NoArgsConstructor
public class Comment extends Auditable{
    @Id
    @GeneratedValue

    private Long id;

    private String body;

    // Link
    @ManyToOne()
    private Link link;

    // constructor


    public Comment(String body, Link link) {
        this.body = body;
        this.link = link;
    }
}
