LOCAL_PATH:= $(call my-dir)
include $(CLEAR_VARS)
LOCAL_MODULE_TAGS := optional
LOCAL_UNINSTALLABLE_MODULE := true
LOCAL_MODULE_PATH := $(TARGET_OUT_APPS)
LOCAL_CERTIFICATE := platform LOCAL_SRC_FILES
LOCAL_SRC_FILES := $(call all-java-files-under, src)
LOCAL_PACKAGE_NAME := SystemApp
LOCAL_PROGUARD_ENABLED := disabled
LOCAL_PRIVILEGED_MODULE := true
LOCAL_STATIC_JAVA_LIBRARIES := libarity android-support-v4
include $(BUILD_PACKAGE)
include $(call all-makefiles-under,$(LOCAL_PATH))


# adb remount
# adb push System App.apk / system / priv-app /
# adb shell chmod 644 / system / priv-app / System App.apk
# adb reboot   repo init -u https://android.googlesource.com/platform/manifest -b android-10.0.0_r41
# adb -s emulator-5554 shell    openssl pkcs8 -inform DER -nocrypt -in \
                                  $ANDROID_ROOT/build/target/product/core.mk
# echo export "PATH=~/Library/Android/sdk/platform-tools:$PATH" >> ~/.zshenv
# mDpm set-device-owner com.jeyastine.dpcadminaccess/.DeviceAdminRcvr   git config --global user.name "Jeyastine Pushparaj"    git config --global user.email "jeyastinepushparaj@gmail.com"