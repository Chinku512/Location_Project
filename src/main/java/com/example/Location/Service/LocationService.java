package com.example.Location.Service;

import java.util.List;

import com.example.Location.Entity.Location;

public interface LocationService {

	void createLocation(Location location);

	List <Location>listAllLocation();

	void deleteById(long id);

	Location getLocationById(long id);



}
