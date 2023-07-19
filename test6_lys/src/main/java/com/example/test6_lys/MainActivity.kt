package com.example.test6_lys

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.test6_lys.databinding.ActivityMainBinding

//액티비티 : 화면을 그려주는 역할.
class MainActivity : AppCompatActivity() {
    //최초에 한번 화면에 출력을 하는 역할.

    var status : Int = 0
    //토글용 변수. 스위치 효과를 주기 위해서, 상태 패턴의 변수를 이용해서
    //이미지 보여주고, 안보여주기

    override fun onCreate(savedInstanceState: Bundle?) {


        //뷰 바인딩 적용1
        //시스템에서 자동으로 생성해준다. ActivityMainBinding
        //여기 코드, 설정코드이기때문에, 디비 연결 하는 Connection 객체 용도가 비슷.
        //binding 작업하는 뷰가 모두 들어가 있다.
        val binding = ActivityMainBinding.inflate(layoutInflater)

        //savedInstanceState: Bundle? -> 임시 데이터 저장 객체,
        super.onCreate(savedInstanceState)
        //레이아웃 샘플로 리니어 사용하는 중, 이유? 제약조건 설정이 간단해서.
        //뷰만 선택해서 배치만하면, 기본 세로, 가로방향으로 배치가 간단함.

        //(R.layout.activity_main)에서 (binding.root)
        setContentView(binding.root)

        //버튼 클릭 -> 이미지 -> show / hide
        //버튼에 이벤트 클릭 리스너 설정 후 -> 결과로 이미지의 속성 중에
        //visivility 속성으로 show/hide 테스트
        //binding 객체 안에, 사용하는 뷰의 모든 객체가 다 담아져 있습니다.

        //버튼 하나로 토글처럼하는경우 -> 상태패턴 상태를 나타내는 변수를 하나 정해야한다
        binding.btn1.setOnClickListener{


            if(status == 0){
                binding.img1.visibility = View.GONE
                status = 1
            }
            else if(status == 1){
                binding.img1.visibility = View.VISIBLE
                status = 0
            }

        }



//버튼 두개로 하는 경우
//        binding.btn1.setOnClickListener{
//            binding.img1.visibility = View.GONE
//        }
//
//        binding.btn2.setOnClickListener{
//            binding.img1.visibility = View.VISIBLE
//        }
    }
}