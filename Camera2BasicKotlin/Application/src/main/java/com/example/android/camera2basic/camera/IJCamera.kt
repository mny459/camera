package com.example.android.camera2basic.camera

/**
 * @Author CaiRj
 * @Date 2019/7/19 10:47
 * @Desc
 */
interface IJCamera {
    /**
     * 初始化预览配置
     */
    fun initPreview(width: Int, height: Int)

    /**
     * 开启预览
     */
    fun startPreview()

    /**
     * 停止预览
     */
    fun stopPreview()

    /**
     * 打开相机
     */
    fun openCamera()

    /**
     * 释放相机
     */
    fun releaseCamera()

    /**
     * 拍照
     */
    fun takePhoto()
}