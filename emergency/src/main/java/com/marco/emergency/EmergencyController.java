package com.marco.emergency;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("api/v1/emergency")
@RequiredArgsConstructor
public class EmergencyController {


        private final EmergencyService es;


        @PostMapping
        public ResponseEntity<Emergency> addEmergency(@RequestBody Emergency e){
            return ResponseEntity.ok(es.addEmergency(e));
        }


        @GetMapping("{emId}")
        public ResponseEntity<Emergency> getClaimById(@PathVariable(name = "emId") int emId){
            return ResponseEntity.ok(es.getEmById(emId));
        }
        @GetMapping()
        public ResponseEntity<List<Emergency>> getAllClaim(){
            return ResponseEntity.ok(es.getAllEmergencies());
        }

        @PatchMapping
        public ResponseEntity<Emergency> updateClaim(@RequestBody Emergency e){
            return ResponseEntity.ok(es.editEmergency(e));
        }
        @DeleteMapping
        public ResponseEntity<String> deleteEmergency(@RequestParam int e){
            es.deleteEm(e);
            return ResponseEntity.ok("Emergency deleted successfully");
        }
}
