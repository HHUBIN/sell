package hu.sell.repository;

import hu.sell.dataobject.ProductCategory;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).orElse(null);
        System.out.printf(productCategory.toString());
        System.out.printf("");
        System.out.printf("是的法规和健康噶尔的凤凰健康的风格黄金卡仕达分工会尽快");
    }

    @Test
    public void saveTest(){
        ProductCategory productCategory = new ProductCategory("热销榜", 667);
        productCategory.setCategoryId(3);
        ProductCategory result = repository.save(productCategory);
    }
    @Test
    public void selectTest(){
        List<Integer> list = Arrays.asList(1,2,4);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        System.out.printf(String.valueOf(result));
    }
}