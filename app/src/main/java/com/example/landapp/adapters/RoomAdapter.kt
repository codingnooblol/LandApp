package com.example.landapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.landapp.R
import com.example.landapp.Room

class RoomAdapter(
    val mContext :Context,
    val resID : Int,
    val mList : ArrayList<Room>) : ArrayAdapter<Room>(mContext, resID, mList) {

        val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var temprow = convertView

        if(temprow == null){
            temprow = inflater.inflate(R.layout.room_list_item, null)
        }
        val row = temprow!!

        return row
    }

}