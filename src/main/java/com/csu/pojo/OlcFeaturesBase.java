package com.csu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.csu.handler.PgGeometryTypeHandler;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author tang
 * @since 2022-09-15
 */
@Data
@EqualsAndHashCode(callSuper = false)
@ToString
public class OlcFeaturesBase implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id;

    private String featureId;

    private Integer userId;

    private String featureName;

    private Date updateTime;


    @TableField(typeHandler = PgGeometryTypeHandler.class)
    private String geom;

    private Double aiPrecison;

    private Integer version;

    private String tag;


}
