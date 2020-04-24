package ru.spbu.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import ru.spbu.domain.dto.CommentDTO;
import ru.spbu.entities.forum.Comment;

@Mapper(componentModel = "spring")
public interface CommentMapper {
    @Mappings({
            @Mapping(target = "id", source = "entity.id"),
            @Mapping(target = "commentText", source = "entity.commentText"),
            @Mapping(target = "commentTime", source = "entity.commentTime"),
            //@Mapping(target = "noteId", source = "entity.note.id")
    })
    CommentDTO commentToCommentDTO(Comment entity);

    @Mappings({
            @Mapping(target = "id", source = "dto.id"),
            @Mapping(target = "commentText", source = "dto.commentText"),
            @Mapping(target = "commentTime", source = "dto.commentTime"),
            //@Mapping(target = "note", source = "dto.noteId", qualifiedBy = {EnglishToGerman.class, MovieMapper.class})
    })
    Comment commentDTOtoComment(CommentDTO dto);
}
