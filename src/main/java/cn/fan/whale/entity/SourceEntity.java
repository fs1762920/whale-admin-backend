package cn.fan.whale.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
public class SourceEntity implements Serializable {
    private Integer sourceId;
    private String sourceName;
    private String sourceCode;
    // 0目录 1菜单 2按钮
    private Integer sourceType;
    private Integer parentId;
    private Integer sort;
    private String sourceRoute;
    private Integer state;
    private Date ctime;
    private Date mtime;
    private List<SourceEntity> children;
}
