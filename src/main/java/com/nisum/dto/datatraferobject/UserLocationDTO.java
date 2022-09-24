package com.nisum.dto.datatraferobject;

import lombok.Data;

@Data
public class UserLocationDTO {
    private long UserId;
    private String email;
    private String place;
    private double longitude;
    private double latitude;



}
