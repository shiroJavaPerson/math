/**
 * 
 */
package com.helian.health.util;

/**
 * @author chenhan
 */
public class RedisKeyConstants {

    public final static String REDIS_SEPERATOR                                        = ".";

    public final static String REDIS_OS_ANDROID                                       = "android";

    public final static String REDIS_OS_IOS                                           = "ios";

    public final static String REDIS_MEDIA_HOMEPAGE_KEY                               = "homepage";                                   // 首页
    public final static String REDIS_MEDIA_HOMEPAGE_HOT_KEY                           = "homepage_hot";                               // 首页热点
    public final static String REDIS_MEDIA_HOMEPAGE_HOT_KEY_B                         = "homepage_hot_b";                             // 首页热点

    public final static String REDIS_MEDIA_TOPWEEKRANKING_KEY                         = "topweekranking";                             // 排行榜

    public final static String REDIS_MEDIA_TOPWEEKRANKING_HOT_MOVIE_KEY               = "topweekranking_hot_movie";
    public final static String REDIS_MEDIA_TOPWEEKRANKING_HOT_TV_KEY                  = "topweekranking_hot_tv";
    public final static String REDIS_MEDIA_TOPWEEKRANKING_HOT_VARIETY_KEY             = "topweekranking_hot_variety";
    public final static String REDIS_MEDIA_TOPWEEKRANKING_HOT_MUSIC_KEY               = "topweekranking_hot_music";
    public final static String REDIS_MEDIA_TOPWEEKRANKING_HOT_NOVEL_KEY               = "topweekranking_hot_novel";
    public final static String REDIS_MEDIA_TOPWEEKRANKING_NEW_MUSIC_KEY               = "topweekranking_new_music";
    public final static String REDIS_MEDIA_TOPWEEKRANKING_NEW_NOVEL_KEY               = "topweekranking_new_novel";

    // public final static String REDIS_MEDIA_RANKING_WEEK_MONTH_KEY_APP = "ranking_week_month_key_app"; // app周排行榜
    // public final static String REDIS_MEDIA_RANKING_WEEK_MONTH_KEY_GAME = "ranking_week_month_key_game"; // game周排行榜
    // public final static String REDIS_MEDIA_RANKING_WEEK_MONTH_KEY_VIDEO = "ranking_week_month_key_video"; //
    // video周排行榜
    // public final static String REDIS_MEDIA_RANKING_WEEK_MONTH_KEY_MUSIC = "ranking_week_month_key_music"; //
    // music周排行榜
    // public final static String REDIS_MEDIA_RANKING_WEEK_MONTH_KEY_BOOK = "ranking_week_month_key_book"; // book周排行榜
    // public final static String REDIS_MEDIA_RANKING_WEEK_KEY_APP_LIST = "ranking_week_key_app_list"; // app周排行榜
    // public final static String REDIS_MEDIA_RANKING_MONTH_KEY_APP_LIST = "ranking_month_key_app_list"; // app月排行榜
    // public final static String REDIS_MEDIA_RANKING_WEEK_KEY_GAME_LIST = "ranking_week_key_game_list"; // game周排行榜
    // public final static String REDIS_MEDIA_RANKING_MONTH_KEY_GAME_LIST = "ranking_month_key_game_list"; // game月排行榜
    // public final static String REDIS_MEDIA_RANKING_WEEK_KEY_VIDEO_LIST = "ranking_week_key_video_list"; // video周排行榜
    // public final static String REDIS_MEDIA_RANKING_MONTH_KEY_VIDEO_LIST = "ranking_month_key_video_list"; //
    // video月排行榜
    // public final static String REDIS_MEDIA_RANKING_WEEK_KEY_MUSIC_LIST = "ranking_week_key_music_list"; // music周排行榜
    // public final static String REDIS_MEDIA_RANKING_MONTH_KEY_MUSIC_LIST = "ranking_month_key_music_list"; //
    // music月排行榜
    // public final static String REDIS_MEDIA_RANKING_WEEK_KEY_BOOK_LIST = "ranking_week_key_book_list"; // book周排行榜
    // public final static String REDIS_MEDIA_RANKING_MONTH_KEY_BOOK_LIST = "ranking_month_key_book_list"; // book月排行榜

    public final static String REDIS_MEDIA_RANKING_KEY_APP_WEEK_DOWNLOAD              = "ranking_key_app_week_download";              // 应用上周下载量排行
    public final static String REDIS_MEDIA_RANKING_KEY_APP_TOTAL_DOWNLOAD             = "ranking_key_app_total_download";             // 应用总下载量排行
    public final static String REDIS_MEDIA_RANKING_KEY_GAME_WEEK_DOWNLOAD             = "ranking_key_game_week_download";             // 游戏上周下载量排行
    public final static String REDIS_MEDIA_RANKING_KEY_GAME_TOTAL_DOWNLOAD            = "ranking_key_game_total_download";            // 游戏总下载量排行

    public final static String REDIS_MEDIA_RANKING_KEY_VIDEO_MOVIE_WEEK_DOWNLOAD      = "ranking_key_video_movie_week_download";      // 电影上周下载量排行
    public final static String REDIS_MEDIA_RANKING_KEY_VIDEO_TV_WEEK_DOWNLOAD         = "ranking_key_video_tv_week_download";         // 电视剧上周下载量排行
    public final static String REDIS_MEDIA_RANKING_KEY_VIDEO_MOVIE_WEEK_NEW           = "ranking_key_video_movie_week_new";           // 新电影排行

    public final static String REDIS_MEDIA_RANKING_KEY_NOVEL_WEEK_DOWNLOAD            = "ranking_key_novel_week_download";            // 小说上周下载量排行
    public final static String REDIS_MEDIA_RANKING_KEY_NOVEL_WEEK_NEW                 = "ranking_key_novel_week_new";                 // 新小说排行

    public final static String REDIS_MEDIA_RANKING_KEY_MUSIC_SINGLE_WEEK_DOWNLOAD     = "ranking_key_music_single_week_download";     // 单曲下载
    public final static String REDIS_MEDIA_RANKING_KEY_MUSIC_ALBUM_WEEK_DOWNLOAD      = "ranking_key_music_album_week_download";      // 专辑下载
    public final static String REDIS_MEDIA_RANKING_KEY_MUSIC_SINGLE_WEEK_NEW          = "ranking_key_music_single_week_new";          // 新单曲
    public final static String REDIS_MEDIA_RANKING_KEY_MUSIC_ALBUM_WEEK_NEW           = "ranking_key_music_album_week_new";           // 新专辑

    public final static String REDIS_MEDIA_RANKING_KEY_UPDATE_PRODUCT_APP             = "update_product_app";                         // 产品更新
                                                                                                                                       // AP
    public final static String REDIS_MEDIA_RANKING_KEY_UPDATE_PRODUCT_GAME            = "update_product_game";                        // 产品更新
                                                                                                                                       // game
    public final static String REDIS_MEDIA_RANKING_KEY_UPDATE_PRODUCT_VIDEO           = "update_product_video";                       // 产品更新
                                                                                                                                       // video
    public final static String REDIS_MEDIA_RANKING_KEY_UPDATE_PRODUCT_BOOK            = "update_product_book";                        // 产品更新
                                                                                                                                       // book
    public final static String REDIS_MEDIA_RANKING_KEY_UPDATE_PRODUCT_MUSIC_SINGLE    = "update_product_music_single";                // 产品更新
    public final static String REDIS_MEDIA_RANKING_KEY_UPDATE_PRODUCT_MUSIC_ALBUM     = "update_product_music_album";                 // 产品更新

    public final static String REDIS_MEDIA_KEY_COUNT_UPDATE_PRODUCT                   = "count_update_product";                       // 统计产品更新数量
                                                                                                                                       // music

    public final static String REDIS_MEDIA_SEARCH_PAGE_KEY                            = "search_page";                                // 搜索页

    public final static String REDIS_MEDIA_SEARCH_PAGE_KEY_V2                         = "search_page_v2";                             // 搜索页

    public final static String REDIS_MEDIA_CATEGORY_PAGE_KEY                          = "category_page";                              // 类目页

    public final static String REDIS_MEDIA_PRODUCT                                    = "product";

    /** redis产品基础信息POSTYPE */
    public final static String REDIS_POSTYPE_PRODUCT_FIELD_BASE                       = "product_base";

    /** redis产品扩展信息POSTYPE */
    public final static String REDIS_POSTYPE_PRODUCT_FIELD_EXT                        = "product_ext";

    /** redis产品文件POSTYPE */
    public final static String REDIS_POSTYPE_PRODUCT_FIELD_FILE                       = "product_file";

    /** redis产品图片POSTYPE */
    public final static String REDIS_POSTYPE_PRODUCT_FIELD_IMG                        = "product_img";

    /** redis产品标签POSTYPE */
    public final static String REDIS_POSTYPE_PRODUCT_FIELD_TAG                        = "product_tag";

    /** redis标签key */
    public final static String REDIS_PRODUCT_TAG                                      = "productSetInTagId";

    /** redis用户访问Set的key */
    public final static String REDIS_PRODUCT_PV_SET                                   = "Redis_Product_PV_Set";

    /** redis用户下载Set的key */
    public final static String REDIS_PRODUCT_DOWNLOAD_SET                             = "Redis_Product_Download_Set";

    /** redis用户访问key */
    public final static String REDIS_PRODUCT_PV                                       = "product_PV";

    /** redis用户下载key */
    public final static String REDIS_PRODUCT_DOWNLOAD                                 = "product_Download";

    /** redis通用代码key */
    public final static String REDIS_COMMON_CODE                                      = "common_code";

    /** redis生成6位不重复uuid的key */
    public final static String UUID_BY_REDIS_KEY                                      = "uuid_by_redis_key";

    /** android版块key */
    public final static String ANDROID_ZONE_REDIS_KEY                                 = "android_zone_redis_key";

    /** ios版块key */
    public final static String IOS_ZONE_REDIS_KEY                                     = "ios_zone_redis_key";

    /**
     * LBS
     */
    /** 默认单用户收益值key **/
    public final static String REDIS_LBS_INCOME_PER_NEW_USER                          = "income_per_new_user";

    /** 产品单次收益值key **/
    public final static String REDIS_LBS_INCOME_PER_PRODUCT                           = "income_per_product";

    /** ap收益信息key **/
    public final static String REDIS_LBS_AP_INFO                                      = "ap_income";

    /** 客服端登录使用key */
    public final static String REGUSER_LOGIN                                          = "reguser_login";
    /** 热门搜索词key */
    public final static String KEY_WORD                                               = "key_word";

    /** 热门搜索参考词 */
    public final static String KEY_WORD_CONSULT                                       = "key_word_Consult";

    /** 热门搜索参考词更新时间 */
    public final static String KEY_WORD_CONSULT_TIME                                  = "key_word_Consult_time";

    /** 客服端valicode使用key */
    public final static String VALID_CODE                                             = "valid_code";
    public final static String REWARD_VALID_CODE_                                     = "reward_valid_code_";

    public final static String REDIS_MEDIA_TRACE_BY_DEVICE_ID_                        = "trace_by_device_id_";                        // 追单
    public final static String REDIS_MEDIA_TRACE_BY_USER_ID_                          = "trace_by_user_id_";                          // 追单

    /** 已登录的用户 */
    public final static String REDIS_LOGIN_USERS                                      = "login_users";                                // 已登录的用户
    public final static String REDIS_LOGIN_DEVICEID                                   = "Login_Deviceid"; // 已登录设备
    public final static String REDIS_LOGIN_USER_ID                                   = "Login_user_id";
    public final static String REDIS_LOGIN_REGISTRATIONID                             = "login_registrationID";                       // 登录用户提交的极光id
    public final static String REDIS_LOGIN_MOBILE                                     = "login_user_mobile";                     // 登录用户提交的极光id
    public final static String REDIS_LOGIN_OS                                         = "login_os";                                   // 登录的设备ios或者android
    public final static String REDIS_LOGIN_MAC                                        = "login_os_mac";                               // 登录的设备mac
    public final static String REDIS_LOGIN_SN                                         = "login_os_sn";                                // 登录的设备sn

    /** 首页热点 产品下载量数据缓存多久取一次 */
    public final static String REDIS_MEDIA_HOMEPAGE_HOT_PRODUCT_DOWNLOADCOUNT_TIMEOUT = "homepage_hot_product_download_count_timeout";
    /**
     * AP下载完成后回告信息
     */
    public final static String REDIS_DOWNLOAD_PRODUCT                                 = "download_product_";                          // 产品
    public final static String REDIS_DOWNLOAD_FILE                                    = "download_file_";                             // 文件

    public final static String REDIS_USER_LOG_MAC                                     = "user_log_mac_";
    public final static String REDIS_USER_LOG_SN                                      = "user_log_sn_";

    /**
     * AP是否可蹭网
     */
    public final static String AP_IS_ONLINE                                           = "ap_is_online";

    /** B用户暗号 */
    public final static String B_USER_CODE                                            = "b_user_code";
    public final static String B_USER_CODE_LENGTH                                     = "b_user_code_length";

    /**
     * lucene上次更新时间
     */
    public final static String LUCENE_LAST_UPDATE_TIME                                = "lucene_last_update_time";

    /**
     * 初始化产品、文件id列表
     */
    public final static String REDIS_SYN_PID                                          = "syn_pid";                                    // 产品idkey
    public final static String REDIS_SYN_FID                                          = "syn_fid";                                    // 文件idkey

    /**
     * 初始化APP信息
     */
    public final static String REDIS_INIT_APP_KEY                                     = "init_app";                                   // APP初始化key
    public final static String REDIS_INIT_APP_FIELD_V_IOS                             = "init_app_v_ios";                             // iosAPP版本号
    public final static String REDIS_INIT_APP_FIELD_V_AND                             = "init_app_v_and";                             // androidAPP版本号
    public final static String REDIS_INIT_APP_FIELD_TIME_IOS                          = "init_app_time_ios";                          // iosAPP上传时间
    public final static String REDIS_INIT_APP_FIELD_TIME_AND                          = "init_app_time_and";                          // androidAPP上传时间

    /**
     * 中文在线小说根目录
     */
    public final static String REDIS_CHINAPHONE_BOOKID_PATH                           = "chinaPhone_bookid_path";
    public final static String REDIS_CHINEPHONE_BOOKID_PATH_NUM                       = "chinephone_bookid_path_num";
    public final static String REDIS_CHINAPHONE_BASE_PATH                             = "chinaphone_base_path";

    /**
     * 用于话费订单自动退款去重
     */
    public final static String REDIS_KEY_BILLORDER_REFUND_AUTO                        = "order_auto_refund";

    /**
     * 用于统一平台异步通知回调去重
     */
    public final static String REDIS_KEY_PLATFORM_NOTIFY                              = "order_platform_notify";

    /**
     * ap网点绑定关系key前缀
     */
    public final static String REDIS_KEY_STATION_AP                                   = "station_";

    /**
     * ap下在线人数前缀
     */
    public final static String REDIS_KEY_AP_USER_COUNT                                = "ap_user_count_";

    /**
     * 新添加到组的产品id
     */
    public final static String REDIS_SET_PRODUCT_NEW_ADD                              = "set_product_new_add";

    /**
     * 组别产品id set
     */
    public final static String SET_PRODUCT_IDS_INIT                                   = "product_ids_init_set_";

    /**
     * 组别产品文件id set
     */
    public final static String SET_FILE_IDS_INIT                                      = "file_ids_init_set_";

    /**
     * third_sign_key
     */
    public final static String THIRD_SIGN_KEY                                         = "third_sign_key";

    public final static String SSID_SET                                               = "ssid_set";

    public final static String SSID_UPDATETIME                                        = "ssid_updateTime";

    public final static String APP_LOGIN_TOKEN_                                       = "app_login_token_";
    public final static String XIAOHE_LOGIN_TOKEN_                                    = "xiaohe_login_token_";

    public final static String PRODUCT_SYNCHRO_COUNT_KEY                              = "product_synchro_count_key";

    public final static String REDIS_PRODUCT_PV_LIANLIAN                              = "product_PV_lianlian";

    public final static String REDIS_PRODUCT_DOWNLOAD_LIANLIAN                        = "product_Download_lianlian";

    public final static String REDIS_SN_ISSPEED                                       = "sn_isSpeed";

    public final static String BANNER_CODE_                                           = "banner_code_";

    public final static String hos_sign_key                                           = "hos_sign_key";

    public final static String JIAOHAO_DEVICEID_OF_                                   = "jiaohao_deviceid_of_";

    public final static String JIAOHAO_JPUSHID_OF_                                    = "jiaohao_jpushid_of_";

    public final static String JIAOHAO_OS_OF_                                         = "jiaohao_os_of_";

    public final static String JIAOHAO_NAME_OF_                                       = "jiaohao_name_of_";

    public final static String HOS_ID_NAME_VERIFY_                                    = "hos_id_name_verify_";

    public final static String DEFAULT_HOS_USER_INFO_                                 = "default_hos_user_info_";

    public final static String DEFAULT_HOS_CARD_NO                                    = "default_hos_card_no";

    public final static String DEFAULT_HOS_CENTER_ID                                  = "default_hos_center_id";

    public final static String REPORT_HAS_NEW_ADD                                     = "report_has_new_add";

    public final static String AMQ_HOSPITAL_RECORD_CENTER_                            = "amq_hospital_record_center_";

    public final static String AMQ_HOSPITAL_COST_CENTER_                              = "amq_hospital_cost_center_";

    public final static String BILL_HAS_NEW_ADD                                       = "bill_has_new_add";

    public final static String BANNER_VIDEO_CATEGORY                                  = "4banner_video";

    public final static String VIDEO_TOP_BANNER                                       = "video_top_banner";

    public final static String MY_NEWREAD                                             = "my_newread";

    public final static String MY_NEWREAD_TYPE_                                       = "my_newread_type_";

    public final static String MY_NEWREAD_TYPE_NUM                                    = "my_newread_type_num";

    public final static String MY_YUYUE_SET_                                          = "my_yuyue_set_";

    /**
     * 医院上网认证方式KEY
     */
    public final static String INTERNET_AUTH_KEY                                      = "net_open_type";

    public final static String FAP_LAYAREA_KEY                                        = "fap_lay_area_";
    public final static String FAP_AREA_HKEY                                          = "fap_area";

    public final static String STATION_WEIXIN_KEY                                     = "station_weixin";

    public final static String JIAOHAO_JPUSHID_SET_                                   = "jiaohao_jpushid_set_";

    public final static String JIAOHAO_NUM_                                           = "jiaohao_num_";

    public final static String JIAOHAO_JPUSHID_OS_                                    = "jiaohao_jpushid_os_";

    /**
     * HOS_NAME： key-hos_name,field-[station_id],value-[station_name] SN_USED_CAPACITY:
     * key-sn_used_capacity,field-[ap_sn],value-[diskspace]
     */
    public final static String HOS_NAME                                               = "hos_name";
    public final static String SN_USED_CAPACITY                                       = "sn_used_capacity";

    /**
     * 各种统计用户池set的key
     */
    public final static String STATISTIC_MAC_SET_PORTAL                               = "statistic_mac_set_portal";                   // Portal
    public final static String STATISTIC_MAC_SET_APP                                  = "statistic_mac_set_app";
    public final static String STATISTIC_MAC_SET_DOCTORPORTAL                         = "statistic_mac_set_doctorportal";             // Portal
    public final static String STATISTIC_MAC_SET_DOCTORAPP                            = "statistic_mac_set_doctorapp";                // APP

    // 省份证过时未取预约id池
    public final static String YUYUE_GUOSHIWEIQU_                                     = "yuyue_guoshiweiqu_";
    // 身份证黑名单
    public final static String YUYUE_BLACKLIST_                                       = "yuyue_blacklist_";

    /**
     * 存储医院相关信息 key-station_info,field-[station_id],value-station_name;province_code;city_code;area_code
     */
    public final static String KEY_STATION_INFO                                       = "station_info";

    /**
     * 后台登录用户存储token
     */
    public final static String CONSOLE_LOGIN_TOKEN_                                   = "console_login_token_";
    public final static String CONSOLE_LOGIN_PWD_WRONG_                               = "console_login_pwd_wrong_";
    public final static String DC_LOGIN_TOKEN_                                        = "dc_login_token_";
    public final static String DC_LOGIN_PWD_WRONG_                                    = "dc_login_pwd_wrong_";
    public final static String UIP_LOGIN_TOKEN_                                       = "uip_login_token_";
    public final static String UIP_LOGIN_PWD_WRONG_                                   = "uip_login_pwd_wrong_";

    /**
     * 标签相关redis 用户标签key前缀 后+用户mac，例：label_mac_realtime_00:08:22:3e:f9:d1
     */
    public final static String LABEL_MAC_REALTIME_                                    = "label_mac_realtime_";                        // 实时用户标签
    public final static String LABEL_MAC_ANALYSIS_                                    = "label_mac_analysis_";                        // 分析用户标签

    /**
     * 标签相关redis 用户标签field
     */
    public final static String LABEL_MAC_FIELD_PROVINCE                               = "province";
    public final static String LABEL_MAC_FIELD_CITY                                   = "city";
    public final static String LABEL_MAC_FIELD_HOSPITAL                               = "hospital";
    public final static String LABEL_MAC_FIELD_TIME                                   = "time";
    public final static String LABEL_MAC_FIELD_LAY_AREA                               = "lay_area";
    public final static String LABEL_MAC_FIELD_LAY_AREA_FIRST_CODE                    = "lay_area_first_code";
    public final static String LABEL_MAC_FIELD_SECONDARY_LAY_AREA                     = "secondary_lay_area";
    public final static String LABEL_MAC_FIELD_IS_DOCTOR                              = "is_doctor";
    public final static String USER_LABEL_MAC_                                        = "user_label_mac_";
    public final static String USER_LABEL_ALL                                         = "user_label_all";

    public final static String PRODUCT_TAG_UPDATE_NO                                  = "product_tag_update_no";

    /**
     * 关键词前缀(形如：keyword_1_HY00070)
     */
    public final static String KEYWORD_                                               = "keyword_";

    /**
     * 医院wifi各前缀 例： key:station_wifi_set_all_20150916_HY00070 以set方式存储用户mac
     * key:station_wifi_set_inpatient_20150916_HY00070 以set方式存储用户mac(属于住院部) key:station_wifi_onlinetime_20150916
     * field:HY00070 value:123456 以hash方式存储总在线时长
     */
    public final static String STATION_WIFI_SET_ALL_                                  = "station_wifi_set_all_";
    public final static String STATION_WIFI_SET_INPATIENT_                            = "station_wifi_set_inpatient_";
    public final static String STATION_WIFI_ONLINETIME_                               = "station_wifi_onlinetime_";

    // 爱奇艺相关key
    public final static String AIQIYI_SN_TV_INFO_                                     = "aiqiyi_sn_tv_info_";
    public final static String AIQIYI_SN_AID_SET_                                     = "aiqiyi_sn_aid_set_";
    public final static String AIQIYI_SN_TVID_SET_                                    = "aiqiyi_sn_tvid_set_";
    public final static String AIQIYI_AID_HELIAN_PID                                  = "aiqiyi_aid_helian_pid";
    public final static String AIQIYI_HELIAN_PID_AID                                  = "aiqiyi_helian_pid_aid";

    public static final String SPEED_BILL_USER                                        = "speed_bill_user";

    public static final String SPEED_BILL_OPEN_STATION                                = "speed_bill_open_station";

    public static final String HOSPTIAL_SERVICE                                       = "hosptial_service_";
    public static final String HOSPTIAL_WEBSITE_SERVICE                               = "hosptial_website_service";

    public static final String HEALTH_INFO_CLICK                                      = "health_info_click";
    public static final String GUAHAOWANGID_BY_HOSPITALID                             = "guahaowangId_by_hospitalId";
    public static final String QUYIID_BY_HOSPITALID                                   = "quyiId_by_hospitalId";
    public static final String HOSPITALID_BY_STATION                                  = "hospitalid_by_station";
    public static final String STATION_BY_HOSPITALID                                  = "station_by_hospitalid";
    
    public static final String HAS_GUAHAO_STATION                                     = "has_guahao_station";

    public static final String HOSPITAL_INFO_NAME                                     = "hospital_info_name";
    public static final String HOSPITAL_INFO_LEVEL                                    = "hospital_info_level";
    public static final String HOSPITAL_INFO_LOGO                                     = "hospital_info_logo";
    public static final String HOSPITAL_INFO_ADDRESS                                  = "hospital_info_address";

    /**
     * 医院评论相关key
     */
    public static final String COMMENT_BY_HOSPITAL                                    = "comment_by_hospital_";
    public static final String USER_COMMENT_HOSPITAL                                  = "user_comment_hospital";

    public static final String WEATHER_KEY                                            = "weather_key";
    
    public static final String CRM_DEPT_KEY                                           = "crm_dept";
    
    public static final String DINGDING_KEY_CORPID                                    = "corpid";                                     // 企业id
    public static final String DINGDING_KEY_CORPSECRET                                = "corpsecret";                                 // 企业密钥
    
    /**
     * 医生职位对应排序key
     */
    public static final String HOSP_USER_POSITION_SORT                                = "hosp_user_position_sort";
    public static final String HOSP_USER_POSITION_SORT_STATION                        = "hosp_user_position_sort_station";
    public static final String DINGDING_HOSP_USER_STATION                             = "dingding_hosp_user_station";
    
    /**
     * CRM接入方式key 1或者无-禾连医生 2-钉钉
     */
    public static final String CRM_ACCESS_TYPE                                        = "crm_access_type";
    public static final String CRM_ACCESS_TYPE_DINGDING                               = "crm_access_type_dingding";
    
    /**
     * 会议创建时间临时存储 key前缀
     */
    public static final String CRM_CONF_CREATETIME_                                   = "crm_conf_createtime_";
    
    /**
     * CRM导入时关闭短信发送开关key 存储set类型数据，医院代号在其中的为关闭
     */
    public static final String CRM_SHORTMSG_OFF                                       = "crm_shortmsg_off";

    public static final String CAT_EXT_PRODUCT_ID                                     = "cat_ext_product_id";
    
    public static final String CAT_IS_SHOW                                            = "cat_is_show";//是否长久显示
    
    /**
     * 后台异步导出状态
     */
    public static final String EXPORT_STATUS                                          = "export_status";
    
    /**
     * 新增用户池 日新增 月新增
     */
    public static final String USERADD_SET_DAY                                        = "useradd_set_day";
    public static final String USERADD_SET_MONTH                                      = "useradd_set_month";
    
    /**
     * DSP登录用户存储token
     */
    public final static String DSP_LOGIN_TOKEN_                                   = "dsp_login_token_";
    public final static String DSP_LOGIN_PWD_WRONG_                               = "dsp_login_pwd_wrong_";
    
    /**
     * HASH KEY: AP、医院与大科室关系(可根据APMAC、station_id获取大科室信息，多个以,分隔)
     */
    public static final String FAP_LARGEROOM_RELATION                                 = "fap_largeroom_relation";
    public static final String STATION_LARGEROOM_RELATION                             = "station_largeroom_relation";

    /**
     * 以下是广告相关常量-广告位下广告列表的redis前缀 TODO
     */
    public static final String AD_POSITION_ID_PRE = "ad_position_id_";
    
    /**
     * 广告展示的总次数
     */
    public static final String AD_TOTAL_SHOW_TIME = "ad_total_show_time";
    /**
     * 广告点击的总次数
     */
    public static final String  AD_TOTAL_CLICK_TIME = "ad_total_click_time";
    
    public static final String AD_SHOWTIME_BY_DATE_PRE = "ad_showtime_by_date_";
    
    public static final String AD_CLICKTIME_BY_DATE_PRE = "ad_clicktime_by_date_";
    
    public static final String AD_SHOWTIME_BY_USER_DATE_PRE = "ad_showtime_mac_date_";
    
    public static final String AD_CLICKTIME_BY_USER_DATE_PRE = "ad_clicktime_by_user_date_pre_";
    
    public static final String AD_SHOWTIME_BY_USER_FOREVER = "ad_showtime_by_user_forever_";
    public static final String AD_CLICKTIME_BY_USER_FOREVER = "ad_clicktime_by_user_forever_";
    
    /**
     * 广告加载失败
     */
    public static final String  AD_TOTAL_LOAD_FAILURE_TIME = "ad_total_load_failure_time";
    
    public static final String AD_LOAD_FAILURE_BY_DATE_PRE = "ad_load_failure_by_date_";
    
    public static final String AD_LOAD_FAILURE_BY_USER_DATE_PRE = "ad_load_failure_mac_date_";
    
    public static final String AD_LOAD_FAILURE_BY_USER_FOREVER = "ad_load_failure_by_user_forever_";
    
    
    /**
     * 变态医院不让用视频-网点
     */
    public static final String DOCTOR_CANNOT_OPENNET_STATIONID = "doctor_cannot_opennet_stationid";
    /**
     * 变态医院不让用视频-上班时间
     */
    public static final String DOCTOR_CANNOT_OPENNET_MORNING = "doctor_cannot_opennet_morning";
    /**
     * 变态医院不让用视频-下班时间
     */
    public static final String DOCTOR_CANNOT_OPENNET_AFTERNOON = "doctor_cannot_opennet_afternoon";
    
    /**
     * 广告id和广告owner_id的关联关系
     */
    public static final String AD_OWNER_ID = "ad_owner_id";
    
    /**
     * 记录用户最近一次展示的广告内容，有效期到今晚0点
     */
    public static final String AD_LAST_BYMAC ="ad_last_bymac"; 
    
    /**
     * 资讯点赞记录
     */
    public static final String ZIXUN_SAY_GOOD ="zixunSayGood"; 
    
    /**
     * 用户已点赞记录
     */
    public static final String ZIXUN_GOOD_BYUSER ="zixunGoodByuser"; 
    /**
     * 通过h5注定的用户
     */
    public static final String H5_REG ="H5Reg";    
    
   /**
    * jpush +禾连id， 和appid锁定一个极光id
    */
    public static final String JPUSH = "jpush";   
    public static final String JPUSHOBJ = "jpushobj";   
    /**
     * 一个映射关系对应多个广告位
     */
     public static final String AD_RELATION = "ad_relation";   
     
     
     /**
      * dsp报表展现控制展现个数
      */
    public static final String DSP_CONTROL_COUNT                                      = "dsp_control_count";
    
    /**
     * uip饼图展现个数
     */
    public static final String UIP_CONTROL_COUNT                                      = "uip_control_count";
    
    /**
     * 外送人群推送失败次数记录key前缀
     */
    public static final String PRE_KEY_DSP_OUTSIDECROWD_PUSHERRORTIME                 = "outsidecrowd_pusherrortime_";
    
    /**
     * 控制智子云的推送开关 推送是否关闭、中断
     */
    public static final String ZZY_PUSH_ISCLOSE_                                      = "zzy_push_isclose_";
    
    /**
     * redis中ap在线用户中apmac对应的前缀
     */
    public static final String ONLINE_USER_BY_APMAC_PREX = "online_user_by_apmac_";
    /**
     * redis中绿洲ap在线用户中apmac对应的前缀
     */
    public static final String ONLINE_USER_BY_APMAC_LZ_PREX = "online_user_by_lz_apmac_";
    
    /**
     * redis中所有ap_mac
     */
    public static final String ONLINE_USER_BYAPMAC = "online_user_byapmac";

    /**
     * 首页模块key
     */
    public static final String HOME_PAGE_MODULE = "home_page_module"; 
    
    /**
     * 首页所有模块
     */
    public static final String HOME_ALL_MODULE = "home_all_module";
}
