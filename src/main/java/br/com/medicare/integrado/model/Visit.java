package br.com.medicare.integrado.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Visit {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, name = "entry_time")
    private LocalDateTime entryTime;

    @Column(name = "exit_time")
    private LocalDateTime exitTime;

    @JoinColumn(name = "visitor_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Visitor visitor;

    @JoinColumn(name = "hospitalization_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Hospitalization hospitalization;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
