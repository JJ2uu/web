-- multi.music definition
CREATE TABLE `music` (
  song_id int NOT NULL AUTO_INCREMENT,
	title varchar(100) NOT NULL,
  artist varchar(100) NOT NULL,
  hit varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  img varchar(100) DEFAULT NULL,
  	PRIMARY KEY (`song_id`)
) 	ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;


insert into music values (null, 'Why' ,'태연', 120963, 'img10.jpg')

insert into music values(null, 'DINOSAUR', 'AKMU(악뮤)', 176517, 'img11.jpg')

insert into music values(null, '시작', '가호(Gaho)', 243181, 'img12.jpg')

insert into music values(null, 'Out of Time', 'The Weekend', 195, 'img4.jpg')

insert into music values(null, 'Let U In(feat. Colde & Devita)', '코드쿤스트', 151, 'img5.jpg')

insert into music values(null, 'All Day (with TABLO)', 'RM', 116, 'img6.jpg')

insert into music values(null, '자나깨나', '크러쉬', 123, 'img7.jpg')

insert into music values(null, 'levitating', '두아리파', 145, 'img8.jpg')

insert into music values(null, 'gone', '로제', 167, 'img9.jpg')

insert into music values(null, '우린 그렇게 사랑해서','강민경(다비치), 잔나비 최정훈',63006,'img1.jpg')

insert into music values(null, 'Impurities', 'LE SSERAFIM (르세라핌)',41687,'img2.jpg')

insert into music values(null, '비가 오는 날엔', '비스트', 129705, 'img3.jpg')

insert into music values(null, '비가 오는 날엔', '비스트', 129705, 'img3.jpg')


