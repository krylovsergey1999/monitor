package ru.spbu.entities.forum;

import ru.spbu.entities.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
public class Comment extends BaseEntity {
    private String commentText;
    private LocalDateTime commentTime;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "note_id")
    private Note note;

    // Constructors

    public Comment() {
    }

    public Comment(Long id, String commentText, LocalDateTime commentTime, Note note) {
        super(id);
        this.commentText = commentText;
        this.commentTime = commentTime;
        this.note = note;
    }

    // setter and getter
    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

    public Note getNote() {
        return note;
    }

    public void setNote(Note note) {
        this.note = note;
    }
}
