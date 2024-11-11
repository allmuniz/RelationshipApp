package project.allmuniz.relationshipapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MatcheEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long profile1_id;
    @Column(nullable = false)
    private Long profile2_id;

    @Temporal(TemporalType.TIMESTAMP)
    private LocalDateTime createdAt;
}
