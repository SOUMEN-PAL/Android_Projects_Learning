package com.example.quizapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.view.View.OnClickListener
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import org.w3c.dom.Text

class MyQuestions : AppCompatActivity() , OnClickListener{

    private var mCurrentPosition: Int = 1
    private  var mQuestionList: ArrayList<Question>? = null
    private var mSelectedOption : Int = 0

    private  var progessBar : ProgressBar? = null
    private var tvProgess : TextView? = null
    private var tvQuestion : TextView? = null
    private var ivImage : ImageView? = null

    private var tvOptionOne : TextView? = null
    private var tvOptionTwo : TextView? = null
    private var tvOptionThree : TextView? = null
    private var tvOptionFour : TextView? = null
    private var btnSubmit : Button? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_my_questions)
        // Getting the id of the views //
        progessBar = findViewById(R.id.progessbar)
        tvProgess = findViewById(R.id.tvprogess)
        tvQuestion = findViewById(R.id.tvQuestion)
        ivImage = findViewById(R.id.iv_image)

        tvOptionOne = findViewById(R.id.tv_option_one)
        tvOptionTwo = findViewById(R.id.tv_option_two)
        tvOptionThree = findViewById(R.id.tv_option_three)
        tvOptionFour = findViewById(R.id.tv_option_four)
        mQuestionList = constance.getquestions()
        btnSubmit = findViewById(R.id.btn_submit)
        setQuestion()

    }

    private fun setQuestion() {

        val question : Question = mQuestionList!![mCurrentPosition - 1]
        ivImage?.setImageResource(question.image)
        progessBar?.progress = mCurrentPosition
        tvProgess?.text = "$mCurrentPosition/${progessBar?.max}"
        tvQuestion?.text = question.question
        tvOptionOne?.text = question.op1
        tvOptionTwo?.text = question.op2
        tvOptionThree?.text = question.op3
        tvOptionFour?.text = question.op4

        if(mCurrentPosition == mQuestionList!!.size){
            btnSubmit?.text = "FINISH"
        }else{
            btnSubmit?.text = "SUBMIT"
        }

    }



    override fun onClick(v: View?) {
        TODO("Not yet implemented")
    }
}