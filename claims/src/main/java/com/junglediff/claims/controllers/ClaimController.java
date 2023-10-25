package com.junglediff.claims.controllers;


import com.junglediff.claims.entities.Claim;
import com.junglediff.claims.services.ClaimService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/claims/")
@RequiredArgsConstructor
public class ClaimController {
    private final ClaimService claimService;


    @PostMapping
    public ResponseEntity<Claim> addClaim(@RequestBody Claim claim){
        return ResponseEntity.ok(claimService.addClaim(claim));
    }


    @GetMapping("{claimId}")
    public ResponseEntity<Claim> getClaimById(@PathVariable(name = "claimId") long claimId){
        return ResponseEntity.ok(claimService.getClaimById(claimId));
    }
    @GetMapping()
    public ResponseEntity<List<Claim>> getAllClaim(){
        return ResponseEntity.ok(claimService.getAllClaim());
    }
    @PatchMapping
    public ResponseEntity<Claim> updateClaim(@RequestBody Claim claim){
        return ResponseEntity.ok(claimService.updateClaim(claim));
    }
    @DeleteMapping
    public ResponseEntity<String> addClaim(@RequestParam long claimId){
        claimService.deleteClaim(claimId);
        return ResponseEntity.ok("Claim deleted successfully");
    }
}
