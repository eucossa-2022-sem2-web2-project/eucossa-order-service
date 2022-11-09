package com.eucossa.client.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author christopherochiengotieno@gmail.com
 * @version 1.0.0
 * @since Wednesday, 09/11/2022
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PayerInfoDto {
    private String email;
    private String firstName;
    private String lastName;
    private String payerId;
    private ShippingAddressDto shippingAddress;
    private String countryCode;
}