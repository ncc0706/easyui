package com.xlinyu.kit;

import java.util.Random;

public class ToolsUtil {

	private static final String RANDOMSTR="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789~!@#$%^*()_+={}[]|";
	
	/**
	 * 生成随机密码
	 * @param length
	 * @return
	 */
	public static String genRandomPassword(int length){  
        Random random = new Random();  
        StringBuffer sb = new StringBuffer();  
          
        for(int i = 0 ; i < length; ++i){  
            int number = random.nextInt(80);//[0,80)  
              
            sb.append(RANDOMSTR.charAt(number));  
        }  
        return sb.toString();  
    }
	
}
