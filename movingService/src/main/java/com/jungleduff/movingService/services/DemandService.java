package com.jungleduff.movingService.services;

import com.jungleduff.movingService.entities.Demands;

import java.util.List;

public interface DemandService {
    Demands createDemands(Demands demands);
    Demands getDemandsById(String id);
    List<Demands> getAllDemands();
    // Add other CRUD methods
}
