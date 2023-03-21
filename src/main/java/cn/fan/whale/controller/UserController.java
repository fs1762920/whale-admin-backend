package cn.fan.whale.controller;

import cn.fan.whale.common.BaseReturnDto;
import cn.fan.whale.entity.UserEntity;
import cn.fan.whale.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/login")
    public BaseReturnDto login(@RequestParam UserEntity userEntity) {
        return null;
    }

    @PostMapping("/logout")
    public BaseReturnDto logout(@RequestParam UserEntity userEntity) {
        return null;
    }

    @GetMapping("/findByPage")
    public BaseReturnDto findByPage(Integer pageNum, Integer pageSize, UserEntity userEntity) {
        return null;
    }

    @PostMapping("/save")
    public BaseReturnDto save(@RequestParam UserEntity userEntity) {
        return null;
    }

    @PostMapping("/update")
    public BaseReturnDto update(@RequestParam UserEntity userEntity) {
        return null;
    }

    @GetMapping("/delete")
    public BaseReturnDto delete(Integer userId) {
        return null;
    }
}
