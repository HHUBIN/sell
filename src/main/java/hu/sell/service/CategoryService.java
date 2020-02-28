package hu.sell.service;

import hu.sell.dataobject.ProductCategory;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface CategoryService {

    ProductCategory findOne(Integer productCategoryId);

    List<ProductCategory> findAll();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
