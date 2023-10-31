package com.jungleduff.movingService.entities;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;
import java.util.List;

@Data
@Document(collection = "demands")
public class Demands {

    @Id
    private String id;

    private String pickUpLocation;
    private String dropOffLocation;
    private String phone;
    private Date movingDate;
    private String description;
    private DemandStatus demandStatus = DemandStatus.OPEN;

    @DBRef
    private List<MovingOffers> offers;
}

