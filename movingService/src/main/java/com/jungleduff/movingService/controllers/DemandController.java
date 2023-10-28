package com.jungleduff.movingService.controllers;

import com.jungleduff.movingService.entities.Demands;
import com.jungleduff.movingService.services.DemandService;
import com.jungleduff.movingService.services.DemandsServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("api/v1/demands/")
@RequiredArgsConstructor
public class DemandController {

    private final DemandService demandService;

    @PostMapping
    public Demands createDemands(@RequestBody Demands demands) {
        return demandService.createDemands(demands);
    }

    @GetMapping("{id}")
    public Demands getDemandsById(@PathVariable String id) {
        return demandService.getDemandsById(id);
    }

    @GetMapping
    public List<Demands> getAllDemands() {
        return demandService.getAllDemands();
    }

}
