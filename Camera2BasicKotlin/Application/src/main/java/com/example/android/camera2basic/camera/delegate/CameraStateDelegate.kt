package com.example.android.camera2basic.camera.delegate

/**
 * @Author CaiRj
 * @Date 2019/7/19 9:56
 * @Desc
 */
interface CameraStateDelegate {
    fun onDisconnected(error: Int = -1)
}