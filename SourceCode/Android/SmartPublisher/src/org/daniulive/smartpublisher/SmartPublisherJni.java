/*
 * SmartPublisherJni.java
 * SmartPublisherJni
 * 
 * Created by DaniuLive on 2015/09/20.
 * Copyright © 2014~2016 DaniuLive. All rights reserved.
 */
package org.daniulive.smartpublisher;

import java.nio.ByteBuffer;

public class SmartPublisherJni {
	
	/**
	 * Initialized publisher with width and height.
	 *
	 * <pre>This function must be called firstly.</pre>
	 *
	 * @return {0} if successful
	 */
    public native int SmartPublisherInit(int width, int height);
	
    /**
     * Create file directory
     * 
     * @param path,  E.g: /sdcard/daniulive/rec
     * @return {0} if successful
     */
    public native int SmartPublisherCreateFileDirectory(String path);
    
    /**
     * �����Ƿ�¼��
     * @param isRecoder, 1:��ʾ¼�� 0����ʾ��¼��. Ĭ�ϲ�¼��. �������Ϊ1,�ڵ���SmartPublisherStartPublish֮ǰ�������SmartPublisherSetRecoderDirectory, ����һ����Ч��Ŀ¼
     * @return {0} if successful
     */
    public native int SmartPublisherSetRecoder(int isRecoder);
    
    /**
     * ����¼��Ŀ¼
     * @param path, ¼���ļ����Ŀ¼�����Ŀ¼�����Ѿ����ڣ���������ڣ�������ʧ��
     * @return {0} if successful
     */
    public native int SmartPublisherSetRecoderDirectory(String path);
    
    /**
     * ���õ���¼���ļ�����ļ���С��
     *@param size, ��λ��MB����С5MB�����500MB�����������Χ������ʧ�ܣ�Ĭ����200MB
     * @return {0} if successful
     */
    public native int SmartPublisherSetRecoderFileMaxSize(int size);
    
    
	/**
	* start to publish stream.
	*
	* @param url
	*
	* @return {0} if successful
	*/
    public native int SmartPublisherStartPublish(String url);
	
	/**
	* set live video data.
	*
	* @param cameraType: CAMERA_FACING_BACK with 0, CAMERA_FACING_FRONT with 1
	* @param curOrg: LANDSCAPE with 0, PORTRAIT 1
	*
	* @return {0} if successful
	*/
    public native int SmartPublisherOnCaptureVideoData(byte[] data, int len, int cameraType, int curOrg);
	
    
	/**
	 * Stop publisher.
	 *
	 * @return {0} if successful
	 */
    public native int SmartPublisherStopPublish();
}
