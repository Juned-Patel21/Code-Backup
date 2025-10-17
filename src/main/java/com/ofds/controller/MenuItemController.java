package com.ofds.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ofds.dto.MenuItemDTO;
import com.ofds.entity.MenuItemEntity;
import com.ofds.exception.DataNotFoundException;
import com.ofds.service.MenuItemService;

import org.springframework.web.bind.annotation.RequestBody;
import lombok.RequiredArgsConstructor;

//@RestController
//@RequestMapping("/api/menu-items")
//@RequiredArgsConstructor
//public class MenuItemController {
//
//    private final MenuItemService menuItemService;
//
//    @GetMapping("/getMenuItemsByRestaurantId/restaurant/{restaurantId}")
//    public ResponseEntity<List<MenuItemDTO>> getMenuItemsByRestaurantId(@PathVariable Long restaurantId) {
//        return menuItemService.getMenuItemsByRestaurantId(restaurantId);
//    }
//
//    @PostMapping("/createMenuItem/restaurant/{restaurantId}")
//    public ResponseEntity<MenuItemDTO> createMenuItem(
//            @PathVariable Long restaurantId,
//            @RequestBody MenuItemDTO dto) {
//        return menuItemService.createMenuItem(restaurantId, dto);
//    }
//
//    @PutMapping("/updateMenuItem/{id}")
//    public ResponseEntity<MenuItemDTO> updateMenuItem(
//            @PathVariable Long id,
//            @RequestBody MenuItemDTO dto) {
//        return menuItemService.updateMenuItem(id, dto);
//    }
//
//    @DeleteMapping("/deleteMenuItem/{id}")
//    public ResponseEntity<Void> deleteMenuItem(@PathVariable Long id) {
//        return menuItemService.deleteMenuItem(id);
//    }
//}



@RestController
@RequestMapping("/api/menu-items")
@RequiredArgsConstructor
public class MenuItemController {

    private final MenuItemService menuItemService;

    @GetMapping("/getMenuItemsByRestaurantId/restaurant/{restaurantId}")
    public ResponseEntity<List<MenuItemDTO>> getMenuItemsByRestaurantId(@PathVariable Integer restaurantId) throws DataNotFoundException {
        return menuItemService.getMenuItemsByRestaurantId(restaurantId);
    }
    
    @PostMapping("/createMenuItem/restaurant/{restaurantId}")
    public ResponseEntity<MenuItemDTO> createMenuItem(
            @PathVariable Integer restaurantId,
            @RequestBody MenuItemDTO dto) throws DataNotFoundException {
        return menuItemService.createMenuItem(restaurantId, dto);
    }
    

    @PutMapping("/updateMenuItem/{id}")
    public ResponseEntity<MenuItemDTO> updateMenuItem(
            @PathVariable Integer id,
            @RequestBody MenuItemDTO dto) throws DataNotFoundException {
        return menuItemService.updateMenuItem(id, dto);
    }

    @DeleteMapping("/deleteMenuItem/{id}")
    public ResponseEntity<Void> deleteMenuItem(@PathVariable Integer id) throws DataNotFoundException {
        return menuItemService.deleteMenuItem(id);
    }
}