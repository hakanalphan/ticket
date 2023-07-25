package ticket.wepApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticket.business.abstracts.AircraftService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.entities.concretes.Aircraft;

import java.util.List;


@RestController
@RequestMapping("/aircraft")
public class AircraftsController {
    private final AircraftService aircraftService;

    @Autowired
    public AircraftsController(AircraftService aircraftService) {
        this.aircraftService = aircraftService;
    }

    @PostMapping
    public Result<Aircraft> createAircraft(@RequestBody Aircraft aircraft) {
        return aircraftService.addAircraft(aircraft);
    }

    @GetMapping
    public Result<List<Aircraft>> getAllAircraft() {
        return aircraftService.getAllAircrafts();
    }

    @GetMapping("/{id}")
    public Result<Aircraft> getAircraftById(@PathVariable Long id) {
        return aircraftService.getAircraftById(id);
    }

    @PutMapping("/{id}")
    public Result<Aircraft> updateAircraft(@PathVariable Long id,@RequestBody Aircraft aircraft) {
        return aircraftService.updateAircraft(id,aircraft);
    }

    @DeleteMapping("/{id}")
    public DataResult<Aircraft> deleteAircraft(@PathVariable Long id) {
        return aircraftService.deleteAircraft(id);
    }
}
