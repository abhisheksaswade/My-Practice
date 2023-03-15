package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.pojos.Advertisement;

public interface AdvertisementRepository extends JpaRepository<Advertisement, Long> {


}
