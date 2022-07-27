package com.example.springlight.repos;

import com.example.springlight.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepo extends JpaRepository<Link, Long> {
}
