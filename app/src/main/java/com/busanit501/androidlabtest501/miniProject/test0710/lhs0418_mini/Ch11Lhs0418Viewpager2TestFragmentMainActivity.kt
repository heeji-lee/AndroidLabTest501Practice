package com.busanit501.androidlabtest501.miniProject.test0710.lhs0418_mini

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.busanit501.androidlabtest501.R
import com.busanit501.androidlabtest501.databinding.ActivityCh11Lhs0418Viewpager2TestFragmentMainBinding

class Ch11Lhs0418Viewpager2TestFragmentMainActivity : AppCompatActivity() {
    lateinit var binding : ActivityCh11Lhs0418Viewpager2TestFragmentMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        binding = ActivityCh11Lhs0418Viewpager2TestFragmentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_ch11_viewpager2_test_fragment_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        //더미 데이터 만들기.
        val testData = mutableListOf<String>()
        for (i in 0..2) {
            testData.add("오늘 점심은 뭐 먹나요? $i")
        }

        // 뷰페이져의 속성에 어댑터 속성 연결하기.
        binding.ch11vierpagerTest1.adapter = Lhs0418ViewpagerFragmentAdapter(this)


        //2번째 뷰페이져 붙이기
        binding.ch11vierpagerTest2.adapter = Lhs0418ViewpagerFragmentAdapter2(this)

    } //onCreate
}