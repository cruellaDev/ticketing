package org.project.ticketing.infrastructure.concert.repository.jpa;

import org.project.ticketing.infrastructure.concert.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationJpaRepository extends JpaRepository<ReservationEntity, Long> {
}
