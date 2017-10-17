package com.naosim.dddwork.api;

// 操作種別
public enum ServiceType {
    input,
    total;

    public boolean isInput(){
        return (this == ServiceType.input);
    }
    public boolean isTotal(){
        return (this == ServiceType.total);
    }

    public static ServiceType getEnum(String str){
        return ServiceType.valueOf(str);
    }
}
