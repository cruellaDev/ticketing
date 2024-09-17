package org.project.ticketing.infrastructure.concert.repository.jpa;

import org.project.ticketing.infrastructure.concert.entity.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketJpaRepository extends JpaRepository<TicketEntity, Long> {
}
