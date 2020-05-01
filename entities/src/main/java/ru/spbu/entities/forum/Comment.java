package ru.spbu.entities.forum;

import org.springframework.lang.NonNull;
import ru.spbu.entities.BaseEntity;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "comment")
public class Comment extends BaseEntity {
    private String commentText;
    private LocalDateTime commentTime;

    @NonNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "note_id")
    private Note note;

    // Constructors


    public Comment() {
    }

    public Comment(String commentText, LocalDateTime commentTime, Note note) {
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

    @Override
    public String toString() {
        return "Comment{" +
                "commentText='" + commentText + '\'' +
                ", commentTime=" + commentTime +
                ", note=" + note +
                ", id=" + id +
                '}';
    }
}
