package com.yann.autoreply.common;

public enum ResultCodeEnum {

	SUCCESS("100", "success"),
    FAILURE("101", "error"),
    OVERTIME("102", "overtime");

    private String code;
    private String desc;

    ResultCodeEnum(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public String getCode() {
        return code;
    }

    public String getDesc() {
        return desc;
    }

    public static String getDesc(String code) {
        for (ResultCodeEnum c : ResultCodeEnum.values()) {
            if (c.getCode().equals(code)) {
                return c.getDesc();
            }
        }
        return null;
    }
	
}
