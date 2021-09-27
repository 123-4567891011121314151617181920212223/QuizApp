package com.quizapp

import com.quizapp.R
import com.quizapp.Question

object Constants {


    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        // 1
        val que1 = Question(
            1, "what color is this?",
            R.drawable.ic_red,
            "red", "blue",
            "green", "orange", 1
        )

        questionsList.add(que1)

        // 2
        val que2 = Question(
            2, "what color is this?",
            R.drawable.ic_black,
            "white", "red",
            "black", "green", 3
        )

        questionsList.add(que2)

        // 3
        val que3 = Question(
            3, "what is this animal called?",
            R.drawable.ic_horse,
            "cat", "horse",
            "tiger", "dog", 4
        )

        questionsList.add(que3)



        return questionsList
    }
}