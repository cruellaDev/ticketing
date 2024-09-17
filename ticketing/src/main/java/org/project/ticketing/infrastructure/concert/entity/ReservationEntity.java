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
@Table(name = "reservation")
@SQLDelete(sql = "UPDATE reservation SET deleted_at = CURRENT_TIMESTAMP WHERE reservation_id = ?")
public class ReservationEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reservation_id", unique = true, nullable = false, updatable = false)
    private Long reservationId;

    @Column(name = "user_id", nullable = false, updatable = false)
    private Long userId;

    @Column(name = "reservation_status", length = 50, nullable = false)
    private String reservationStatus;

    @Column(name = "booker_name", length = 300, nullable = false)
    private String bookerName;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
