
/* Drop Tables */

DROP TABLE Replyqa;
DROP TABLE Boardqa;
DROP TABLE Replyreview;
DROP TABLE Boardreview;
DROP TABLE Reservation;
DROP TABLE Car;
DROP TABLE Member;




/* Create Tables */

CREATE TABLE Boardqa
(
	bq_num integer NOT NULL,
	bq_title varchar NOT NULL,
	bq_contents varchar NOT NULL,
	bq_date timestamp NOT NULL,
	-- 회원 식별자 번호이다
	m_num integer NOT NULL,
	PRIMARY KEY (bq_num)
);


CREATE TABLE Boardreview
(
	br_num integer NOT NULL,
	br_title varchar NOT NULL,
	br_writer varchar NOT NULL,
	br_contents varchar NOT NULL,
	br_date timestamp NOT NULL,
	br_view varchar NOT NULL,
	-- 회원 식별자 번호이다
	m_num integer NOT NULL,
	PRIMARY KEY (br_num)
);


CREATE TABLE Car
(
	c_num integer NOT NULL,
	c_license varchar NOT NULL,
	-- 대형, 중형, 소형 분류
	c_ct varchar NOT NULL,
	c_img varchar NOT NULL,
	c_price varchar NOT NULL,
	-- 대형, 소형
	c_ct1 varchar NOT NULL,
	-- 국산 외제
	c_ct2 varchar NOT NULL,
	c_ct3 varchar NOT NULL,
	-- true, false로 반납여부
	c_return boolean NOT NULL,
	PRIMARY KEY (c_num)
);


CREATE TABLE Member
(
	-- 회원 식별자 번호이다
	m_num integer NOT NULL,
	-- 아이디
	m_id varchar NOT NULL,
	m_password varchar NOT NULL,
	m_name varchar NOT NULL,
	m_dof varchar NOT NULL,
	m_phone varchar NOT NULL,
	PRIMARY KEY (m_num)
);


CREATE TABLE Replyqa
(
	rq_num integer NOT NULL,
	rq_contents varchar NOT NULL,
	rq_date timestamp NOT NULL,
	bq_num integer NOT NULL,
	PRIMARY KEY (rq_num)
);


CREATE TABLE Replyreview
(
	rv_num integer NOT NULL,
	rv_writer varchar NOT NULL,
	rv_contents varchar NOT NULL,
	rv_date timestamp NOT NULL,
	br_num integer NOT NULL,
	PRIMARY KEY (rv_num)
);


CREATE TABLE Reservation
(
	r_num integer NOT NULL,
	-- 회원 식별자 번호이다
	m_num integer NOT NULL,
	-- 예약시작일
	-- 
	r_dayin varchar NOT NULL,
	-- 예약종료일
	r_dayout varchar NOT NULL,
	r_totprice varchar NOT NULL,
	c_num integer NOT NULL,
	PRIMARY KEY (r_num)
);



/* Create Foreign Keys */

ALTER TABLE Replyqa
	ADD FOREIGN KEY (bq_num)
	REFERENCES Boardqa (bq_num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Replyreview
	ADD FOREIGN KEY (br_num)
	REFERENCES Boardreview (br_num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Reservation
	ADD FOREIGN KEY (c_num)
	REFERENCES Car (c_num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Boardqa
	ADD FOREIGN KEY (m_num)
	REFERENCES Member (m_num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Boardreview
	ADD FOREIGN KEY (m_num)
	REFERENCES Member (m_num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Reservation
	ADD FOREIGN KEY (m_num)
	REFERENCES Member (m_num)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



