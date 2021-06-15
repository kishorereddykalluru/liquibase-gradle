--liquibase formatted sql

--changeset kallki: 3
CREATE TABLE IF NOT EXIST person_backup LIKE person;
--rollback DROP TABLE person_backup