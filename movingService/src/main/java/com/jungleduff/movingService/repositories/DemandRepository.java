package com.jungleduff.movingService.repositories;

import com.jungleduff.movingService.entities.Demands;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemandRepository extends MongoRepository<Demands,String> {

}
