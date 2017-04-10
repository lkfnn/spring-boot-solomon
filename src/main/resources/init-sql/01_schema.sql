DROP TABLE user IF EXISTS;
DROP TABLE book_store IF EXISTS;
DROP TABLE book IF EXISTS;

CREATE TABLE user (
  id            BIGINT IDENTITY PRIMARY KEY,
  userName      VARCHAR(128),
  password      VARCHAR(128)
);

CREATE TABLE book_store (
  id           BIGINT IDENTITY PRIMARY KEY,
  name         VARCHAR(64),
  address      VARCHAR(256)
);

CREATE TABLE book (
  id            BIGINT IDENTITY PRIMARY KEY,
  bookStoreId   BIGINT,
  name          VARCHAR(128),
  author        VARCHAR(128),
  price         DECIMAL(10,2),
  topic         VARCHAR(128),
  publishDate   DATE
);