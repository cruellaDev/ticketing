package org.project.ticketing.infrastructure.user.repository.jpa;

import org.project.ticketing.infrastructure.user.entity.UserPointHistoryEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPointHistoryJpaRepository extends JpaRepository<UserPointHistoryEntity, Long> {
}
