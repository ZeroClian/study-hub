package cn.zeroclian.entity;

import cn.zeroclian.enums.Type;
import lombok.Data;

/**
 * @author Justin
 */
@Data
public class Category {
    private Integer id;
    private String name;
    private Type type;
}
