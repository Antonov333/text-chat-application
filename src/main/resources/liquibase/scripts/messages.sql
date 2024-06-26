-- liquibase formatted sql
-- changeset antonov:1

CREATE table messages (
                        id UUID PRIMARY KEY,
                        time_of_posting TIMESTAMP WITH TIME ZONE,
                        author TEXT,
                        content TEXT);