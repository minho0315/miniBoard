package minho.miniBoard.domain;

import java.time.LocalDateTime;

public class Comment {

    private Long id;
    private Member member;
    private String content;
    private LocalDateTime createDate;
    private LocalDateTime editDate;
}
