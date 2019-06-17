-- SCRIPT INFORMATION --
-- Types: mysql mariadb
-- Version: 1
-- Upgrades: 0
-- SCRIPT INFORMATION --

START TRANSACTION;
SET foreign_key_checks = 0;

DROP TABLE IF EXISTS prelude_player_data CASCADE;
DROP TABLE IF EXISTS prelude_overrides_log CASCADE;
DROP TABLE IF EXISTS prelude_played_hours_per_month CASCADE;
DROP TABLE IF EXISTS prelude_eaten_materials CASCADE;
DROP TABLE IF EXISTS prelude_placed_materials CASCADE;
DROP TABLE IF EXISTS prelude_broken_materials CASCADE;
DROP TABLE IF EXISTS prelude_enchanted_materials CASCADE;
DROP TABLE IF EXISTS prelude_crafted_materials CASCADE;

CREATE TABLE prelude_player_data (
  puuid                 BINARY(16) NOT NULL,
  break_count           BIGINT     NOT NULL,
  place_count           BIGINT     NOT NULL,
  meters_walked         DOUBLE     NOT NULL,
  xp_gained             BIGINT     NOT NULL,
  saturation_gained     BIGINT     NOT NULL,
  millis_played         BIGINT     NOT NULL,
  millis_tracking_month INTEGER    NOT NULL,
  forced_dedication     BOOLEAN    NOT NULL,
  PRIMARY KEY (puuid)
);

CREATE TABLE prelude_overrides_log (
  puuid            BINARY(16) NOT NULL,
  force_dedication BOOLEAN    NOT NULL,
  enforced_by      BINARY(16) NOT NULL,
  PRIMARY KEY (puuid),
  KEY (enforced_by)
);

CREATE TABLE prelude_played_hours_per_month (
  puuid         BINARY(16) NOT NULL,
  month         INTEGER    NOT NULL,
  year          INTEGER    NOT NULL,
  millis_played BIGINT     NOT NULL,
  PRIMARY KEY (puuid),
  UNIQUE (month, year, puuid)
);

CREATE TABLE prelude_eaten_materials (
  puuid          BINARY(16) NOT NULL,
  eaten_material INTEGER    NOT NULL,
  amount         INTEGER    NOT NULL,
  PRIMARY KEY (puuid),
  UNIQUE (puuid, eaten_material)
);

CREATE TABLE prelude_placed_materials (
  puuid           BINARY(16) NOT NULL,
  placed_material INTEGER    NOT NULL,
  amount          INTEGER    NOT NULL,
  PRIMARY KEY (puuid),
  UNIQUE (puuid, placed_material)
);

CREATE TABLE prelude_broken_materials (
  puuid           BINARY(16) NOT NULL,
  broken_material INTEGER    NOT NULL,
  amount          INTEGER    NOT NULL,
  PRIMARY KEY (puuid),
  UNIQUE (puuid, broken_material)
);

CREATE TABLE prelude_enchanted_materials (
  puuid              BINARY(16) NOT NULL,
  enchanted_material INTEGER    NOT NULL,
  amount             INTEGER    NOT NULL,
  PRIMARY KEY (puuid),
  UNIQUE (puuid, enchanted_material)
);

CREATE TABLE prelude_crafted_materials (
  puuid            BINARY(16) NOT NULL,
  crafted_material INTEGER    NOT NULL,
  amount           INTEGER    NOT NULL,
  PRIMARY KEY (puuid),
  UNIQUE (puuid, crafted_material)
);

SET foreign_key_checks = 1;
COMMIT;