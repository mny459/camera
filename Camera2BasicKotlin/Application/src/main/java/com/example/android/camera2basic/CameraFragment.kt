package com.example.android.camera2basic


import android.app.AlertDialog
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.android.camera2basic.camera.AutoFitTextureView
import com.example.android.camera2basic.camera.JCamera
import java.io.File

/**
 * A simple [Fragment] subclass.
 *
 */
class CameraFragment : Fragment(), View.OnClickListener {
    override fun onClick(view: View) {
        when (view.id) {
            R.id.picture -> JCamera.instance.lockFocus()
            R.id.info -> {
                if (activity != null) {
                    AlertDialog.Builder(activity)
                            .setMessage(R.string.intro_message)
                            .setPositiveButton(android.R.string.ok, null)
                            .show()
                }
            }
        }
    }

    private lateinit var textureView: AutoFitTextureView
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_camera2_basic, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<View>(R.id.picture).setOnClickListener(this)
        view.findViewById<View>(R.id.info).setOnClickListener(this)
        textureView = view.findViewById(R.id.texture)
    }

    override fun onStart() {
        super.onStart()
        JCamera.instance.initCamera(activity, textureView, "${activity.getExternalFilesDir(null)}${File.separator}$PIC_FILE_NAME")
    }

    override fun onResume() {
        super.onResume()
        JCamera.instance.startPreview()
    }

    override fun onPause() {
        super.onPause()
        JCamera.instance.releaseCamera()
    }

    companion object {
        @JvmStatic
        fun newInstance(): Camera2BasicFragment = Camera2BasicFragment()
    }
}
