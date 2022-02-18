package tourguide.controller;

import gpsUtil.location.Attraction;
import gpsUtil.location.VisitedLocation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import tourguide.services.GpsService;

import java.util.List;
import java.util.UUID;

@RestController
public class GpsController {

    private final GpsService gpsService;

    public GpsController(GpsService gpsService) {
        this.gpsService = gpsService;
    }

    @GetMapping("getLocation/{userId}")
    public VisitedLocation getUserLocation(@PathVariable String userId){
        return gpsService.getUserLocation(UUID.fromString(userId));
    }

    @GetMapping("getAttractions")
    public List<Attraction> getAttractions(){
        return gpsService.getAttractions();
    }
}
