package ru.spbu.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spbu.entities.forum.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}
