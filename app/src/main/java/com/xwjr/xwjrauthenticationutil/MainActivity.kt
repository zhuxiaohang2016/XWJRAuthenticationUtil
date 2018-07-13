package com.xwjr.xwjrauthenticationutil

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.xwjr.track.TrackConfig
import com.xwjr.track.TrackData
import com.xwjr.track.TrackOperate
import java.lang.Thread.sleep

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


//        TrackConfig.init(this,"http://p2psp.kfxfd.cn:9080/apphub/tracking/","49dd08f0-24e6-11e7-b026-6b0b8b32be51")
//
//        sleep(3000)
//
//        TrackOperate.upload(TrackData.getCommonMap().toString())
    }
}
