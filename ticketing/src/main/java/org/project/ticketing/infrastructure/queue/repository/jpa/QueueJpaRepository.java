package org.project.ticketing.infrastructure.queue.repository.jpa;

import org.project.ticketing.infrastructure.queue.entity.QueueEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QueueJpaRepository extends JpaRepository<QueueEntity, Long> {
}
