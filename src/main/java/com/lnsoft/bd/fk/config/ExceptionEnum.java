package com.lnsoft.bd.fk.config;

/**
 * 自定义枚举异常
 */
public enum ExceptionEnum {

    Error_1111(1111,"上传图片失败"),
    Error_1112(1112,"专业流程ID为空");

    private String name;

    private int index;

    private ExceptionEnum(int index,String name) {
        this.name = name;
        this.index = index;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
