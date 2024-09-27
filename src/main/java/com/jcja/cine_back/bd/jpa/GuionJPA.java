package com.jcja.cine_back.bd.jpa;

import com.jcja.cine_back.bd.orm.GuionORM;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GuionJPA extends JpaRepository<GuionORM, Long> {
}
