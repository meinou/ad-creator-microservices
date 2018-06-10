insert into EFFECTS
    (EFFECT_NAME)
    values
    ('fade'),
    ('shade'),
    ('jump');

insert into ADS
    (TEXT, URL_CLICK, USER_ID)
    values
    ('hello, world', 'http://instagram.com/mentret', 1);

insert into AD_TO_EFFECT
    (AD_ID, EFFECT_ID)
    values
    (1, 2),
    (1, 1);