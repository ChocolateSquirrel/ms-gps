package gps.services;

import gpsUtil.GpsUtil;
import gpsUtil.location.Attraction;

import gpsUtil.location.VisitedLocation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class GpsService {

    private static final double STATUTE_MILES_PER_NAUTICAL_MILE = 1.15077945;
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
