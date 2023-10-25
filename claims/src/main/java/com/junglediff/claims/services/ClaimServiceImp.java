package com.junglediff.claims.services;

import com.junglediff.claims.entities.Claim;
import com.junglediff.claims.repositories.ClaimsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClaimServiceImp implements ClaimService {

    private final ClaimsRepository repository;
    @Override
    public Claim addClaim(Claim claim) {
        return repository.save(claim);
    }

    @Override
    public Claim updateClaim(Claim claim) {
        return repository.save(claim);
    }

    @Override
    public Claim getClaimById(long id) {
        return repository.findById(id)
                .orElse(Claim.builder().claimDesc("Fake Claim").build());
    }

    @Override
    public List<Claim> getAllClaim() {
        return repository.findAll();
    }

    @Override
    public void deleteClaim(long claimId) {
          repository.deleteById(claimId);
    }
}
