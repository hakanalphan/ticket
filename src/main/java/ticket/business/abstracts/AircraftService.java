package ticket.business.abstracts;

import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.Result;
import ticket.entities.concretes.Aircraft;

import java.util.List;

public interface AircraftService {

    Result addAircraft(Aircraft aircraft);
    DataResult<Aircraft> getAircraftById(Long id);
    DataResult<Aircraft> updateAircraft( long id);

    DataResult<Aircraft> deleteAircraft(Long id);

    DataResult<List<Aircraft>> getAllAircrafts();
}
