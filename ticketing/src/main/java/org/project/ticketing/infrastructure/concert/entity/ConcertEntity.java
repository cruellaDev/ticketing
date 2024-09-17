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
@Table(name = "concert")
@SQLDelete(sql = "UPDATE concert SET deleted_at = CURRENT_TIMESTAMP WHERE concert_id = ?")
public class ConcertEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "concert_id", unique = true, nullable = false, updatable = false)
    private Long concertId;

    @Column(name = "concert_name", length = 300, nullable = false)
    private String concertName;

    @Column(name = "concert_status", length = 50, nullable = false)
    private String concertStatus;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
