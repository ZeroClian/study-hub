package cn.zeroclian.mapper;

import cn.zeroclian.entity.Classic;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author ZeroClian
 * @since 2022-05-07
 */
@Mapper
public interface ClassicMapper extends BaseMapper<Classic> {
    void addLike(Integer id);

    void cancelLike(Integer id);
}
