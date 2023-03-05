package com.gorani.jetpack_navigation_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Navigation - Animation Effect
 *
 * ex. Fragment A / Fragment B 가 있다고 가정.
 * - 효과
 * - enterAnim : A -> B 로 갈 때, B 가 보이는 방식.
 * - exitAnim : A -> B 로 갈 때, A 가 사라지는 방식.
 * - popEnterAnim -> Back Button(뒤로 가기) 으로 B -> A 로 올 떄, A 가 나타나는 방식.
 * - popExitAnim -> Back Button(뒤로 가기) 으로 B -> A 로 올 떄, B 가 사라지는 방식.
 */

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}