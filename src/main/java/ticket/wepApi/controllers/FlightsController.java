package ticket.wepApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;
import ticket.business.abstracts.FlightService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.entities.concretes.Flight;

import java.util.List;

@RestController
@RequestMapping("/flights")
@CrossOrigin(origins = "*")
public class FlightsController {


    private final FlightService flightService;

    @Autowired
    public FlightsController(FlightService flightService) {
        this.flightService = flightService;
    }

    @GetMapping("/getall")
    public DataResult<List<Flight>> getAllFlights() {
        return flightService.getAllFlights();
    }

    @PostMapping("/add")
    public Result addFlight(@RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }

    @GetMapping("/{flightId}")
    public DataResult<Flight> getFlightById(@PathVariable Long flightId) {
        return flightService.getFlightById(flightId);
    }

    @PutMapping("/update")
    public DataResult<Flight> updateFlight(@RequestBody Flight flight) {
        return flightService.updateFlight(flight);
    }

    @DeleteMapping("/delete/{id}")
    public DataResult<Flight> deleteFlight(@PathVariable long id) {
        return flightService.deleteFlight(id);
    }
}
