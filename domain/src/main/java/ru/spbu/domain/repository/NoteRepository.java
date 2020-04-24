package ru.spbu.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.spbu.entities.forum.Note;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}
