package ${package}.model.base;

import java.util.Date;

/**
 * 缓存存储base模型
 * @author Nobody
 */
@Data
@ToString
public class Base {
    /**
     * 创建时间
     */
    protected Date gmtCreate;

    /**
     * 更新时间
     */
    protected Date gmtModified;
}