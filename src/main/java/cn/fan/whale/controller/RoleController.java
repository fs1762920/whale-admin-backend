package cn.fan.whale.controller;

import cn.fan.whale.common.BaseReturnDto;
import cn.fan.whale.entity.RoleEntity;
import cn.fan.whale.service.RoleService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/role")
public class RoleController {

    private final RoleService roleService;

    public RoleController(RoleService roleService) {
        this.roleService = roleService;
    }

    @GetMapping("/findByPage")
    public BaseReturnDto findByPage(Integer pageNum, Integer pageSize, RoleEntity roleEntity) {
        return null;
    }

    @PostMapping("/save")
    public BaseReturnDto save(@RequestParam RoleEntity roleEntity) {
        return null;
    }

    @PostMapping("/update")
    public BaseReturnDto update(@RequestParam RoleEntity roleEntity) {
        return null;
    }

    @GetMapping("/delete")
    public BaseReturnDto delete(Integer roleId) {
        return null;
    }
}
