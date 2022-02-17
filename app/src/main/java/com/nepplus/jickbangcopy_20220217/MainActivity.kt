package com.nepplus.jickbangcopy_20220217

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.nepplus.jickbangcopy_20220217.adapters.RoomAdapter
import com.nepplus.jickbangcopy_20220217.datas.RoomData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mRoomList = ArrayList<RoomData>()
    lateinit var mRoomAdapter: RoomAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mRoomList.add( RoomData(8000, "서울시 동대문구", 7, "1번째 방입니다.") )
        mRoomList.add( RoomData(19000, "서울시 서대문구", 5, "2번째 방입니다.") )
        mRoomList.add( RoomData(25600, "서울시 동작구", 3, "3번째 방입니다") )
        mRoomList.add( RoomData(3800, "서울시 강남구", -1, "4번째 방입니다.") )
        mRoomList.add( RoomData(56000, "서울시 은평구", 8, "5번째 방입니다.") )
        mRoomList.add( RoomData(7800, "서울시 마포구", -2, "6번째 방입니다.") )
        mRoomList.add( RoomData(6800, "서울시 중랑구", 0, "7번째 방입니다.") )
        mRoomList.add( RoomData(29000, "서울시 성북구", 1, "8번째 방입니다.") )
        mRoomList.add( RoomData(31200, "서울시 성동구", 0, "9번째 방입니다.") )


        mRoomAdapter = RoomAdapter( this, R.layout.room_list_item, mRoomList )
        roomListView.adapter = mRoomAdapter


    }
}