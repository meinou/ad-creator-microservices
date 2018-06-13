insert into EFFECT
    (Name)
    values
    ('fade'),
    ('shade'),
    ('jump');

insert into AD
    (cta, Image_Url,Click_Url, USER_ID)
    values
    ('hello, world', 'https://static.makeuseof.com/wp-content/uploads/2012/08/computer-cat.jpg', 'http://instagram.com/mentret', 1);
    ('hello, cat', 'https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1200px-Cat03.jpg', 'http://instagram.com/mentret', 1);
    ('scary', 'https://journo.com.tr/wp-content/uploads/2017/06/cattwitter.jpg', 'http://instagram.com/mentret', 1);

insert into AD_EFFECTS
    (AD_AID, EFFECTS_EID)
    values
    (1, 2),
    (1, 1);




