package cn.zeroclian.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.time.LocalDate;

/**
 * <p>
 *
 * </p>
 *
 * @author ZeroClian
 * @since 2022-05-07
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("m_classic")
public class Classic implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * id
     */
    @TableId
    private Integer id;

    private String content;

    private Integer favNums;

    private String image;

    private Integer classicIndex;

    private Boolean likeStatus;

    private LocalDate pubdate;

    private String title;

    private String type;


}
