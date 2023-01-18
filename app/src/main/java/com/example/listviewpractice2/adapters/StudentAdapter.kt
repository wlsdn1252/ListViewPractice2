package com.example.listviewpractice2.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.listviewpractice2.R
import com.example.listviewpractice2.datas.Student

class StudentAdapter(val mContext : Context, val resId : Int, mList: ArrayList<Student>) : ArrayAdapter<Student>(mContext,resId,mList) {

    // 인플레이터 변수 대입
    val inf = LayoutInflater.from(mContext)

    // 화면 구성하기
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // 리스트 한 줄에 해당하는 convertView를 대입
        var tmpRow = convertView

        // 만약 리스트의 한 줄이 비어있다면
        if(tmpRow == null){
            // student_list_item를 인플레이트 해달라
            tmpRow = inf.inflate(R.layout.student_list_item,null)
        }

        // if문이 끝나면 tmpRow에는 null값이 무조건 없다.
        val row = tmpRow!!
        return row
    }
}