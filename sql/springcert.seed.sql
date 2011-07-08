DROP database IF EXISTS springcert;
CREATE database springcert;
USE springcert;

DROP TABLE IF EXISTS document;
CREATE TABLE documents (
  document_id char(36) NOT NULL,
  name varchar(255) NOT NULL
);

insert into documents values ('1', 'aaa');
insert into documents values ('2', 'bbb');