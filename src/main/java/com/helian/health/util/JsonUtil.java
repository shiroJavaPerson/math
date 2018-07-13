package com.helian.health.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;


/**
 * Created by xsh on 2016/12/26.
 * json工具类
 */
public class JsonUtil {

    /**
     * @author xsh
     * @since 2016-12-26
     * 将都为String类型的键，值放入json
     * @param key 要求为String数组的键
     * @param value 要求为String数组的值
     * @return
     */
    public static JSONObject putStringInJson(String[] key,String[] value) {
        JSONObject json = new JSONObject();
        if (key.length != value.length) {
            json.put("error", "参数错误，键值不匹配");
            return json;
        }
        for (int i = 0; i < key.length; i++) {
            json.put(key[i], value[i]);
        }
        return json;
    }
    
    @SuppressWarnings({ "rawtypes", "unchecked" })
    public static Object jsonToArray(String json, Class clazz){
        return JSON.parseArray(json, clazz);
    }
    
    /**
     * 将json转成list
     * @return
     */
    public static <T> List<T> fromListJson(String str,Class<T> clazz){  
        return JSONArray.parseArray(str, clazz);  
    }  
    
	/**
	 * 功能描述：把JSON数据转换成较为复杂的java对象列表
	 * 
	 * @param jsonData
	 *            JSON数据
	 * @return
	 * @throws Exception
	 * @author myclover
	 */
	public static List<Map<String, Object>> getBeanMapList(String jsonData)
			throws Exception {
		return JSON.parseObject(jsonData,
				new TypeReference<List<Map<String, Object>>>() {
				});
	}
}
