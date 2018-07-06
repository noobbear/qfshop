package com.qf.shop.servlet;

import java.util.ArrayList;
import java.util.List;

/**
 * һ����Կ�ף��������Ʊ��ظ��ύ��
 * @author Administrator
 *
 */
public class KeyOpetion {
	
	private List<String> keyList = new ArrayList<String>();
	private static KeyOpetion keyOpetion =null;
	private KeyOpetion(){
		
	}
	
	/**
	 * ����һ��Կ��
	 * @return
	 */
	public String createKey(){
		Long time = System.currentTimeMillis();
		String key = time.toString();
		keyList.add(key);
		return key;
	}
	
	/**
	 * ɾ��Կ�ף��������Կ���Ѿ�ʧЧ������ʧЧ��Կ�����ύ�ʹ������ظ��ύ��
	 * @param key
	 */
	public void deleteKey(String key){
		keyList.remove(key);
	}
	
	/**
	 * �ж�Կ���Ƿ�ʧЧ
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
