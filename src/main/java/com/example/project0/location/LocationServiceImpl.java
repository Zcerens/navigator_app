package com.example.project0.location;

import com.example.project0.infrastructure.exceptions.LocationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/*
 * @author: zcs
 * @date: 12.08.2024
 * @time: 14:21
 *
 * */

@Service
public class LocationServiceImpl implements LocationService{
    @Autowired
    private LocationRepository locationRepository;

    @Override
    public List<Location> getAllLocations() {
        return locationRepository.findAll();
    }

    @Override
    public Optional<Location> getLocationById(Long id) {
        return locationRepository.findById(id);
    }

    @Override
    public Location createLocation(Location location) {
        return locationRepository.save(location);
    }

    @Override
    public Location updateLocation(Long id, Location locationDetails) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new LocationNotFoundException("Location with ID " + id + " not found."));
        location.setName(locationDetails.getName());
        location.setAddress(locationDetails.getAddress());
        location.setLatitude(locationDetails.getLatitude());
        location.setLongitude(locationDetails.getLongitude());
        location.setDescription(locationDetails.getDescription());
        location.setCategory(locationDetails.getCategory());
        location.setUpdatedDate(locationDetails.getUpdatedDate());
        return locationRepository.save(location);
    }

    @Override
    public void deleteLocation(Long id) {
        Location location = locationRepository.findById(id)
                .orElseThrow(() -> new LocationNotFoundException("Location with ID " + id + " not found."));
        locationRepository.delete(location);
    }
}
