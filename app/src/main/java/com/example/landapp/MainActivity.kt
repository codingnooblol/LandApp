package com.example.landapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.landapp.adapters.RoomAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<Room>()

    lateinit var mRoomAdapter: RoomAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add(Room(8000, "서울시 동대문구", -1, "서울시 동대문구 3층방입니다"))
        mRoomList.add(Room(24500, "원주시 단구동", 5, "원주시 단구동 5층방입니다"))
        mRoomList.add(Room(16500, "용인시 김량장동", 0, "용인시 김량장동 7층방입니다"))
        mRoomList.add(Room(10000, "원주시 명륜동", 4, "원주시 명륜동 4층방입니다"))
        mRoomList.add(Room(7000, "원주시 치악로", -3, "원주시 치악로 2층방입니다"))

        mRoomAdapter = RoomAdapter(this, R.layout.room_list_item,mRoomList)

        roomListView.adapter = mRoomAdapter
    }
}