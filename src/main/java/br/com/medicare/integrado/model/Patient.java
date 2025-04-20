package br.com.medicare.integrado.model;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String cpf;

    @Column(name = "phone_number")
    private String phoneNumber;

    private String email;

    @Column(name = "data_nascimento", nullable = false)
    private String dataNascimento;

    @JoinColumn(name = "address_id", nullable = false)
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Address address;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;
}
