package com.example.k230327_android_lab_pra

import java.util.Scanner

// 회원 정보를 담을 데이터 클래스
data class User(val id: String, val password: String, val email: String, val phone: String)

// Admin 계정 정보
val admin = User("admin", "1234", "admin@example.com", "010-1234-5678")

// 로그인 함수
fun login(scanner: Scanner): Boolean {
    print("ID: ")
    val id = scanner.nextLine()
    print("Password: ")
    val password = scanner.nextLine()

    return id == admin.id && password == admin.password
}

fun main() {
    val scanner = Scanner(System.`in`)

    while (true) {
        println("===== 메뉴 =====")
        println("1. 로그인")
        println("2. 종료")
        print("메뉴를 선택하세요: ")
        val choice = scanner.nextLine()

        when (choice) {
            "1" -> {
                if (login(scanner)) {
                    println("로그인 성공!")
                } else {
                    println("로그인 실패. 아이디 또는 비밀번호가 일치하지 않습니다.")
                }
            }
            "2" -> break
            else -> println("잘못된 입력입니다. 다시 입력해주세요.")
        }
    }

    scanner.close()
}



class Test2 {

}