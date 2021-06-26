package jp.techacademy.kotaro.nohagi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 名前：山本、年齢：14歳で、趣味：野球のHumanインスタンスを作成
        val yamamoto = Human("山本", 14,"野球")
        //自己紹介
        yamamoto.say()
        //独り言
        yamamoto.think()

        // 名前：山本、年齢：14歳で、趣味：野球のHumanインスタンスを作る
        val lambo = Human("ランボ",5,"ブランコ")
        //自己紹介
        lambo.say()
        //独り言
        lambo.think()
    }
}