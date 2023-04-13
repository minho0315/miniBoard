package minho.miniBoard.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
public class Tag {

    @Id @GeneratedValue
    @Column(name = "tag_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "board_id")
    private Board board;
}
