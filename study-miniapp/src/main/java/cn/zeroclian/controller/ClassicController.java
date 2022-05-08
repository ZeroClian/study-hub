package cn.zeroclian.controller;


import cn.zeroclian.Like;
import cn.zeroclian.entity.Classic;
import cn.zeroclian.service.ClassicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author ZeroClian
 * @since 2022-05-07
 */
@RestController
@RequestMapping("/classic")
public class ClassicController {

    @Autowired
    public ClassicService classicService;

    @GetMapping("/latest")
    public Classic getClassicById() {
        return classicService.getById(1);
    }

    @PostMapping("/like/add")
    public void addLike(@RequestBody Like like) {
        classicService.addLike(like.getId(), like.getType());
    }

    @PostMapping("/like/cancel")
    public void cancelLike(@RequestBody Like like) {
        classicService.cancelLike(like.getId(), like.getType());
    }
}
