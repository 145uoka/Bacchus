insert into bacchus.auth_m(auth_level,auth_name) values (0,'一般');
insert into bacchus.auth_m(auth_level,auth_name) values (2,'管理者');

insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0101','ユーザー一覧照会','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0102','ユーザー登録','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0103','ユーザー編集','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0201','イベント一覧照会','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0202','イベント登録','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0203','イベント編集','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0204','イベント詳細','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0205','イベント通知','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0301','参加可否登録','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.display_def_m(display_id,display_name,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_0401','プロフィール編集','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);

insert into bacchus.event_type_m(event_type_id,event_type_name,order_num) values (1,'課会',null);

insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (1,'0001','0','一般',1,'一般ユーザ',0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (2,'0001','1','運用',1,'運用管理者',1,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (3,'0001','2','管理者',1,'システム管理者',0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (4,'0002','0','未定',1,'参加可否',0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (5,'0002','1','参加',2,'参加可否',0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (6,'0002','2','不参加',3,'参加可否',0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (7,'0003','1','有',1,'経費補助有無',0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (8,'0003','0','無',2,'経費補助有無',0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (9,'0004','1','課会',1,null,0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (10,'0004','2','部活',2,null,0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (11,'0004','3','その他',3,null,0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (12,'0004','4','BBQ',4,null,0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (13,'0004','5','忘年会',5,null,0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (14,'0004','6','ボーリング大会',6,null,0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);
insert into bacchus.general_code_m(code_id,code_div,code,name,order_number,remarks,del_flg,register_datetime,register_user,update_datetime,update_user) values (15,'0004','7','納会',7,null,0,'2018-02-03T17:53:02',null,'2018-02-03T17:53:02',null);

insert into bacchus.system_property_m(prop_key,prop_value,description,register_datetime,register_user,update_datetime,update_user) values ('BACCHUS_URL','https://glue-bacchus.herokuapp.com','BacchusのURL（コンテキストルート）','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.system_property_m(prop_key,prop_value,description,register_datetime,register_user,update_datetime,update_user) values ('DEVELOP_MODE_FLG','0','1:開発モード','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);
insert into bacchus.system_property_m(prop_key,prop_value,description,register_datetime,register_user,update_datetime,update_user) values ('MESSAGING_API_ACCESS_TOKEN','cEbVssZVjzR01EXKfo/UWv85D5J9Q/TdlhNI77k3SVQ9ynsushSnIEH/PO4kgNFpNJw5uF+Ypf/8mD5RTFwNNLNlaMlWngeEr4P+gh2vR8/Q3ZICuvgDEQPydROZo3ipd1tCrz2DNOV2U8yLc1qOzAdB04t89/1O/w1cDnyilFU=','Messaging API : アクセストークン','2018-02-03T17:53:01',null,'2018-02-03T17:53:01',null);

insert into bacchus.user_type_m(user_type_id,user_type_name,subsidy_amount) values (1,'1sol4',1500);
insert into bacchus.user_type_m(user_type_id,user_type_name,subsidy_amount) values (2,'研修',3500);

insert into bacchus.user_t(user_id,login_id,line_flg,line_id,line_user_name,user_name,last_name,first_name,email,password,user_type_id,auth_level) values (1,'test',0,null,null,'一般管理者','一般','管理者','test@glue-si.com','0a4d5171b606a176e34479a896d0bbd6',1,0);
insert into bacchus.user_t(user_id,login_id,line_flg,line_id,line_user_name,user_name,last_name,first_name,email,password,user_type_id,auth_level) values (2,'admin',0,null,null,'システム管理者','システム','管理者','test@glue-si.com','5c3cb737fd6f09fba72b6b3fb98eff48',1,2);

select setval('bacchus.user_t_user_id_seq',(select max(user_id) from bacchus.user_t));
select setval('bacchus.candidate_t_candidate_no_seq',(select max(candidate_no) from bacchus.candidate_t));
select setval('bacchus.entry_t_entry_id_seq',(select max(entry_id) from bacchus.entry_t));
select setval('bacchus.event_notify_event_notify_no_seq',(select max(event_notify_no) from bacchus.event_notify));
select setval('bacchus.event_t_event_no_seq',(select max(event_no) from bacchus.event_t));
select setval('bacchus.general_code_m_code_id_seq',(select max(code_id) from bacchus.general_code_m));
select setval('bacchus.subsidy_mng_m_money_id_seq',(select max(money_id) from bacchus.subsidy_mng_m));
select setval('bacchus.user_type_m_user_type_id_seq',(select max(user_type_id) from bacchus.user_type_m));