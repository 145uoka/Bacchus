/*
 [df:title]
  イベント通知用ユーザー一覧の取得。

 [df:description]
 イベント通知用ユーザー一覧の取得。

*/

-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

select
  t1.user_id
  , t1.login_id
  , t1.line_flg
  , t1.line_id
  , t1.line_user_name
  , t1.user_name
  , t1.last_name
  , t1.first_name
  , t1.email
  , t1.password
  , t1.user_type_id
  , t1.auth_level
  , t3.user_type_name
  , t3.subsidy_amount
  , t2.event_notify_no
  , t2.event_no
  , t2.notify_datetime
from
  user_t t1
  inner join user_type_m t3
    on t1.user_type_id = t3.user_type_id
  left outer join event_notify t2
    on t1.user_id = t2.user_id
    and t2.event_no = /*pmb.eventNo*/1
  where t1.line_flg = /*pmb.lineFlg*/1
  and t1.delete_flag = /*pmb.deleteFlag*/false
order by
  t1.user_id

