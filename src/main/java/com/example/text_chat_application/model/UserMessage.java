package com.example.text_chat_application.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.ZonedDateTime;


/**
 * Model for User message in chat
 * Implemented id with Long to make message sorting simple
 */
@Data
@Entity
@Table(name = "messages")
public class UserMessage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "time_of_posting")
    private ZonedDateTime time;

    @Column(name = "author")
    private String userNick;

    @Column(name = "content")
    private String text;

}
