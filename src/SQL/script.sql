CREATE TABLE users (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(50),
    password VARCHAR(50),
    created_on TIMESTAMP
);

CREATE TABLE profiles (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    userId INT(6) UNSIGNED NOT NULL UNIQUE REFERENCES users(id),
    firstName TEXT NOT NULL,
    lastName TEXT NOT NULL,
    created_on TIMESTAMP
);

CREATE TABLE posts (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    profileId INT(6) UNSIGNED REFERENCES profiles(id),
    title TEXT,
    content TEXT
);

CREATE TABLE posts_categories (
    postId INT(6) UNSIGNED NOT NULL REFERENCES posts(id),
    categoryId INT(6) UNSIGNED NOT NULL REFERENCES categories(id)
);

CREATE TABLE categories (
    id INT(6) UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    category VARCHAR(25)
);

INSERT INTO users (email, password, created_on)
    VALUES ('cliff@test.com', 'tester', CURRENT_TIMESTAMP);

INSERT INTO users (email, password, created_on)
    VALUES ('gabe@test.com', 'tester', CURRENT_TIMESTAMP);

INSERT INTO users (email, password, created_on)
    VALUES ('tom@test.com', 'tester', CURRENT_TIMESTAMP);

-- PROFILES

INSERT INTO profiles (userId, firstName, lastName, created_on)
    VALUES (1, "Cliff", "Choiniere", CURRENT_TIMESTAMP);

INSERT INTO profiles (userId, firstName, lastName, created_on)
    VALUES (2, "Gabe", "Sherman", CURRENT_TIMESTAMP);

INSERT INTO profiles (userId, firstName, lastName, created_on)
    VALUES (3, "Tom", "Hodgkinson", CURRENT_TIMESTAMP);

-- posts

INSERT INTO `posts` (`profileId`, `title`, `content`)
    VALUES (1, "SQL Syntax", "It's not so bad");

INSERT INTO `posts` (`profileId`, `title`, `content`)
    VALUES (1, "Javascript", "I write a lot of js");

INSERT INTO `posts` (`profileId`, `title`, `content`)
    VALUES (2, "Hacking the Mainframe", "Beep Boop-Beep Boop");

INSERT INTO `posts` (`profileId`, `title`, `content`)
    VALUES (NULL, "I'm a ghost", "Boo");

-- categories

INSERT INTO categories (category) VALUES ('programming');
INSERT INTO categories (category) VALUES ('SQL');
INSERT INTO categories (category) VALUES ('Javascript');
INSERT INTO categories (category) VALUES ('Hacking');
INSERT INTO categories (category) VALUES ('Supernatural');

-- post_categories

INSERT INTO posts_categories (postId, categoryId) VALUES (1, 1);
INSERT INTO posts_categories (postId, categoryId) VALUES (1, 2);
INSERT INTO posts_categories (postId, categoryId) VALUES (2, 1);
INSERT INTO posts_categories (postId, categoryId) VALUES (2, 3);
INSERT INTO posts_categories (postId, categoryId) VALUES (3, 1);
INSERT INTO posts_categories (postId, categoryId) VALUES (3, 4);
INSERT INTO posts_categories (postId, categoryId) VALUES (4, 5);