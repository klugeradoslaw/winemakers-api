package pl.klugeradoslaw.winemakersapi.wine;

import jakarta.persistence.*;
import lombok.*;
import pl.klugeradoslaw.winemakersapi.step.Step;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class Wine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private LocalDate dateOfStart;
    private String description;
    @Enumerated(EnumType.STRING)
    private WineStatus status;
    @OneToMany
    private List<Step> steps;
}
