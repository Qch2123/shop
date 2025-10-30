package edu.fdzc.shop.service;

import edu.fdzc.shop.dao.CategoryMapper;
import edu.fdzc.shop.dto.CategoryDto;
import edu.fdzc.shop.entity.Category;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.UUID;

@Service
public class CategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    /**
     * 保存商品分类
     * @param categoryDto
     * @return
     */
    public boolean saveCategory(CategoryDto categoryDto) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDto,category);
        category.setId(UUID.randomUUID().toString());
        return categoryMapper.insert(category)>0;
    }

    /**
     * 修改商品分类
     * @param categoryDto
     * @return
     */
    public boolean updateCategory(CategoryDto categoryDto) {
        Category category = new Category();
        BeanUtils.copyProperties(categoryDto,category);
        category.setUpdateTime(new Date());
        return categoryMapper.update(category)>0;
    }

    /**
     * 删除商品分类
     * @param categoryId
     * @return
     */
    public boolean deleteCategory(String categoryId) {
        return categoryMapper.deleteById(categoryId)>0;
    }

    /**
     * 根据id获取指定的商品分类
     * @param categoryId
     * @return
     */
    public CategoryDto getCategoryById(String categoryId) {
        return convertDto(categoryMapper.findById(categoryId));
    }

    public CategoryDto convertDto(Category category) {
        if(category!=null) {
            CategoryDto categoryDto = new CategoryDto();
            BeanUtils.copyProperties(category,categoryDto);
            return categoryDto;
        }
        return null;
    }
}
