package com.example.project0.location;

import java.util.List;
import java.util.Optional;

public interface LocationService {
    List<Location> getAllLocations();
    Optional<Location> getLocationById(Long id);
    Location createLocation(Location location);
    Location updateLocation(Long id, Location locationDetails);
    void deleteLocation(Long id);
}
