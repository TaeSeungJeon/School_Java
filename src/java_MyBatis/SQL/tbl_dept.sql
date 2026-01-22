--tbl_dept 부서테이블 생성
create table tbl_dept
(
    deptno int primary key,
    dname  varchar2(50),
    LOC    varchar2(200)
);

insert into tbl_dept values (11, '개발부', '대전시');
insert into tbl_dept values (12, '디자인부서', '판교');

select * from tbl_dept order by deptno asc;

commit;