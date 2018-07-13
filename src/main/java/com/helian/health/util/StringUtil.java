/**
 * 
 */
package com.helian.health.util;

/**
 * String 工具类
 * @author jiangcong@helianhealth.com
 * @date 2017年1月3日 下午3:08:38
 *
 */
public class StringUtil {

	/**
	 * 版本号大于等于version
	 * @param version
	 * @param comparedVersion
	 * @return
	 */
    public static boolean isLargerOrEqualVersion(String version, String comparedVersion) {
        try {
        	if(version==null||version.length()<0) return false;
            String[] s1 = version.split("\\.");
            String[] s2 = comparedVersion.split("\\.");
            int length1 = s1.length;
            int length2 = s2.length;
            for (int i = 0; i < length2 && i < length1; i++) {
                if (Integer.parseInt(s1[i]) > Integer.parseInt(s2[i])) {
                    return true;
                }
                if (Integer.parseInt(s1[i]) < Integer.parseInt(s2[i])) {
                    return false;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
	
}
