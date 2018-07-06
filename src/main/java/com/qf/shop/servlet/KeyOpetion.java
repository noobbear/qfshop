package com.qf.shop.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * 一次性钥匙，用来控制表单重复提交。
 * @author Administrator
 *
 */
public class KeyOpetion {
	
	private List<String> keyList = new ArrayList<String>();
	private static KeyOpetion keyOpetion =null;
	private KeyOpetion(){
		
	}
	
	/**
	 * 创建一个钥匙
	 * @return
	 */
	public String createKey(){
		Long time = System.currentTimeMillis();
		String key = time.toString();
		keyList.add(key);
		return key;
	}
	
	/**
	 * 删除钥匙，代表这个钥匙已经失效，拿着失效的钥匙来提交就代表是重复提交。
	 * @param key
	 */
	public void deleteKey(String key){
		keyList.remove(key);
	}
	
	/**
	 * 判断钥匙是否失效
	 * @param key
	 * @return
	 */
	public boolean keyContains(String key){
		return keyList.contains(key);
	}
	
	public static KeyOpetion getKeyObject(){
		if(keyOpetion == null){
			keyOpetion = new KeyOpetion();
		}
		return keyOpetion;
	}
}
