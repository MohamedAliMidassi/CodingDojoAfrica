package com.example.demo.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.models.Travel;
import com.example.demo.repositories.TravelRepository;

@Service
public class TravelService {
	
	@Autowired
	private TravelRepository travelRepo;
	
	public Travel createTravel(Travel travel) {
		return travelRepo.save(travel);
	}
	
	public List<Travel> allTravels(){
		return travelRepo.findAll();
	}
	
	public Travel findTravelById(Long id) {
		Optional<Travel> opTravel = travelRepo.findById(id);
		if(opTravel.isPresent()) {
			return opTravel.get();
		}else {
			return null;
		}
	}

	public Travel updateTravel(Travel travel) {
		return travelRepo.save(travel);
	}
	
	public void deleteTravel(Long id) {
		travelRepo.deleteById(id);
	}
	
}

