package com.example.text_chat_application.model.repository;

import com.example.text_chat_application.model.UserMessage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessageRepository extends JpaRepository<UserMessage, Long> {
}
