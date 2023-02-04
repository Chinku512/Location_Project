package com.example.Location.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Location.Entity.Location;
import com.example.Location.Repository.LocationRepository;
@Service
public class LocationServiceImpl implements LocationService {
	
	@Autowired
	private LocationRepository locationRepo;

	@Override
	public void createLocation(Location location) {
		locationRepo.save(location);
	}

	@Override
	public List<Location> listAllLocation() {
		List<Location> locations = locationRepo.findAll();
		return locations;
	}

	@Override
	public void deleteById(long id) {
		locationRepo.deleteById(id);
	}

	@Override
	public Location getLocationById(long id) {
		Optional<Location> location = locationRepo.findById(id);
		return null;
	}


}
