package com.jluuno.result;

public enum AppHttpCodeEnum {
    // 成功
    SUCCESS(200,"操作成功"),
    // 登录
    NEED_LOGIN(401,"需要登录后操作"),
    NO_OPERATOR_AUTH(403,"无权限操作"),
    SYSTEM_ERROR(500,"出现错误"),
    USERNAME_EXIST(501,"用户名已存在"),
    PHONENUMBER_EXIST(502,"手机号已存在"), EMAIL_EXIST(503, "邮箱已存在"),

    CONTENT_NOT_NULL(506, "评论信息不能为空"),
    REQUIRE_USERNAME(504, "必需填写用户名"),
    LOGIN_ERROR(505,"用户名或密码错误"),
    FILE_TYPE_ERROR(509,"文件类型错误"),
    UPLOAD_ERROR(510,"文件上传异常"),

    USERNAME_NOT_NULL(511,"用户名不能为空"),
    NICKNAME_NOT_NULL(512,"昵称不能为空"),
    EMAIL_NOT_NULL(513,"邮箱不能为空"),
    PASSWORD_NOT_NULL(514,"密码不能为空"),
    NICKNAME_EXIST(515,"昵称已存在"),
    CATEGORY_NAME_NEED(516, "分类名必须填写"),
    LINK_NAME_NEED(517,"友链名字必须填写" ),
    LINK_ADDRESS_NEED(518,"友链网址必须填写" );


    int code;
    String msg;
    AppHttpCodeEnum(int code, String errorMessage){
        this.code = code;
        this.msg = errorMessage;
    }
    public int getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }
}