package edu.fdzc.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 分类DTO
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {
    /**
     * 分类ID
     */
    private String id;
    /**
     * 分类名称
     */
    private String categoryName;
}
