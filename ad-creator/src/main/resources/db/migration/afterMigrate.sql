insert into EFFECT
    (Name)
    values
    ('colorOnHover'),
    ('grayscaleOnRest'),
    ('jump');

insert into AD
    (cta, Image_Url,Click_Url, USER_ID)
    values
    ('hello, world', 'https://static.makeuseof.com/wp-content/uploads/2012/08/computer-cat.jpg', 'http://instagram.com/mentret', 1),
    ('Click to see more cats!', 'https://static.makeuseof.com/wp-content/uploads/2012/08/computer-cat.jpg', 'https://kotiki.d3.ru/', 1),
    ('Best Models', 'https://ip.index.hr/remote/index.hr/images2/europskamacka625Shutter.jpg?maxwidth=625', 'https://www.google.com/search?q=cats&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjPo8fX0NDbAhUKk1kKHTC4DM0Q_AUICigB&biw=1490&bih=873', 1),
    ('Mysterious', 'https://desktopwalls.net/wp-content/uploads/2015/03/Funny%20Cats%20Looking%20At%20Cats%20Pictures%20Desktop%20Wallpaper.jpg', 'http://instagram.com/mentret', 1),
    ('When will Trump destroy the world?', 'https://www.zerohedge.com/sites/default/files/styles/teaser_desktop_2x/public/2018-06/2018.06.10soros.JPG', 'https://www.zerohedge.com/', 1),
    ('scary', 'https://journo.com.tr/wp-content/uploads/2017/06/cattwitter.jpg', 'http://instagram.com/mentret', 1),
    ('cat', 'https://upload.wikimedia.org/wikipedia/commons/thumb/3/3a/Cat03.jpg/1200px-Cat03.jpg', 'http://instagram.com/mentret', 1),
    ('Hack the internet', 'https://squawker.org/wp-content/uploads/cat-computer.jpg', 'http://instagram.com/mentret', 1);
insert into AD_EFFECTS
    (AD_AID, EFFECTS_EID)
    values
    (1, 2),
    (1, 3),
    (2, 2),
    (3, 1),
    (4, 2),
    (5, 1);




