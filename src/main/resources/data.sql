INSERT INTO roles(role_id, name, write_access, read_access, edit_access, edit_all_access, delete_access) VALUES (1, 'ADMIN', true, true, true, true, true);
INSERT INTO roles(role_id, name, write_access, read_access, edit_access, edit_all_access, delete_access) VALUES (2, 'USER', false, true, false, false, false);
INSERT INTO roles(role_id, name, write_access, read_access, edit_access, edit_all_access, delete_access) VALUES (3, 'PUBLISHER', true, true, true, false, false);

INSERT INTO users (user_id, first_name, last_name, email_id, password, role_id) VALUES  (1, 'Amrutha', 'Narendran', 'amrutha@gmail.com', '1234', 1);
INSERT INTO users (user_id, first_name, last_name, email_id, password, role_id) VALUES  (2, 'Savio', 'Jojo', 'savio@gmail.com', '1234', 3);
INSERT INTO users (user_id, first_name, last_name, email_id, password, role_id) VALUES  (3, 'John', 'Doe', 'john@gmail.com', '1234', 2);
INSERT INTO users (user_id, first_name, last_name, email_id, password, role_id) VALUES  (4, 'Jane', 'Doe', 'jane@gmail.com', '1234', 2);

INSERT INTO news (news_id, title, is_published, published_date, creation_date, valid_from, valid_to, content, author_id) VALUES  (1, 'Testing News', true, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'This a sample news contents which contains many paragraph and contents', 2);
INSERT INTO news (news_id, title, is_published, published_date, creation_date, valid_from, valid_to, content, author_id) VALUES  (2, 'Testing News second time', true, CURRENT_TIMESTAMP , CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, 'This a sample news testing second time contents which contains many paragraph and contents', 2);
