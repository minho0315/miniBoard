package minho.miniBoard.domain;

import java.time.LocalDateTime;
import java.util.List;

public class Board {

    private Long id;
    private String title;
    private String content;
    private Member member;
    private LocalDateTime createDate;
    private LocalDateTime editDate;
    private List<Comment> comments;
    private List<String> tags;
    private Integer like;
}
