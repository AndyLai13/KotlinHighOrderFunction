package com.viewsonic.kotlinhighorderfunction

class Delegate {
    interface Base{
        fun show ()
    }

    class BaseImpl: Base {
        override fun show() {
            print("BaseImpl::show()")
        }
    }

    class BaseProxy(base: Base): Base by base

    fun exec() {
        val base = BaseImpl()
        BaseProxy(base).show()
    }
}