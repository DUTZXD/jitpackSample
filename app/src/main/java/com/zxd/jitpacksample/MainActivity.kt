package com.zxd.jitpacksample

import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.appbar.AppBarLayout
import com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener
import com.zxd.composetest.ui.NestCollapsingToolbarLayout
import kotlin.math.abs


class MainActivity : AppCompatActivity() {

    private var appBarLayout: AppBarLayout? = null

    private var toolBar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.zxd_layout)
        appBarLayout = findViewById(R.id.app_bar)
        toolBar = findViewById(R.id.tool_bar)
        appBarLayout?.addOnOffsetChangedListener { appBarLayout, verticalOffset ->
            val totalScrollRange = appBarLayout.totalScrollRange
            val progress = (-verticalOffset).toFloat() / totalScrollRange.toFloat()
            if (abs(verticalOffset) == appBarLayout.totalScrollRange) {
                Log.d("@@#", "CollapsingToolbarLayout 完全折叠，显示 Toolbar")
                // CollapsingToolbarLayout 完全折叠，显示 Toolbar
                toolBar?.visibility = View.VISIBLE
            } else {
                Log.d("@@#", "CollapsingToolbarLayout 没有完全折叠，隐藏 Toolbar")
                //
                toolBar?.visibility = View.GONE
            }
//            Log.d("@@#", "verticalOffset: $verticalOffset")
//            Log.d("@@#", "totalScrollRange: $totalScrollRange")
//            Log.d("@@#", "progress: $progress")

        }
    }
}