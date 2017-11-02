
/* Drop Tables */

DROP TABLE IF EXISTS display_def_m;
DROP TABLE IF EXISTS general_code_m;
DROP TABLE IF EXISTS system_property_m;
DROP TABLE IF EXISTS user_t;



/* Drop Sequences */

DROP SEQUENCE IF EXISTS general_code_m_code_id_seq;




/* Create Tables */

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



/* Comments */

COMMENT ON TABLE display_def_m IS '画面名定義_M';
COMMENT ON COLUMN display_def_m.display_id IS '画面ID';
COMMENT ON COLUMN display_def_m.display_name IS '画面名';
COMMENT ON COLUMN display_def_m.REGISTER_DATETIME IS '作成日時';
COMMENT ON COLUMN display_def_m.REGISTER_USER IS '作成者';
COMMENT ON COLUMN display_def_m.UPDATE_DATETIME IS '更新日時';
COMMENT ON COLUMN display_def_m.UPDATE_USER IS '更新者';
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



