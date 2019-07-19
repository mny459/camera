package com.example.android.camera2basic.camera.delegate

import com.example.android.camera2basic.camera.error.JCameraError

/**
 * @Author CaiRj
 * @Date 2019/7/19 11:23
 * @Desc
 */
interface JCameraListener {
    fun onDisconnected(error: Int = -1)
    fun onError(error: JCameraError)
}