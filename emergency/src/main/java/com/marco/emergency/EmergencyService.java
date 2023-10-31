package com.marco.emergency;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmergencyService implements EmergencyS{

    private final EmergencyRepository repository;

    @Override
    public Emergency addEmergency(Emergency e) {
        return repository.save(e);
    }

    @Override
    public Emergency editEmergency(Emergency e) {
        return repository.save(e);
    }

    @Override
    public Emergency getEmById(int id) {
        return repository.findById(id)
                .orElse(Emergency.builder().title("Not Found").build());
    }

    @Override
    public List<Emergency> getAllEmergencies() {
        return repository.findAll();
    }

    @Override
    public void deleteEm(int emId) {
        repository.deleteById(emId);
    }
}