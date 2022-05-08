package cn.zeroclian.service;

import cn.zeroclian.entity.Classic;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 服务类
 * </p>
 *
 * @author ZeroClian
 * @since 2022-05-07
 */
public interface ClassicService extends IService<Classic> {
    void addLike(Integer id, String type);

    void cancelLike(Integer id, String type);
}
