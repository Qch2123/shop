package edu.fdzc.shop.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 商品分类实体类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Category extends AbstractEntity{
    /**
     * 分类名称
     */
    private String categoryName;
}
