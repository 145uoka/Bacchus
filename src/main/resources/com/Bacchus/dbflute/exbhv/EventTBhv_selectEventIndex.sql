/*
 [df:title]
  イベント情報及び、ユーザ情報、候補日、参加人数の取得

 [df:description]
  イベント情報及び、ユーザ情報、候補日、参加人数の取得

*/

-- #df:entity#

-- !df:pmb!
-- !!AutoDetect!!

select
  t1.event_no
  , t1.event_name
  , t1.event_detail
  , t1.event_place
  , t1.event_url
  , t1.tell
  , t1.event_entry_fee
  , t1.auxiliary_flg
  , t1.fix_flg
  , t1.candidate_no
  , t1.store_name
  , t1.event_div
  , t1.user_id
  , t2.login_id
  , t2.line_flg
  , t2.line_id
  , t2.line_user_name
  , t2.user_name
  , t2.last_name
  , t2.first_name
  , t2.email
  , t2.password
  , t2.user_type_id
  , t2.auth_level
  , t3.event_start_datetime
  , t3.event_end_datetime
  , t3.start_date
  , t3.start_time
  , t4.entry_count
  , t5.code_id
  , t5.code_div
  , t5.code
  , t5.name
  , t5.order_number
  , t5.remarks
from
  event_t t1
  left outer join user_t t2
    on t1.user_id = t2.user_id
  left outer join candidate_t t3
    on t1.candidate_no = t3.candidate_no
    and t1.fix_flg = /*pmb.eventT_fixFlg*/1
  left outer join (
    select
      candidate_no
      , entry_div
      , count(*) as entry_count
    from
      entry_t
    group by
      candidate_no
      , entry_div
    having
      entry_div = /*pmb.eventT_entryDiv*/1
  ) t4
    on t4.candidate_no = t1.candidate_no
    and t1.fix_flg = /*pmb.eventT_fixFlg*/1
  left outer join general_code_m t5
    ON t1.event_div is not null
    and t5.code_div = /*pmb.generalCodeM_codeDiv*/'0004'
    and t5.code = t1.event_div
    and t5.del_flg = /*pmb.generalCodeM_delFlg*/0
order by
  t3.event_start_datetime asc, t1.event_no




