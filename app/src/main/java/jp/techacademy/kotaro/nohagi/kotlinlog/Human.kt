package jp.techacademy.kotaro.nohagi.kotlinlog

import android.util.Log

class Human : Animal,Thinkable {
    // プロパティ
    var hobby: String

    // 引数付きコンストラクタ
    constructor(name: String, age: Int, hobby: String) : super(name,age) {
        this.hobby = hobby
    }

    //自己紹介
    override fun say(){
        Log.d("kotlintest", "私の名前は"+this.name + "です。年は" + this.age + "です。")
    }

    //独り言
    override fun think(){
        Log.d("kotlintest", "「私は"+this.hobby+"について考える。」")
    }
}