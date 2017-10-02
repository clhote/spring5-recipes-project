package clhote.spring.domain;

import lombok.*;

import javax.persistence.*;

/**
 * Created by CLH3623 on 28/09/2017.
 */
@Data
@Entity
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    private Recipe recipe;

    @Lob
    private String recipeNotes;

}
