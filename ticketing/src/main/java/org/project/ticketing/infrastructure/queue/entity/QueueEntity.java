package org.project.ticketing.infrastructure.queue.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.SQLDelete;
import org.project.ticketing.infrastructure.common.BaseEntity;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
@Table(name = "queue")
@SQLDelete(sql = "UPDATE queue SET deleted_at = CURRENT_TIMESTAMP WHERE queue_id = ?")
public class QueueEntity extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "queue_id", unique = true, nullable = false, updatable = false)
    private Long queueId;

    @Column(name = "user_id", nullable = false, updatable = false)
    private Long userId;

    @Column(name = "token", nullable = false, updatable = false, columnDefinition = "BINARY(16)")
    private UUID token;

    @Column(name = "token_status", nullable = false, length = 50)
    private String tokenStatus;

    @Column(name = "activated_at")
    private LocalDateTime activatedAt;

    @Column(name = "deleted_at")
    private LocalDateTime deletedAt;
}
