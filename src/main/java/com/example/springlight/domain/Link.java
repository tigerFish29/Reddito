package com.example.springlight.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@NoArgsConstructor

public class Link extends Auditable {
    @Id
    @GeneratedValue

    private Long id;
    @NonNull
    private String title;
    @NonNull
    private String url;

    // comments
    @OneToMany(mappedBy = "link")
    private List<Comment> comments = new ArrayList<>();


}
