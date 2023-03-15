package com.app.core;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.pojos.Advertisement;
import com.app.pojos.User;
import com.app.service.AdvertisementService;
import com.app.service.UserService;

@RestController
@RequestMapping("ads")
public class AdvertisementController {
	
	@Autowired
	private AdvertisementService adServ;
	
	
	@GetMapping
	public List<Advertisement> getAllAds()
	{
		return adServ.getAllAdDetails();
	}
	
	
	@GetMapping("/{adId}")
	public Optional<Advertisement> getAd(@PathVariable Long adId)
	{
		return adServ.getAdDetails(adId);
	}

	
	@PostMapping
	public Advertisement addAdvertisement(@RequestBody Advertisement transientAd)
	{
		return adServ.addAdDetails(transientAd);
	}
	
	
	@PutMapping
	public Advertisement updateAd(@RequestBody Advertisement detachedAd)
	{
		return adServ.updateAdDetails(detachedAd);
	}
	
	@DeleteMapping("/{adId}}")
	public String deleteAd(@PathVariable Long adId)
	{
		return adServ.deleteAdDetails(adId);
	}
}
