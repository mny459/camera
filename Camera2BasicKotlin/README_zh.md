> 取经自 Google 官方 Camera2 Demo

## 关键类介绍
- `CameraManager`:官方介绍
> A system service manager for detecting, characterizing, and connecting to CameraDevices
 翻译：一种系统服务管理器，用于检测、描述和连接到摄像机设备

- `CameraDevice`:
- `CameraCharacteristics`: 相机特征。characteristics 表示特征
> The properties describing a CameraDevice
 翻译：描述 CameraDevice 的属性

主要的属性特征
1. `LENS_FACING`：前置摄像头（`LENS_FACING_FRONT`）还是后置摄像头（`LENS_FACING_BACK`）。
2. `SENSOR_ORIENTATION`：摄像头拍照方向。
3. `FLASH_INFO_AVAILABLE`：是否支持闪光灯。
4. `CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL`：获取当前设备支持的相机特性。
    - INFO_SUPPORTED_HARDWARE_LEVEL_FULL：全方位的硬件支持，允许手动控制全高清的摄像、支持连拍模式以及其他新特性。
    - INFO_SUPPORTED_HARDWARE_LEVEL_LIMITED：有限支持，这个需要单独查询。
    - INFO_SUPPORTED_HARDWARE_LEVEL_LEGACY：所有设备都会支持，也就是和过时的Camera API支持的特性是一致的。

- `CaptureRequest`:
>