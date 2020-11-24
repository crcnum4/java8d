-- SELECT *
--   FROM profiles;

-- SELECT * FROM users JOIN profiles ON profiles.userId = users.id

-- SELECT * FROM posts;

-- userId = 1

-- SELECT * FROM posts where profileId =
--     (SELECT profiles.id FROM profiles where userId = 1);

-- SELECT posts.* FROM posts LEFT JOIN profiles on profiles.userId = 1

-- SELECT posts.id, title, content, firstName, lastName FROM posts JOIN profiles ON posts.profileId = profiles.id;

-- select * from categories;


SELECT * from posts p
    JOIN posts_categories pc on (p.id = pc.postId)
    JOIN categories c on (pc.categoryId = c.id)