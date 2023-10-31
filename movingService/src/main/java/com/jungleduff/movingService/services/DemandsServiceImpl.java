package com.jungleduff.movingService.services;

import com.jungleduff.movingService.entities.Demands;
import com.jungleduff.movingService.repositories.DemandRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class DemandsServiceImpl implements DemandService {

    private final DemandRepository demandsRepository;

    @Override
    public Demands createDemands(Demands demands) {
        return demandsRepository.save(demands);
    }

    @Override
    public Demands getDemandsById(String id) {
        return demandsRepository.findById(id).orElse(null);
    }

    @Override
    public List<Demands> getAllDemands() {
        return demandsRepository.findAll();
    }

    @Override
    public Demands updateDemands(Demands demand) {
        return demandsRepository.save(demand);
    }

    @Override
    public void deleteDemands(String demandId) {
        demandsRepository.deleteById(demandId);
    }

    // Implement other CRUD methods
}
