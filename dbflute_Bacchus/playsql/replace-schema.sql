
/* Drop Tables */

DROP TABLE IF EXISTS candidate_t;
DROP TABLE IF EXISTS display_def_m;
DROP TABLE IF EXISTS entry_t;
DROP TABLE IF EXISTS event_t;
DROP TABLE IF EXISTS general_code_m;
DROP TABLE IF EXISTS subsidy_mng_m;
DROP TABLE IF EXISTS system_property_m;
DROP TABLE IF EXISTS user_t;




/* Create Tables */

-- 候補日_T
CREATE TABLE candidate_t
(
	-- 候補日管理番号
	candidate_no serial NOT NULL,
	-- イベント管理番号
	event_no int,
	-- 開始日時
	event_start_datetime timestamp,
	-- 終了日時
	event_end_datetime timestamp,
	PRIMARY KEY (candidate_no)
) WITHOUT OIDS;


-- 画面名定義_M
CREATE TABLE display_def_m
(
	-- 画面ID
	display_id text NOT NULL,
	-- 画面名
	display_name text,
	-- 作成日時
	REGISTER_DATETIME timestamp DEFAULT CURRENT_TIMESTAMP,
	-- 作成者
	REGISTER_USER text,
	-- 更新日時
	UPDATE_DATETIME timestamp DEFAULT CURRENT_TIMESTAMP,
	-- 更新者
	UPDATE_USER text,
	CONSTRAINT display_def_m_pkey PRIMARY KEY (display_id)
) WITHOUT OIDS;


-- 参加_T
CREATE TABLE entry_t
(
	-- 参加ID
	entry_id serial NOT NULL,
	-- 候補日管理番号
	candidate_no  int,
	-- user_id
	user_id int,
	-- 参加区分
	entry_div int,
	PRIMARY KEY (entry_id)
) WITHOUT OIDS;


-- イベント_T
CREATE TABLE event_t
(
	-- イベント管理番号
	event_no serial NOT NULL,
	-- イベント名
	event_name text,
	-- イベント詳細
	event_detail  text,
	-- 場所
	event_place  text,
	-- URL
	event_url  text,
	-- 電話番号
	tell text,
	-- イベント参加費
	event_entry_fee int,
	-- 補助フラグ
	auxiliary_flg  smallint,
	-- 確定フラグ
	fix_flg smallint,
	-- 候補日管理番号
	candidate_no int,
	-- 店舗名
	store_name text,
	-- 参加人数
	entry_people int,
	-- イベント区分
	event_div text,
	-- ユーザーID
	user_id int,
	PRIMARY KEY (event_no)
) WITHOUT OIDS;


-- 汎用コード_M
CREATE TABLE general_code_m
(
	-- コードID
	code_id serial NOT NULL,
	-- コード区分
	code_div text NOT NULL,
	-- コード
	code text,
	-- 名称
	name text,
	-- 表示順
	order_number smallint,
	-- 備考
	remarks text,
	-- 削除フラグ
	del_flg smallint,
	-- 作成日時
	REGISTER_DATETIME timestamp DEFAULT CURRENT_TIMESTAMP,
	-- 作成者
	REGISTER_USER text,
	-- 更新日時
	UPDATE_DATETIME timestamp DEFAULT CURRENT_TIMESTAMP,
	-- 更新者
	UPDATE_USER text,
	CONSTRAINT general_code_m_pkey PRIMARY KEY (code_id)
) WITHOUT OIDS;


-- 補助金管理_M
CREATE TABLE subsidy_mng_m
(
	-- 金額ID
	money_id serial NOT NULL,
	-- ユーザー区分
	user_type int,
	-- 金額
	money int,
	PRIMARY KEY (money_id)
) WITHOUT OIDS;


-- システムプロパティ_M
CREATE TABLE system_property_m
(
	-- プロパティキー
	prop_key text NOT NULL,
	-- 値
	prop_value text,
	-- 説明
	description text,
	-- 作成日時
	REGISTER_DATETIME timestamp DEFAULT CURRENT_TIMESTAMP,
	-- 作成者
	REGISTER_USER text,
	-- 更新日時
	UPDATE_DATETIME timestamp DEFAULT CURRENT_TIMESTAMP,
	-- 更新者
	UPDATE_USER text,
	CONSTRAINT system_property_m_pkey PRIMARY KEY (prop_key)
) WITHOUT OIDS;


-- ユーザー_T
CREATE TABLE user_t
(
	-- user_id
	user_id serial NOT NULL,
	-- ユーザ名
	user_name text NOT NULL,
	-- Eメール
	email text,
	-- ユーザー区分
	user_type int,
	-- 暗号化PWD
	password text NOT NULL,
	-- 権限レベル
	auth_level int DEFAULT 0 NOT NULL,
	PRIMARY KEY (user_id)
) WITHOUT OIDS;


ALTER SEQUENCE user_t_user_id_SEQ INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 RESTART 1 CACHE 1;



/* Comments */

COMMENT ON TABLE candidate_t IS '候補日_T';
COMMENT ON COLUMN candidate_t.candidate_no IS '候補日管理番号';
COMMENT ON COLUMN candidate_t.event_no IS 'イベント管理番号';
COMMENT ON COLUMN candidate_t.event_start_datetime IS '開始日時';
COMMENT ON COLUMN candidate_t.event_end_datetime IS '終了日時';
COMMENT ON TABLE display_def_m IS '画面名定義_M';
COMMENT ON COLUMN display_def_m.display_id IS '画面ID';
COMMENT ON COLUMN display_def_m.display_name IS '画面名';
COMMENT ON COLUMN display_def_m.REGISTER_DATETIME IS '作成日時';
COMMENT ON COLUMN display_def_m.REGISTER_USER IS '作成者';
COMMENT ON COLUMN display_def_m.UPDATE_DATETIME IS '更新日時';
COMMENT ON COLUMN display_def_m.UPDATE_USER IS '更新者';
COMMENT ON TABLE entry_t IS '参加_T';
COMMENT ON COLUMN entry_t.entry_id IS '参加ID';
COMMENT ON COLUMN entry_t.candidate_no  IS '候補日管理番号';
COMMENT ON COLUMN entry_t.user_id IS 'user_id';
COMMENT ON COLUMN entry_t.entry_div IS '参加区分';
COMMENT ON TABLE event_t IS 'イベント_T';
COMMENT ON COLUMN event_t.event_no IS 'イベント管理番号';
COMMENT ON COLUMN event_t.event_name IS 'イベント名';
COMMENT ON COLUMN event_t.event_detail  IS 'イベント詳細';
COMMENT ON COLUMN event_t.event_place  IS '場所';
COMMENT ON COLUMN event_t.event_url  IS 'URL';
COMMENT ON COLUMN event_t.tell IS '電話番号';
COMMENT ON COLUMN event_t.event_entry_fee IS 'イベント参加費';
COMMENT ON COLUMN event_t.auxiliary_flg  IS '補助フラグ';
COMMENT ON COLUMN event_t.fix_flg IS '確定フラグ';
COMMENT ON COLUMN event_t.candidate_no IS '候補日管理番号';
COMMENT ON COLUMN event_t.store_name IS '店舗名';
COMMENT ON COLUMN event_t.entry_people IS '参加人数';
COMMENT ON COLUMN event_t.event_div IS 'イベント区分';
COMMENT ON COLUMN event_t.user_id IS 'ユーザーID';
COMMENT ON TABLE general_code_m IS '汎用コード_M';
COMMENT ON COLUMN general_code_m.code_id IS 'コードID';
COMMENT ON COLUMN general_code_m.code_div IS 'コード区分';
COMMENT ON COLUMN general_code_m.code IS 'コード';
COMMENT ON COLUMN general_code_m.name IS '名称';
COMMENT ON COLUMN general_code_m.order_number IS '表示順';
COMMENT ON COLUMN general_code_m.remarks IS '備考';
COMMENT ON COLUMN general_code_m.del_flg IS '削除フラグ';
COMMENT ON COLUMN general_code_m.REGISTER_DATETIME IS '作成日時';
COMMENT ON COLUMN general_code_m.REGISTER_USER IS '作成者';
COMMENT ON COLUMN general_code_m.UPDATE_DATETIME IS '更新日時';
COMMENT ON COLUMN general_code_m.UPDATE_USER IS '更新者';
COMMENT ON TABLE subsidy_mng_m IS '補助金管理_M';
COMMENT ON COLUMN subsidy_mng_m.money_id IS '金額ID';
COMMENT ON COLUMN subsidy_mng_m.user_type IS 'ユーザー区分';
COMMENT ON COLUMN subsidy_mng_m.money IS '金額';
COMMENT ON TABLE system_property_m IS 'システムプロパティ_M';
COMMENT ON COLUMN system_property_m.prop_key IS 'プロパティキー';
COMMENT ON COLUMN system_property_m.prop_value IS '値';
COMMENT ON COLUMN system_property_m.description IS '説明';
COMMENT ON COLUMN system_property_m.REGISTER_DATETIME IS '作成日時';
COMMENT ON COLUMN system_property_m.REGISTER_USER IS '作成者';
COMMENT ON COLUMN system_property_m.UPDATE_DATETIME IS '更新日時';
COMMENT ON COLUMN system_property_m.UPDATE_USER IS '更新者';
COMMENT ON TABLE user_t IS 'ユーザー_T';
COMMENT ON COLUMN user_t.user_id IS 'user_id';
COMMENT ON COLUMN user_t.user_name IS 'ユーザ名';
COMMENT ON COLUMN user_t.email IS 'Eメール';
COMMENT ON COLUMN user_t.user_type IS 'ユーザー区分';
COMMENT ON COLUMN user_t.password IS '暗号化PWD';
COMMENT ON COLUMN user_t.auth_level IS '権限レベル';



