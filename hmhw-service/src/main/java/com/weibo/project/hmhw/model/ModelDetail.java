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
@TableName("hmhw_model_detail")
public class ModelDetail extends Model<ModelDetail> {

    private static final long serialVersionUID = 1L;

    @TableId("ID")
    private Integer id;
    /**
     * 材料
     */
    @TableField("INTRODUCE")
    private String introduce;
    /**
     * 图文
     */
    @TableField("PICTURE")
    private String picture;
    /**
     * 配方
     */
    @TableField("RECIPE")
    private String recipe;
    /**
     * 关联模型id
     */
    @TableField("MODLE_ID")
    private Integer modleId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
