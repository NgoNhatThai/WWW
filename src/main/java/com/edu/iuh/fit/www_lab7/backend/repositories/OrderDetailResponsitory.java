package com.edu.iuh.fit.www_lab7.backend.repositories;

import com.edu.iuh.fit.www_lab7.backend.models.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailResponsitory extends JpaRepository<OrderDetail, Long> {
}
