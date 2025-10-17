package com.ofds.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ofds.entity.MenuItemEntity;
import com.ofds.entity.RestaurantEntity;

public interface MenuItemRepository extends JpaRepository<MenuItemEntity, Integer> {
   // Optional<MenuItemEntity> findByRestaurantId(Long restaurantId);
 
//	List<MenuItemEntity> findByRestaurantId(RestaurantEntity restaurantEntity);

	Optional<MenuItemEntity> findById(Integer id);
}
