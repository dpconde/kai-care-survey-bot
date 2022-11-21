
#Survey
INSERT INTO survey (id, name, isTemplate, threadId, fromUserId, toUserId)
VALUES ('8d7e7a84-5850-4427-8803-000c1f435d9c', 'has_es', true, null, null, null);


#Questions and answers
#1
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('ad3c9c8a-1d51-420b-8dd7-a4934a1a50e9','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Me siento tenso/a o nervioso/a:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('d0643515-a4c4-44bf-976e-4ef400fc7768','8d7e7a84-5850-4427-8803-000c1f435d9c', 'ad3c9c8a-1d51-420b-8dd7-a4934a1a50e9', 'Casi todo el día', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('afe74ab9-52ce-46b5-8080-55faedff6adc','8d7e7a84-5850-4427-8803-000c1f435d9c', 'ad3c9c8a-1d51-420b-8dd7-a4934a1a50e9', 'Gran parte del día', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('0502617a-81ef-4e67-8760-7867b6900882','8d7e7a84-5850-4427-8803-000c1f435d9c', 'ad3c9c8a-1d51-420b-8dd7-a4934a1a50e9', 'De vez en cuando', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('2833473b-17a3-45d3-9721-f5a8abb0e825','8d7e7a84-5850-4427-8803-000c1f435d9c', 'ad3c9c8a-1d51-420b-8dd7-a4934a1a50e9', 'Nunca', 'D');



#2
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('15112aea-a34a-4987-876c-3a4631d56504','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Sigo disfrutando con las mismas cosas de siempre:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('dddfa357-df5d-4640-8690-25c4ba279059','8d7e7a84-5850-4427-8803-000c1f435d9c', '15112aea-a34a-4987-876c-3a4631d56504', 'Igual que antes', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('3f84644f-ad95-44d6-a84b-c9b6d5642654','8d7e7a84-5850-4427-8803-000c1f435d9c', '15112aea-a34a-4987-876c-3a4631d56504', 'No tanto como antes', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('b53310e8-0a9d-41aa-b463-8d279c4c11cb','8d7e7a84-5850-4427-8803-000c1f435d9c', '15112aea-a34a-4987-876c-3a4631d56504', 'Solamente un poco', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('e04b8181-355b-4ec0-bb84-28daf34cf73c','8d7e7a84-5850-4427-8803-000c1f435d9c', '15112aea-a34a-4987-876c-3a4631d56504', 'Ya no disfruto con nada', 'D');



#3
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('f0a15c9d-488e-4d67-ad4d-97c49418b752','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Siento una especie de temor como si algo malo fuera a suceder:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('a21935fd-71b5-4f36-8bdc-fe2ee0002823','8d7e7a84-5850-4427-8803-000c1f435d9c', 'f0a15c9d-488e-4d67-ad4d-97c49418b752', 'Sí y muy intenso', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('6f03493f-a119-463a-945f-477b9343aa81','8d7e7a84-5850-4427-8803-000c1f435d9c', 'f0a15c9d-488e-4d67-ad4d-97c49418b752', 'Sí, pero no muy intenso', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('8b9bef43-f857-4bfa-b3be-82b9ef53a825','8d7e7a84-5850-4427-8803-000c1f435d9c', 'f0a15c9d-488e-4d67-ad4d-97c49418b752', 'Sí, pero no me preocupa', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('1ee667cf-45e7-463f-98a6-5ef37a2b1be8','8d7e7a84-5850-4427-8803-000c1f435d9c', 'f0a15c9d-488e-4d67-ad4d-97c49418b752', 'No siento nada de eso', 'D');



#4
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('9e15ed3b-f2a4-4522-bda9-cec2f2de0f69','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Soy capaz de reírme y ver el lado gracioso de las cosas:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('74e4bf9d-38ed-4b03-98ca-910c90c9b148','8d7e7a84-5850-4427-8803-000c1f435d9c', '9e15ed3b-f2a4-4522-bda9-cec2f2de0f69', 'Igual que siempre', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('2964882f-7354-4429-af65-0215f52f1ad2','8d7e7a84-5850-4427-8803-000c1f435d9c', '9e15ed3b-f2a4-4522-bda9-cec2f2de0f69', 'Actualmente algo menos', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('798eed21-fb3e-4178-85ca-78fb4ca82019','8d7e7a84-5850-4427-8803-000c1f435d9c', '9e15ed3b-f2a4-4522-bda9-cec2f2de0f69', 'Actualmente mucho menos', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('ee416759-3684-49a8-9087-68cf148d33b3','8d7e7a84-5850-4427-8803-000c1f435d9c', '9e15ed3b-f2a4-4522-bda9-cec2f2de0f69', 'Actualmente en absoluto', 'D');



#5
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('c5f592ca-a8e9-4ec8-98f7-fe1847b21e77','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Tengo la cabeza llena de preocupaciones:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('de98019a-0498-446e-a11b-4e8588af26d1','8d7e7a84-5850-4427-8803-000c1f435d9c', 'c5f592ca-a8e9-4ec8-98f7-fe1847b21e77', 'Casi todo el día', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('36b4b062-85f8-4f6b-8b23-88398a7c8830','8d7e7a84-5850-4427-8803-000c1f435d9c', 'c5f592ca-a8e9-4ec8-98f7-fe1847b21e77', 'Gran parte del día', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('4b81cfc6-8f3f-435b-ba76-f47d91008db7','8d7e7a84-5850-4427-8803-000c1f435d9c', 'c5f592ca-a8e9-4ec8-98f7-fe1847b21e77', 'De vez en cuando', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('db6feb4d-d52d-4d7e-a338-f2b60565eda8','8d7e7a84-5850-4427-8803-000c1f435d9c', 'c5f592ca-a8e9-4ec8-98f7-fe1847b21e77', 'Nunca', 'D');



#6
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('d2b91fc1-cc75-4980-bdec-719c552fab90','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Me siento alegre:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('97b79ad4-268d-4b16-9c46-cf9ce86804a3','8d7e7a84-5850-4427-8803-000c1f435d9c', 'd2b91fc1-cc75-4980-bdec-719c552fab90', 'Gran parte del día', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('5cc402ac-4521-4eca-9bde-7f1ba7e52df9','8d7e7a84-5850-4427-8803-000c1f435d9c', 'd2b91fc1-cc75-4980-bdec-719c552fab90', 'En algunas ocasiones', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('59783911-ac3e-4ad7-be22-213ba51d22aa','8d7e7a84-5850-4427-8803-000c1f435d9c', 'd2b91fc1-cc75-4980-bdec-719c552fab90', 'Muy pocas veces', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('682f6f48-4d43-4105-8b68-db19a72b27fa','8d7e7a84-5850-4427-8803-000c1f435d9c', 'd2b91fc1-cc75-4980-bdec-719c552fab90', 'Nunca', 'D');



#7
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('b3f11722-f2ea-4ef1-bad5-c171190d807f','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Soy capaz de permanecer sentado/a tranquilo/a y relajadamente:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('03add6dd-1d18-4286-8286-336b6b44f086','8d7e7a84-5850-4427-8803-000c1f435d9c', 'b3f11722-f2ea-4ef1-bad5-c171190d807f', 'Siempre', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('c0cb4bfe-6ee9-44e2-8044-97bf0ca075a2','8d7e7a84-5850-4427-8803-000c1f435d9c', 'b3f11722-f2ea-4ef1-bad5-c171190d807f', 'A menudo', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('64d78604-cc88-438a-ad6d-45dca68e4cc0','8d7e7a84-5850-4427-8803-000c1f435d9c', 'b3f11722-f2ea-4ef1-bad5-c171190d807f', 'Raras veces', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('4e1665ba-7f6d-4aed-a00f-db8d5860e64a','8d7e7a84-5850-4427-8803-000c1f435d9c', 'b3f11722-f2ea-4ef1-bad5-c171190d807f', 'Nunca', 'D');



#8
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('fc3743a8-ead1-4f08-90d7-ee6a479a6ed1','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Me siento lento/a y torpe:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('797454dc-48cd-45e5-98f0-20f79f16f9e2','8d7e7a84-5850-4427-8803-000c1f435d9c', 'fc3743a8-ead1-4f08-90d7-ee6a479a6ed1', 'Nunca', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('8d1c5007-77b2-460d-8a5f-060ef67f6b9a','8d7e7a84-5850-4427-8803-000c1f435d9c', 'fc3743a8-ead1-4f08-90d7-ee6a479a6ed1', 'A veces', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('bc4717d1-5f45-4df0-8eec-449e2a5ee53f','8d7e7a84-5850-4427-8803-000c1f435d9c', 'fc3743a8-ead1-4f08-90d7-ee6a479a6ed1', 'A menudo', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('9c9f7a76-9330-4049-803c-f7e096b0eb33','8d7e7a84-5850-4427-8803-000c1f435d9c', 'fc3743a8-ead1-4f08-90d7-ee6a479a6ed1', 'Gran parte del día', 'D');



#9
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('279ff03e-86c0-4e10-8ebe-a42ca2d6fbb3','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Experimento una desagradable sensación de "nervios y hormigueos en el estómago":');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('c926f4b3-16d1-43c5-a256-e17db822154b','8d7e7a84-5850-4427-8803-000c1f435d9c', '279ff03e-86c0-4e10-8ebe-a42ca2d6fbb3', 'Nunca', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('1f352609-e8bb-47bc-87ca-eed95dacc03a','8d7e7a84-5850-4427-8803-000c1f435d9c', '279ff03e-86c0-4e10-8ebe-a42ca2d6fbb3', 'Sólo en algunas ocasiones', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('da45c020-1dea-4319-81da-73f9fe40eb03','8d7e7a84-5850-4427-8803-000c1f435d9c', '279ff03e-86c0-4e10-8ebe-a42ca2d6fbb3', 'A menudo', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('c96a1e9c-025e-4b94-a2ec-64dfda0d5894','8d7e7a84-5850-4427-8803-000c1f435d9c', '279ff03e-86c0-4e10-8ebe-a42ca2d6fbb3', 'Muy a menudo', 'D');



#10
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('80980f5d-5559-43b6-abd8-adefd96a6b1c','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'He perdido el interés por mi aspecto personal:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('02e1f8d5-5dce-498b-93c7-69d1b4289095','8d7e7a84-5850-4427-8803-000c1f435d9c', '80980f5d-5559-43b6-abd8-adefd96a6b1c', 'Me cuido como siempre lo he hecho', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('d0b1fe7c-6a6d-4ec8-b42a-459e3fb5a464','8d7e7a84-5850-4427-8803-000c1f435d9c', '80980f5d-5559-43b6-abd8-adefd96a6b1c', 'Es posible que no me cuide como debiera', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('d9fc0a15-91af-4b9b-b0ca-8375daca6c1f','8d7e7a84-5850-4427-8803-000c1f435d9c', '80980f5d-5559-43b6-abd8-adefd96a6b1c', 'No me cuido como debiera hacerlo', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('7339212b-800b-462f-bbcd-003d584f71c7','8d7e7a84-5850-4427-8803-000c1f435d9c', '80980f5d-5559-43b6-abd8-adefd96a6b1c', 'Completamente', 'D');



#11
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('3afb1b98-dc81-4863-b86c-658bcc6add2b','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Me siento inquieto/a como si no pudiera parar de moverme:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('13a278ab-9b0f-4974-9b75-3adbc8e42ac6','8d7e7a84-5850-4427-8803-000c1f435d9c', '3afb1b98-dc81-4863-b86c-658bcc6add2b', 'Realmente mucho', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('950caf9f-710f-4ee3-a0b5-83dbe394ad81','8d7e7a84-5850-4427-8803-000c1f435d9c', '3afb1b98-dc81-4863-b86c-658bcc6add2b', 'Bastante', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('bcb007a9-6804-4b9e-becf-031e871dfdf7','8d7e7a84-5850-4427-8803-000c1f435d9c', '3afb1b98-dc81-4863-b86c-658bcc6add2b', 'No mucho', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('9beee6f1-bcb8-4f01-b892-6f42bf3b48ee','8d7e7a84-5850-4427-8803-000c1f435d9c', '3afb1b98-dc81-4863-b86c-658bcc6add2b', 'En absoluto', 'D');



#12
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('ea520a1e-1be9-4ae2-8498-050908b02cdc','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Tengo ilusión por las cosas:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('07570f95-efe5-4766-98d4-a7b43f1d36ba','8d7e7a84-5850-4427-8803-000c1f435d9c', 'ea520a1e-1be9-4ae2-8498-050908b02cdc', 'Como siempre', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('49f946cf-5d84-4190-bbb6-1abd22784dbc','8d7e7a84-5850-4427-8803-000c1f435d9c', 'ea520a1e-1be9-4ae2-8498-050908b02cdc', 'Algo menos que antes', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('39729d5c-e278-46de-b98b-b7f87000d142','8d7e7a84-5850-4427-8803-000c1f435d9c', 'ea520a1e-1be9-4ae2-8498-050908b02cdc', 'Mucho menos que antes', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('f0ee2caf-0dbe-4ddd-a3d6-92f5439ac119','8d7e7a84-5850-4427-8803-000c1f435d9c', 'ea520a1e-1be9-4ae2-8498-050908b02cdc', 'En absoluto', 'D');



#13
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('61df2a5b-3ee7-4bdf-8b05-92a1fd0fa0f5','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Experimento de repente sensaciones de gran angustia o temor:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('c5152776-a07c-40d2-8208-60efd74a6c97','8d7e7a84-5850-4427-8803-000c1f435d9c', '61df2a5b-3ee7-4bdf-8b05-92a1fd0fa0f5', 'Muy a menudo', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('74dd4bd9-ee42-48f2-9b4f-e5eec2546e98','8d7e7a84-5850-4427-8803-000c1f435d9c', '61df2a5b-3ee7-4bdf-8b05-92a1fd0fa0f5', 'Con cierta frecuencia', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('d50fcfb1-63a9-403e-a3fc-884821220b6a','8d7e7a84-5850-4427-8803-000c1f435d9c', '61df2a5b-3ee7-4bdf-8b05-92a1fd0fa0f5', 'Raramente', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('6f3a1bc3-bd54-4b4d-997b-86ad5b5201eb','8d7e7a84-5850-4427-8803-000c1f435d9c', '61df2a5b-3ee7-4bdf-8b05-92a1fd0fa0f5', 'Nunca', 'D');



#14
INSERT INTO survey_question (id, questionSurveyId, selectionId, text)
VALUES ('8e22f7c9-66ef-4c83-aaf3-6063e518aa6d','8d7e7a84-5850-4427-8803-000c1f435d9c', null, 'Soy capaz de disfrutar con un buen libro o un buen programa de radio o de televisión:');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('1698c814-03f8-4af6-8bd6-f55eaa6d2fcf','8d7e7a84-5850-4427-8803-000c1f435d9c', '8e22f7c9-66ef-4c83-aaf3-6063e518aa6d', 'A menudo', 'A');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('64fab4d0-b1ca-4de9-acea-f37a0bfeb5fc','8d7e7a84-5850-4427-8803-000c1f435d9c', '8e22f7c9-66ef-4c83-aaf3-6063e518aa6d', 'Algunas veces', 'B');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('c1a950d7-e156-4ec0-a810-0b57d1ba3149','8d7e7a84-5850-4427-8803-000c1f435d9c', '8e22f7c9-66ef-4c83-aaf3-6063e518aa6d', 'Pocas veces', 'C');

INSERT INTO survey_question_answer (id, answerSurveyId, answerQuestionId, text, optionLetter)
VALUES ('53d38d2a-9ff2-4cf4-92ee-22a55a46bd88','8d7e7a84-5850-4427-8803-000c1f435d9c', '8e22f7c9-66ef-4c83-aaf3-6063e518aa6d', 'Casi nunca', 'D');




