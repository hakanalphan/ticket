package ticket.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.business.abstracts.AirportService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.dataaccess.abstracts.AirportRepository;
import ticket.entities.concretes.Airport;

import java.util.List;
import java.util.Optional;


@Service
public class AirportManager  implements AirportService {

    private final AirportRepository AirportRepository;



    @Autowired
    public AirportManager(AirportRepository AirportRepository) {

        this.AirportRepository = AirportRepository;
    }

    @Override
    public DataResult addAirport(Airport airport) {
        AirportRepository.save(airport);
        return new SuccessDataResult<>(true, "Airport added successfully");
    }

    public DataResult<Airport> getAirportById(Long id) {
        Optional<Airport> airport = AirportRepository.findById(id);

        return new SuccessDataResult<>(airport,"data");
    }

    public DataResult<Airport> updateAirport(Airport airport) {
        Airport existingAirport = AirportRepository.findById(airport.getId()).orElse(null);
        if (existingAirport != null) {
            AirportRepository.save(airport);
            return new SuccessDataResult<>(true, "Airport updated successfully");
        }
        return new SuccessDataResult<>(false, "Airport not found");
    }

    public DataResult<Airport> deleteAirport(Long id) {
        Airport existingAirport = AirportRepository.findById(id).orElse(null);
        if (existingAirport != null) {
            AirportRepository.deleteById(id);
            return new SuccessDataResult<>(true, "Airport deleted successfully");
        }
        return new SuccessDataResult<>(false, "Airport not found");
    }

    public DataResult<List<Airport>> getAllAirports() {
        List<Airport> airports = AirportRepository.findAll();
        return new SuccessDataResult<>(airports,"data listed");
    }
}
