package com.helian.health.util;

public enum ResultCode
{
    /**
     * 正常
     */
    NORMAL(0, "NORMAL", "正常", 0),
    
    /** ========== 系统错误码 ========== **/
    
    /**
     * Token过期
     */
    TOKEN_ERROT(401, "TOKEN_ERROT", "登录已失效,请重新登录", 1),
    
    /**
     * 系统错误
     */
    ERROR_SYSTEM(10001, "ERROR_SYSTEM", "系统错误,请稍后再试！", 1),
    
    /**
     * 数据库查询失败
     */
    ERROR_SYSTEM_DATABASE_QUERY(10011, "ERROR_SYSTEM_DATABASE_QUERY", "数据库查询失败！", 1),
    
    /**
     * 数据库存储失败
     */
    ERROR_SYSTEM_DATABASE_INSERT(10012, "ERROR_SYSTEM_DATABASE_INSERT", "数据库存储失败！", 1),
    
    /**
     * 数据库更新失败
     */
    ERROR_SYSTEM_DATABASE_UPDATE(10013, "ERROR_SYSTEM_DATABASE_UPDATE", "数据库更新失败！", 1),
    
    /**
     * 数据库事务执行失败
     */
    ERROR_SYSTEM_DATABASE_TRANSACTION(10014, "ERROR_SYSTEM_DATABASE_TRANSACTION", "数据库事务执行失败！", 1),
    
    /**
     * 数据库查询失败
     */
    ERROR_SYSTEM_DATABASE_QUERY_NULL(10015, "ERROR_SYSTEM_DATABASE_QUERY", "数据库查询值为空！", 1),
    
    /**
     * 数据对象转换失败
     */
    ERROR_SYSTEM_DATAOBJECT_TRANSFORM(10016, "ERROR_SYSTEM_DATAOBJECT_TRANSFORM", "数据对象转换失败！", 1),
    
    /**
     * 请求出错，请检查您传入的参数格式是否正确
     */
    ERROR_SYSTEM_PARAM_FORMAT(10017, "ERROR_SYSTEM_PARAM_FORMAT", "请求出错，请检查您传入的参数格式是否正确", 1),
    
    /**
     * 时间格式不正确
     */
    ERROR_SYSTEM_DATETIME_PARAM_FORMAT(10018, "ERROR_SYSTEM_DATETIME_PARAM_FORMAT", "时间格式不正确！", 1),
    
    /**
     * redis中值格式不正确
     */
    ERROR_SYSTEM_REDIS_VALUE_FORMAT_ERROR(10019, "ERROR_SYSTEM_REDIS_VALUE_FORMAT_ERROR", "redis中值格式不正确！", 1),
    
    /** ========== 应用错误码 ========== **/
    
    /**
     * 传入的参数有误，验证不能通过
     */
    PARAM_WRONG(20000, "PARAM_WRONG", "传入的参数有误，验证不能通过！", 2),
    
    ERROR_PASSWORD_TO_SHORT_FORMAT_ERROR(20001, "PASSWORD_TO_SHORT", "密码过短！", 2),
    /**
     * 验证码已过期
     */
    VALID_CODE_EXPIRE_ERROR(20002, "valid_code_expire", "验证码已过期！", 2),
    /**
     * 该用户不存在，请注册
     */
    USER_NOT_EXISTS_ERROR(20003, "user_not_exists", "该用户不存在，请注册！", 2),
    /**
     * 密码修改失败
     */
    PASSWORD_CHANGE_FAILED_ERROR(20004, "password_change_failed", "密码修改失败！", 2),
    /**
     * 密码错误
     */
    PASSWORD_FAILED_ERROR(20005, "password_failed", "密码错误！", 2),
    /**
     * 头像上传失败
     */
    IMG_UPLOAD_FAILED_ERROR(20006, "img_upload_failed", "上传失败！", 2),
    /**
     * 验证码已过期
     */
    MSG_UPLOAD_FAILED_ERROR(20007, "valicode_failed", "验证码已过期！", 2),
    /**
     * 信息获取失败
     */
    DATA_REQUIRD_ERROR(20008, "Data_requird", "信息获取失败！", 2),
    
    /**
     * 账号已被冻结
     */
    ACCOUNT_HAS_BEEN_FROZEN_ERROR(20009, "Account_has_been_frozen", "账号已被冻结！", 2),
    /**
     * 注册失败
     */
    REGISTER_FAILED_ERROR(20010, "register_failed", "注册失败！", 2),
    /**
     * 该手机号已注册
     */
    ACCOUNT_HAS_BEEN_EXISTS_ERROR(20011, "Account_has_been_exists", "该手机号已注册！", 2),
    /**
     * 不存在的验证码
     */
    VALICODE_NOT_EXISTS_ERROR(20012, "valicode_not_exists", "不存在的验证码！", 2),
    /**
     * 短信发送失败
     */
    MSG_PUSH_FAILED_ERROR(20013, "msg_push_failed", "短信发送失败！", 2),
    /**
     * 验证码不匹配
     */
    VALICODE_NOT_EQUEL_ERROR(20014, "valicode_not_equel", "验证码不匹配！", 2),
    /**
     * 设备信息保存失败
     */
    DEVICE_INFO_ERROR(20015, "device_info_error", "设备信息保存失败！", 2),
    /**
     * 设备信息保存失败
     */
    MSG_INFO_ERROR(20016, "msg_info_error", "建议信息保存失败！", 2),
    /**
     * 请在15分钟之后，再发送验证码
     */
    UNDETECTED_FAILURE_TIME_ERROR(20017, " undetected_failure_time", "请在15分钟之后，再发送验证码！", 2),
    /**
     * 设备信息获取失败
     */
    GET_DEVICE_INFO_ERROR(20018, " get_device_info_error", "设备信息获取失败！", 2),
    
    TRACES_VALID_PRODUCT_FALSE(20019, " TRACES_VALID_PRODUCT_ID_FALSE", "产品ID或产品类型验证不能通过，追单失败！", 2),
    
    TRACES_EXIST(20020, " TRACES_EXIST", "追单已存在,此次追单操作失败！", 2),
    
    PRE_PASSWORD_ERROR(20021, "pre_password_error", "旧密码错误！", 2),
    
    YZM_ERROR(20022, "yzm_error", "验证码错误！", 2),
    
    OPEN_NET_FAIL(20023, "open_net_fail", "开通网络失败！", 2),
    
    ERROR_HAS_VOTE(20028, "error_has_vote", "已经投过票了，无法重复投票哦!", 2),
    
    NOT_ZHUYUAN_USER(20025, "NOT_ZHUYUAN_USER", "系统未查询到您相关的住院信息，请确认后重新输入", 2),
    
    NOT_BILL_USER(20026, "NOT_BILL_USER", "您尚未开通入院用户提速服务，是否立即开通", 2),
    
    HOSPITAL_NO_SPEED_BILL(20027, "NOT_BILL_USER", "当前医院未开通住院高速网络服务", 2),
    
    NO_FREETIME_SET(20028, "NO_FREETIME_SET", "没有配置免费时长", 2),
    
    SIGN_ERROR(20029, "SIGN_ERROR", "签名失败", 2),
    
    SIGN_OVER(20030, "SIGN_OVER", "已签过到了", 2),
    
    COMMENT_FREQUENTLY(20031, "COMMENT_FREQUENTLY", "提交太频繁~", 2),
    CANNOT_REWARD_YOU(20032, "CANNOT_REWARD_YOU", "不能打赏自己", 2),
    HAVE_REWARD_YOU(20033, "HAVE_REWARD_YOU", "已经打赏过", 2),
    SOMEONE_HAS_THIS_NICKNAME(20034, "someone_has_this_nickname", "该昵称已被占用", 2),
    ASK_UPLOAD_FAILED_ERROR(20035, "ASK_UPLOAD_FAILED_ERROR", "上传失败", 2),
    HAVE_YES_CLICK(20036, "HAVE_YES_CLICK", "已经点过赞", 2),
    HAVE_DELETE(20037, "HAVE_DELETE", "已经删除", 2),
    HAS_DONE(20038, "HAS_DONE", "已经评价过", 2),
    
    INSUFFICIENT_NUMBER(20039, "INSUFFICIENT_NUMBER", "商品数量不足", 2),
    INSUFFICIENT_SCORE(20040, "INSUFFICIENT_SCORE", "积分不足", 2),
    GOODS_EXPIRED(20041, "GOODS_EXPIRED", "商品已过期", 2),
    GOODS_IS_SHELVES(20042, "GOODS_IS_SHELVES", "该商品已下架", 2),
    EXCEED_BUY_COUNT(20050, "EXCEED_BUY_COUNT", "已超过兑购次数上限",2),
    
    ID_IS_NULL(20043, "ID_IS_NULL", "参数不能为空", 2),
    
    SUBMIT_ERROT(20044, "SUBMIT_ERROT", "发送失败", 2),
    REPLY_ERROR(20045, "REPLY_ERROR", "回复失败", 2),
    CIRCLE_ERROR(20046, "CIRCLE_ERROR", "最多加入20个圈子", 2),
    
    PLAN_SAVE_ERROR(20047,"PLAN_SAVE_ERROR","每天最多只能开启5条住院计划",2),
    USER_HAS_SLIENCE(20048, "USER_HAS_SLIENCE", "您已被禁言", 2),
    GUANFANG_SLIENCE(20049, "GUANFANG_SLIENCE", "官方圈禁止非官方发帖", 2),
    
    CLICY_YES_NOT(20050, "CLICY_YES_NOT", "不能点赞自己", 2),
    
    PLAN_COMMENT_SENSTIVE_ERROR(20051,"PLAN_COMMENT_SENSTIVE_ERROR","您发布的内容含有违规内容,请重新输入",2),
    
    PHONE_FORMAT_ERROR(20052, "phone_format_error", "请输入有效的手机号码", 2),
    NICKNAME_TOO_LONG(20053, "nickname_too_long", "昵称不可超过10个字符，请重试。", 2),
    
    
    MEDICATION_REMIND_PUNCH_CARD(20053,"MEDICATION_REMIND_PUNCH_CARD","超过打卡时间,不能打卡",2),
    
    MEDICATION_REMIND_CODE_ERROR(20054,"MEDICATION_REMIND_CODE_ERROR","请输入正确的监管码或者商品码",2),
    
    MEDICATION_REMIND_PLAN_ERROR(20055,"MEDICATION_REMIND_PLAN_ERROR","没有用药提醒信息，不能打卡",2),
    
 
    MEDICATION_REMIND_SIGN_ERROR(20056,"MEDICATION_REMIND_SIGN_ERROR","签名认证失败",2),
 

    MEDICATION_REMIND_REPEAT_ERROR(20057,"MEDICATION_REMIND_REPEAT_ERROR","已添加该药的用药提醒",2),
 
    MEDICATION_REMIND_REPEAT_PUNCH_ERROR(20058,"MEDICATION_REMIND_REPEAT_PUNCH_ERROR","该时间已经打卡",2),
    
    SENSITIVE_WORD_ERROR(20059,"SENSITIVE_WORD_ERROR","提交内容包含敏感词",2),
    
    
    TIEZI_HAVE_DELETE(20060, "TIEZI_HAVE_DELETE", "帖子不存在", 2),
    
    LOGIN_FAIL(20061, "LOGIN_FAIL", "登录失败，请重新登录",2),
    
    IMG_UPLOAD_ERROR(20062, "IMG_UPLOAD_ERROR", "图片检测异常",2),
    
    IMG_ERROR(20063, "IMG_ERROR", "异常图片",2),
    
    MYSELF_ERROR(20064, "MYSELF_ERROR", "非本人操作",2),

    EXAMINE_PROJECT_NOT_FOUND_ERROR(20065, "EXAMINE_PROJECT_NOT_FOUND_ERROR", "检查项目不存在", 2),
    
    ERROR_PERMISSION_DENIED(20066, "ERROR_PERMISSION_DENIED", "权限不足",2),
    
    ERROR_EMOJI(20067, "ERROR_EMOJI", "暂不支持表情操作",2),
    
    YIYUANDUOBAO_SIGN_ERROR(20068, "YIYUANDUOBAO_SIGN_ERROR", "当前不在签到时间内",2),
    
    YIYUANDUOBAO_WITHDRAW_OVER_ERROR(20069,"YIYUANDUOBAO_WITHDRAW_OVER_ERROR", "提现金额超出剩余金额", 2),
    
    HAS_COLLECTION_HOSINFO(20070, "HAS_COLLECTION_HOSINFO", "该资讯已被您收藏", 2 ),
    
    YIYUANDUOBAO_PAY_ERROR(20071, "YIYUANDUOBAO_PAY_ERROR", "当前不在付款时间内",2),
    
    YIYUANDUOBAO_PAY_AGAIN_ERROR(20072, "YIYUANDUOBAO_PAY_AGAIN_ERROR", "本期已付过款",2),
    
    YIYUANDUOBAO_WITHDRAW_FLOOR_ERROR(20073,"YIYUANDUOBAO_WITHDRAW_FLOOR_ERROR", "提现金额只能精确到分", 2)
    ;
    
 
    private String msg;
    
    private int code;
    
    private String codeStr;
    
    /**
     * 错误类型（0:一般结果码；1：系统级的错误；2：应用级的错误）
     */
    private int type;
    
    public String getCode()
    {
        return String.valueOf(this.code);
    }
    
    public String getMsg()
    {
        return this.msg;
    }
    
    public String getCodeStr()
    {
        return this.codeStr;
    }
    
    public int getType()
    {
        return this.type;
    }
    
    private ResultCode(int code, String codeStr, String msg, int type)
    {
        this.msg = msg;
        this.code = code;
        this.codeStr = codeStr;
        this.type = type;
    }
    
}
