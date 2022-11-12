package com.example.landapp

import java.text.NumberFormat
import java.util.*

class Room(val price : Int,
           val address : String,
           val floor : Int,
           val description : String) : java.io.Serializable{ //부동산 앱의 정보들의 형태를 결정

    fun getFormattedPrice() : String { //가격 단위를 환산해주는 함수

        val hundreadMillion = this.price / 10000
        val tenMillion = this.price % 10000

        if(this.price > 10000) {
            return "${hundreadMillion}억 ${NumberFormat.getNumberInstance(Locale.KOREA).format(tenMillion)}만원"
        }

        else if(this.price / 10000 >= 1) {

            return "${hundreadMillion}억"
        }

        else {
            return "${NumberFormat.getNumberInstance(Locale.KOREA).format(tenMillion)}만원"
        }
    }

    fun getFormattedFloor() : String { //층을 분류해주는 함수

        if(this.floor >= 1) {
            return "${this.floor}층"
        }

        else if(this.floor == 0) {
            return "반지하"
        }
        else
            return "지하 ${-this.floor}층"
        }
    }
