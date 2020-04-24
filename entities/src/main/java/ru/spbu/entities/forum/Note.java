package ru.spbu.entities.forum;

import ru.spbu.entities.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "note")
public class Note extends BaseEntity {
    private String title;
    private String text;
    private LocalDateTime commentTime;

    // orphanRemoval = true - удалит все комментарии без Note
    @OneToMany(mappedBy = "note", orphanRemoval = true)
    private List<Comment> items = new ArrayList<Comment>();

    // Constructors
    public Note() {
    }

    public Note(Long id, String title, String text, LocalDateTime commentTime, List<Comment> items) {
        super(id);
        this.title = title;
        this.text = text;
        this.commentTime = commentTime;
        this.items = items;
    }

    public void addComment(Comment comment) {
        comment.setNote(this);
        this.items.add(comment);
    }

    // setter and getter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

    public List<Comment> getItems() {
        return items;
    }

    public void setItems(List<Comment> items) {
        this.items = items;
    }
}
