SELECT * FROM app_user 
 INNER JOIN study_set ON app_user.user_id = study_set.owner_id
 WHERE app_user.user_id = 5;