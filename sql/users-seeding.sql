INSERT INTO user (id, firstname, lastname, password, role, username)
VALUES (2, 'caroline', 'dulce','alexandre', 'USER', 'caroline@gmail.com');

INSERT INTO account(id, balance, updated_at, owner_id) VALUES(2, 500.00, CURRENT_TIMESTAMP, 2)