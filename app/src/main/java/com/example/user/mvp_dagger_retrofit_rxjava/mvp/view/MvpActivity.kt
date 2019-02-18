package com.example.user.mvp_dagger_retrofit_rxjava.mvp.view

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View

import com.example.user.mvp_dagger_retrofit_rxjava.R
import com.example.user.mvp_dagger_retrofit_rxjava.mvp.BaseActivity
import com.example.user.mvp_dagger_retrofit_rxjava.mvp.BasePresenter
import com.example.user.mvp_dagger_retrofit_rxjava.mvp.JavaBean.Data
import com.example.user.mvp_dagger_retrofit_rxjava.mvp.present.MainPresent

val add5= {i: Int -> i + 5}  // g(x)
val multiplyBy2 = {i : Int -> i * 2} // f(x)
class MvpActivity : BaseActivity<Data>() {
     var data: Data?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mvp2)
        val add5AndMultiplyBy2 = add5 andThen multiplyBy2
        val add5ComposeMultiplyBy2 = add5 compose multiplyBy2
       Log.d("asdasdada","${add5AndMultiplyBy2(8)}")   //m(x) = f(g(x))

    }

    fun click(view: View) {
        data = iPresenter.data
    }

    override fun createPresenter(): BasePresenter<*> {
        return MainPresent()
    }

    infix fun <P1, P2, R> Function1<P1, P2>.andThen(function: Function1<P2, R>): Function1<P1,R>{
        return fun(p1: P1): R{
            return function.invoke(this.invoke(p1))
        }
    }

    infix fun <P1,P2, R> Function1<P2,R>.compose(function: Function1<P1, P2>): Function1<P1, R>{
        return fun(p1: P1): R{
            return this.invoke(function.invoke(p1))
        }
    }
}
