package com.example.k230327_android_lab_pra



fun hofFun(arg: (Int) -> Boolean): () -> String {
    val result = if(arg(10)) {
        "valid"
    } else {
        "invalid"
    }
    return {"hofFun result : $result"}
}




val data5 : Int = 1


val data4 : Int by lazy {
    println("in lazy....순서2..")
    10
}



lateinit var name2: String
//lateinit var num : Int    이건 왜 안돼  Int가 기본형이라 안된다는데 String은 기본형이 아닌가?
// 기본 문법에 대한 설명은 참고 및, 한번 정도
// 직접 코드로 작성해서, 오류 부분 정도 확인하고,
// 그리고 실제 작업은 ide에서 문법체크 해주니 도움을 받자.



val name : String = "lys"


fun main() {
    val result = hofFun({no -> no > 0})
    println(result())

//    val name: String
//    val name : String = "main안의 name 변수"    //지역변수 가 전역변수보다 우선
//    println("이름은: $name") //jsp EL 표기법, ${} 해당 변수 사용하면 됨
//    println("hello world")


//    println("in main 순서1")
//    println("data4 사용하자 순서3 : $data4 ")
//    println("data4 사용하자 순서3 : ("+ {data4} + 10)
//    println(data4 + 10)
//    println(data4 + 10)


//    data5.  : 모든 타입이 객체이기 때문에, 닷 연산자 통해서 멤버에 다 접근이 가능하다.


// null 허용할수있는 연산자가 있을 때만. null 허용 연산자 코틀린에서 엄청많이사용한다
//    var data6 : Int? = 2
//    data6 = null


    //Array, 선언, 세터, 게터
    //선언
//    val data1 : Array<Int> = Array(3, {0}) //사이즈3 , 값은 0으로 {0,0,0}
    //세터
//    data1[0] = 10
//    data1[2] = 20
//    println("""
//        data1의 size : ${data1.size}
//        data1의 요소 : ${data1[0]}, ${data1.get(1)}, ${data1[2]}
//    """.trimIndent())




}

class Test {

}