package com.jungleduff.movingService.repositories;

import com.jungleduff.movingService.entities.MovingOffers;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovingOfferRepositories extends MongoRepository<MovingOffers,String>{

}
