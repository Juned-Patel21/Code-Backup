package com.ofds.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import com.ofds.entity.RestaurantEntity;
import com.ofds.exception.DataNotFoundException;
import com.ofds.repository.RestaurantRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class RestaurantService {

	@Autowired
	RestaurantRepository restaurantRepo;
	

    public ResponseEntity<RestaurantEntity> createRestaurant(RestaurantEntity restaurantEntity) {
        RestaurantEntity saved = restaurantRepo.save(restaurantEntity);
        return new ResponseEntity<>(saved, HttpStatus.CREATED);
    }
    

    public ResponseEntity<List<RestaurantEntity>> getAllRestaurants() throws DataNotFoundException {
        List<RestaurantEntity> restaurants = restaurantRepo.findAll();
        if (restaurants.isEmpty()) {
            throw new DataNotFoundException("No restaurants found");
        }
        return new ResponseEntity<>(restaurants, HttpStatus.OK);
    }


    public ResponseEntity<Void> deleteRestaurant(Integer id) throws DataNotFoundException {
        Optional<RestaurantEntity> optionalRestaurant = restaurantRepo.findById(id);
        if (optionalRestaurant.isEmpty()) {
            throw new DataNotFoundException("Restaurant not found with id: " + id);
        }
        restaurantRepo.deleteById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

  }

