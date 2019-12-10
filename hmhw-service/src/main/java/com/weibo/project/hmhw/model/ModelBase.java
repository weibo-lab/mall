package com.weibo.project.hmhw.model;

import com.baomidou.mybatisplus.activerecord.Model;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
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
@TableName("hmhw_model_base")
public class ModelBase extends Model<ModelBase> {

    private static final long serialVersionUID = 1L;

    /**
     * 模型名称
     */
    @TableField("MODEL_NAME")
    private String modelName;
    /**
     * 难度等级
     */
    @TableField("MODEL_LEVEL")
    private String modelLevel;
    /**
     * 制作统计
     */
    @TableField("MODEL_TOTAL")
    private String modelTotal;
    /**
     * 浏览统计
     */
    @TableField("SCAN_TOTAL")
    private String scanTotal;
    /**
     * 智力
     */
    @TableField("INTELLECT")
    private String intellect;
    /**
     * 一级分类
     */
    @TableField("TYPE_F")
    private String typeF;
    /**
     * 二级分类
     */
    @TableField("TYPE_S")
    private String typeS;
    /**
     * 课程主键
     */
    @TableId(value = "ID", type = IdType.AUTO)
    private Integer id;
    /**
     * 媒体外键
     */
    @TableField("DIGITAL_ID")
    private Integer digitalId;


    @Override
    protected Serializable pkVal() {
        return this.id;
    }

}
