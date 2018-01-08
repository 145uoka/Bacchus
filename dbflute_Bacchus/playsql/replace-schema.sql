
/* Drop Tables */

DROP TABLE IF EXISTS Bacchus.entry_t;
DROP TABLE IF EXISTS Bacchus.candidate_t;
DROP TABLE IF EXISTS Bacchus.event_t;
DROP TABLE IF EXISTS Bacchus.user_t;
DROP TABLE IF EXISTS Bacchus.auth_M;
DROP TABLE IF EXISTS Bacchus.display_def_m;
DROP TABLE IF EXISTS Bacchus.general_code_m;
DROP TABLE IF EXISTS Bacchus.system_property_m;
DROP TABLE IF EXISTS Bacchus.user_type_m;




/* Create Tables */

-- 権限_M
CREATE TABLE Bacchus.auth_M
(
	-- 権限レベル
	auth_level int NOT NULL,
	-- 権限名称
	auth_name text NOT NULL,
	PRIMARY KEY (auth_level)
) WITHOUT OIDS;


-- 候補日_T
CREATE TABLE Bacchus.candidate_t
(
	-- 候補日管理番号
	candidate_no serial NOT NULL,
	-- イベント管理番号
	event_no int NOT NULL,
	-- 開始日時
	event_start_datetime timestamp,
	-- 終了日時
	event_end_datetime timestamp,
	-- 開始年月日
	start_date text,
	-- 開始時分
	start_time text,
	PRIMARY KEY (candidate_no)
) WITHOUT OIDS;


-- 画面名定義_M
CREATE TABLE Bacchus.display_def_m
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
CREATE TABLE Bacchus.entry_t
(
	-- 参加ID
	entry_id bigserial NOT NULL,
	-- 候補日管理番号
	candidate_no int NOT NULL,
	-- user_id
	user_id int NOT NULL,
	-- 参加区分
	entry_div int,
	PRIMARY KEY (entry_id)
) WITHOUT OIDS;


-- イベント_T
CREATE TABLE Bacchus.event_t
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
	-- イベント区分
	event_div text,
	-- 幹事ユーザID
	user_id int,
	PRIMARY KEY (event_no)
) WITHOUT OIDS;


-- 汎用コード_M
CREATE TABLE Bacchus.general_code_m
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


-- システムプロパティ_M
CREATE TABLE Bacchus.system_property_m
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
CREATE TABLE Bacchus.user_t
(
	-- user_id
	user_id serial NOT NULL,
	-- ログインID
	login_id text UNIQUE,
	-- Lineフラグ
	line_flg int DEFAULT 0 NOT NULL,
	-- LineID
	line_id text,
	-- LINEユーザ名
	line_user_name text,
	-- ユーザー名
	user_name text,
	-- 苗字(氏)
	last_name text,
	-- 名前(名)
	first_name text,
	-- Eメール
	email text,
	-- 暗号化PWD
	password text,
	-- ユーザー区分ID
	user_type_id int NOT NULL,
	-- 権限レベル
	auth_level int NOT NULL,
	PRIMARY KEY (user_id)
) WITHOUT OIDS;


ALTER SEQUENCE Bacchus.user_t_user_id_SEQ INCREMENT 1 MINVALUE 1 MAXVALUE 9223372036854775807 RESTART 1 CACHE 1;


-- ユーザー区分_M
CREATE TABLE Bacchus.user_type_m
(
	-- ユーザー区分ID
	user_type_id serial NOT NULL,
	-- ユーザー区分名称
	user_type_name text NOT NULL,
	-- 補助金額
	subsidy_amount int DEFAULT 0 NOT NULL,
	PRIMARY KEY (user_type_id)
) WITHOUT OIDS;



/* Create Foreign Keys */

ALTER TABLE Bacchus.user_t
	ADD FOREIGN KEY (auth_level)
	REFERENCES Bacchus.auth_M (auth_level)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Bacchus.entry_t
	ADD FOREIGN KEY (candidate_no)
	REFERENCES Bacchus.candidate_t (candidate_no)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Bacchus.candidate_t
	ADD FOREIGN KEY (event_no)
	REFERENCES Bacchus.event_t (event_no)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Bacchus.entry_t
	ADD FOREIGN KEY (user_id)
	REFERENCES Bacchus.user_t (user_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Bacchus.event_t
	ADD FOREIGN KEY (user_id)
	REFERENCES Bacchus.user_t (user_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;


ALTER TABLE Bacchus.user_t
	ADD FOREIGN KEY (user_type_id)
	REFERENCES Bacchus.user_type_m (user_type_id)
	ON UPDATE RESTRICT
	ON DELETE RESTRICT
;



/* Comments */

COMMENT ON TABLE Bacchus.auth_M IS '権限_M';
COMMENT ON COLUMN Bacchus.auth_M.auth_level IS '権限レベル';
COMMENT ON COLUMN Bacchus.auth_M.auth_name IS '権限名称';
COMMENT ON TABLE Bacchus.candidate_t IS '候補日_T';
COMMENT ON COLUMN Bacchus.candidate_t.candidate_no IS '候補日管理番号';
COMMENT ON COLUMN Bacchus.candidate_t.event_no IS 'イベント管理番号';
COMMENT ON COLUMN Bacchus.candidate_t.event_start_datetime IS '開始日時';
COMMENT ON COLUMN Bacchus.candidate_t.event_end_datetime IS '終了日時';
COMMENT ON COLUMN Bacchus.candidate_t.start_date IS '開始年月日';
COMMENT ON COLUMN Bacchus.candidate_t.start_time IS '開始時分';
COMMENT ON TABLE Bacchus.display_def_m IS '画面名定義_M';
COMMENT ON COLUMN Bacchus.display_def_m.display_id IS '画面ID';
COMMENT ON COLUMN Bacchus.display_def_m.display_name IS '画面名';
COMMENT ON COLUMN Bacchus.display_def_m.REGISTER_DATETIME IS '作成日時';
COMMENT ON COLUMN Bacchus.display_def_m.REGISTER_USER IS '作成者';
COMMENT ON COLUMN Bacchus.display_def_m.UPDATE_DATETIME IS '更新日時';
COMMENT ON COLUMN Bacchus.display_def_m.UPDATE_USER IS '更新者';
COMMENT ON TABLE Bacchus.entry_t IS '参加_T';
COMMENT ON COLUMN Bacchus.entry_t.entry_id IS '参加ID';
COMMENT ON COLUMN Bacchus.entry_t.candidate_no IS '候補日管理番号';
COMMENT ON COLUMN Bacchus.entry_t.user_id IS 'user_id';
COMMENT ON COLUMN Bacchus.entry_t.entry_div IS '参加区分';
COMMENT ON TABLE Bacchus.event_t IS 'イベント_T';
COMMENT ON COLUMN Bacchus.event_t.event_no IS 'イベント管理番号';
COMMENT ON COLUMN Bacchus.event_t.event_name IS 'イベント名';
COMMENT ON COLUMN Bacchus.event_t.event_detail  IS 'イベント詳細';
COMMENT ON COLUMN Bacchus.event_t.event_place  IS '場所';
COMMENT ON COLUMN Bacchus.event_t.event_url  IS 'URL';
COMMENT ON COLUMN Bacchus.event_t.tell IS '電話番号';
COMMENT ON COLUMN Bacchus.event_t.event_entry_fee IS 'イベント参加費';
COMMENT ON COLUMN Bacchus.event_t.auxiliary_flg  IS '補助フラグ';
COMMENT ON COLUMN Bacchus.event_t.fix_flg IS '確定フラグ';
COMMENT ON COLUMN Bacchus.event_t.candidate_no IS '候補日管理番号';
COMMENT ON COLUMN Bacchus.event_t.store_name IS '店舗名';
COMMENT ON COLUMN Bacchus.event_t.event_div IS 'イベント区分';
COMMENT ON COLUMN Bacchus.event_t.user_id IS '幹事ユーザID';
COMMENT ON TABLE Bacchus.general_code_m IS '汎用コード_M';
COMMENT ON COLUMN Bacchus.general_code_m.code_id IS 'コードID';
COMMENT ON COLUMN Bacchus.general_code_m.code_div IS 'コード区分';
COMMENT ON COLUMN Bacchus.general_code_m.code IS 'コード';
COMMENT ON COLUMN Bacchus.general_code_m.name IS '名称';
COMMENT ON COLUMN Bacchus.general_code_m.order_number IS '表示順';
COMMENT ON COLUMN Bacchus.general_code_m.remarks IS '備考';
COMMENT ON COLUMN Bacchus.general_code_m.del_flg IS '削除フラグ';
COMMENT ON COLUMN Bacchus.general_code_m.REGISTER_DATETIME IS '作成日時';
COMMENT ON COLUMN Bacchus.general_code_m.REGISTER_USER IS '作成者';
COMMENT ON COLUMN Bacchus.general_code_m.UPDATE_DATETIME IS '更新日時';
COMMENT ON COLUMN Bacchus.general_code_m.UPDATE_USER IS '更新者';
COMMENT ON TABLE Bacchus.system_property_m IS 'システムプロパティ_M';
COMMENT ON COLUMN Bacchus.system_property_m.prop_key IS 'プロパティキー';
COMMENT ON COLUMN Bacchus.system_property_m.prop_value IS '値';
COMMENT ON COLUMN Bacchus.system_property_m.description IS '説明';
COMMENT ON COLUMN Bacchus.system_property_m.REGISTER_DATETIME IS '作成日時';
COMMENT ON COLUMN Bacchus.system_property_m.REGISTER_USER IS '作成者';
COMMENT ON COLUMN Bacchus.system_property_m.UPDATE_DATETIME IS '更新日時';
COMMENT ON COLUMN Bacchus.system_property_m.UPDATE_USER IS '更新者';
COMMENT ON TABLE Bacchus.user_t IS 'ユーザー_T';
COMMENT ON COLUMN Bacchus.user_t.user_id IS 'user_id';
COMMENT ON COLUMN Bacchus.user_t.login_id IS 'ログインID';
COMMENT ON COLUMN Bacchus.user_t.line_flg IS 'Lineフラグ';
COMMENT ON COLUMN Bacchus.user_t.line_id IS 'LineID';
COMMENT ON COLUMN Bacchus.user_t.line_user_name IS 'LINEユーザ名';
COMMENT ON COLUMN Bacchus.user_t.user_name IS 'ユーザー名';
COMMENT ON COLUMN Bacchus.user_t.last_name IS '苗字(氏)';
COMMENT ON COLUMN Bacchus.user_t.first_name IS '名前(名)';
COMMENT ON COLUMN Bacchus.user_t.email IS 'Eメール';
COMMENT ON COLUMN Bacchus.user_t.password IS '暗号化PWD';
COMMENT ON COLUMN Bacchus.user_t.user_type_id IS 'ユーザー区分ID';
COMMENT ON COLUMN Bacchus.user_t.auth_level IS '権限レベル';
COMMENT ON TABLE Bacchus.user_type_m IS 'ユーザー区分_M';
COMMENT ON COLUMN Bacchus.user_type_m.user_type_id IS 'ユーザー区分ID';
COMMENT ON COLUMN Bacchus.user_type_m.user_type_name IS 'ユーザー区分名称';
COMMENT ON COLUMN Bacchus.user_type_m.subsidy_amount IS '補助金額';



