package com.chaokunyang.shop.admin.service.fallback;

import com.chaokunyang.shop.admin.service.CategoryService;
import com.chaokunyang.shop.model.Category;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * @author panxiang
 * @create 2017-08-24 17:25
 */
@Component
public class CategoryServiceFallback implements CategoryService {

    private Logger logger = LogManager.getLogger(getClass());


    @Override
    public Category get(@PathVariable("id") Long id) {
        logger.error("CATEGORY-SERVICE unavailable");
        return null;
    }

    @Override
    public Category save(@RequestParam Category category) {
        logger.error("CATEGORY-SERVICE unavailable");

        return null;
    }
}
