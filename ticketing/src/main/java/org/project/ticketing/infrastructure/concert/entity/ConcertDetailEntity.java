package org.project.ticketing.infrastructure.concert.entity;

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
@Table(name = "concert_detail")
@SQLDelete(sql = "UPDATE concert_detail SET deleted_at = CURRENT_TIMESTAMP WHERE concert_detail_id = ?")
public class ConcertDetailEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "concert_detail_id", unique = true, nullable = false, updatable = false)
    private Long concertDetailId;

    @Column(name = "concert_id", nullable = false, updatable = false)
    private Long concertId;

    @Column(name = "performed_at", nullable = false, updatable = false)
    private LocalDateTime performedAt;

    @Column(name = "performance_price", nullable = false, precision = 18, scale = 3, updatable = false)
    private BigDecimal performancePrice;

    @Column(name = "performance_capacity", nullable = false, updatable = false)
    private Integer performanceCapacity;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
