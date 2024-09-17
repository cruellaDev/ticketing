package org.project.ticketing.infrastructure.payment.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.project.ticketing.infrastructure.common.BaseEntity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "payment")
@SQLDelete(sql = "UPDATE payment SET deleted_at = CURRENT_TIMESTAMP WHERE payment_id = ?")
public class PaymentEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "payment_id", unique = true, nullable = false, updatable = false)
    private Long paymentId;

    @Column(name = "reservation_id", nullable = false, updatable = false)
    private Long reservationId;

    @Column(name = "payed_amount", nullable = false, precision = 18, scale = 3)
    private BigDecimal payedAmount;

    @Column(name = "refundable_amount", nullable = false, precision = 18, scale = 3)
    private BigDecimal refundableAmount;

    @Column(name = "refunded_amount", nullable = false, precision = 18, scale = 3)
    private BigDecimal refundedAmount;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
