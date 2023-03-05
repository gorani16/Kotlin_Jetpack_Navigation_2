package com.gorani.jetpack_navigation_2

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs

class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        // 방법1. Bundle 객체의 데이터 받기
//        val bundleData = arguments?.getString("key")    // key : Fragment1 에서 생성한 Bundle 객체의 Key 값
//        Log.d("bundleData", "$bundleData")

        // 방법2. Safe Args 데이터 받기
        val args: BlankFragment2Args by navArgs()
        Log.d("Safe_Args", args.key)

        view.findViewById<Button>(R.id.btn_2).setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_blankFragment2_to_blankFragment1)
        }



    }
}