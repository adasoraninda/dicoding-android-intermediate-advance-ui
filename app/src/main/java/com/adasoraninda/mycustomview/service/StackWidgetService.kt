package com.adasoraninda.mycustomview.service

import android.content.Intent
import android.widget.RemoteViewsService
import com.adasoraninda.mycustomview.factory.StackRemoteViewsFactory

class StackWidgetService : RemoteViewsService() {

    override fun onGetViewFactory(intent: Intent?): RemoteViewsFactory {
        return StackRemoteViewsFactory(this.applicationContext)
    }
}