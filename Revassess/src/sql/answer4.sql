SELECT app_user.username, category.name, flashcard.question, flashcard.answer  FROM study_set
 INNER JOIN app_user ON study_set.owner_id = app_user.user_id
 INNER JOIN study_set_card ON study_set.study_set_id = study_set_card.study_set_id
 INNER JOIN flashcard ON study_set_card.flashcard_id = flashcard.flashcard_id
 INNER JOIN category ON flashcard.category_id = category.category_id
 WHERE owner_id = 4;