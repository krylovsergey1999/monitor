package ru.spbu.domain.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class CommentDTO extends BaseDTO implements Serializable {
    private String commentText;
    private LocalDateTime commentTime;
    private Long noteId;

    public String getCommentText() {
        return commentText;
    }

    public LocalDateTime getCommentTime() {
        return commentTime;
    }

    public Long getNoteId() {
        return noteId;
    }
}
