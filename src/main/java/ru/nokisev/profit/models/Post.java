package ru.nokisev.profit.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ManyToAny;

import java.util.Date;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String desc;
    private Date dateOfCreated;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    @JoinColumn(name = "user_id")
    private User author;

}
