package br.com.medicare.integrado.model;

import jakarta.persistence.*;
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
public class Payment {

    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private Double amount;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private MethodPayment method;

    @Column(nullable = false)
    private LocalDateTime datetime;

    private String description;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private StatusPayment status;

    @Column(name = "transaction_code")
    private String transactionCode;

    @Column(name = "pagseguro_payment_url")
    private String pagseguroPaymentUrl;

    @Column(name = "pagseguro_checkout_url")
    private String pagseguroCheckoutUrl;

    @Column(name = "payment_method_details")
    private String paymentMethodDetails;

    @JoinColumn(name = "patient_id")
    @ManyToOne(fetch = FetchType.LAZY)
    private Patient patient;

    @CreationTimestamp
    @Column(name = "created_at", updatable = false, nullable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updatedAt;
}
