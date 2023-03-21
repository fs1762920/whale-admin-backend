package cn.fan.whale.controller;

import cn.fan.whale.common.BaseReturnDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/system")
public class SystemController {

    @GetMapping("/server")
    public BaseReturnDto server() {
        // {service: {}, jvm: {}}
        return null;
    }

    @GetMapping("/cpu")
    public BaseReturnDto cpu(Date startDateTime, Date endDateTime) {
        return null;
    }

    @GetMapping("/memo")
    public BaseReturnDto memo(Date startDateTime, Date endDateTime) {
        return null;
    }

}
