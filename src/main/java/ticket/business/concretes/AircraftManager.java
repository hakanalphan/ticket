package ticket.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ticket.business.abstracts.AircraftService;
import ticket.core.utilities.results.DataResult;
import ticket.core.utilities.results.SuccessDataResult;
import ticket.dataaccess.abstracts.AircraftRepository;
import ticket.entities.concretes.Aircraft;

import java.util.List;


@Service
public class AircraftManager implements AircraftService {

    private AircraftRepository AircraftRepository;


    @Autowired

    public AircraftManager(AircraftRepository AircraftRepository) {

        this.AircraftRepository = AircraftRepository;
    }

    @Override
    public DataResult<Aircraft> addAircraft(Aircraft aircraft) {
        AircraftRepository.save(aircraft);
        return new SuccessDataResult<>(true, "Aircraft added successfully");
    }

    @Override
    public DataResult<Aircraft> getAircraftById(Long id) {
        Aircraft aircraft = AircraftRepository.findById(id).orElse(null);
        return new SuccessDataResult<>(aircraft,"");}

    @Override
    public DataResult<Aircraft> updateAircraft(long id) {
        return new SuccessDataResult<Aircraft>(this.AircraftRepository.getById(id),"");
    }




    @Override
    public DataResult<Aircraft> deleteAircraft(Long id) {
        Aircraft existingAircraft = AircraftRepository.findById(id).orElse(null);
        if (existingAircraft != null) {
            AircraftRepository.deleteById(id);
            return new SuccessDataResult<>(true, "Aircraft deleted successfully");
        }
        return new SuccessDataResult<>(false, "Aircraft not found");
    }

    @Override
    public DataResult<List<Aircraft>> getAllAircrafts() {
        return new SuccessDataResult<List<Aircraft>>(this.AircraftRepository.findAll(),"data listed");
    }
}
