package com.junglediff.claims.repositories;

import com.junglediff.claims.entities.Claim;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClaimsRepository extends JpaRepository<Claim,Long> {
}
