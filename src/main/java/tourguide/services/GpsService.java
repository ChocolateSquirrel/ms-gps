package tourguide.services;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GpsService {

    private final GpsUtil gpsUtil;

    public GpsService() {
        this.gpsUtil = new GpsUtil();
    }

    public VisitedLocation getUserLocation(UUID userId){
        return gpsUtil.getUserLocation(userId);
    }

    public List<Attraction> getAttractions(){
        return gpsUtil.getAttractions();
    }


}
