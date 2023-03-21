package cn.fan.whale.common;

import cn.fan.whale.constant.ExceptionEnum;
import lombok.Data;

import java.io.Serializable;

@Data
public class BaseReturnDto implements Serializable {

    public static final int RESP_SUCCESS_CODE = 0;

    private int code;
    private String msg;
    private Object data;

    public BaseReturnDto(){
        this.code=RESP_SUCCESS_CODE;
    }

    public BaseReturnDto(int code, String msg){
        this.code=code;
        this.msg=msg;
    }

    public BaseReturnDto(int code, String msg, Object data){
        this.code=code;
        this.msg=msg;
        this.data=data;
    }

    public static BaseReturnDto success(int code, String message) {
        BaseReturnDto returnDto = new BaseReturnDto();
        returnDto.setMsg(message);
        return returnDto;
    }

    public static BaseReturnDto success(Object data) {
        BaseReturnDto returnDto = new BaseReturnDto();
        returnDto.setMsg("success");
        returnDto.setData(data);
        return returnDto;
    }

    public static BaseReturnDto error(int code, String msg) {
        BaseReturnDto returnDto = new BaseReturnDto();
        returnDto.setCode(code);
        returnDto.setMsg(msg);
        returnDto.setData(null);
        return returnDto;
    }

    public static BaseReturnDto error(ExceptionEnum exceptionEnum) {
        BaseReturnDto returnDto = new BaseReturnDto();
        returnDto.setCode(exceptionEnum.getCode());
        returnDto.setMsg(exceptionEnum.getMsg());
        returnDto.setData(null);
        return returnDto;
    }
}
