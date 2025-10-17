package com.ofds.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofds.dto.RestaurantDTO;
import com.ofds.entity.RestaurantEntity;
import com.ofds.exception.DataNotFoundException;
import com.ofds.service.RestaurantService;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/restaurants")
@RequiredArgsConstructor
public class RestaurantController {

	@Autowired
    RestaurantService restaurantService;

    @PostMapping("/createRestaurant")
    public ResponseEntity<RestaurantEntity> createRestaurant(@RequestBody RestaurantEntity restaurantEntity) {
    	return restaurantService.createRestaurant(restaurantEntity);
    }
    

    @GetMapping("/getAllRestaurants")
      public ResponseEntity<List<RestaurantEntity>> getAllRestaurants() throws DataNotFoundException {
          return restaurantService.getAllRestaurants();
      }

      @DeleteMapping("/deleteRestaurant/{id}")
      public ResponseEntity<Void> deleteRestaurant(@PathVariable Integer id) throws DataNotFoundException {
          return restaurantService.deleteRestaurant(id);
      }

   
}