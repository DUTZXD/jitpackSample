package com.zxd.jitpacksample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.CollapsingToolbarLayout


class MainActivity : AppCompatActivity() {

    private var appBarLayout: AppBarLayout? = null

    private var toolBar: Toolbar? = null

    private var collapsingToolbarLayout: CollapsingToolbarLayout? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zxd_layout)
        appBarLayout = findViewById(R.id.app_bar)
        toolBar = findViewById(R.id.tool_bar)
        toolBar?.setOnClickListener {
            appBarLayout?.setExpanded(true, true)
        }
        collapsingToolbarLayout = findViewById(R.id.collapsing_toolbar)

        appBarLayout?.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
            val progress = (-verticalOffset).toFloat() / appBarLayout.totalScrollRange.toFloat()
            toolBar?.alpha = progress
//            if (abs(verticalOffset) == appBarLayout.totalScrollRange) {
//                Log.d("@@#", "CollapsingToolbarLayout 完全折叠，显示 Toolbar")
//                toolBar?.visibility = View.VISIBLE
//                toolBar?.alpha = progress
//                collapsingToolbarLayout?.alpha = 0f
//            } else {
//                Log.d("@@#", "CollapsingToolbarLayout 没有完全折叠，隐藏 Toolbar")
//                toolBar?.visibility = View.GONE
//                toolBar?.alpha = progress
//                collapsingToolbarLayout?.alpha = 1 - progress
//            }
//            Log.d("@@#", "progress: $progress")
        }
    }
}