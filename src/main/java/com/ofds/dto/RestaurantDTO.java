package com.ofds.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestaurantDTO {
    private Integer id;
    private String name;
    private String ownerName;
    private String email;
    private String phone;
    private String address;
    private Double rating;
    private String imageUrl;
}