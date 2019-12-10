package com.weibo.project.hmhw.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.weibo.project.hmhw.mapper.CategoryMapper;
import com.weibo.project.hmhw.model.Category;
import com.weibo.project.hmhw.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author weibo
 * @since 2019-12-10
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {

}
