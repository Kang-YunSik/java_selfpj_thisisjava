CREATE TABLE if not exists boadrs;

create table boards (
	bno				int					primary key auto_increment,
    btitle			varchar(100)		not null,
    bcontent		longtext			not null,
    bwriter			varchar(50)			not null,
    bdate			datetime			default now()
);

drop table boards;

select * from boards;

SELECT *
FROM boards
Where bno = 3;

		UPDATE boards SET
			btitle = #{btitle},
			bcontent = #{bcontent},
			bwriter = #{bwriter}
		WHERE bno = #{bno}