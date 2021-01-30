package us.hyalen.location.service;

import us.hyalen.location.entity.Location;

import java.util.List;

public interface LocationService {
    List<Location> retrieveLocations();
    List<String> findAllNames();
    List<String> findAllAddresses();
    String findNameById(Long id);
}
