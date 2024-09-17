package org.project.ticketing.infrastructure.concert.repository.jpa;

import org.project.ticketing.infrastructure.concert.entity.ConcertEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcertJpaRepository extends JpaRepository<ConcertEntity, Long> {
}
