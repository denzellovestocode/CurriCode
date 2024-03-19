package com.example.kojpy




object QuestionsBank {
    private fun javaQuestions(): List<QuestionList> {
        val questionLists: MutableList<QuestionList> = ArrayList<QuestionList>()

        //create object of QuestionList class and pass a question along with options and answer
        val question1 = QuestionList(
            "What is 1(one) plus 3(three)?",
            "1(one)",
            "8(eight)",
            "4(four)",
            "13(thirteen)",
            "4(four)",
            ""
        )
        val question2 = QuestionList(
            "What is 7(seven) minus 2(two)?",
            "4(four)",
            "5(five)",
            "9(nine)",
            "4(four)",
            "5(five)",
            ""
        )
        val question3 = QuestionList(
            "What is 13(thirteen) minus 10(ten) ?",
            "3(three)",
            "230(two hundred and thirty)",
            "0(zero)",
            "23(twenty three)",
            "3(three)",
            ""
        )
        val question4 = QuestionList(
            "What is the next two digits after 8",
            "7 and 6",
            "8 and 9",
            "9 and 10",
            "7 and 6",
            "9 and 10",
            ""
        )

        // add all question to list<QuestionsList>
        questionLists.add(question1)
        questionLists.add(question2)
        questionLists.add(question3)
        questionLists.add(question4)
        return questionLists
    }

    private fun phpQuestions(): List<QuestionList> {
        val questionLists: MutableList<QuestionList> = ArrayList<QuestionList>()

        //Create object of QuestionList class and pass a question along with options and answer
        val question1 = QuestionList(
            "What does PHP stand for ?",
            "Professional Home Page ",
            "Hypertext Preprocessor",
            "Pretext Hypertext Processor",
            "Preprocessor Home Page ",
            "Hypertext Preprocessor",
            ""
        )
        val question2 = QuestionList(
            "who is the father of PHP ?",
            "Rasmus Lerdorf",
            "William Makepiece",
            "Drek Kolkevi",
            "List Barely ",
            "Rasmus Lerdorf",
            ""
        )
        val question3 = QuestionList(
            "PHP files have a default file extension of. ",
            ".html ",
            ".php",
            ".xml",
            ".json ",
            ".php",
            ""
        )
        val question4 = QuestionList(
            "Which version of PHP introduced Try/catch Exception?",
            "PHP 4",
            "PHP 5",
            "PHP 6",
            "PHP 5.3",
            "PHP 5",
            ""
        )

        // add all question to list<QuestionsList>
        questionLists.add(question1)
        questionLists.add(question2)
        questionLists.add(question3)
        questionLists.add(question4)
        return questionLists
    }

    private fun htmlQuestions(): List<QuestionList> {
        val questionLists: MutableList<QuestionList> = ArrayList<QuestionList>()

        //Create object of QuestionList class and pass a question along with options and answer
        val question1 = QuestionList(
            "What is 1(one) plus 3(three)?",
            "1(one)",
            "8(eight)",
            "4(four)",
            "13(thirteen)",
            "4(four)",
            ""
        )
        val question2 = QuestionList(
            "What is 7(seven) minus 2(two)?",
            "4(four)",
            "5(five)",
            "9(nine)",
            "4(four)",
            "5(five)",
            ""
        )
        val question3 = QuestionList(
            "What is 13(thirteen) minus 10(ten) ?",
            "3(three)",
            "230(two hundred and thirty)",
            "0(zero)",
            "23(twenty three)",
            "3(three)",
            ""
        )
        val question4 = QuestionList(
            "What are the next two digits after 8",
            "7 and 6",
            "8 and 9",
            "9 and 10",
            "7 and 6",
            "9 and 10",
            ""
        )

        // add all question to list<QuestionsList>
        questionLists.add(question1)
        questionLists.add(question2)
        questionLists.add(question3)
        questionLists.add(question4)
        return questionLists
    }

    private fun androidQuestions(): List<QuestionList> {
        val questionLists: MutableList<QuestionList> = ArrayList<QuestionList>()

        //Create object of QuestionList class and pass a question along with options and answer
        val question1 = QuestionList(
            "Select a component which is Not part of Android architecture  ?",
            "Android Framework",
            "Libraries",
            "Linux Kernel",
            "Android Document",
            "Linux Kernel",
            ""
        )
        val question2 = QuestionList(
            "A_______ makes a specific set of the application data available to other application ",
            "Content provider",
            "Broadcast receivers",
            "Intent",
            "None of these",
            "Content provider",
            ""
        )
        val question3 = QuestionList(
            "Which among these are NOT a part of Android native libraries?",
            "webkit",
            "Dalvik",
            "OpenGL",
            "SQLite",
            "Dalvik",
            ""
        )
        val question4 = QuestionList(
            "During an Activity life-cycle, what is the first callback method invoked by the system ?",
            "onStop()",
            "onStart()",
            "onCreate()",
            "onRestore()",
            "onCreate()",
            ""
        )

        // add all question to list<QuestionsList>
        questionLists.add(question1)
        questionLists.add(question2)
        questionLists.add(question3)
        questionLists.add(question4)
        return questionLists
    }

    fun getQuestions(selectedTopicName: String?): List<QuestionList> {
        return when (selectedTopicName) {
            "java" -> javaQuestions()
            "php" -> phpQuestions()
            "android" -> androidQuestions()
            else -> htmlQuestions()
        }
    }
}
