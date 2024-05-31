-- liquibase formatted sql
-- changeset antonov:2

CREATE table users(
                    id UUID PRIMARY KEY,
                    nick TEXT,
                    password TEXT);

INSERT INTO users (id, nick, password) VALUES
('4dc71a30-edcf-4fd5-b4f8-f8bc7c84e8e9','John', 'qwe'),
('8a002eec-f086-4612-856d-38286938b2ab', 'Stacey', 'rewq'),
('0fb64ac0-8fe8-440b-a568-d31364753347', 'Rachel', 'asd'),
('d61057d4-4997-4f11-a9e1-dbc9e015db51', 'Francis', 'zxc');