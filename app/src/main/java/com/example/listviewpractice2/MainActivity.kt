package com.example.listviewpractice2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.listviewpractice2.adapters.StudentAdapter
import com.example.listviewpractice2.datas.Student
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // 실제 뿌려줄 데이터 대입
    val mStudentList = ArrayList<Student>()

    lateinit var mAdapter : StudentAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mStudentList.add(Student("강진우",1997))
        mStudentList.add(Student("이봉준",1997))
        mStudentList.add(Student("정호석",1997))
        mStudentList.add(Student("안준호",1997))

        mAdapter = StudentAdapter(this,R.layout.student_list_item, mStudentList)

        studnetListView.adapter = mAdapter

    }
}