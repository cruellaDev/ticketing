package org.project.ticketing.infrastructure.user.repository.jpa;

import org.project.ticketing.infrastructure.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserJpaRepository extends JpaRepository<UserEntity, Long> {
}
