package org.project.ticketing.infrastructure.payment.repository.jpa;

import org.project.ticketing.infrastructure.payment.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentJpaRepository extends JpaRepository<PaymentEntity, Long> {
}
