package com.jungleduff.movingService.services;

import com.jungleduff.movingService.entities.Demands;

import java.util.List;

public interface DemandService {
    Demands createDemands(Demands demands);
    Demands getDemandsById(String id);
    List<Demands> getAllDemands();

    Demands updateDemands(Demands demands);

    void  deleteDemands(String demandId);
    // Add other CRUD methods
}
