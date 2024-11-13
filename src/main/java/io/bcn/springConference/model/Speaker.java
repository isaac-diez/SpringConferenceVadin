package io.bcn.springConference.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.GenericGenerator;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "speakers")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Speaker {

    @Id
    @GeneratedValue(generator = "UUID")
    @GenericGenerator(name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator")
    @Column(name = "id", updatable = false,
            nullable = false)
    private UUID id;

    @Column(nullable = false)
    private String name;

    @Column(columnDefinition = "TEXT")
    private String bio;

    @Column(nullable = false, unique = true)
    private String email;

    @OneToMany(mappedBy = "speaker")
    private List<Conference> conferences;
}