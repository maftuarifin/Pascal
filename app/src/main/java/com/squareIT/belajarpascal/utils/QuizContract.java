package com.squareIT.belajarpascal.utils;

import android.provider.BaseColumns;

public final class QuizContract {

    public QuizContract() {
    }


    public static class CategoriesTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_categories";
        public static final String COLUMN_NAME = "name";
        public static final String COLUMN_HIGHSCORE = "highscore";

    }

    public static class QuestionTable implements BaseColumns {
        public static final String TABLE_NAME = "quiz_questions";
        public static final String COLUMN_QUESTION = "question";
        public static final String COLUMN_OPTION1 = "option1";
        public static final String COLUMN_OPTION2 = "option2";
        public static final String COLUMN_OPTION3 = "option3";
        public static final String COLUMN_OPTION4 = "option4";
        public static final String COLUMN_OPTION5 = "option5";
        public static final String COLUMN_ANSWER_NUMBER = "answer_number";
        public static final String COLUMN_CATEGORY_ID = "category_id";
    }


}
