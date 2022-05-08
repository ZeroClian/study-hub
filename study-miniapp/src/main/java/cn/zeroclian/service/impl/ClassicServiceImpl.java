package cn.zeroclian.service.impl;

import cn.zeroclian.entity.Classic;
import cn.zeroclian.mapper.ClassicMapper;
import cn.zeroclian.service.ClassicService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author ZeroClian
 * @since 2022-05-07
 */
@Service
public class ClassicServiceImpl extends ServiceImpl<ClassicMapper, Classic> implements ClassicService {

    @Autowired
    ClassicMapper classicMapper;

    @Override
    public void addLike(Integer id, String type) {
        Classic classic = getById(id);
        if (!classic.getLikeStatus()) {
            classic.setLikeStatus(true);
            classic.setFavNums(classic.getFavNums() + 1);
        }
        saveOrUpdate(classic);
    }

    @Override
    public void cancelLike(Integer id, String type) {
        Classic classic = getById(id);
        if (classic.getLikeStatus()) {
            classic.setLikeStatus(false);
            classic.setFavNums(classic.getFavNums() - 1);
        }
        saveOrUpdate(classic);
    }
}
