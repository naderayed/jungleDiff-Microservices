package com.junglediff.claims.services;

import com.junglediff.claims.entities.Claim;

import java.util.List;

public interface ClaimService {
    Claim addClaim(Claim claim);
    Claim updateClaim(Claim claim);
    Claim getClaimById(long id);
   List<Claim> getAllClaim();
   void deleteClaim(long claimId);
}
