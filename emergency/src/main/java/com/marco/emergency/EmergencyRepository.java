package com.marco.emergency;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmergencyRepository extends JpaRepository<Emergency,Integer> {
}
