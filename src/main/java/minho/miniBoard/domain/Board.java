package minho.miniBoard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
public class Board {

    @Id @GeneratedValue
    @Column(name = "board_id")
    private Long id;

    private String title;
    private String content;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    private LocalDateTime createDate;
    private LocalDateTime editDate;

    @OneToMany(mappedBy = "board")
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "board")
    private List<Tag> tags = new ArrayList<>();
    private Integer prefer;
}
