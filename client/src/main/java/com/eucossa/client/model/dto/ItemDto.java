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
public class ItemDto {
    private String name;
    private String sku;
    private String price;
    private String currency;
    private String tax;
    private String quantity;
}
