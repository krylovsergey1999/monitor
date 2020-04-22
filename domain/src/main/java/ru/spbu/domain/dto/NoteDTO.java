package ru.spbu.domain.dto;

import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.List;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString(callSuper = true)
public class NoteDTO extends BaseDTO implements Serializable {
    private String title;
    private String text;
    private LocalDateTime commentTime;
    // Лист id comments
    private List<CommentDTO> items;
}
