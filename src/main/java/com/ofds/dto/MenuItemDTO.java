package com.ofds.dto;

import lombok.AllArgsConstructor;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MenuItemDTO {
    private Integer id;
    private String name;
    private Double price;
    private String imageUrl;
    private Integer restaurantId;
}

