package minho.miniBoard.domain;

import java.awt.print.Book;
import java.util.List;

public class Member {

    private Long id;
    private String name;
    private String email;
    private String userId;
    private String password;
    private Grade grade;
    private List<Board> boards;
    private List<Comment> comments;
    private Integer activity;
    private BookMarks bookMarks;
}
