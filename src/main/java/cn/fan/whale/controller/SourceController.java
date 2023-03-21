package cn.fan.whale.controller;

import cn.fan.whale.common.BaseReturnDto;
import cn.fan.whale.entity.RoleEntity;
import cn.fan.whale.entity.SourceEntity;
import cn.fan.whale.service.SourceService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/source")
public class SourceController {

    private final SourceService sourceService;

    public SourceController(SourceService sourceService) {
        this.sourceService = sourceService;
    }

    @GetMapping("/find")
    public BaseReturnDto find(SourceEntity sourceEntity) {
        return null;
    }

    @PostMapping("/save")
    public BaseReturnDto save(@RequestParam SourceEntity sourceEntity) {
        return null;
    }

    @PostMapping("/update")
    public BaseReturnDto update(@RequestParam SourceEntity sourceEntity) {
        return null;
    }

    @GetMapping("/delete")
    public BaseReturnDto delete(Integer sourceId) {
        return null;
    }
}
