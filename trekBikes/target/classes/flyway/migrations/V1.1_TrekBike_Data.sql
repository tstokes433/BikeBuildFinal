

-- Frameset
INSERT INTO frameset (frameset_id) VALUES('Domane');
INSERT INTO frameset (frameset_id) VALUES('Checkpoint');
INSERT INTO frameset (frameset_id) VALUES('Emonda');

-- Handlebar
INSERT INTO handlebar (handlebar_id) VALUES('Elite_IsoZone');
INSERT INTO handlebar (handlebar_id) VALUES('Elite');
INSERT INTO handlebar (handlebar_id) VALUES('Comp_VRC');

-- Color
INSERT INTO color (color_id) VALUES('Lithium_Grey_to_Crimson');
INSERT INTO color (color_id) VALUES('Purple_Abyss');
INSERT INTO color (color_id) VALUES('Satin_Cobra_Blood');

-- Saddle
INSERT INTO saddle (saddle_id) VALUES('Versa_Comp');
INSERT INTO saddle (saddle_id) VALUES('Aeolus_Pro');
INSERT INTO saddle (saddle_id) VALUES('Sport');


-- Drivetrain
INSERT INTO drivetrain (drivetrain_id) VALUES('Shimano_105_R7020');
INSERT INTO drivetrain (drivetrain_id) VALUES('Shimano_GRX_RX600');
INSERT INTO drivetrain (drivetrain_id) VALUES('SRAM_RED_AXS');


-- Tire
INSERT INTO tire (tire_id) VALUES('Bontrager_R1');
INSERT INTO tire (tire_id) VALUES('Continental_Sprinter');
INSERT INTO tire (tire_id) VALUES('Pirelli_Cinturato');


-- Bike
INSERT INTO bike (bike_pk, frameset_id, color_id, drivetrain_id, handlebar_id, saddle_id, tire_id) VALUES (1, 'Domane', 'Lithium_Grey_to_Crimson',  'Shimano_105_R7020', 'Elite_IsoZone',  'Versa_Comp', 'Bontrager_R1');
INSERT INTO bike (bike_pk, frameset_id, color_id, drivetrain_id, handlebar_id, saddle_id, tire_id) VALUES (NULL, 'Domane', 'Lithium_Grey_to_Crimson',  'Shimano_105_R7020', 'Elite_IsoZone',  'Versa_Comp', 'Bontrager_R1');
