package com.jungleduff.movingService.entities;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@Data
@Document(collection = "movingOffers")
public class MovingOffers {
    @Id
    private String id;
    private Float price;
    private String phone;
    private OfferStatus offerStatus = OfferStatus.PENDING;
    private String description;
    @DBRef
    private Demands demand;
}
