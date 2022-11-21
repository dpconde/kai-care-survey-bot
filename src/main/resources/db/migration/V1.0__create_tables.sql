CREATE TABLE survey
(
    id         varchar(36)  NOT NULL,
    name       varchar(100) NOT NULL,
    isTemplate BOOLEAN      NOT NULL,
    threadId   varchar(36) DEFAULT NULL,
    fromUserId varchar(36) DEFAULT NULL,
    toUserId   varchar(36) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE survey_question
(
    id          varchar(36)  NOT NULL,
    questionSurveyId    varchar(36)  NOT NULL,
    selectionId varchar(36) DEFAULT NULL,
    text        varchar(256) NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT FK_SurveyQuestion FOREIGN KEY (questionSurveyId) REFERENCES survey(id)
);

CREATE TABLE survey_question_answer
(
    id           varchar(36)  NOT NULL,
    answerSurveyId     varchar(36)  NOT NULL,
    answerQuestionId   varchar(36)  NOT NULL,
    text         varchar(256) NOT NULL,
    optionLetter varchar(1)   NOT NULL,
    PRIMARY KEY (id),
    CONSTRAINT FK_QuestionAnswer FOREIGN KEY (answerQuestionId) REFERENCES survey_question(id),
    CONSTRAINT FK_SurveyAnswer FOREIGN KEY (answerSurveyId) REFERENCES survey(id)
);

ALTER TABLE survey_question
    ADD CONSTRAINT FK_QuestionSelection FOREIGN KEY (selectionId) REFERENCES survey_question_answer(id);

