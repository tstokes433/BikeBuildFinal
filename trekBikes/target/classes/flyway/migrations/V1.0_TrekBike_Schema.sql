DROP TABLE IF EXISTS bike;
DROP TABLE IF EXISTS handlebar_color;
DROP TABLE IF EXISTS color;
DROP TABLE IF EXISTS handlebar;
DROP TABLE IF EXISTS saddle;
DROP TABLE IF EXISTS drivetrain;
DROP TABLE IF EXISTS tire;
DROP TABLE IF EXISTS frameset;



CREATE TABLE frameset (
  frameset_pk int unsigned NOT NULL AUTO_INCREMENT,
  frameset_id enum('Domane', 'Emonda', 'Checkpoint') NOT NULL,
  PRIMARY KEY (frameset_pk), UNIQUE KEY (frameset_id)
);

CREATE TABLE tire (
  tire_pk int unsigned NOT NULL AUTO_INCREMENT,
  tire_id enum('Bontrager_R1', 'Continental_Sprinter', 'Pirelli_Cinturato') NOT NULL,
  PRIMARY KEY (tire_pk), UNIQUE KEY (tire_id)
);

CREATE TABLE drivetrain (
  drivetrain_pk int unsigned NOT NULL AUTO_INCREMENT,
  drivetrain_id enum('Shimano_105_R7020', 'SRAM_RED_AXS', 'Shimano_GRX_RX600') NOT NULL,
  frameset_fk int unsigned,
  PRIMARY KEY (drivetrain_pk), UNIQUE KEY (drivetrain_id)
);

CREATE TABLE saddle (
  saddle_pk int unsigned NOT NULL AUTO_INCREMENT,
  saddle_id enum('Versa_Comp', 'Aeolus_Pro', 'Sport') NOT NULL,
  frameset_fk int unsigned,
  PRIMARY KEY (saddle_pk), UNIQUE KEY (saddle_id)
);



CREATE TABLE handlebar (
  handlebar_pk int unsigned NOT NULL AUTO_INCREMENT,
  handlebar_id enum('Elite_IsoZone', 'Elite', 'Comp_VRC') NOT NULL,
  frameset_fk int unsigned,
  PRIMARY KEY (handlebar_pk), UNIQUE KEY (handlebar_id)
);

CREATE TABLE color (
  color_pk int unsigned NOT NULL AUTO_INCREMENT,
  color_id enum('Lithium_Grey_to_Crimson', 'Purple_Abyss', 'Satin_Cobra_Blood') NOT NULL,
  frameset_fk int unsigned,
  PRIMARY KEY (color_pk), UNIQUE KEY (color_id)
);

CREATE TABLE handlebar_color (
  color_fk int unsigned NOT NULL,
  handlebar_fk int unsigned NOT NULL,
  FOREIGN KEY (handlebar_fk) REFERENCES handlebar (handlebar_pk),
  FOREIGN KEY (color_fk) REFERENCES color (color_pk),
  UNIQUE KEY (handlebar_fk, color_fk)
);

CREATE TABLE bike (
  bike_pk int unsigned AUTO_INCREMENT,
	frameset_id enum('Domane', 'Emonda', 'Checkpoint') NOT NULL,
	tire_id enum('Bontrager_R1', 'Continental_Sprinter', 'Pirelli_Cinturato') NOT NULL,
	drivetrain_id enum('Shimano_105_R7020', 'SRAM_RED_AXS', 'Shimano_GRX_RX600') NOT NULL,	
	saddle_id enum('Versa_Comp', 'Aeolus_Pro', 'Sport') NOT NULL,
    handlebar_id enum('Elite_IsoZone', 'Elite', 'Comp_VRC') NOT NULL,
	color_id enum('Lithium_Grey_to_Crimson', 'Purple_Abyss', 'Satin_Cobra_Blood') NOT NULL,
  PRIMARY KEY (bike_pk),
   FOREIGN KEY (frameset_id) REFERENCES frameset (frameset_id) ON DELETE CASCADE,
   FOREIGN KEY (tire_id) REFERENCES tire (tire_id) ON DELETE CASCADE,
   FOREIGN KEY (drivetrain_id) REFERENCES drivetrain (drivetrain_id) ON DELETE CASCADE,
   FOREIGN KEY (saddle_id) REFERENCES saddle (saddle_id) ON DELETE CASCADE,
   FOREIGN KEY (handlebar_id) REFERENCES handlebar (handlebar_id) ON DELETE CASCADE,
   FOREIGN KEY (color_id) REFERENCES color (color_id) ON DELETE CASCADE   
);