package org.project.ticketing.infrastructure.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "user_point_history")
@SQLDelete(sql = "UPDATE user_point_history SET deleted_at = CURRENT_TIMESTAMP WHERE user_point_history_id = ?")
public class UserPointHistoryEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_point_history_id", unique = true, nullable = false, updatable = false)
    private Long userPointHistoryId;

    @Column(name = "user_id", nullable = false, updatable = false)
    private Long userId;

    @Column(name = "amount", nullable = false, updatable = false, precision = 18, scale = 3)
    private BigDecimal amount;

    @Column(name = "type", nullable = false, length = 50, updatable = false)
    private String type;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
