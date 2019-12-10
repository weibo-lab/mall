package com.weibo.project.hmhw.model;

import com.baomidou.mybatisplus.activerecord.Model;
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
@TableName("hmhw_model_digital")
public class ModelDigital extends Model<ModelDigital> {

    private static final long serialVersionUID = 1L;

    private String picture1;
    private String picture2;
    private String picture3;
    private String video1;
    private String video2;
    private String video3;
    @TableId(value = "DIGITAL_ID", type = IdType.AUTO)
    private Integer digitalId;


    @Override
    protected Serializable pkVal() {
        return this.digitalId;
    }

}
