package org.project.ticketing.infrastructure.concert.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.project.ticketing.infrastructure.common.BaseEntity;

import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "concert_seat")
@SQLDelete(sql = "UPDATE concert_seat SET deleted_at = CURRENT_TIMESTAMP WHERE concert_seat_id = ?")
public class ConcertSeatEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "concert_seat_id", unique = true, nullable = false, updatable = false)
    private Long concertSeatId;

    @Column(name = "concert_detail_id", nullable = false, updatable = false)
    private Long concertDetailId;

    @Column(name = "seat_number", length = 50, nullable = false, updatable = false)
    private String seatNumber;

    @Column(name = "seat_status", length = 50, nullable = false)
    private String seatStatus;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
