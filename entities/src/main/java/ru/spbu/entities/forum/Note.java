package ru.spbu.entities.forum;

import org.springframework.data.annotation.Version;
import org.springframework.lang.NonNull;
import ru.spbu.entities.BaseEntity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "note")
public class Note extends BaseEntity {
    @Version
    private long version;

    @NonNull
    private String title;
    @NonNull
    private String text;

    @NonNull
    @OneToMany(mappedBy = "note", orphanRemoval = true, cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<Comment>();

    // Constructors

    public Note() {
    }

    public Note(@NonNull String title, @NonNull String text, @NonNull List<Comment> comments) {
        this.title = title;
        this.text = text;
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

    @NonNull
    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(@NonNull List<Comment> comments) {
        this.comments = comments;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "Note{" +
                "title='" + title + '\'' +
                ", text='" + text + '\'' +
                ", comments=" + comments +
                ", id=" + id +
                '}';
    }
}
