package com.gorani.jetpack_navigation_2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation

/**
 * Bundle
 * Fragment 간 Data 를 전달하는 방법.
 * Key 와 Value 의 한 쌍으로 Data 를 Bundle 객체에 담아 다른 Fragment 로 전달한다.
 * 단순히 Bundle 객체를 만들어 Data 를 보내는 방식의 경우 받은 Data 의 값이 null 일 수도 있다.
 * Data 의 값이 null 인 경우 반드시 예외처리를 해줘야하는 수고가 발생한다.
 * 이런 문제점을 고려하여 Google 공식 문서에서는 Safe Args 를 사용하기를 권장한다.
 *
 * https://developer.android.com/guide/navigation/navigation-pass-data?hl=ko
 *
 */

class BlankFragment1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        // * 방법1. 일반적인 Data 전달 방법 : Bundle
//        // Bundle 생성
//        val bundle = Bundle()
//        bundle.putString("key", "value")
//
//        // Bundle 객체 보내기
//        view.findViewById<Button>(R.id.btn_1).setOnClickListener {
//            Navigation.findNavController(it).navigate(R.id.action_blankFragment1_to_blankFragment2, bundle)
//        }

        // * 방법2. Safe Args
//        val action = BlankFragment1Directions.actionBlankFragment1ToBlankFragment2("abcdef")    // Data (abcdf) 를 전달
        val action = BlankFragment1Directions.actionBlankFragment1ToBlankFragment2()
        // ㄴ> Data 없이 전달 -> Default 값이 전달됨. 이런 측면에서 Safe 하다고 할 수 있음. (적어도 Nullable 이 아니기 때문.)

        view.findViewById<Button>(R.id.btn_1).setOnClickListener {
            Navigation.findNavController(it).navigate(action)
        }

    }

}