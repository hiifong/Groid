package cc.hiifong.groid.activity.core

import android.app.Activity

// 单例Activity集合管理器
object ActivityCollector {

    private val activities = ArrayList<Activity>()

    // 添加一个activity到activities
    fun addActivity(activity: Activity) {
        activities.add(activity)
    }
    // 从activities中移除一个activity
    fun removeActivity(activity: Activity) {
        activities.remove(activity)
    }
    // 清空activities中的所有activity
    fun finishAll() {
        for (activity in activities) {
            if (!activity.isFinishing) {
                activity.finish()
            }
        }
        activities.clear()
    }

}