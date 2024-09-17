package org.project.ticketing.infrastructure.concert.repository.jpa;

import org.project.ticketing.infrastructure.concert.entity.ConcertSeatEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertSeatJpaRepository extends JpaRepository<ConcertSeatEntity, Long> {
}
