package com.weibo.project.hmhw.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author weibo
 * @since 2019-12-10
 */
@Data
@Accessors(chain = true)
@TableName("hmhw_category")
public class Category extends Model<Category> {

    private static final long serialVersionUID = 1L;

    /**
     * 分类id
     */
    @TableId("CATEGORY_ID")
    private Integer categoryId;
    /**
     * 分类名
     */
    @TableField("MODEL_CATEGORY")
    private String modelCategory;
    /**
     * 分类归属
     */
    @TableField("category_type")
    private Integer categoryType;
    /**
     * 分类编码
     */
    @TableField("category_code")
    private String categoryCode;


    @Override
    protected Serializable pkVal() {
        return this.categoryId;
    }

}
