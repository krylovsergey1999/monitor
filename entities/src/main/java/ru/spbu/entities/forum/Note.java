package ru.spbu.entities.forum;

import org.springframework.lang.NonNull;
import ru.spbu.entities.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "note")
public class Note extends BaseEntity {
    @NonNull
    private String title;
    @NonNull
    private String text;

    private LocalDateTime commentTime;

    @NonNull
    @OneToMany(mappedBy = "note", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<Comment> comments = new ArrayList<Comment>();

    // Constructors

    public Note() {
    }

    public Note(@NonNull String title, @NonNull String text, LocalDateTime commentTime, @NonNull List<Comment> comments) {
        this.title = title;
        this.text = text;
        this.commentTime = commentTime;
        this.comments = comments;
    }

    // setter and getter

    @NonNull
    public String getTitle() {
        return title;
    }

    public void setTitle(@NonNull String title) {
        this.title = title;
    }

    @NonNull
    public String getText() {
        return text;
    }

    public void setText(@NonNull String text) {
        this.text = text;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public void setCommentTime(LocalDateTime commentTime) {
        this.commentTime = commentTime;
    }

    @NonNull
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(@NonNull List<Comment> comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", commentTime=" + commentTime +
                ", comments=" + comments +
                ", id=" + id +
                '}';
    }
}
