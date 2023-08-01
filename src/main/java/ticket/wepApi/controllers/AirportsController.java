package ticket.wepApi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ticket.business.abstracts.AirportService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.entities.concretes.Airport;

import javax.xml.transform.Result;
import java.util.List;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/airports")
public class AirportsController {


    @Autowired
    private final AirportService airportService;


    public AirportsController(AirportService airportService) {
        this.airportService = airportService;
    }

    @GetMapping("/all")
    public DataResult<List<Airport>> getAllAirports() {
        return airportService.getAllAirports();
    }

    @PostMapping("/add")
    public DataResult<Airport> addAirport(@RequestBody Airport airport) {
        return  new SuccessDataResult<>(airportService.addAirport(airport),"");
    }

    @GetMapping("/{airportId}")
    public DataResult<Airport> getAirportById(@PathVariable Long airportId) {
        return airportService.getAirportById(airportId);
    }

    @PutMapping("/update")
    public DataResult<Airport> updateAirport(@RequestBody Airport airport) {
        return new SuccessDataResult<>(airportService.updateAirport(airport),"da");
    }

    @DeleteMapping("/delete/{id}")
    public DataResult<Airport> deleteAirport(@PathVariable Long id) {
        return (DataResult<Airport>) airportService.deleteAirport(id);
    }
}
