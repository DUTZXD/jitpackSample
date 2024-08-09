package com.zxd.jitpacksample

import android.os.Bundle
import android.util.Log
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener
import com.zxd.composetest.ui.NestCollapsingToolbarLayout


class MainActivity : AppCompatActivity() {

    //    private var toolbar: NestCollapsingToolbarLayout? = null
//
//    private var coupon: LinearLayout? = null
//
//    private var title: TextView? = null
    private var appBarLayout: AppBarLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zxd_layout)
        appBarLayout = findViewById(R.id.app_bar)
        appBarLayout?.addOnOffsetChangedListener(OnOffsetChangedListener { appBarLayout, verticalOffset ->
            val totalScrollRange = appBarLayout.totalScrollRange
            val progress = (-verticalOffset).toFloat() / totalScrollRange.toFloat()

            Log.d("@@#", "verticalOffset: $verticalOffset")
            Log.d("@@#", "totalScrollRange: $totalScrollRange")
            Log.d("@@#", "progress: $progress")

            // 缩放视图
//            customTitleView.setScaleX(1f + progress)
//            customTitleView.setScaleY(1f + progress)

            // 根据需要调整视图的位置
            // customTitleView.setTranslationY(-verticalOffset);
        })
//        toolbar = findViewById(R.id.tool_bar)
//        coupon = findViewById(R.id.coupon)
//        title = findViewById(R.id.title_discount)
//        toolbar?.setOnScrimesShowListener(object :
//            NestCollapsingToolbarLayout.OnScrimsShowListener {
//            override fun onScrimsShowChange(
//                nestCollapsingToolbarLayout: NestCollapsingToolbarLayout,
//                isScrimesShow: Boolean
//            ) {
//                if (isScrimesShow) {
//                    coupon?.visibility = VISIBLE
//                } else {
//                    coupon?.visibility = GONE
//                    title?.setOnTouchListener(null)
//                }
//            }
//        })
    }
}