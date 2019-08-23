package com.wangyang.mybasemodule

import android.content.Context
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.Message
import android.support.v4.app.Fragment
import com.example.router_lib.provider.moudle.main.IMainProvider
import com.example.router_lib.router.IntentManager
import com.wangyang.baselibrary.ui.activity.BaseMvpActivity
import com.wangyang.baselibrary.utils.FragmentManager
import com.wangyang.baselibrary.utils.PermissionUtil
import com.wangyang.mybasemodule.test.compontent.DaggerTestCompontent
import com.wangyang.mybasemodule.test.module.TestModule
import kotlinx.android.synthetic.main.activity_main.*
import org.jetbrains.anko.toast
import java.lang.ref.WeakReference
import java.util.*
import javax.inject.Inject


open class MainActivity : BaseMvpActivity<MainPresenter>(), MainView {

    private val homeFragment by lazy { HomeFragment() }
    private val testFragment by lazy { TestFragment() }
    private val stack = Stack<Fragment>()
    @Inject
    lateinit var fragementManager: FragmentManager

    @Inject
    lateinit var user: User

    @Inject
    lateinit var context: Context

    override fun onResult(msg: String) {
        toast(msg)
    }

    override fun onLoadData(msg: String) {
        toast(msg)
    }


    companion object {

        private class MyHandler(val activity: WeakReference<MainActivity>) : Handler(Looper.getMainLooper()) {

            override fun handleMessage(msg: Message) {
                super.handleMessage(msg)
                when (msg.what) {
                    1 -> {
                        activity.get()!!.mProgressBar.progress = msg.obj.toString().toDouble().toInt()
                    }
                }
            }
        }
    }


    override fun inject() {
        DaggerTestCompontent.builder().appComponent(appComponent)
                .testModule(TestModule())
                .build().inject(this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        val recyclerView = findViewById<RecyclerView>(R.id.mRecycleView)
//        CallBackManager.INSTANCE.addCallBack("test") {
//            toast("你好啊")
//        }.addCallBackWithValue("test") {
//            toast(it as String)
//        }
//        findViewById<FrameLayout>(R.id.mFrameLayout).setOnClickListener {
//            CallBackManager.INSTANCE.getCallBackWithValue("test").invoke("你")
//        }
//        PermissionUtil.checkNoRequest(this, arrayOf(Manifest.permission.WRITE_EXTERNAL_STORAGE, Manifest.permission.CAMERA), 1002)
//        AliPayManager.aliPay("sad", this, object : AliPayManager.IAliPayResult {
//            override fun result(msg: Any) {
//                toast(msg as String)
//            }
//        })
//        WechatUtil.INS.signSuccess = {
//
//        }
//        mFrameLayout.setOnClickListener {
//            MyClient.builder().addUrl("https://imtt.dd.qq.com/16891/apk/C7156DC5B3C8AEFBD61F170B76F3801D.apk?fsname=com.tencent.qqmusic_9.2.8.5_1065.apk&csr=1bbd")
//                    .build()
//                    .downLoad()
//                    .downLoad(MyHandler(WeakReference(this)), "MyTest", "kpc.apk")
//                    .execute(object : BaseSubscribe<File>() {
//                        override fun onNext(t: File) {
//                            installApk(t, this@MainActivity)
//                            Log.e(localClassName, t.path)
//                        }
//
//                        override fun onError(e: Throwable) {
//                            Log.e(localClassName, e.message)
//                        }
//                    })
//        }
//        mBottomBar.setTabSelectedListener(object : BottomNavigationBar.OnTabSelectedListener {
//            override fun onTabReselected(position: Int) {
//
//            }
//
//            override fun onTabUnselected(position: Int) {
//            }
//
//            override fun onTabSelected(position: Int) {
//
//            }
//        })
//        WechatUtil.INS.signIn()
//        Log.e("sadas", user.toString())
//        Log.e("sadas", context.toString())
//        Log.e("sadas", appComponent.toString())
//        Log.e("sadas", mPresenter.toString())
//        mPresenter.mView = this
//        mPresenter.loadData(this, recyclerView)
//        ShareUtil.setListener(object : ShareListener {
//            override fun onComplete(platform: String?) {
//                Log.e(localClassName, platform)
//            }
//
//            override fun onCancel(platform: String?) {
//                Log.e(localClassName, platform)
//            }
//
//            override fun onError(platform: String?) {
//                Log.e(localClassName, platform)
//            }
//        })

//        mBottomNavigationBar.setMode(BottomNavigationBar.MODE_FIXED)
//                .setBackgroundStyle(BottomNavigationBar.BACKGROUND_STYLE_DEFAULT)
//                .setActiveColor(R.color.colorPrimary)
//                .setBarBackgroundColor(R.color.common_white)
//                .setInActiveColor(R.color.ucrop_color_widget_active)
//                .setFirstSelectedPosition(0)
//                .addItem(BottomNavigationItem(R.drawable.icon_back, "返回"))
//                .addItem(BottomNavigationItem(R.drawable.icon_news, "新闻"))
//                .initialise()
//        mBottomBar.setTabSelectedListener(object : BottomNavigationBar.OnTabSelectedListener {
//            override fun onTabReselected(position: Int) {
//
//            }
//
//            override fun onTabUnselected(position: Int) {
//            }
//
//            override fun onTabSelected(position: Int) {
////                fragementManager.changeFragment(supportFragmentManager.beginTransaction(), position)
//            }
//        })
//        stack.add(homeFragment)
//        stack.add(testFragment)
//        fragementManager.addFragments(R.id.mFrameLayout, supportFragmentManager.beginTransaction(), stack)
//        fragementManager.changeFragment(supportFragmentManager.beginTransaction(), 0)
        IntentManager.INS.init(IMainProvider.MAIN_MAIN_ACTIVITY).withObj("sad", TestJ("wang", "10")).greenChannel().navigation()
//        ARouter.getInstance().build(IMainProvider.MAIN_MAIN_ACTIVITY).withObject("sad", TestJ("wang", "10")).navigation(null,null)
//        RouterManager.INS.getMainProvider()!!.isLogin()
        mFrameLayout.setOnClickListener {
            mPresenter.jumpLogin()
        }
    }


    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        when (requestCode) {
            1002 -> {
                for (i in grantResults) {
                    if (!PermissionUtil.isHasPermission(i)) {
                        toast("$i is not open!")
                    }
                }
            }
        }
    }
}
