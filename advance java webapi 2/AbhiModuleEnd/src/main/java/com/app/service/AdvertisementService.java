package com.app.service;

import java.util.List;
import java.util.Optional;

import com.app.dto.AuthenticationDto;
import com.app.pojos.Advertisement;
import com.app.pojos.User;

public interface AdvertisementService {
	
	public List<Advertisement> getAllAdDetails();
	
	public Optional<Advertisement> getAdDetails(Long advertisementId);
	
	public Advertisement addAdDetails(Advertisement transientAd);
	
	public Advertisement updateAdDetails(Advertisement detachedAd);
	
	public String deleteAdDetails(Long advertisementId);
	
}
