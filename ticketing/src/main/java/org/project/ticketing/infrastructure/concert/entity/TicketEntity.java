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
@Table(name = "ticket")
@SQLDelete(sql = "UPDATE ticket SET deleted_at = CURRENT_TIMESTAMP WHERE ticket_id = ?")
public class TicketEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ticket_id", unique = true, nullable = false, updatable = false)
    private Long ticketId;

    @Column(name = "reservation_id", nullable = false, updatable = false)
    private Long reservationId;

    @Column(name = "concert_id", nullable = false)
    private Long concertId;

    @Column(name = "concert_name", length = 300, nullable = false)
    private String concertName;

    @Column(name = "concert_detail_id", nullable = false)
    private Long concertDetailId;

    @Column(name = "performed_at", nullable = false)
    private LocalDateTime performedAt;

    @Column(name = "performance_price", nullable = false, precision = 18, scale = 3)
    private BigDecimal performancePrice;

    @Column(name = "performance_capacity", nullable = false)
    private Integer performanceCapacity;

    @Column(name = "concert_seat_id", nullable = false)
    private Long concertSeatId;

    @Column(name = "seat_number", length = 50, nullable = false)
    private String seatNumber;

    @Column(name = "claimed_at")
    private LocalDateTime claimedAt;

    @Column(name = "cancelled_at")
    private LocalDateTime cancelledAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
