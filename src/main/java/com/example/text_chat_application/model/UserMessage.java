package com.example.text_chat_application.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import org.hibernate.annotations.UuidGenerator;

import java.time.ZonedDateTime;
import java.util.UUID;


/**
 * Model for user message in chat
 */
@Data
@Entity
@Table(name = "messages")
public class UserMessage {

    @Id
    @UuidGenerator(style = UuidGenerator.Style.TIME)
    @Column(name = "id")
    private UUID id;

    @Column(name = "time_of_posting")
    private ZonedDateTime time;

    @Column(name = "author")
    private String userNick;

    @Column(name = "content")
    private String text;

}
