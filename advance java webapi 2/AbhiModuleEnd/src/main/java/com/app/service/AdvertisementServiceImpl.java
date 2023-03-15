package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.pojos.Advertisement;
import com.app.repository.AdvertisementRepository;


@Service
@Transactional
public class AdvertisementServiceImpl implements AdvertisementService {
	
	@Autowired
	private AdvertisementRepository adRepo;

	@Override
	public List<Advertisement> getAllAdDetails() {

		return adRepo.findAll();
	}

	@Override
	public Optional<Advertisement> getAdDetails(Long advertisementId) {

		return adRepo.findById(advertisementId);
	}

	@Override
	public Advertisement addAdDetails(Advertisement transientAd) {

		return adRepo.save(transientAd);
	}

	@Override
	public Advertisement updateAdDetails(Advertisement detachedAd) {

		return adRepo.save(detachedAd);
	}

	@Override
	public String deleteAdDetails(Long advertisementId) {
		
		if(adRepo.existsById(advertisementId))
		{
			adRepo.deleteById(advertisementId);
			return "delete operation is successful.......";
		}

		return "delete operation is failed.......";
	}

}
