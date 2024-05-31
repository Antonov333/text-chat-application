package com.example.text_chat_application.repository;

import com.example.text_chat_application.model.ChatUser;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserRepository extends JpaRepository<ChatUser, UUID> {
}
