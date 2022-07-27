package com.example.springlight.repos;

import com.example.springlight.domain.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentsRepo extends JpaRepository<Comment, Long> {
}
