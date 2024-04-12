-- Active: 1712932639768@@127.0.0.1@3306@bank_db
START TRANSACTION;

-- Insertion dans la table users
INSERT INTO user (id, firstname, lastname, password, role, username)
VALUES (1, 'boris', 'rose','caroline', 'USER', 'boris@gmail.com');

UPDATE user SET account = 1;

-- Récupération de l'ID généré
SET @user_id = LAST_INSERT_ID();
INSERT INTO account (id, balance,updated_at, owner_id)
VALUES (1, 200.00, CURRENT_TIMESTAMP, 1);


-- Commit si tout se passe bien, sinon rollback
COMMIT;
