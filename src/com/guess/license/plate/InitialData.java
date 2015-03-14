package com.guess.license.plate;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;

public class InitialData {

	private static ContentValues values = new ContentValues();
	
	public static void InsertBuild(SQLiteDatabase db){
		values.clear();
		
		values.put(Database.BUILD[1], 1);
		values.put(Database.BUILD[2], "Guess License Plate");
		values.put(Database.BUILD[3], 1);
		values.put(Database.BUILD[4], "Alberto Tosi Brandi");		
		db.insert(Database.TABLES[0], null, values);		
	}
	
	public static void InsertPlate(SQLiteDatabase db){
		values.clear();
		
		// ABKHAZIA
		values.put(Database.PLATE[1], "ABKHAZIA");
		values.put(Database.PLATE[2], "eu_abk_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ALBANIA
		values.put(Database.PLATE[1], "ALBANIA");
		values.put(Database.PLATE[2], "eu_alb_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ANDORRA
		values.put(Database.PLATE[1], "ANDORRA");
		values.put(Database.PLATE[2], "eu_and_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ARMENIA
		values.put(Database.PLATE[1], "ARMENIA");
		values.put(Database.PLATE[2], "eu_arm_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AUSTRIA(BURGENLAND)
		values.put(Database.PLATE[1], "AUSTRIA(BURGENLAND)");
		values.put(Database.PLATE[2], "eu_aus_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AUSTRIA(CARINTHIA)
		values.put(Database.PLATE[1], "AUSTRIA(CARINTHIA)");
		values.put(Database.PLATE[2], "eu_aus_002");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AUSTRIA(LOWER AUSTRIA)
		values.put(Database.PLATE[1], "AUSTRIA(LOWER AUSTRIA)");
		values.put(Database.PLATE[2], "eu_aus_003");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AUSTRIA(POLIZEI)
		values.put(Database.PLATE[1], "AUSTRIA(POLIZEI)");
		values.put(Database.PLATE[2], "eu_aus_004");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AUSTRIA(SALZBURG)
		values.put(Database.PLATE[1], "AUSTRIA(SALZBURG)");
		values.put(Database.PLATE[2], "eu_aus_005");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AUSTRIA(STYRIA)
		values.put(Database.PLATE[1], "AUSTRIA(STYRIA)");
		values.put(Database.PLATE[2], "eu_aus_006");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AUSTRIA(TYROL)
		values.put(Database.PLATE[1], "AUSTRIA(TYROL)");
		values.put(Database.PLATE[2], "eu_aus_007");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AUSTRIA(UPPER AUSTRIA)
		values.put(Database.PLATE[1], "AUSTRIA(UPPER AUSTRIA)");
		values.put(Database.PLATE[2], "eu_aus_008");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
				
		// AUSTRIA(VIENNA)
		values.put(Database.PLATE[1], "AUSTRIA(VIENNA)");
		values.put(Database.PLATE[2], "eu_aus_009");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AUSTRIA(VORARLBERG)
		values.put(Database.PLATE[1], "AUSTRIA(VORARLBERG)");
		values.put(Database.PLATE[2], "eu_aus_010");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// AZERBAIJAN
		values.put(Database.PLATE[1], "AZERBAIJAN");
		values.put(Database.PLATE[2], "eu_aze_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// BELGIUM
		values.put(Database.PLATE[1], "BELGIUM");
		values.put(Database.PLATE[2], "eu_beg_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// BELARUS
		values.put(Database.PLATE[1], "BELARUS");
		values.put(Database.PLATE[2], "eu_bel_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// CROATIA
		values.put(Database.PLATE[1], "CROATIA");
		values.put(Database.PLATE[2], "eu_cro_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// CYPRUS
		values.put(Database.PLATE[1], "CYPRUS");
		values.put(Database.PLATE[2], "eu_cyp_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// CZECH REPUBLIC
		values.put(Database.PLATE[1], "CZECH REPUBLIC");
		values.put(Database.PLATE[2], "eu_cze_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// DENMARK
		values.put(Database.PLATE[1], "DENMARK");
		values.put(Database.PLATE[2], "eu_den_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ENGLAND
		values.put(Database.PLATE[1], "ENGLAND");
		values.put(Database.PLATE[2], "eu_eng_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ESTONIA
		values.put(Database.PLATE[1], "ESTONIA");
		values.put(Database.PLATE[2], "eu_est_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FINLAND
		values.put(Database.PLATE[1], "FINLAND");
		values.put(Database.PLATE[2], "eu_fin_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (ALSACE)
		values.put(Database.PLATE[1], "FRANCE REGION (ALSACE)");
		values.put(Database.PLATE[2], "eu_fra_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (AQUITAINE)
		values.put(Database.PLATE[1], "FRANCE REGION (AQUITAINE)");
		values.put(Database.PLATE[2], "eu_fra_002");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (AUVERGNE)
		values.put(Database.PLATE[1], "FRANCE REGION (AUVERGNE)");
		values.put(Database.PLATE[2], "eu_fra_003");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
				
		// FRANCE REGION (BASSE-NORMANDIE)
		values.put(Database.PLATE[1], "FRANCE REGION (BASSE-NORMANDIE)");
		values.put(Database.PLATE[2], "eu_fra_004");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (BOURGOGNE)
		values.put(Database.PLATE[1], "FRANCE REGION (BOURGOGNE)");
		values.put(Database.PLATE[2], "eu_fra_005");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (BRETAGNE)
		values.put(Database.PLATE[1], "FRANCE REGION (BRETAGNE)");
		values.put(Database.PLATE[2], "eu_fra_006");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (CENTRE)
		values.put(Database.PLATE[1], "FRANCE REGION (CENTRE)");
		values.put(Database.PLATE[2], "eu_fra_007");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (CHAMPAGNE-ARDENNE)
		values.put(Database.PLATE[1], "FRANCE REGION (CHAMPAGNE-ARDENNE)");
		values.put(Database.PLATE[2], "eu_fra_008");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (CORSE/CORSICA)
		values.put(Database.PLATE[1], "FRANCE REGION (CORSE/CORSICA)");
		values.put(Database.PLATE[2], "eu_fra_009");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (FRANCHE-COMTE)
		values.put(Database.PLATE[1], "FRANCE REGION (FRANCHE-COMTE)");
		values.put(Database.PLATE[2], "eu_fra_010");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (GUADELOUPE)
		values.put(Database.PLATE[1], "FRANCE REGION (GUADELOUPE)");
		values.put(Database.PLATE[2], "eu_fra_011");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (GUYANE/FRENCH GUIANA)
		values.put(Database.PLATE[1], "FRANCE REGION (GUYANE/FRENCH GUIANA)");
		values.put(Database.PLATE[2], "eu_fra_012");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (HAUTE-NORMANDIE)
		values.put(Database.PLATE[1], "FRANCE REGION (HAUTE-NORMANDIE)");
		values.put(Database.PLATE[2], "eu_fra_013");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (LANGUEDOC-ROUSSILLON)
		values.put(Database.PLATE[1], "FRANCE REGION (LANGUEDOC-ROUSSILLON)");
		values.put(Database.PLATE[2], "eu_fra_014");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (LIMOUSIN)
		values.put(Database.PLATE[1], "FRANCE REGION (LIMOUSIN)");
		values.put(Database.PLATE[2], "eu_fra_015");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (LORRAINE)
		values.put(Database.PLATE[1], "FRANCE REGION (LORRAINE)");
		values.put(Database.PLATE[2], "eu_fra_016");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (MARTINIQUE)
		values.put(Database.PLATE[1], "FRANCE REGION (MARTINIQUE)");
		values.put(Database.PLATE[2], "eu_fra_017");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (MIDI-PYRENEES)
		values.put(Database.PLATE[1], "FRANCE REGION (MIDI-PYRENEES)");
		values.put(Database.PLATE[2], "eu_fra_018");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (NORD-PAS-DE-CALAIS)
		values.put(Database.PLATE[1], "FRANCE REGION (NORD-PAS-DE-CALAIS)");
		values.put(Database.PLATE[2], "eu_fra_019");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (PARIS/ILE DE FRANCE)
		values.put(Database.PLATE[1], "FRANCE REGION (PARIS/ILE DE FRANCE)");
		values.put(Database.PLATE[2], "eu_fra_020");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (PAYS-DE-LA-LOIRE)
		values.put(Database.PLATE[1], "FRANCE REGION (PAYS-DE-LA-LOIRE)");
		values.put(Database.PLATE[2], "eu_fra_021");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (PICARDIE)
		values.put(Database.PLATE[1], "FRANCE REGION (PICARDIE)");
		values.put(Database.PLATE[2], "eu_fra_022");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (POITOU-CHARENTES)
		values.put(Database.PLATE[1], "FRANCE REGION (POITOU-CHARENTES)");
		values.put(Database.PLATE[2], "eu_fra_023");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (PROVENCE-ALPES-COTE-D AZUR)
		values.put(Database.PLATE[1], "FRANCE REGION (PROVENCE-ALPES-COTE-D AZUR)");
		values.put(Database.PLATE[2], "eu_fra_024");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (REUNION)
		values.put(Database.PLATE[1], "FRANCE REGION (REUNION)");
		values.put(Database.PLATE[2], "eu_fra_025");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (RHONE-ALPES)
		values.put(Database.PLATE[1], "FRANCE REGION (RHONE-ALPES)");
		values.put(Database.PLATE[2], "eu_fra_026");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// FRANCE REGION (SAINT-MARTIN)
		values.put(Database.PLATE[1], "FRANCE REGION (SAINT-MARTIN)");
		values.put(Database.PLATE[2], "eu_fra_027");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// BRITAIN/UK
		values.put(Database.PLATE[1], "BRITAIN/UK");
		values.put(Database.PLATE[2], "eu_gbt_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GEORGIA
		values.put(Database.PLATE[1], "GEORGIA");
		values.put(Database.PLATE[2], "eu_geo_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(WOLFSBURG)
		values.put(Database.PLATE[1], "GERMAN(WOLFSBURG)");
		values.put(Database.PLATE[2], "eu_ger_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(MUNICH)
		values.put(Database.PLATE[1], "GERMAN(MUNICH)");
		values.put(Database.PLATE[2], "eu_ger_002");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(STUTTGART)
		values.put(Database.PLATE[1], "GERMAN(STUTTGART)");
		values.put(Database.PLATE[2], "eu_ger_003");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(BERLIN)
		values.put(Database.PLATE[1], "GERMAN(BERLIN)");
		values.put(Database.PLATE[2], "eu_ger_004");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(BRANDENBURG)
		values.put(Database.PLATE[1], "GERMAN(BRANDENBURG)");
		values.put(Database.PLATE[2], "eu_ger_005");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(BREMEN)
		values.put(Database.PLATE[1], "GERMAN(BREMEN)");
		values.put(Database.PLATE[2], "eu_ger_006");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(HAMBURG)
		values.put(Database.PLATE[1], "GERMAN(HAMBURG)");
		values.put(Database.PLATE[2], "eu_ger_007");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(HESSEN/WIESBADEN)
		values.put(Database.PLATE[1], "GERMAN(HESSEN/WIESBADEN)");
		values.put(Database.PLATE[2], "eu_ger_008");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(MECKLENBURG-VORPOMMERN)
		values.put(Database.PLATE[1], "GERMAN(MECKLENBURG-VORPOMMERN)");
		values.put(Database.PLATE[2], "eu_ger_009");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN NORDRHEIN-WESTFALEN(DÜSSELDORF)
		values.put(Database.PLATE[1], "GERMAN NORDRHEIN-WESTFALEN(DÜSSELDORF)");
		values.put(Database.PLATE[2], "eu_ger_010");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(RHEINLAND/PFALZ/MAINZ)
		values.put(Database.PLATE[1], "GERMAN(RHEINLAND/PFALZ/MAINZ)");
		values.put(Database.PLATE[2], "eu_ger_011");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(SAARLAND/SAARBRÜCKEN)
		values.put(Database.PLATE[1], "GERMAN(SAARLAND/SAARBRÜCKEN)");
		values.put(Database.PLATE[2], "eu_ger_012");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(SACHSEN)
		values.put(Database.PLATE[1], "GERMAN(SACHSEN)");
		values.put(Database.PLATE[2], "eu_ger_013");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(SACHSEN-ANHALT)
		values.put(Database.PLATE[1], "GERMAN(SACHSEN-ANHALT)");
		values.put(Database.PLATE[2], "eu_ger_014");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(SCHLESWIG-HOLSTEIN)
		values.put(Database.PLATE[1], "GERMAN(SCHLESWIG-HOLSTEIN)");
		values.put(Database.PLATE[2], "eu_ger_015");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(THÜRINGEN)
		values.put(Database.PLATE[1], "GERMAN(THÜRINGEN)");
		values.put(Database.PLATE[2], "eu_ger_016");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GERMAN(INGOLSTADT)
		values.put(Database.PLATE[1], "GERMAN(INGOLSTADT)");
		values.put(Database.PLATE[2], "eu_ger_017");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// GREECE
		values.put(Database.PLATE[1], "GREECE");
		values.put(Database.PLATE[2], "eu_gre_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// HUNGARY
		values.put(Database.PLATE[1], "HUNGARY");
		values.put(Database.PLATE[2], "eu_hun_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// IRELAND
		values.put(Database.PLATE[1], "IRELAND");
		values.put(Database.PLATE[2], "eu_irl_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ICELAND
		values.put(Database.PLATE[1], "ICELAND");
		values.put(Database.PLATE[2], "eu_isl_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ISLE OF MAN
		values.put(Database.PLATE[1], "ISLE OF MAN");
		values.put(Database.PLATE[2], "eu_ism_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF BOLOGNA
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF BOLOGNA");
		values.put(Database.PLATE[2], "eu_ita_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF CAGLIARI
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF CAGLIARI");
		values.put(Database.PLATE[2], "eu_ita_002");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF CHIETI
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF CHIETI");
		values.put(Database.PLATE[2], "eu_ita_003");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF FLORENCE
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF FLORENCE");
		values.put(Database.PLATE[2], "eu_ita_004");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF GENOA
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF GENOA");
		values.put(Database.PLATE[2], "eu_ita_005");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF LATINA
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF LATINA");
		values.put(Database.PLATE[2], "eu_ita_006");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF MESSINA
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF MESSINA");
		values.put(Database.PLATE[2], "eu_ita_007");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF MILAN
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF MILAN");
		values.put(Database.PLATE[2], "eu_ita_008");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF MODENA
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF MODENA");
		values.put(Database.PLATE[2], "eu_ita_009");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF NAPLES
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF NAPLES");
		values.put(Database.PLATE[2], "eu_ita_010");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF PALERMO
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF PALERMO");
		values.put(Database.PLATE[2], "eu_ita_011");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF PISA
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF PISA");
		values.put(Database.PLATE[2], "eu_ita_012");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF POTENZA
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF POTENZA");
		values.put(Database.PLATE[2], "eu_ita_013");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF ROME
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF ROME");
		values.put(Database.PLATE[2], "eu_ita_014");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF SALERNO
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF SALERNO");
		values.put(Database.PLATE[2], "eu_ita_015");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF TORINO
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF TORINO");
		values.put(Database.PLATE[2], "eu_ita_016");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF VENICE
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF VENICE");
		values.put(Database.PLATE[2], "eu_ita_017");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ITALY - PROVINCE OF VERONA
		values.put(Database.PLATE[1], "ITALY - PROVINCE OF VERONA");
		values.put(Database.PLATE[2], "eu_ita_018");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// REPUBLIC OF KOSOVO
		values.put(Database.PLATE[1], "REPUBLIC OF KOSOVO");
		values.put(Database.PLATE[2], "eu_kos_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// LATVIA
		values.put(Database.PLATE[1], "LATVIA");
		values.put(Database.PLATE[2], "eu_lat_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// LIECHTENSTEIN
		values.put(Database.PLATE[1], "LIECHTENSTEIN");
		values.put(Database.PLATE[2], "eu_lie_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// LITHUANIA
		values.put(Database.PLATE[1], "LITHUANIA");
		values.put(Database.PLATE[2], "eu_lit_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// LUXEMBOURG
		values.put(Database.PLATE[1], "LUXEMBOURG");
		values.put(Database.PLATE[2], "eu_lux_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// MACEDONIA
		values.put(Database.PLATE[1], "MACEDONIA");
		values.put(Database.PLATE[2], "eu_mac_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// MALTA
		values.put(Database.PLATE[1], "MALTA");
		values.put(Database.PLATE[2], "eu_mal_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// MOLDOVA
		values.put(Database.PLATE[1], "MOLDOVA");
		values.put(Database.PLATE[2], "eu_mol_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// MONACO
		values.put(Database.PLATE[1], "MONACO");
		values.put(Database.PLATE[2], "eu_mon_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// MONTENEGRO
		values.put(Database.PLATE[1], "MONTENEGRO");
		values.put(Database.PLATE[2], "eu_mne_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// NETHERLANDS
		values.put(Database.PLATE[1], "NETHERLANDS");
		values.put(Database.PLATE[2], "eu_net_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// NORWAY
		values.put(Database.PLATE[1], "NORWAY");
		values.put(Database.PLATE[2], "eu_nor_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// POLAND
		values.put(Database.PLATE[1], "POLAND");
		values.put(Database.PLATE[2], "eu_pol_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// PORTUGAL
		values.put(Database.PLATE[1], "PORTUGAL");
		values.put(Database.PLATE[2], "eu_por_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ROMANIA
		values.put(Database.PLATE[1], "ROMANIA");
		values.put(Database.PLATE[2], "eu_rom_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// RUSSIA
		values.put(Database.PLATE[1], "RUSSIA");
		values.put(Database.PLATE[2], "eu_rus_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SAN MARINO
		values.put(Database.PLATE[1], "SAN MARINO");
		values.put(Database.PLATE[2], "eu_rsm_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SCOTLAND
		values.put(Database.PLATE[1], "SCOTLAND");
		values.put(Database.PLATE[2], "eu_sco_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SLOVAKIA
		values.put(Database.PLATE[1], "SLOVAKIA");
		values.put(Database.PLATE[2], "eu_slo_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SLOVENIA
		values.put(Database.PLATE[1], "SLOVENIA");
		values.put(Database.PLATE[2], "eu_slv_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SPAIN (ESPANA)
		values.put(Database.PLATE[1], "SPAIN (ESPANA)");
		values.put(Database.PLATE[2], "eu_spa_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SERBIA
		values.put(Database.PLATE[1], "SERBIA");
		values.put(Database.PLATE[2], "eu_srb_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWEDEN
		values.put(Database.PLATE[1], "SWEDEN");
		values.put(Database.PLATE[2], "eu_swe_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(AARGAU)
		values.put(Database.PLATE[1], "SWITZERLAND(AARGAU)");
		values.put(Database.PLATE[2], "eu_swi_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(APPENZELL AUSSERRHODEN)
		values.put(Database.PLATE[1], "SWITZERLAND(APPENZELL AUSSERRHODEN)");
		values.put(Database.PLATE[2], "eu_swi_002");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(APPENZELL INNERRHODEN)
		values.put(Database.PLATE[1], "SWITZERLAND(APPENZELL INNERRHODEN)");
		values.put(Database.PLATE[2], "eu_swi_003");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(BASEL-LANDSCHAFT)
		values.put(Database.PLATE[1], "SWITZERLAND(BASEL-LANDSCHAFT)");
		values.put(Database.PLATE[2], "eu_swi_004");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(BASEL-STADT)
		values.put(Database.PLATE[1], "SWITZERLAND(BASEL-STADT)");
		values.put(Database.PLATE[2], "eu_swi_005");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(BERN)
		values.put(Database.PLATE[1], "SWITZERLAND(BERN)");
		values.put(Database.PLATE[2], "eu_swi_006");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(FRIBOURG)
		values.put(Database.PLATE[1], "SWITZERLAND(FRIBOURG)");
		values.put(Database.PLATE[2], "eu_swi_007");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(GENÈVE)
		values.put(Database.PLATE[1], "SWITZERLAND(GENÈVE)");
		values.put(Database.PLATE[2], "eu_swi_009");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(GLARUS)
		values.put(Database.PLATE[1], "SWITZERLAND(GLARUS)");
		values.put(Database.PLATE[2], "eu_swi_010");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 1);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(GRAUBÜNDEN)
		values.put(Database.PLATE[1], "SWITZERLAND(GRAUBÜNDEN)");
		values.put(Database.PLATE[2], "eu_swi_011");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(JURA)
		values.put(Database.PLATE[1], "SWITZERLAND(JURA)");
		values.put(Database.PLATE[2], "eu_swi_012");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(LUCERNE)
		values.put(Database.PLATE[1], "SWITZERLAND(LUCERNE)");
		values.put(Database.PLATE[2], "eu_swi_013");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(NEUCHÂTEL)
		values.put(Database.PLATE[1], "SWITZERLAND(NEUCHÂTEL)");
		values.put(Database.PLATE[2], "eu_swi_014");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(NIDWALDEN)
		values.put(Database.PLATE[1], "SWITZERLAND(NIDWALDEN)");
		values.put(Database.PLATE[2], "eu_swi_015");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(OBWALDEN)
		values.put(Database.PLATE[1], "SWITZERLAND(OBWALDEN)");
		values.put(Database.PLATE[2], "eu_swi_016");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(SCHAFFHAUSEN)
		values.put(Database.PLATE[1], "SWITZERLAND(SCHAFFHAUSEN)");
		values.put(Database.PLATE[2], "eu_swi_017");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 2);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(SCHWYZ)
		values.put(Database.PLATE[1], "SWITZERLAND(SCHWYZ)");
		values.put(Database.PLATE[2], "eu_swi_018");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(SOLOTHURN)
		values.put(Database.PLATE[1], "SWITZERLAND(SOLOTHURN)");
		values.put(Database.PLATE[2], "eu_swi_019");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(ST. GALLEN)
		values.put(Database.PLATE[1], "SWITZERLAND(ST. GALLEN)");
		values.put(Database.PLATE[2], "eu_swi_020");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(THURGAU)
		values.put(Database.PLATE[1], "SWITZERLAND(THURGAU)");
		values.put(Database.PLATE[2], "eu_swi_021");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(TICINO)
		values.put(Database.PLATE[1], "SWITZERLAND(TICINO)");
		values.put(Database.PLATE[2], "eu_swi_022");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(URI)
		values.put(Database.PLATE[1], "SWITZERLAND(URI)");
		values.put(Database.PLATE[2], "eu_swi_023");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(VALAIS)
		values.put(Database.PLATE[1], "SWITZERLAND(VALAIS)");
		values.put(Database.PLATE[2], "eu_swi_024");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(VAUD)
		values.put(Database.PLATE[1], "SWITZERLAND(VAUD)");
		values.put(Database.PLATE[2], "eu_swi_025");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(ZUG)
		values.put(Database.PLATE[1], "SWITZERLAND(ZUG)");
		values.put(Database.PLATE[2], "eu_swi_026");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// SWITZERLAND(ZURICH)
		values.put(Database.PLATE[1], "SWITZERLAND(ZURICH)");
		values.put(Database.PLATE[2], "eu_swi_027");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 3);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// TAJIKISTAN
		values.put(Database.PLATE[1], "TAJIKISTAN");
		values.put(Database.PLATE[2], "eu_taj_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// TURKEY (TR)
		values.put(Database.PLATE[1], "TURKEY (TR)");
		values.put(Database.PLATE[2], "eu_tur_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// UKRAINE
		values.put(Database.PLATE[1], "UKRAINE");
		values.put(Database.PLATE[2], "eu_ukr_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// UZBEKISTAN
		values.put(Database.PLATE[1], "UZBEKISTAN");
		values.put(Database.PLATE[2], "eu_uzb_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// VATICAN CITY
		values.put(Database.PLATE[1], "VATICAN CITY");
		values.put(Database.PLATE[2], "eu_vat_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// WALES
		values.put(Database.PLATE[1], "WALES");
		values.put(Database.PLATE[2], "eu_wal_001");
		values.put(Database.PLATE[3], "Europe");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "Europe");
		db.insert(Database.TABLES[1], null, values);
		
		// ALABAMA
		values.put(Database.PLATE[1], "ALABAMA");
		values.put(Database.PLATE[2], "us_alb_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// ALASKA
		values.put(Database.PLATE[1], "ALASKA");
		values.put(Database.PLATE[2], "us_als_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// ARIZONA
		values.put(Database.PLATE[1], "ARIZONA");
		values.put(Database.PLATE[2], "us_ari_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// ARKANSAS
		values.put(Database.PLATE[1], "ARKANSAS");
		values.put(Database.PLATE[2], "us_ark_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// CALIFORNIA
		values.put(Database.PLATE[1], "CALIFORNIA");
		values.put(Database.PLATE[2], "us_cal_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// COLORADO
		values.put(Database.PLATE[1], "COLORADO");
		values.put(Database.PLATE[2], "us_col_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// CONNECTICUT
		values.put(Database.PLATE[1], "CONNECTICUT");
		values.put(Database.PLATE[2], "us_con_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// DELAWARE
		values.put(Database.PLATE[1], "DELAWARE");
		values.put(Database.PLATE[2], "us_del_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// FLORIDA
		values.put(Database.PLATE[1], "FLORIDA");
		values.put(Database.PLATE[2], "us_flo_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// GEORGIA
		values.put(Database.PLATE[1], "GEORGIA");
		values.put(Database.PLATE[2], "us_geo_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// HAWAII
		values.put(Database.PLATE[1], "HAWAII");
		values.put(Database.PLATE[2], "us_haw_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// IDAHO
		values.put(Database.PLATE[1], "IDAHO");
		values.put(Database.PLATE[2], "us_ida_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// ILLINOIS
		values.put(Database.PLATE[1], "ILLINOIS");
		values.put(Database.PLATE[2], "us_ill_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// INDIANA
		values.put(Database.PLATE[1], "INDIANA");
		values.put(Database.PLATE[2], "us_ind_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// IOWA
		values.put(Database.PLATE[1], "IOWA");
		values.put(Database.PLATE[2], "us_iow_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// KANSASAS
		values.put(Database.PLATE[1], "KANSASAS");
		values.put(Database.PLATE[2], "us_kan_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// KENTUCKY
		values.put(Database.PLATE[1], "KENTUCKY");
		values.put(Database.PLATE[2], "us_ken_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// LOUSIANA
		values.put(Database.PLATE[1], "LOUSIANA");
		values.put(Database.PLATE[2], "us_lou_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// MAINE
		values.put(Database.PLATE[1], "MAINE");
		values.put(Database.PLATE[2], "us_mai_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// MARYLAND
		values.put(Database.PLATE[1], "MARYLAND");
		values.put(Database.PLATE[2], "us_mar_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// MASSACHUSETTS
		values.put(Database.PLATE[1], "MASSACHUSETTS");
		values.put(Database.PLATE[2], "us_mas_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// MICHIGAN
		values.put(Database.PLATE[1], "MICHIGAN");
		values.put(Database.PLATE[2], "us_mic_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// MINNESOTA
		values.put(Database.PLATE[1], "MINNESOTA");
		values.put(Database.PLATE[2], "us_min_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// MISSISSIPPI
		values.put(Database.PLATE[1], "MISSISSIPPI");
		values.put(Database.PLATE[2], "us_msi_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// MISSOURI
		values.put(Database.PLATE[1], "MISSOURI");
		values.put(Database.PLATE[2], "us_mso_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// MONTANA
		values.put(Database.PLATE[1], "MONTANA");
		values.put(Database.PLATE[2], "us_mon_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// NEBRASKA
		values.put(Database.PLATE[1], "NEBRASKA");
		values.put(Database.PLATE[2], "us_neb_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// NEVADA
		values.put(Database.PLATE[1], "NEVADA");
		values.put(Database.PLATE[2], "us_nev_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// NEWHAMPSHIRE
		values.put(Database.PLATE[1], "NEWHAMPSHIRE");
		values.put(Database.PLATE[2], "us_neh_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// NEW JERSEY
		values.put(Database.PLATE[1], "NEW JERSEY");
		values.put(Database.PLATE[2], "us_nej_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// NEW MEXICO
		values.put(Database.PLATE[1], "NEW MEXICO");
		values.put(Database.PLATE[2], "us_nem_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// NEW YORK
		values.put(Database.PLATE[1], "NEW YORK");
		values.put(Database.PLATE[2], "us_ney_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// NORTH CAROLINA
		values.put(Database.PLATE[1], "NORTH CAROLINA");
		values.put(Database.PLATE[2], "us_nrc_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// NORTH DAKOTA
		values.put(Database.PLATE[1], "NORTH DAKOTA");
		values.put(Database.PLATE[2], "us_nrd_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// OHIO
		values.put(Database.PLATE[1], "OHIO");
		values.put(Database.PLATE[2], "us_ohi_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// OKLAHOMA
		values.put(Database.PLATE[1], "OKLAHOMA");
		values.put(Database.PLATE[2], "us_okl_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// OREGON
		values.put(Database.PLATE[1], "OREGON");
		values.put(Database.PLATE[2], "us_ore_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// PENNSYLVANIA
		values.put(Database.PLATE[1], "PENNSYLVANIA");
		values.put(Database.PLATE[2], "us_pen_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// RHODEILSLAND
		values.put(Database.PLATE[1], "RHODEILSLAND");
		values.put(Database.PLATE[2], "us_rho_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// SOUTH CAROLINA
		values.put(Database.PLATE[1], "SOUTH CAROLINA");
		values.put(Database.PLATE[2], "us_soc_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// SOUTH DAKOTA
		values.put(Database.PLATE[1], "SOUTH DAKOTA");
		values.put(Database.PLATE[2], "us_sod_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// TENNESSEE
		values.put(Database.PLATE[1], "TENNESSEE");
		values.put(Database.PLATE[2], "us_ten_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// TEXAS
		values.put(Database.PLATE[1], "TEXAS");
		values.put(Database.PLATE[2], "us_tex_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// UTAH
		values.put(Database.PLATE[1], "UTAH");
		values.put(Database.PLATE[2], "us_uth_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// VERMONT
		values.put(Database.PLATE[1], "VERMONT");
		values.put(Database.PLATE[2], "us_ver_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// VIRGINIA
		values.put(Database.PLATE[1], "VIRGINIA");
		values.put(Database.PLATE[2], "us_vir_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// WASHINGTON
		values.put(Database.PLATE[1], "WASHINGTON");
		values.put(Database.PLATE[2], "us_was_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// WEST VIRGINIA
		values.put(Database.PLATE[1], "WEST VIRGINIA");
		values.put(Database.PLATE[2], "us_wes_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// WISCONSIN
		values.put(Database.PLATE[1], "WISCONSIN");
		values.put(Database.PLATE[2], "us_wis_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
		
		// WYOMING
		values.put(Database.PLATE[1], "WYOMING");
		values.put(Database.PLATE[2], "us_wiy_001");
		values.put(Database.PLATE[3], "ROTW");
		values.put(Database.PLATE[4], 0);
		values.put(Database.PLATE[5], 1);
		values.put(Database.PLATE[6], "North America");
		db.insert(Database.TABLES[1], null, values);
	}

	public static void InsertLang(SQLiteDatabase db){
		values.clear();
		
		// ABKHAZIA
		values.put(Database.LANG[1], "eu_abk_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ABKHAZIA");
		values.put(Database.LANG[4], "ABCASIA");
		values.put(Database.LANG[5], "ABCASIA");
		values.put(Database.LANG[6], "ABCASIA");
		values.put(Database.LANG[7], "ABCASIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ALBANIA
		values.put(Database.LANG[1], "eu_alb_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ALBANIA");
		values.put(Database.LANG[4], "ALBANIA");
		values.put(Database.LANG[5], "ALBANIA");
		values.put(Database.LANG[6], "ALBANIE");
		values.put(Database.LANG[7], "ALBÂNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ANDORRA
		values.put(Database.LANG[1], "eu_and_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ANDORRA");
		values.put(Database.LANG[4], "ANDORRA");
		values.put(Database.LANG[5], "ANDORRA");
		values.put(Database.LANG[6], "ANDORRE");
		values.put(Database.LANG[7], "ANDORRA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ARMENIA
		values.put(Database.LANG[1], "eu_arm_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ARMENIA");
		values.put(Database.LANG[4], "ARMENIA");
		values.put(Database.LANG[5], "ARMENIA");
		values.put(Database.LANG[6], "ARMÉNIE");
		values.put(Database.LANG[7], "ARMÊNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// AUSTRIA(BURGENLAND)
		values.put(Database.LANG[1], "eu_aus_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AUSTRIA(BURGENLAND)");
		values.put(Database.LANG[4], "AUSTRIA(BURGENLAND)");
		values.put(Database.LANG[5], "AUSTRIA(BURGENLAND)");
		values.put(Database.LANG[6], "AUTRICHE(BURGENLAND)");
		values.put(Database.LANG[7], "ÁUSTRIA(BURGENLAND)");		
		db.insert(Database.TABLES[2], null, values);
		
		// AUSTRIA(CARINTHIA)
		values.put(Database.LANG[1], "eu_aus_002");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AUSTRIA(CARINTHIA)");
		values.put(Database.LANG[4], "AUSTRIA(CARINZIA)");
		values.put(Database.LANG[5], "AUSTRIA(CARINTIA)");
		values.put(Database.LANG[6], "AUTRICHE(CARINTHIE)");
		values.put(Database.LANG[7], "ÁUSTRIA(CARÍNTIA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// AUSTRIA(LOWER AUSTRIA)
		values.put(Database.LANG[1], "eu_aus_003");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AUSTRIA(LOWER AUSTRIA)");
		values.put(Database.LANG[4], "AUSTRIA(AUSTRIA BASSA)");
		values.put(Database.LANG[5], "AUSTRIA(BAJA AUSTRIA)");
		values.put(Database.LANG[6], "AUTRICHE(BASSE-AUTRICHE)");
		values.put(Database.LANG[7], "ÁUSTRIA(ÁUSTRIA BAIXA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// AUSTRIA(POLIZEI)
		values.put(Database.LANG[1], "eu_aus_004");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AUSTRIA(POLIZEI)");
		values.put(Database.LANG[4], "AUSTRIA(POLIZIA)");
		values.put(Database.LANG[5], "AUSTRIA(POLICÍA)");
		values.put(Database.LANG[6], "AUTRICHE(POLICE)");
		values.put(Database.LANG[7], "ÁUSTRIA(POLÍCIA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// AUSTRIA(SALZBURG)
		values.put(Database.LANG[1], "eu_aus_005");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AUSTRIA(SALZBURG)");
		values.put(Database.LANG[4], "AUSTRIA(SALISBURGO)");
		values.put(Database.LANG[5], "AUSTRIA(SALZBURGO)");
		values.put(Database.LANG[6], "AUTRICHE(SALZBURG)");
		values.put(Database.LANG[7], "ÁUSTRIA(SALZBURG)");		
		db.insert(Database.TABLES[2], null, values);
		
		// AUSTRIA(STYRIA)
		values.put(Database.LANG[1], "eu_aus_006");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AUSTRIA(STYRIA)");
		values.put(Database.LANG[4], "AUSTRIA(STYRIA)");
		values.put(Database.LANG[5], "AUSTRIA(ESTIRIA)");
		values.put(Database.LANG[6], "AUTRICHE(STYRIA)");
		values.put(Database.LANG[7], "ÁUSTRIA(STYRIA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// AUSTRIA(TYROL)
		values.put(Database.LANG[1], "eu_aus_007");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AUSTRIA(TYROL)");
		values.put(Database.LANG[4], "AUSTRIA(TIROLO)");
		values.put(Database.LANG[5], "AUSTRIA(TIROL)");
		values.put(Database.LANG[6], "AUTRICHE(TYROL)");
		values.put(Database.LANG[7], "ÁUSTRIA(TYROL)");		
		db.insert(Database.TABLES[2], null, values);
		
		// AUSTRIA(UPPER AUSTRIA)
		values.put(Database.LANG[1], "eu_aus_008");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AUSTRIA(UPPER AUSTRIA)");
		values.put(Database.LANG[4], "AUSTRIA(AUSTRIA ALTA)");
		values.put(Database.LANG[5], "AUSTRIA(AUSTRIA ALTA)");
		values.put(Database.LANG[6], "AUTRICHE(HAUTE-AUTRICHE)");
		values.put(Database.LANG[7], "ÁUSTRIA(ÁUSTRIA ALTA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// AUSTRIA(VIENNA)
		values.put(Database.LANG[1], "eu_aus_009");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AUSTRIA(VIENNA)");
		values.put(Database.LANG[4], "AUSTRIA(VIENNA)");
		values.put(Database.LANG[5], "AUSTRIA(VIENNA)");
		values.put(Database.LANG[6], "AUTRICHE(VIENNE)");
		values.put(Database.LANG[7], "ÁUSTRIA(VORARLBERG)");		
		db.insert(Database.TABLES[2], null, values);
		
		// AZERBAIJAN
		values.put(Database.LANG[1], "eu_aze_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "AZERBAIJAN");
		values.put(Database.LANG[4], "AZERBAIGIAN");
		values.put(Database.LANG[5], "AZERBAIYÁN");
		values.put(Database.LANG[6], "AZERBAÏDJAN");
		values.put(Database.LANG[7], "AZERBAIJÃO");		
		db.insert(Database.TABLES[2], null, values);
		
		// BELGIUM
		values.put(Database.LANG[1], "eu_beg_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "BELGIUM");
		values.put(Database.LANG[4], "BELGIO");
		values.put(Database.LANG[5], "BÉLGICA");
		values.put(Database.LANG[6], "BELGIQUE");
		values.put(Database.LANG[7], "BÉLGICA");		
		db.insert(Database.TABLES[2], null, values);
		
		// BELARUS
		values.put(Database.LANG[1], "eu_bel_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "BELARUS");
		values.put(Database.LANG[4], "BIELORUSSIA");
		values.put(Database.LANG[5], "BIELORUSIA");
		values.put(Database.LANG[6], "BÉLARUS");
		values.put(Database.LANG[7], "BELARUS");		
		db.insert(Database.TABLES[2], null, values);
		
		// BOSNIA
		values.put(Database.LANG[1], "eu_bos_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "BOSNIA");
		values.put(Database.LANG[4], "BOSNIA");
		values.put(Database.LANG[5], "BOSNIA");
		values.put(Database.LANG[6], "BOSNIE");
		values.put(Database.LANG[7], "BÓSNIA");		
		db.insert(Database.TABLES[2], null, values);		
		
		// BULGARIA
		values.put(Database.LANG[1], "eu_bul_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "BULGARIA");
		values.put(Database.LANG[4], "BULGARIA");
		values.put(Database.LANG[5], "BULGARIA");
		values.put(Database.LANG[6], "BULGARIE");
		values.put(Database.LANG[7], "BULGÁRIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// CROATIA
		values.put(Database.LANG[1], "eu_cro_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "CROATIA");
		values.put(Database.LANG[4], "CROAZIA");
		values.put(Database.LANG[5], "CROACIA");
		values.put(Database.LANG[6], "CROATIE");
		values.put(Database.LANG[7], "CROÁCIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// CYPRUS
		values.put(Database.LANG[1], "eu_cyp_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "CYPRUS");
		values.put(Database.LANG[4], "CIPRO");
		values.put(Database.LANG[5], "CHIPRE");
		values.put(Database.LANG[6], "CHYPRE");
		values.put(Database.LANG[7], "CHIPRE");		
		db.insert(Database.TABLES[2], null, values);
		
		// CZECH REPUBLIC
		values.put(Database.LANG[1], "eu_cze_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "CZECH REPUBLIC");
		values.put(Database.LANG[4], "REPUBBLICA CECA");
		values.put(Database.LANG[5], "REPÚBLICA CHECA");
		values.put(Database.LANG[6], "RÉPUBLIQUE TCHÈQUE");
		values.put(Database.LANG[7], "REPÚBLICA CHECA");		
		db.insert(Database.TABLES[2], null, values);
		
		// DENMARK
		values.put(Database.LANG[1], "eu_den_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "DENMARK");
		values.put(Database.LANG[4], "DANIMARCA");
		values.put(Database.LANG[5], "DINAMARCA");
		values.put(Database.LANG[6], "DENMARK");
		values.put(Database.LANG[7], "DINAMARCA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ENGLAND
		values.put(Database.LANG[1], "eu_eng_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ENGLAND");
		values.put(Database.LANG[4], "INGHILTERRA");
		values.put(Database.LANG[5], "INGLATERRA");
		values.put(Database.LANG[6], "ANGLETERRE");
		values.put(Database.LANG[7], "INGLATERRA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ESTONIA
		values.put(Database.LANG[1], "eu_est_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ESTONIA");
		values.put(Database.LANG[4], "ESTONIA");
		values.put(Database.LANG[5], "ESTONIA");
		values.put(Database.LANG[6], "ESTONIE");
		values.put(Database.LANG[7], "ESTÔNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// FINLAND
		values.put(Database.LANG[1], "eu_fin_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FINLAND");
		values.put(Database.LANG[4], "FINLANDIA");
		values.put(Database.LANG[5], "FINLANDIA");
		values.put(Database.LANG[6], "FINLANDE");
		values.put(Database.LANG[7], "FINLÂNDIA");		
		db.insert(Database.TABLES[2], null, values);
				
		// FRANCE (ALSACE)
		values.put(Database.LANG[1], "eu_fra_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (ALSACE)");
		values.put(Database.LANG[4], "FRANCIA (ALSAZIA)");
		values.put(Database.LANG[5], "FRANCIA (ALSACIA)");
		values.put(Database.LANG[6], "FRANCE (ALSACE)");
		values.put(Database.LANG[7], "FRANÇA (ALSÁCIA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (AQUITAINE)
		values.put(Database.LANG[1], "eu_fra_002");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (AQUITAINE)");
		values.put(Database.LANG[4], "FRANCIA (AQUITANIA)");
		values.put(Database.LANG[5], "FRANCIA (AQUITANIA)");
		values.put(Database.LANG[6], "FRANCE (AQUITAINE)");
		values.put(Database.LANG[7], "FRANÇA (AQUITÂNIA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (AUVERGNE)
		values.put(Database.LANG[1], "eu_fra_003");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (AUVERGNE)");
		values.put(Database.LANG[4], "FRANCIA (AUVERGNE)");
		values.put(Database.LANG[5], "FRANCIA (AUVERNIA)");
		values.put(Database.LANG[6], "FRANCE (AUVERGNE)");
		values.put(Database.LANG[7], "FRANÇA (AUVERGNE)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (BASSE-NORMANDIE)
		values.put(Database.LANG[1], "eu_fra_004");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (BASSE-NORMANDIE)");
		values.put(Database.LANG[4], "FRANCIA (BASSA-NORMANDIA)");
		values.put(Database.LANG[5], "FRANCIA (BAJA NORMANDIA)");
		values.put(Database.LANG[6], "FRANCE (BASSE-NORMANDIE)");
		values.put(Database.LANG[7], "FRANÇA (BAIXA-NORMANDIA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (BOURGOGNE)
		values.put(Database.LANG[1], "eu_fra_005");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (BOURGOGNE)");
		values.put(Database.LANG[4], "FRANCIA (BORGOGNA)");
		values.put(Database.LANG[5], "FRANCIA (BORGOÑA)");
		values.put(Database.LANG[6], "FRANCE (BOURGOGNE)");
		values.put(Database.LANG[7], "FRANÇA (BURGUNDY)");		
		db.insert(Database.TABLES[2], null, values);

		// FRANCE (BRETAGNE)
		values.put(Database.LANG[1], "eu_fra_006");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (BRETAGNE)");
		values.put(Database.LANG[4], "FRANCIA (BRETAGNA)");
		values.put(Database.LANG[5], "FRANCIA (BRETAÑA)");
		values.put(Database.LANG[6], "FRANCE (BRETAGNE)");
		values.put(Database.LANG[7], "FRANÇA (BRETANHA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (CENTRE)
		values.put(Database.LANG[1], "eu_fra_007");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (CENTRE)");
		values.put(Database.LANG[4], "FRANCIA (CENTRO)");
		values.put(Database.LANG[5], "FRANCIA (CENTRE)");
		values.put(Database.LANG[6], "FRANCE (CENTRE)");
		values.put(Database.LANG[7], "FRANÇA (CENTRO)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (CHAMPAGNE-ARDENNE)
		values.put(Database.LANG[1], "eu_fra_008");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (CHAMPAGNE-ARDENNE)");
		values.put(Database.LANG[4], "FRANCIA (CHAMPAGNE-ARDENNE)");
		values.put(Database.LANG[5], "FRANCIA (CHAMPAGNE-ARDENNE)");
		values.put(Database.LANG[6], "FRANCE (CHAMPAGNE-ARDENNE)");
		values.put(Database.LANG[7], "FRANÇA (CHAMPAGNE-ARDENNE)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (CORSE/CORSICA)
		values.put(Database.LANG[1], "eu_fra_009");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (CORSE/CORSICA)");
		values.put(Database.LANG[4], "FRANCIA (CORSICA)");
		values.put(Database.LANG[5], "FRANCIA (CÓRCEGA)");
		values.put(Database.LANG[6], "FRANCE (CORSE)");
		values.put(Database.LANG[7], "FRANÇA (CÓRSEGA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (FRANCHE-COMTE)
		values.put(Database.LANG[1], "eu_fra_010");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (FRANCHE-COMTE)");
		values.put(Database.LANG[4], "FRANCIA (FRANCHE-COMTE)");
		values.put(Database.LANG[5], "FRANCIA (FRANCHE-COMTE)");
		values.put(Database.LANG[6], "FRANCE (FRANCHE-COMTE)");
		values.put(Database.LANG[7], "FRANÇA (FRANCHE-COMTE)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (GUADELOUPE)
		values.put(Database.LANG[1], "eu_fra_011");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (GUADELOUPE)");
		values.put(Database.LANG[4], "FRANCIA (GUADALUPE)");
		values.put(Database.LANG[5], "FRANCIA (GUADALUPE)");
		values.put(Database.LANG[6], "FRANCE (GUADELOUPE)");
		values.put(Database.LANG[7], "FRANÇA (GUADALUPE)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (GUYANE/FRENCH GUIANA)
		values.put(Database.LANG[1], "eu_fra_012");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (GUYANE/FRENCH GUIANA)");
		values.put(Database.LANG[4], "FRANCIA (GUYANA FRANCESE)");
		values.put(Database.LANG[5], "FRANCIA (GUAYANA FRANCESA)");
		values.put(Database.LANG[6], "FRANCE (FRENCH GUIANA)");
		values.put(Database.LANG[7], "FRANÇA (GUIANA FRANCESA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (HAUTE-NORMANDIE)
		values.put(Database.LANG[1], "eu_fra_013");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (HAUTE-NORMANDIE)");
		values.put(Database.LANG[4], "FRANCIA (ALTA NORMANDIA)");
		values.put(Database.LANG[5], "FRANCIA (ALTA NORMANDIA)");
		values.put(Database.LANG[6], "FRANCE (HAUTE-NORMANDIE)");
		values.put(Database.LANG[7], "FRANÇA (ALTA NORMANDIA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (LANGUEDOC-ROUSSILLON)
		values.put(Database.LANG[1], "eu_fra_014");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (LANGUEDOC-ROUSSILLON)");
		values.put(Database.LANG[4], "FRANCIA (LANGUEDOC-ROUSSILLON)");
		values.put(Database.LANG[5], "FRANCIA (LANGUEDOC-ROUSSILLON)");
		values.put(Database.LANG[6], "FRANCE (LANGUEDOC-ROUSSILLON)");
		values.put(Database.LANG[7], "FRANÇA (LANGUEDOC-ROUSSILLON)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (LIMOUSIN)
		values.put(Database.LANG[1], "eu_fra_015");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (LIMOUSIN)");
		values.put(Database.LANG[4], "FRANCIA (LIMOUSIN)");
		values.put(Database.LANG[5], "FRANCIA (LIMOUSIN)");
		values.put(Database.LANG[6], "FRANCE (LIMOUSIN)");
		values.put(Database.LANG[7], "FRANÇA (LIMOUSIN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (LORRAINE)
		values.put(Database.LANG[1], "eu_fra_016");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (LORRAINE)");
		values.put(Database.LANG[4], "FRANCIA (LORENA)");
		values.put(Database.LANG[5], "FRANCIA (LORRAINE)");
		values.put(Database.LANG[6], "FRANCE (LORRAINE)");
		values.put(Database.LANG[7], "FRANÇA (LORENA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (MARTINIQUE)
		values.put(Database.LANG[1], "eu_fra_017");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (MARTINIQUE)");
		values.put(Database.LANG[4], "FRANCIA (MARTINICA)");
		values.put(Database.LANG[5], "FRANCIA (MARTINICA)");
		values.put(Database.LANG[6], "FRANCE (MARTINIQUE)");
		values.put(Database.LANG[7], "FRANÇA (MARTINICA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (MIDI-PYRENEES)
		values.put(Database.LANG[1], "eu_fra_018");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (MIDI-PYRENEES)");
		values.put(Database.LANG[4], "FRANCIA (PIRENEI)");
		values.put(Database.LANG[5], "FRANCIA (PIRINEOS)");
		values.put(Database.LANG[6], "FRANCE (MIDI-PYRÉNÉES)");
		values.put(Database.LANG[7], "FRANÇA (PIRINEUS)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (NORD-PAS-DE-CALAIS)
		values.put(Database.LANG[1], "eu_fra_019");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (NORD-PAS-DE-CALAIS)");
		values.put(Database.LANG[4], "FRANCIA (NORD-PAS-DE-CALAIS)");
		values.put(Database.LANG[5], "FRANCIA (NORD-PAS-DE-CALAIS)");
		values.put(Database.LANG[6], "FRANCE (NORD-PAS-DE-CALAIS)");
		values.put(Database.LANG[7], "FRANÇA (NORD-PAS-DE-CALAIS)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (PARIS/ILE DE FRANCE)
		values.put(Database.LANG[1], "eu_fra_020");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (PARIS/ILE DE FRANCE)");
		values.put(Database.LANG[4], "FRANCIA (PARIGI/FRANCIA ISOLA)");
		values.put(Database.LANG[5], "FRANCIA (PARÍS/FRANCIA ISLA)");
		values.put(Database.LANG[6], "FRANCE (PARIS/ÎLE DE FRANCE)");
		values.put(Database.LANG[7], "FRANÇA (PARIS/FRANÇA ISLAND)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (PAYS-DE-LA-LOIRE)
		values.put(Database.LANG[1], "eu_fra_021");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (PAYS-DE-LA-LOIRE)");
		values.put(Database.LANG[4], "FRANCIA (PAESE DELLA LOIRA)");
		values.put(Database.LANG[5], "FRANCIA (TIERRA DEL LOIRA)");
		values.put(Database.LANG[6], "FRANCE (PAYS-DE-LA-LOIRE)");
		values.put(Database.LANG[7], "FRANÇA (TERRA DO LOIRE)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (PICARDIE)
		values.put(Database.LANG[1], "eu_fra_022");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (PICARDIE)");
		values.put(Database.LANG[4], "FRANCIA (PICCARDIA)");
		values.put(Database.LANG[5], "FRANCIA (PICARDÍA)");
		values.put(Database.LANG[6], "FRANCE (PICARDIE)");
		values.put(Database.LANG[7], "FRANÇA (PICARDIA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (POITOU-CHARENTES)
		values.put(Database.LANG[1], "eu_fra_023");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (POITOU-CHARENTES)");
		values.put(Database.LANG[4], "FRANCIA (POITOU-CHARENTES)");
		values.put(Database.LANG[5], "FRANCIA (POITOU-CHARENTES)");
		values.put(Database.LANG[6], "FRANCE (POITOU-CHARENTES)");
		values.put(Database.LANG[7], "FRANÇA (POITOU-CHARENTES)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (PROVENCE-ALPES-COTE-D AZUR)
		values.put(Database.LANG[1], "eu_fra_024");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (PROVENCE-ALPES-COTE-D AZUR)");
		values.put(Database.LANG[4], "FRANCIA (PROVENZA-ALPI-COSTA AZZURRA)");
		values.put(Database.LANG[5], "FRANCIA (PROVENCE-ALPES-COTE-D AZUR)");
		values.put(Database.LANG[6], "FRANCE (PROVENCE-ALPES-CÔTÉ-D AZUR)");
		values.put(Database.LANG[7], "FRANÇA (PROVENCE-ALPES-CÔTE-D AZUR)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (REUNION)
		values.put(Database.LANG[1], "eu_fra_025");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (REUNION)");
		values.put(Database.LANG[4], "FRANCIA (RIUNIONE)");
		values.put(Database.LANG[5], "FRANCIA (REUNIÓN)");
		values.put(Database.LANG[6], "FRANCE (REUNION)");
		values.put(Database.LANG[7], "FRANÇA (REUNIÃO)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (RHONE-ALPES)
		values.put(Database.LANG[1], "eu_fra_026");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (RHONE-ALPES)");
		values.put(Database.LANG[4], "FRANCIA (RHONE-ALPES)");
		values.put(Database.LANG[5], "FRANCIA (RÓDANO-ALPES)");
		values.put(Database.LANG[6], "FRANCE (RHONE-ALPES)");
		values.put(Database.LANG[7], "FRANÇA (RHÔNE-ALPES)");		
		db.insert(Database.TABLES[2], null, values);
		
		// FRANCE (SAINT-MARTIN)
		values.put(Database.LANG[1], "eu_fra_027");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FRANCE (SAINT-MARTIN)");
		values.put(Database.LANG[4], "FRANCIA (SAINT-MARTIN)");
		values.put(Database.LANG[5], "FRANCIA (SAINT-MARTIN)");
		values.put(Database.LANG[6], "FRANCE (SAINT-MARTIN)");
		values.put(Database.LANG[7], "FRANÇA (SAINT-MARTIN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// BRITAIN/UK
		values.put(Database.LANG[1], "eu_gbt_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "BRITAIN/UK");
		values.put(Database.LANG[4], "GRAN BRETAGNA");
		values.put(Database.LANG[5], "GRAN BRETAÑA");
		values.put(Database.LANG[6], "GRANDE BRETAGNE");
		values.put(Database.LANG[7], "GRÃ-BRETANHA");		
		db.insert(Database.TABLES[2], null, values);
		
		// GEORGIA
		values.put(Database.LANG[1], "eu_geo_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GEORGIA");
		values.put(Database.LANG[4], "GEORGIA");
		values.put(Database.LANG[5], "GEORGIA");
		values.put(Database.LANG[6], "GÉORGIE");
		values.put(Database.LANG[7], "GEÓRGIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(WOLFSBURG)
		values.put(Database.LANG[1], "eu_ger_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(WOLFSBURG)");
		values.put(Database.LANG[4], "GERMANIA(WOLFSBURG)");
		values.put(Database.LANG[5], "ALEMANIA(WOLFSBURG)");
		values.put(Database.LANG[6], "ALEMAGNE(WOLFSBURG)");
		values.put(Database.LANG[7], "ALEMANHA(WOLFSBURG)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(MUNICH)
		values.put(Database.LANG[1], "eu_ger_002");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(MUNICH)");
		values.put(Database.LANG[4], "GERMANIA(MONACO)");
		values.put(Database.LANG[5], "ALEMANIA(MUNICH)");
		values.put(Database.LANG[6], "ALEMAGNE(MUNICH)");
		values.put(Database.LANG[7], "ALEMANHA(MUNIQUE)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(STUTTGART)
		values.put(Database.LANG[1], "eu_ger_003");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(STUTTGART)");
		values.put(Database.LANG[4], "GERMANIA(STOCCARDA)");
		values.put(Database.LANG[5], "ALEMANIA(STUTTGART)");
		values.put(Database.LANG[6], "ALEMAGNE(STUTTGART)");
		values.put(Database.LANG[7], "ALEMANHA(ESTUGARDA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(BERLIN)
		values.put(Database.LANG[1], "eu_ger_004");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(BERLIN)");
		values.put(Database.LANG[4], "GERMANIA(BERLINO)");
		values.put(Database.LANG[5], "ALEMANIA(BERLIN)");
		values.put(Database.LANG[6], "ALEMAGNE(BERLIN)");
		values.put(Database.LANG[7], "ALEMANHA(BERLIM)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(BRANDENBURG)
		values.put(Database.LANG[1], "eu_ger_005");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(BRANDENBURG)");
		values.put(Database.LANG[4], "GERMANIA(BRANDENBURGO)");
		values.put(Database.LANG[5], "ALEMANIA(BRANDENBURGO)");
		values.put(Database.LANG[6], "ALEMAGNE(BRANDENBURG)");
		values.put(Database.LANG[7], "GERMAN(BRANDENBURG)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(BREMEN)
		values.put(Database.LANG[1], "eu_ger_006");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(BREMEN)");
		values.put(Database.LANG[4], "GERMANIA(BREMA)");
		values.put(Database.LANG[5], "ALEMANIA(BREMEN)");
		values.put(Database.LANG[6], "ALEMAGNE(BRÊME)");
		values.put(Database.LANG[7], "ALEMANHA(BREMA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(HAMBURG)
		values.put(Database.LANG[1], "eu_ger_007");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(HAMBURG)");
		values.put(Database.LANG[4], "GERMANIA(AMBURGO)");
		values.put(Database.LANG[5], "ALEMANIA(HAMBURGO)");
		values.put(Database.LANG[6], "ALEMAGNE(HAMBURG)");
		values.put(Database.LANG[7], "ALEMANHA(HAMBURGO)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(HESSEN/WIESBADEN)
		values.put(Database.LANG[1], "eu_ger_008");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(HESSEN/WIESBADEN)");
		values.put(Database.LANG[4], "GERMANIA(HESSEN/WIESBADEN)");
		values.put(Database.LANG[5], "ALEMANIA(HESSEN/WIESBADEN)");
		values.put(Database.LANG[6], "ALEMAGNE(HESSEN/WIESBADEN)");
		values.put(Database.LANG[7], "ALEMANHA(HESSEN/WIESBADEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(MECKLENBURG-VORPOMMERN)
		values.put(Database.LANG[1], "eu_ger_009");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(MECKLENBURG-VORPOMMERN)");
		values.put(Database.LANG[4], "GERMANIA(MECKLENBURG-VORPOMMERN)");
		values.put(Database.LANG[5], "ALEMANIA(MECKLENBURG-VORPOMMERN)");
		values.put(Database.LANG[6], "ALEMAGNE(MECKLENBURG-VORPOMMERN)");
		values.put(Database.LANG[7], "ALEMANHA(MECKLENBURG-VORPOMMERN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY NORDRHEIN-WESTFALEN(DÜSSELDORF)
		values.put(Database.LANG[1], "eu_ger_010");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY NORDRHEIN-WESTFALEN(DÜSSELDORF)");
		values.put(Database.LANG[4], "GERMANIA NORDRHEIN-WESTFALEN(DÜSSELDORF)");
		values.put(Database.LANG[5], "ALEMANIA NORDRHEIN-WESTFALEN(DUSSELDORF)");
		values.put(Database.LANG[6], "ALEMAGNE NORDRHEIN-WESTFALEN(DUSSELDORF)");
		values.put(Database.LANG[7], "ALEMANHA NORDRHEIN-WESTFALEN(DUSSELDORF");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(RHEINLAND/PFALZ/MAINZ)
		values.put(Database.LANG[1], "eu_ger_011");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(RHEINLAND/PFALZ/MAINZ)");
		values.put(Database.LANG[4], "GERMANIA(RHEINLAND/PFALZ/MAINZ)");
		values.put(Database.LANG[5], "ALEMANIA(RHEINLAND/PFALZ/MAINZ)");
		values.put(Database.LANG[6], "ALEMAGNE(RHEINLAND/PFALZ/MAINZ)");
		values.put(Database.LANG[7], "ALEMANHA(RHEINLAND/PFALZ/MAINZ)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(SAARLAND/SAARBRÜCKEN)
		values.put(Database.LANG[1], "eu_ger_012");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(SAARLAND/SAARBRÜCKEN)");
		values.put(Database.LANG[4], "GERMANIA(SAARLAND/SAARBRÜCKEN)");
		values.put(Database.LANG[5], "ALEMANIA(SAARLAND/SAARBRUCKEN)");
		values.put(Database.LANG[6], "ALEMAGNE(SAARLAND/SAARBRUCKEN)");
		values.put(Database.LANG[7], "ALEMANHA(SAARLAND/SAARBRUCKEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(SACHSEN)
		values.put(Database.LANG[1], "eu_ger_013");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(SACHSEN)");
		values.put(Database.LANG[4], "GERMANIA(SACHSEN)");
		values.put(Database.LANG[5], "ALEMANIA(SACHSEN)");
		values.put(Database.LANG[6], "ALEMAGNE(SACHSEN)");
		values.put(Database.LANG[7], "ALEMANHA(SACHSEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(SACHSEN-ANHALT)
		values.put(Database.LANG[1], "eu_ger_014");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(SACHSEN-ANHALT)");
		values.put(Database.LANG[4], "GERMANIA(SACHSEN-ANHALT)");
		values.put(Database.LANG[5], "ALEMANIA(SACHSEN-ANHALT)");
		values.put(Database.LANG[6], "ALEMAGNE(SACHSEN-ANHALT)");
		values.put(Database.LANG[7], "ALEMANHA(SACHSEN-ANHALT)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(SCHLESWIG-HOLSTEIN)
		values.put(Database.LANG[1], "eu_ger_015");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(SCHLESWIG-HOLSTEIN)");
		values.put(Database.LANG[4], "GERMANIA(SCHLESWIG-HOLSTEIN)");
		values.put(Database.LANG[5], "ALEMANIA(SCHLESWIG-HOLSTEIN)");
		values.put(Database.LANG[6], "ALEMAGNE(SCHLESWIG-HOLSTEIN)");
		values.put(Database.LANG[7], "ALEMANHA(SCHLESWIG-HOLSTEIN)");		
		db.insert(Database.TABLES[2], null, values);

		// GERMANY(THÜRINGEN)
		values.put(Database.LANG[1], "eu_ger_016");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(THÜRINGEN)");
		values.put(Database.LANG[4], "GERMANIA(THÜRINGEN)");
		values.put(Database.LANG[5], "ALEMANIA(THURINGEN)");
		values.put(Database.LANG[6], "ALEMAGNE(THURINGEN)");
		values.put(Database.LANG[7], "ALEMANHA(THURINGEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GERMANY(INGOLSTADT)
		values.put(Database.LANG[1], "'eu_ger_017");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GERMANY(INGOLSTADT)");
		values.put(Database.LANG[4], "GERMANIA(INGOLSTADT)");
		values.put(Database.LANG[5], "ALEMANIA(INGOLSTADT)");
		values.put(Database.LANG[6], "ALEMAGNE(INGOLSTADT)");
		values.put(Database.LANG[7], "ALEMANHA(INGOLSTADT)");		
		db.insert(Database.TABLES[2], null, values);
		
		// GREECE
		values.put(Database.LANG[1], "eu_gre_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GREECE");
		values.put(Database.LANG[4], "GRECIA");
		values.put(Database.LANG[5], "GRECIA");
		values.put(Database.LANG[6], "GRÈCE");
		values.put(Database.LANG[7], "GRÉCIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// HUNGARY
		values.put(Database.LANG[1], "eu_hun_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "HUNGARY");
		values.put(Database.LANG[4], "UNGHERIA");
		values.put(Database.LANG[5], "HUNGRÍA");
		values.put(Database.LANG[6], "HONGRIE");
		values.put(Database.LANG[7], "HUNGRIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// IRELAND
		values.put(Database.LANG[1], "eu_irl_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "IRELAND");
		values.put(Database.LANG[4], "IRLANDA");
		values.put(Database.LANG[5], "IRLANDA");
		values.put(Database.LANG[6], "IRLANDE");
		values.put(Database.LANG[7], "IRLANDA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ICELAND
		values.put(Database.LANG[1], "eu_isl_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ICELAND");
		values.put(Database.LANG[4], "ISLANDA");
		values.put(Database.LANG[5], "ISLANDIA");
		values.put(Database.LANG[6], "ISLANDE");
		values.put(Database.LANG[7], "ISLÂNDIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ISLE OF MAN
		values.put(Database.LANG[1], "eu_ism_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ISLE OF MAN");
		values.put(Database.LANG[4], "ISOLA DI MAN");
		values.put(Database.LANG[5], "ISLA DE MAN");
		values.put(Database.LANG[6], "ÎLE DE MAN");
		values.put(Database.LANG[7], "ILHA DE MAN");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF BOLOGNA
		values.put(Database.LANG[1], "eu_ita_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF BOLOGNA");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI BOLOGNA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE BOLOGNA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE BOLOGNA");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE BOLOGNA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF CAGLIARI
		values.put(Database.LANG[1], "eu_ita_002");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF CAGLIARI");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI CAGLIARI");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE CAGLIARI");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE CAGLIARI");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE CAGLIARI");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF CHIETI
		values.put(Database.LANG[1], "eu_ita_003");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF CHIETI");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI CHIETI");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE CHIETI");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE CHIETI");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE CHIETI");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF FLORENCE
		values.put(Database.LANG[1], "eu_ita_004");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF FLORENCE");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI FIRENZE");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE FLORENCIA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE FLORENCE");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE FLORENÇA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF GENOA
		values.put(Database.LANG[1], "eu_ita_005");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF GENOA");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI GENOVA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE GENOVA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE GENOA");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE GÊNOVA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF LATINA
		values.put(Database.LANG[1], "eu_ita_006");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF LATINA");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI LATINA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE LATINA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE LATINA");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE LATINA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF MESSINA
		values.put(Database.LANG[1], "eu_ita_007");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF MESSINA");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI MESSINA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE MESSINA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE MESSINA");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE MESSINA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF MILAN
		values.put(Database.LANG[1], "eu_ita_008");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF MILAN");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI MILANO");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE MILAN");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE MILAN");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE MILAN");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF MODENA
		values.put(Database.LANG[1], "eu_ita_009");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF MODENA");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI MODENA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE MODENA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE MODENA");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE MODENA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF NAPLES
		values.put(Database.LANG[1], "eu_ita_010");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF NAPLES");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI NAPOLI");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE NÁPOLES");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE NAPLES");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE NÁPOLES");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF PALERMO
		values.put(Database.LANG[1], "eu_ita_011");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF PALERMO");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI PALERMO");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE PALERMO");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE PALERMO");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE PALERMO");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF PISA
		values.put(Database.LANG[1], "eu_ita_012");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF PISA");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI PISA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE PISA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE PISA");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE PISA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF POTENZA
		values.put(Database.LANG[1], "eu_ita_013");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF POTENZA");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI POTENZA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE POTENZA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE POTENZA");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE POTENZA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF ROME
		values.put(Database.LANG[1], "eu_ita_014");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF ROME");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI ROMA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE ROMA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE ROME");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE ROMA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF SALERNO
		values.put(Database.LANG[1], "eu_ita_015");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF SALERNO");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI SALERNO");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE SALERNO");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE SALERNO");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE SALERNO");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF TORINO
		values.put(Database.LANG[1], "eu_ita_016");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF TORINO");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI TORINO");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE TORINO");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE TORINO");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE TORINO");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF VENICE
		values.put(Database.LANG[1], "eu_ita_017");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF VENICE");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI VENEZIA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE VENECIA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE VENISE");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE VENEZA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ITALY - PROVINCE OF VERONA
		values.put(Database.LANG[1], "eu_ita_018");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ITALY - PROVINCE OF VERONA");
		values.put(Database.LANG[4], "ITALIA - PROVINCIA DI VERONA");
		values.put(Database.LANG[5], "ITALIA - LA PROVINCIA DE VERONA");
		values.put(Database.LANG[6], "ITALIE - LA PROVINCE DE VERONA");
		values.put(Database.LANG[7], "ITALIA - PROVÍNCIA DE VERONA");		
		db.insert(Database.TABLES[2], null, values);
		
		// REPUBLIC OF KOSOVO
		values.put(Database.LANG[1], "eu_kos_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "REPUBLIC OF KOSOVO");
		values.put(Database.LANG[4], "REPUBBLICA DEL KOSSOVO");
		values.put(Database.LANG[5], "REPÚBLICA DE KOSOVO");
		values.put(Database.LANG[6], "RÉPUBLIC DU KOSOVO");
		values.put(Database.LANG[7], "REPÚBLICA DO KOSOVO");		
		db.insert(Database.TABLES[2], null, values);
		
		// LATVIA
		values.put(Database.LANG[1], "eu_lat_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "LATVIA");
		values.put(Database.LANG[4], "LETTONIA");
		values.put(Database.LANG[5], "LETONIA");
		values.put(Database.LANG[6], "LETTONIE");
		values.put(Database.LANG[7], "LETÔNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// LIECHTENSTEIN
		values.put(Database.LANG[1], "eu_lie_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "LIECHTENSTEIN");
		values.put(Database.LANG[4], "LIECHTENSTEIN");
		values.put(Database.LANG[5], "LIECHTENSTEIN");
		values.put(Database.LANG[6], "LIECHTENSTEIN");
		values.put(Database.LANG[7], "LIECHTENSTEIN");		
		db.insert(Database.TABLES[2], null, values);
		
		// LITHUANIA
		values.put(Database.LANG[1], "eu_lit_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "LITHUANIA");
		values.put(Database.LANG[4], "LITUANIA");
		values.put(Database.LANG[5], "LITUANIA");
		values.put(Database.LANG[6], "LITUANIE");
		values.put(Database.LANG[7], "LITUÂNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// LUXEMBOURG
		values.put(Database.LANG[1], "eu_lux_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "LUXEMBOURG");
		values.put(Database.LANG[4], "LUSSEMBURGO");
		values.put(Database.LANG[5], "LUXEMBURGO");
		values.put(Database.LANG[6], "LUXEMBOURG");
		values.put(Database.LANG[7], "LUXEMBURGO");		
		db.insert(Database.TABLES[2], null, values);
		
		// MACEDONIA
		values.put(Database.LANG[1], "eu_mac_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MACEDONIA");
		values.put(Database.LANG[4], "MACEDONIA");
		values.put(Database.LANG[5], "MACEDONIA");
		values.put(Database.LANG[6], "MACÉDOINE");
		values.put(Database.LANG[7], "MACEDÔNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// MALTA
		values.put(Database.LANG[1], "eu_mal_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MALTA");
		values.put(Database.LANG[4], "MALTA");
		values.put(Database.LANG[5], "MALTA");
		values.put(Database.LANG[6], "MALTE");
		values.put(Database.LANG[7], "MALTA");		
		db.insert(Database.TABLES[2], null, values);
		
		// MOLDOVA
		values.put(Database.LANG[1], "eu_mol_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MOLDOVA");
		values.put(Database.LANG[4], "MOLDAVIA");
		values.put(Database.LANG[5], "MOLDOVIA");
		values.put(Database.LANG[6], "MOLDOVIE");
		values.put(Database.LANG[7], "MOLDÁVIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// MONACO
		values.put(Database.LANG[1], "eu_mon_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MONACO");
		values.put(Database.LANG[4], "MONACO");
		values.put(Database.LANG[5], "MONACO");
		values.put(Database.LANG[6], "MONACO");
		values.put(Database.LANG[7], "MONACO");		
		db.insert(Database.TABLES[2], null, values);
		
		// MONTENEGRO
		values.put(Database.LANG[1], "eu_mne_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MONTENEGRO");
		values.put(Database.LANG[4], "MONTENEGRO");
		values.put(Database.LANG[5], "MONTENEGRO");
		values.put(Database.LANG[6], "MONTENEGRO");
		values.put(Database.LANG[7], "MONTENEGRO");		
		db.insert(Database.TABLES[2], null, values);
		
		// NETHERLANDS
		values.put(Database.LANG[1], "eu_net_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NETHERLANDS");
		values.put(Database.LANG[4], "PAESI BASSI");
		values.put(Database.LANG[5], "PAÍSES BAJOS");
		values.put(Database.LANG[6], "PAYS-BAS");
		values.put(Database.LANG[7], "PAÍSES BAIXOS");		
		db.insert(Database.TABLES[2], null, values);
		
		// NORWAY
		values.put(Database.LANG[1], "eu_nor_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NORWAY");
		values.put(Database.LANG[4], "NORVEGIA");
		values.put(Database.LANG[5], "NORUEGA");
		values.put(Database.LANG[6], "NORVÈGE");
		values.put(Database.LANG[7], "NORUEGA");		
		db.insert(Database.TABLES[2], null, values);
		
		// POLAND
		values.put(Database.LANG[1], "eu_pol_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "POLAND");
		values.put(Database.LANG[4], "POLONIA");
		values.put(Database.LANG[5], "POLONIA");
		values.put(Database.LANG[6], "POLOGNE");
		values.put(Database.LANG[7], "POLÓNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// PORTUGAL
		values.put(Database.LANG[1], "eu_por_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "PORTUGAL");
		values.put(Database.LANG[4], "PORTOGALLO");
		values.put(Database.LANG[5], "PORTUGAL");
		values.put(Database.LANG[6], "PORTUGAL");
		values.put(Database.LANG[7], "PORTUGAL");		
		db.insert(Database.TABLES[2], null, values);
		
		// ROMANIA
		values.put(Database.LANG[1], "eu_rom_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ROMANIA");
		values.put(Database.LANG[4], "ROMANIA");
		values.put(Database.LANG[5], "ROUMANIE");
		values.put(Database.LANG[6], "ROMANIA");
		values.put(Database.LANG[7], "ROUMANIE");		
		db.insert(Database.TABLES[2], null, values);
		
		// RUSSIA
		values.put(Database.LANG[1], "eu_rus_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "RUSSIA");
		values.put(Database.LANG[4], "RUSSIA");
		values.put(Database.LANG[5], "RUSIA");
		values.put(Database.LANG[6], "RUSSIE");
		values.put(Database.LANG[7], "RUSSIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// SAN MARINO
		values.put(Database.LANG[1], "eu_rsm_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SAN MARINO");
		values.put(Database.LANG[4], "SAN MARINO");
		values.put(Database.LANG[5], "SAN MARINO");
		values.put(Database.LANG[6], "SAN MARINO");
		values.put(Database.LANG[7], "SAN MARINO");		
		db.insert(Database.TABLES[2], null, values);
		
		// SCOTLAND
		values.put(Database.LANG[1], "eu_sco_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SCOTLAND");
		values.put(Database.LANG[4], "SCOZIA");
		values.put(Database.LANG[5], "ESCOCIA");
		values.put(Database.LANG[6], "ECOSSE");
		values.put(Database.LANG[7], "ESCÓCIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// SLOVAKIA
		values.put(Database.LANG[1], "eu_slo_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SLOVAKIA");
		values.put(Database.LANG[4], "SLOVACCHIA");
		values.put(Database.LANG[5], "ESLOVAQUIA");
		values.put(Database.LANG[6], "SLOVAQUIE");
		values.put(Database.LANG[7], "ESLOVÁQUIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// SLOVENIA
		values.put(Database.LANG[1], "eu_slv_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SLOVENIA");
		values.put(Database.LANG[4], "SLOVENIA");
		values.put(Database.LANG[5], "ESLOVENIA");
		values.put(Database.LANG[6], "SLOVÉNIE");
		values.put(Database.LANG[7], "ESLOVÉNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// SPAIN
		values.put(Database.LANG[1], "eu_spa_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SPAIN");
		values.put(Database.LANG[4], "SPAGNA");
		values.put(Database.LANG[5], "ESPAÑA");
		values.put(Database.LANG[6], "ESPAGNE");
		values.put(Database.LANG[7], "ESPANHA");		
		db.insert(Database.TABLES[2], null, values);
		
		// SERBIA
		values.put(Database.LANG[1], "eu_srb_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SERBIA");
		values.put(Database.LANG[4], "SERBIA");
		values.put(Database.LANG[5], "SERBIA");
		values.put(Database.LANG[6], "SERBIE");
		values.put(Database.LANG[7], "SÉRVIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWEDEN
		values.put(Database.LANG[1], "eu_swe_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWEDEN");
		values.put(Database.LANG[4], "SVEZIA");
		values.put(Database.LANG[5], "SUECIA");
		values.put(Database.LANG[6], "SUÈDE");
		values.put(Database.LANG[7], "SUÉCIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(AARGAU)
		values.put(Database.LANG[1], "eu_swi_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(AARGAU)");
		values.put(Database.LANG[4], "SVIZZERA(AARGAU)");
		values.put(Database.LANG[5], "SUIZA(AARGAU)");
		values.put(Database.LANG[6], "SUISSE(AARGAU)");
		values.put(Database.LANG[7], "SUÍÇA(AARGAU)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(APPENZELL AUSSERRHODEN)
		values.put(Database.LANG[1], "eu_swi_002");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(APPENZELL AUSSERRHODEN)");
		values.put(Database.LANG[4], "SVIZZERA(APPENZELL AUSSERRHODEN)");
		values.put(Database.LANG[5], "SUIZA(APPENZELL AUSSERRHODEN)");
		values.put(Database.LANG[6], "SUISSE(APPENZELL AUSSERRHODEN)");
		values.put(Database.LANG[7], "SUÍÇA(APPENZELL AUSSERRHODEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(APPENZELL INNERRHODEN)
		values.put(Database.LANG[1], "eu_swi_003");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(APPENZELL INNERRHODEN)");
		values.put(Database.LANG[4], "SVIZZERA(APPENZELL INNERRHODEN)");
		values.put(Database.LANG[5], "SUIZA(APPENZELL INNERRHODEN)");
		values.put(Database.LANG[6], "SUISSE(APPENZELL INNERRHODEN)");
		values.put(Database.LANG[7], "SUÍÇA(APPENZELL INNERRHODEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(BASEL-LANDSCHAFT)
		values.put(Database.LANG[1], "eu_swi_004");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(BASEL-LANDSCHAFT)");
		values.put(Database.LANG[4], "SVIZZERA(BASILEA-LANDSCHAFT)");
		values.put(Database.LANG[5], "SUIZA(BASILEA-LANDSCHAFT)");
		values.put(Database.LANG[6], "SUISSE(BÂLE-LANDSCHAFT)");
		values.put(Database.LANG[7], "SUÍÇA(BASEL-LANDSCHAFT)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(BASEL-STADT)
		values.put(Database.LANG[1], "eu_swi_005");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(BASEL-STADT)");
		values.put(Database.LANG[4], "SVIZZERA(BASILEA-STADT)");
		values.put(Database.LANG[5], "SUIZA(BASILEA-STADT)");
		values.put(Database.LANG[6], "SUISSE(BÂLE-STADT)");
		values.put(Database.LANG[7], "SUÍÇA(BASEL-STADT)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(BERN)
		values.put(Database.LANG[1], "eu_swi_006");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(BERN)");
		values.put(Database.LANG[4], "SVIZZERA(BERNA)");
		values.put(Database.LANG[5], "SUIZA(BERNA)");
		values.put(Database.LANG[6], "SUISSE(BERN)");
		values.put(Database.LANG[7], "SUÍÇA(BERNA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(FRIBOURG)
		values.put(Database.LANG[1], "eu_swi_007");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(FRIBOURG)");
		values.put(Database.LANG[4], "SVIZZERA(FRIBURGO)");
		values.put(Database.LANG[5], "SUIZA(FRIBURGO)");
		values.put(Database.LANG[6], "SUISSE(FRIBOURG)");
		values.put(Database.LANG[7], "SUÍÇA(FRIBURGO)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(GENEVE)
		values.put(Database.LANG[1], "eu_swi_009");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(GENEVE)");
		values.put(Database.LANG[4], "SVIZZERA(GINEVRA)");
		values.put(Database.LANG[5], "SUIZA(GINEBRA)");
		values.put(Database.LANG[6], "SUISSE(GENÈVE)");
		values.put(Database.LANG[7], "SUÍÇA(GENEBRA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(GLARUS)
		values.put(Database.LANG[1], "eu_swi_010");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(GLARUS)");
		values.put(Database.LANG[4], "SVIZZERA(GLARUS)");
		values.put(Database.LANG[5], "SUIZA(GLARIS)");
		values.put(Database.LANG[6], "SUISSE(GLARUS)");
		values.put(Database.LANG[7], "SUÍÇA(GLARUS)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(GRAUBUNDEN)
		values.put(Database.LANG[1], "eu_swi_011");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(GRAUBUNDEN)");
		values.put(Database.LANG[4], "SVIZZERA(GRIGIONI)");
		values.put(Database.LANG[5], "SUIZA(GRISONS)");
		values.put(Database.LANG[6], "SUISSE(GRISONS)");
		values.put(Database.LANG[7], "SUÍÇA(GRISONS)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(JURA)
		values.put(Database.LANG[1], "eu_swi_012");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(JURA)");
		values.put(Database.LANG[4], "SVIZZERA(JURA)");
		values.put(Database.LANG[5], "SUIZA(JURA)");
		values.put(Database.LANG[6], "SUISSE(JURA)");
		values.put(Database.LANG[7], "SUÍÇA(JURA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(LUCERNE)
		values.put(Database.LANG[1], "eu_swi_013");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(LUCERNE)");
		values.put(Database.LANG[4], "SVIZZERA(LUCERNA)");
		values.put(Database.LANG[5], "SUIZA(LUCERNA)");
		values.put(Database.LANG[6], "SUISSE(LUCERNE)");
		values.put(Database.LANG[7], "SUÍÇA(LUCERNA)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(NEUCHATEL)
		values.put(Database.LANG[1], "eu_swi_014");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(NEUCHATEL)");
		values.put(Database.LANG[4], "SVIZZERA(NEUCHATEL)");
		values.put(Database.LANG[5], "SUIZA(NEUCHATEL)");
		values.put(Database.LANG[6], "SUISSE(NEUCHATEL)");
		values.put(Database.LANG[7], "SUÍÇA(NEUCHATEL)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(NIDWALDEN)
		values.put(Database.LANG[1], "eu_swi_015");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(NIDWALDEN)");
		values.put(Database.LANG[4], "SVIZZERA(NIDWALDEN)");
		values.put(Database.LANG[5], "SUIZA(NIDWALDEN)");
		values.put(Database.LANG[6], "SUISSE(NIDWALDEN)");
		values.put(Database.LANG[7], "SUÍÇA(NIDWALDEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(OBWALDEN)
		values.put(Database.LANG[1], "eu_swi_016");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(OBWALDEN)");
		values.put(Database.LANG[4], "SVIZZERA(OBWALDEN)");
		values.put(Database.LANG[5], "SUIZA(OBWALDEN)");
		values.put(Database.LANG[6], "SUISSE(OBWALDEN)");
		values.put(Database.LANG[7], "SUÍÇA(OBWALDEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(SCHAFFHAUSEN)
		values.put(Database.LANG[1], "eu_swi_017");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(SCHAFFHAUSEN)");
		values.put(Database.LANG[4], "SVIZZERA(SCHAFFHAUSEN)");
		values.put(Database.LANG[5], "SUIZA(SCHAFFHAUSEN)");
		values.put(Database.LANG[6], "SUISSE(SCHAFFHAUSEN)");
		values.put(Database.LANG[7], "SUÍÇA(SCHAFFHAUSEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(SCHWYZ)
		values.put(Database.LANG[1], "eu_swi_018");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(SCHWYZ)");
		values.put(Database.LANG[4], "SVIZZERA(SCHWYZ)");
		values.put(Database.LANG[5], "SUIZA(SCHWYZ)");
		values.put(Database.LANG[6], "SUISSE(SCHWYZ)");
		values.put(Database.LANG[7], "SUÍÇA(SCHWYZ)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(SOLOTHURN)
		values.put(Database.LANG[1], "eu_swi_019");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(SOLOTHURN)");
		values.put(Database.LANG[4], "SVIZZERA(SOLOTHURN)");
		values.put(Database.LANG[5], "SUIZA(SOLEURE)");
		values.put(Database.LANG[6], "SUISSE(SOLEURE)");
		values.put(Database.LANG[7], "SUÍÇA(SOLEURE)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(ST. GALLEN)
		values.put(Database.LANG[1], "eu_swi_020");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(ST. GALLEN)");
		values.put(Database.LANG[4], "SVIZZERA(ST. GALLEN)");
		values.put(Database.LANG[5], "SUIZA(ST. GALLEN)");
		values.put(Database.LANG[6], "SUISSE(ST. GALL)");
		values.put(Database.LANG[7], "SUÍÇA(ST. GALLEN)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(THURGAU)
		values.put(Database.LANG[1], "eu_swi_021");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(THURGAU)");
		values.put(Database.LANG[4], "SWITZERLAND(THURGAU)");
		values.put(Database.LANG[5], "SUIZA(THURGAU)");
		values.put(Database.LANG[6], "SUISSE(THURGAU)");
		values.put(Database.LANG[7], "SUÍÇA(THURGAU)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(TICINO)
		values.put(Database.LANG[1], "eu_swi_022");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(TICINO)");
		values.put(Database.LANG[4], "SVIZZERA(TICINO)");
		values.put(Database.LANG[5], "SUIZA(TICINO)");
		values.put(Database.LANG[6], "SUISSE(TICINO)");
		values.put(Database.LANG[7], "SUÍÇA(TICINO)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(URI)
		values.put(Database.LANG[1], "eu_swi_023");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(URI)");
		values.put(Database.LANG[4], "SVIZZERA(URI)");
		values.put(Database.LANG[5], "SUIZA(URI)");
		values.put(Database.LANG[6], "SUISSE(URI)");
		values.put(Database.LANG[7], "SUÍÇA(URI)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(VALAIS)
		values.put(Database.LANG[1], "eu_swi_024");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(VALAIS)");
		values.put(Database.LANG[4], "SVIZZERA(VALAIS)");
		values.put(Database.LANG[5], "SUIZA(VALAIS)");
		values.put(Database.LANG[6], "SUISSE(VALAIS)");
		values.put(Database.LANG[7], "SUÍÇA(VALAIS)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(VAUD)
		values.put(Database.LANG[1], "eu_swi_025");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(VAUD)");
		values.put(Database.LANG[4], "SVIZZERA(VAUD)");
		values.put(Database.LANG[5], "SUIZA(VAUD)");
		values.put(Database.LANG[6], "SUISSE(VAUD)");
		values.put(Database.LANG[7], "SUÍÇA(VAUD)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(ZUG)
		values.put(Database.LANG[1], "eu_swi_026");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(ZUG)");
		values.put(Database.LANG[4], "SVIZZERA(ZUG)");
		values.put(Database.LANG[5], "SUIZA(ZUG)");
		values.put(Database.LANG[6], "SUISSE(ZUG)");
		values.put(Database.LANG[7], "SUÍÇA(ZUG)");		
		db.insert(Database.TABLES[2], null, values);
		
		// SWITZERLAND(ZURICH)
		values.put(Database.LANG[1], "eu_swi_027");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SWITZERLAND(ZURICH)");
		values.put(Database.LANG[4], "SVIZZERA(ZURIGO)");
		values.put(Database.LANG[5], "SUIZA(ZURICH)");
		values.put(Database.LANG[6], "SUISSE(ZURICH)");
		values.put(Database.LANG[7], "SUÍÇA(ZURICH)");		
		db.insert(Database.TABLES[2], null, values);
		
		// TAJIKISTAN
		values.put(Database.LANG[1], "eu_taj_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "TAJIKISTAN");
		values.put(Database.LANG[4], "TAGIKISTAN");
		values.put(Database.LANG[5], "TAYIKISTÁN");
		values.put(Database.LANG[6], "TADJIKISTAN");
		values.put(Database.LANG[7], "TAJIKISTAN");		
		db.insert(Database.TABLES[2], null, values);
		
		// TURKEY
		values.put(Database.LANG[1], "eu_tur_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "TURKEY");
		values.put(Database.LANG[4], "TURCHIA");
		values.put(Database.LANG[5], "TURQUÍA");
		values.put(Database.LANG[6], "TURQUIE");
		values.put(Database.LANG[7], "TURQUIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// UKRAINE
		values.put(Database.LANG[1], "eu_ukr_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "UKRAINE");
		values.put(Database.LANG[4], "UCRAINA");
		values.put(Database.LANG[5], "UCRAINA");
		values.put(Database.LANG[6], "UKRAINE");
		values.put(Database.LANG[7], "UCRÂNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// UZBEKISTAN
		values.put(Database.LANG[1], "eu_uzb_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "UZBEKISTAN");
		values.put(Database.LANG[4], "UZBEKISTAN");
		values.put(Database.LANG[5], "UZBEKISTÁN");
		values.put(Database.LANG[6], "OUZBEKISTAN");
		values.put(Database.LANG[7], "UZBEQUISTÃO");		
		db.insert(Database.TABLES[2], null, values);
		
		// VATICAN CITY
		values.put(Database.LANG[1], "eu_vat_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "VATICAN CITY");
		values.put(Database.LANG[4], "CITTÀ DEL VATICANO");
		values.put(Database.LANG[5], "CIUDAD DEL VATICANO");
		values.put(Database.LANG[6], "CITE DU VATICAN");
		values.put(Database.LANG[7], "CIDADE DO VATICANO");		
		db.insert(Database.TABLES[2], null, values);
		
		// WALES
		values.put(Database.LANG[1], "eu_wal_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "WALES");
		values.put(Database.LANG[4], "GALLES");
		values.put(Database.LANG[5], "GALES");
		values.put(Database.LANG[6], "PAYS DE GALLES");
		values.put(Database.LANG[7], "PAÍS DE GALES");		
		db.insert(Database.TABLES[2], null, values);
		
		// ALABAMA
		values.put(Database.LANG[1], "us_alb_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ALABAMA");
		values.put(Database.LANG[4], "ALABAMA");
		values.put(Database.LANG[5], "ALABAMA");
		values.put(Database.LANG[6], "ALABAMA");
		values.put(Database.LANG[7], "ALABAMA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ALASKA
		values.put(Database.LANG[1], "us_als_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ALASKA");
		values.put(Database.LANG[4], "ALASKA");
		values.put(Database.LANG[5], "ALASKA");
		values.put(Database.LANG[6], "ALASKA");
		values.put(Database.LANG[7], "ALASKA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ARIZONA
		values.put(Database.LANG[1], "us_ari_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ARIZONA");
		values.put(Database.LANG[4], "ARIZONA");
		values.put(Database.LANG[5], "ARIZONA");
		values.put(Database.LANG[6], "ARIZONA");
		values.put(Database.LANG[7], "ARIZONA");		
		db.insert(Database.TABLES[2], null, values);
		
		// ARKANSAS
		values.put(Database.LANG[1], "us_ark_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ARKANSAS");
		values.put(Database.LANG[4], "ARKANSAS");
		values.put(Database.LANG[5], "ARKANSAS");
		values.put(Database.LANG[6], "ARKANSAS");
		values.put(Database.LANG[7], "ARKANSAS");		
		db.insert(Database.TABLES[2], null, values);
		
		// CALIFORNIA
		values.put(Database.LANG[1], "us_cal_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "CALIFORNIA");
		values.put(Database.LANG[4], "CALIFORNIA");
		values.put(Database.LANG[5], "CALIFORNIA");
		values.put(Database.LANG[6], "CALIFORNIA");
		values.put(Database.LANG[7], "CALIFORNIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// COLORADO
		values.put(Database.LANG[1], "us_col_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "COLORADO");
		values.put(Database.LANG[4], "COLORADO");
		values.put(Database.LANG[5], "COLORADO");
		values.put(Database.LANG[6], "COLORADO");
		values.put(Database.LANG[7], "COLORADO");		
		db.insert(Database.TABLES[2], null, values);
		
		// CONNECTICUT
		values.put(Database.LANG[1], "us_con_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "CONNECTICUT");
		values.put(Database.LANG[4], "CONNECTICUT");
		values.put(Database.LANG[5], "CONNECTICUT");
		values.put(Database.LANG[6], "CONNECTICUT");
		values.put(Database.LANG[7], "CONNECTICUT");		
		db.insert(Database.TABLES[2], null, values);
		
		// DELAWARE
		values.put(Database.LANG[1], "us_del_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "DELAWARE");
		values.put(Database.LANG[4], "DELAWARE");
		values.put(Database.LANG[5], "DELAWARE");
		values.put(Database.LANG[6], "DELAWARE");
		values.put(Database.LANG[7], "DELAWARE");		
		db.insert(Database.TABLES[2], null, values);
		
		// FLORIDA
		values.put(Database.LANG[1], "us_flo_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "FLORIDA");
		values.put(Database.LANG[4], "FLORIDA");
		values.put(Database.LANG[5], "FLORIDA");
		values.put(Database.LANG[6], "FLORIDA");
		values.put(Database.LANG[7], "FLORIDA");		
		db.insert(Database.TABLES[2], null, values);
		
		// GEORGIA
		values.put(Database.LANG[1], "us_geo_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "GEORGIA");
		values.put(Database.LANG[4], "GEORGIA");
		values.put(Database.LANG[5], "GEORGIA");
		values.put(Database.LANG[6], "GEORGIA");
		values.put(Database.LANG[7], "GEORGIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// HAWAII
		values.put(Database.LANG[1], "us_haw_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "HAWAII");
		values.put(Database.LANG[4], "HAWAII");
		values.put(Database.LANG[5], "HAWAII");
		values.put(Database.LANG[6], "HAWAII");
		values.put(Database.LANG[7], "HAWAII");		
		db.insert(Database.TABLES[2], null, values);
		
		// IDAHO
		values.put(Database.LANG[1], "us_ida_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "IDAHO");
		values.put(Database.LANG[4], "IDAHO");
		values.put(Database.LANG[5], "IDAHO");
		values.put(Database.LANG[6], "IDAHO");
		values.put(Database.LANG[7], "IDAHO");		
		db.insert(Database.TABLES[2], null, values);
		
		// ILLINOIS
		values.put(Database.LANG[1], "us_ill_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "ILLINOIS");
		values.put(Database.LANG[4], "ILLINOIS");
		values.put(Database.LANG[5], "ILLINOIS");
		values.put(Database.LANG[6], "ILLINOIS");
		values.put(Database.LANG[7], "ILLINOIS");		
		db.insert(Database.TABLES[2], null, values);
		
		// INDIANA
		values.put(Database.LANG[1], "us_ind_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "INDIANA");
		values.put(Database.LANG[4], "INDIANA");
		values.put(Database.LANG[5], "INDIANA");
		values.put(Database.LANG[6], "INDIANA");
		values.put(Database.LANG[7], "INDIANA");		
		db.insert(Database.TABLES[2], null, values);
		
		// IOWA
		values.put(Database.LANG[1], "us_iow_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "IOWA");
		values.put(Database.LANG[4], "IOWA");
		values.put(Database.LANG[5], "IOWA");
		values.put(Database.LANG[6], "IOWA");
		values.put(Database.LANG[7], "IOWA");		
		db.insert(Database.TABLES[2], null, values);
		
		// KANSASAS
		values.put(Database.LANG[1], "us_kan_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "KANSASAS");
		values.put(Database.LANG[4], "KANSASAS");
		values.put(Database.LANG[5], "KANSASAS");
		values.put(Database.LANG[6], "KANSASAS");
		values.put(Database.LANG[7], "KANSASAS");		
		db.insert(Database.TABLES[2], null, values);
		
		// KENTUCKY
		values.put(Database.LANG[1], "us_ken_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "KENTUCKY");
		values.put(Database.LANG[4], "KENTUCKY");
		values.put(Database.LANG[5], "KENTUCKY");
		values.put(Database.LANG[6], "KENTUCKY");
		values.put(Database.LANG[7], "KENTUCKY");		
		db.insert(Database.TABLES[2], null, values);
		
		// LOUSIANA
		values.put(Database.LANG[1], "us_lou_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "LOUSIANA");
		values.put(Database.LANG[4], "LOUSIANA");
		values.put(Database.LANG[5], "LOUSIANA");
		values.put(Database.LANG[6], "LOUSIANA");
		values.put(Database.LANG[7], "LOUSIANA");		
		db.insert(Database.TABLES[2], null, values);
		
		// MAINE
		values.put(Database.LANG[1], "us_mai_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MAINE");
		values.put(Database.LANG[4], "MAINE");
		values.put(Database.LANG[5], "MAINE");
		values.put(Database.LANG[6], "MAINE");
		values.put(Database.LANG[7], "MAINE");		
		db.insert(Database.TABLES[2], null, values);
		
		// MARYLAND
		values.put(Database.LANG[1], "us_mar_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MARYLAND");
		values.put(Database.LANG[4], "MARYLAND");
		values.put(Database.LANG[5], "MARYLAND");
		values.put(Database.LANG[6], "MARYLAND");
		values.put(Database.LANG[7], "MARYLAND");		
		db.insert(Database.TABLES[2], null, values);
		
		// MASSACHUSETTS
		values.put(Database.LANG[1], "us_mas_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MASSACHUSETTS");
		values.put(Database.LANG[4], "MASSACHUSETTS");
		values.put(Database.LANG[5], "MASSACHUSETTS");
		values.put(Database.LANG[6], "MASSACHUSETTS");
		values.put(Database.LANG[7], "MASSACHUSETTS");		
		db.insert(Database.TABLES[2], null, values);
		
		// MICHIGAN
		values.put(Database.LANG[1], "us_mic_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MICHIGAN");
		values.put(Database.LANG[4], "MICHIGAN");
		values.put(Database.LANG[5], "MICHIGAN");
		values.put(Database.LANG[6], "MICHIGAN");
		values.put(Database.LANG[7], "MICHIGAN");		
		db.insert(Database.TABLES[2], null, values);
		
		// MINNESOTA
		values.put(Database.LANG[1], "us_min_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MINNESOTA");
		values.put(Database.LANG[4], "MINNESOTA");
		values.put(Database.LANG[5], "MINNESOTA");
		values.put(Database.LANG[6], "MINNESOTA");
		values.put(Database.LANG[7], "MINNESOTA");		
		db.insert(Database.TABLES[2], null, values);
		
		// MISSISSIPPI
		values.put(Database.LANG[1], "us_msi_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MISSISSIPPI");
		values.put(Database.LANG[4], "MISSISSIPPI");
		values.put(Database.LANG[5], "MISSISSIPPI");
		values.put(Database.LANG[6], "MISSISSIPPI");
		values.put(Database.LANG[7], "MISSISSIPPI");		
		db.insert(Database.TABLES[2], null, values);
		
		// MISSOURI
		values.put(Database.LANG[1], "us_mso_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MISSOURI");
		values.put(Database.LANG[4], "MISSOURI");
		values.put(Database.LANG[5], "MISSOURI");
		values.put(Database.LANG[6], "MISSOURI");
		values.put(Database.LANG[7], "MISSOURI");		
		db.insert(Database.TABLES[2], null, values);
		
		// MONTANA
		values.put(Database.LANG[1], "us_mon_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "MONTANA");
		values.put(Database.LANG[4], "MONTANA");
		values.put(Database.LANG[5], "MONTANA");
		values.put(Database.LANG[6], "MONTANA");
		values.put(Database.LANG[7], "MONTANA");		
		db.insert(Database.TABLES[2], null, values);
		
		// NEBRASKA
		values.put(Database.LANG[1], "us_neb_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NEBRASKA");
		values.put(Database.LANG[4], "NEBRASKA");
		values.put(Database.LANG[5], "NEBRASKA");
		values.put(Database.LANG[6], "NEBRASKA");
		values.put(Database.LANG[7], "NEBRASKA");		
		db.insert(Database.TABLES[2], null, values);
		
		// NEVADA
		values.put(Database.LANG[1], "us_nev_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NEVADA");
		values.put(Database.LANG[4], "NEVADA");
		values.put(Database.LANG[5], "NEVADA");
		values.put(Database.LANG[6], "NEVADA");
		values.put(Database.LANG[7], "NEVADA");		
		db.insert(Database.TABLES[2], null, values);
		
		// NEWHAMPSHIRE
		values.put(Database.LANG[1], "us_neh_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NEWHAMPSHIRE");
		values.put(Database.LANG[4], "NEWHAMPSHIRE");
		values.put(Database.LANG[5], "NEWHAMPSHIRE");
		values.put(Database.LANG[6], "NEWHAMPSHIRE");
		values.put(Database.LANG[7], "NEWHAMPSHIRE");		
		db.insert(Database.TABLES[2], null, values);
		
		// NEW JERSEY
		values.put(Database.LANG[1], "us_nej_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NEW JERSEY");
		values.put(Database.LANG[4], "NEW JERSEY");
		values.put(Database.LANG[5], "NEW JERSEY");
		values.put(Database.LANG[6], "NEW JERSEY");
		values.put(Database.LANG[7], "NEW JERSEY");		
		db.insert(Database.TABLES[2], null, values);
		
		// NEW MEXICO
		values.put(Database.LANG[1], "us_nem_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NEW MEXICO");
		values.put(Database.LANG[4], "NEW MEXICO");
		values.put(Database.LANG[5], "NEW MEXICO");
		values.put(Database.LANG[6], "NEW MEXICO");
		values.put(Database.LANG[7], "NEW MEXICO");		
		db.insert(Database.TABLES[2], null, values);
		
		// NEW YORK
		values.put(Database.LANG[1], "us_ney_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NEW YORK");
		values.put(Database.LANG[4], "NEW YORK");
		values.put(Database.LANG[5], "NEW YORK");
		values.put(Database.LANG[6], "NEW YORK");
		values.put(Database.LANG[7], "NEW YORK");		
		db.insert(Database.TABLES[2], null, values);
		
		// NORTH CAROLINA
		values.put(Database.LANG[1], "us_nrc_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NORTH CAROLINA");
		values.put(Database.LANG[4], "NORTH CAROLINA");
		values.put(Database.LANG[5], "NORTH CAROLINA");
		values.put(Database.LANG[6], "NORTH CAROLINA");
		values.put(Database.LANG[7], "NORTH CAROLINA");		
		db.insert(Database.TABLES[2], null, values);
		
		// NORTH DAKOTA
		values.put(Database.LANG[1], "us_nrd_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "NORTH DAKOTA");
		values.put(Database.LANG[4], "NORTH DAKOTA");
		values.put(Database.LANG[5], "NORTH DAKOTA");
		values.put(Database.LANG[6], "NORTH DAKOTA");
		values.put(Database.LANG[7], "NORTH DAKOTA");		
		db.insert(Database.TABLES[2], null, values);
		
		// OHIO
		values.put(Database.LANG[1], "us_ohi_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "OHIO");
		values.put(Database.LANG[4], "OHIO");
		values.put(Database.LANG[5], "OHIO");
		values.put(Database.LANG[6], "OHIO");
		values.put(Database.LANG[7], "OHIO");		
		db.insert(Database.TABLES[2], null, values);
		
		// OKLAHOMA
		values.put(Database.LANG[1], "us_okl_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "OKLAHOMA");
		values.put(Database.LANG[4], "OKLAHOMA");
		values.put(Database.LANG[5], "OKLAHOMA");
		values.put(Database.LANG[6], "OKLAHOMA");
		values.put(Database.LANG[7], "OKLAHOMA");		
		db.insert(Database.TABLES[2], null, values);
		
		// OREGON
		values.put(Database.LANG[1], "us_ore_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "OREGON");
		values.put(Database.LANG[4], "OREGON");
		values.put(Database.LANG[5], "OREGON");
		values.put(Database.LANG[6], "OREGON");
		values.put(Database.LANG[7], "OREGON");		
		db.insert(Database.TABLES[2], null, values);
		
		// PENNSYLVANIA
		values.put(Database.LANG[1], "us_pen_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "PENNSYLVANIA");
		values.put(Database.LANG[4], "PENNSYLVANIA");
		values.put(Database.LANG[5], "PENNSYLVANIA");
		values.put(Database.LANG[6], "PENNSYLVANIA");
		values.put(Database.LANG[7], "PENNSYLVANIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// RHODEILSLAND
		values.put(Database.LANG[1], "us_rho_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "RHODEILSLAND");
		values.put(Database.LANG[4], "RHODEILSLAND");
		values.put(Database.LANG[5], "RHODEILSLAND");
		values.put(Database.LANG[6], "RHODEILSLAND");
		values.put(Database.LANG[7], "RHODEILSLAND");		
		db.insert(Database.TABLES[2], null, values);
		
		// SOUTH CAROLINA
		values.put(Database.LANG[1], "us_soc_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SOUTH CAROLINA");
		values.put(Database.LANG[4], "SOUTH CAROLINA");
		values.put(Database.LANG[5], "SOUTH CAROLINA");
		values.put(Database.LANG[6], "SOUTH CAROLINA");
		values.put(Database.LANG[7], "SOUTH CAROLINA");		
		db.insert(Database.TABLES[2], null, values);
		
		// SOUTH DAKOTA
		values.put(Database.LANG[1], "us_sod_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "SOUTH DAKOTA");
		values.put(Database.LANG[4], "SOUTH DAKOTA");
		values.put(Database.LANG[5], "SOUTH DAKOTA");
		values.put(Database.LANG[6], "SOUTH DAKOTA");
		values.put(Database.LANG[7], "SOUTH DAKOTA");		
		db.insert(Database.TABLES[2], null, values);
		
		// TENNESSEE
		values.put(Database.LANG[1], "us_ten_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "TENNESSEE");
		values.put(Database.LANG[4], "TENNESSEE");
		values.put(Database.LANG[5], "TENNESSEE");
		values.put(Database.LANG[6], "TENNESSEE");
		values.put(Database.LANG[7], "TENNESSEE");		
		db.insert(Database.TABLES[2], null, values);
		
		// TEXAS
		values.put(Database.LANG[1], "us_tex_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "TEXAS");
		values.put(Database.LANG[4], "TEXAS");
		values.put(Database.LANG[5], "TEXAS");
		values.put(Database.LANG[6], "TEXAS");
		values.put(Database.LANG[7], "TEXAS");		
		db.insert(Database.TABLES[2], null, values);
		
		// UTAH
		values.put(Database.LANG[1], "us_uth_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "UTAH");
		values.put(Database.LANG[4], "UTAH");
		values.put(Database.LANG[5], "UTAH");
		values.put(Database.LANG[6], "UTAH");
		values.put(Database.LANG[7], "UTAH");		
		db.insert(Database.TABLES[2], null, values);
		
		// VERMONT
		values.put(Database.LANG[1], "us_ver_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "VERMONT");
		values.put(Database.LANG[4], "VERMONT");
		values.put(Database.LANG[5], "VERMONT");
		values.put(Database.LANG[6], "VERMONT");
		values.put(Database.LANG[7], "VERMONT");		
		db.insert(Database.TABLES[2], null, values);
		
		// VIRGINIA
		values.put(Database.LANG[1], "us_vir_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "VIRGINIA");
		values.put(Database.LANG[4], "VIRGINIA");
		values.put(Database.LANG[5], "VIRGINIA");
		values.put(Database.LANG[6], "VIRGINIA");
		values.put(Database.LANG[7], "VIRGINIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// WASHINGTON
		values.put(Database.LANG[1], "us_was_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "WASHINGTON");
		values.put(Database.LANG[4], "WASHINGTON");
		values.put(Database.LANG[5], "WASHINGTON");
		values.put(Database.LANG[6], "WASHINGTON");
		values.put(Database.LANG[7], "WASHINGTON");		
		db.insert(Database.TABLES[2], null, values);
		
		// WEST VIRGINIA
		values.put(Database.LANG[1], "us_wes_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "WEST VIRGINIA");
		values.put(Database.LANG[4], "WEST VIRGINIA");
		values.put(Database.LANG[5], "WEST VIRGINIA");
		values.put(Database.LANG[6], "WEST VIRGINIA");
		values.put(Database.LANG[7], "WEST VIRGINIA");		
		db.insert(Database.TABLES[2], null, values);
		
		// WISCONSIN
		values.put(Database.LANG[1], "us_wis_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "WISCONSIN");
		values.put(Database.LANG[4], "WISCONSIN");
		values.put(Database.LANG[5], "WISCONSIN");
		values.put(Database.LANG[6], "WISCONSIN");
		values.put(Database.LANG[7], "WISCONSIN");		
		db.insert(Database.TABLES[2], null, values);
		
		// WYOMING
		values.put(Database.LANG[1], "us_wiy_001");
		values.put(Database.LANG[2], 1);
		values.put(Database.LANG[3], "WYOMING");
		values.put(Database.LANG[4], "WYOMING");
		values.put(Database.LANG[5], "WYOMING");
		values.put(Database.LANG[6], "WYOMING");
		values.put(Database.LANG[7], "WYOMING");		
		db.insert(Database.TABLES[2], null, values);
		
		/*String lang = 
				"INSERT INTO language (imgID, version, en, it, es, fr, pt) VALUES " +
				"('eu_abk_001',	1,	'ABKHAZIA',	'ABCASIA',	'ABJASIA',	'ABKHAZIE',	'ABECÁSIA'),"+
				"('eu_alb_001',	1,	'ALBANIA',	'ALBANIA',	'ALBANIA',	'ALBANIE',	'ALBÂNIA')," +
				"('eu_and_001',	1,	'ANDORRA',	'ANDORRA',	'ANDORRA',	'ANDORRE',	'ANDORRA')," +
				"('eu_arm_001',	1,	'ARMENIA',	'ARMENIA',	'ARMENIA',	'ARMÉNIE',	'ARMÊNIA')," +
				"('eu_aus_001',	1,	'AUSTRIA(BURGENLAND)',	'AUSTRIA(BURGENLAND)',	'AUSTRIA(BURGENLAND)',	'AUTRICHE(BURGENLAND)',	'ÁUSTRIA(BURGENLAND)')," +
				"('eu_aus_002',	1,	'AUSTRIA(CARINTHIA)',	'AUSTRIA(CARINZIA)',	'AUSTRIA(CARINTIA)',	'AUTRICHE(CARINTHIE)',	'ÁUSTRIA(CARÍNTIA)')," +
				"('eu_aus_003',	1,	'AUSTRIA(LOWER AUSTRIA)',	'AUSTRIA(AUSTRIA BASSA)',	'AUSTRIA(BAJA AUSTRIA)',	'AUTRICHE(BASSE-AUTRICHE)',	'ÁUSTRIA(ÁUSTRIA BAIXA)')," +
				"('eu_aus_004',	1,	'AUSTRIA(POLIZEI)',	'AUSTRIA(POLIZIA)',	'AUSTRIA(POLICÍA)',	'AUTRICHE(POLICE)',	'ÁUSTRIA(POLÍCIA)')," +
				"('eu_aus_005',	1,	'AUSTRIA(SALZBURG)',	'AUSTRIA(SALISBURGO)',	'AUSTRIA(SALZBURGO)',	'AUTRICHE(SALZBURG)',	'ÁUSTRIA(SALZBURG)'),"+
				"('eu_aus_006',	1,	'AUSTRIA(STYRIA)',	'AUSTRIA(STYRIA)',	'AUSTRIA(ESTIRIA)',	'AUTRICHE(STYRIA)',	'ÁUSTRIA(STYRIA)')," +
				"('eu_aus_007',	1,	'AUSTRIA(TYROL)',	'AUSTRIA(TIROLO)',	'AUSTRIA(TIROL)',	'AUTRICHE(TYROL)',	'ÁUSTRIA(TYROL)')," +
				"('eu_aus_008',	1,	'AUSTRIA(UPPER AUSTRIA)',	'AUSTRIA(AUSTRIA ALTA)',	'AUSTRIA(AUSTRIA ALTA)',	'AUTRICHE(HAUTE-AUTRICHE)',	'ÁUSTRIA(ÁUSTRIA ALTA)')," +
				"('eu_aus_009',	1,	'AUSTRIA(VIENNA)',	'AUSTRIA(VIENNA)',	'AUSTRIA(VIENNA)',	'AUTRICHE(VIENNE)',	'ÁUSTRIA(VIENA)')," +
				"('eu_aus_010',	1,	'AUSTRIA(VORARLBERG)',	'AUSTRIA(VORARLBERG)',	'AUSTRIA(VORARLBERG)',	'AUTRICHE(VORARLBERG)',	'ÁUSTRIA(VORARLBERG)')," +
				"('eu_aze_001',	1,	'AZERBAIJAN',	'AZERBAIGIAN',	'AZERBAIYÁN',	'AZERBAÏDJAN',	'AZERBAIJÃO')," +
				"('eu_beg_001',	1,	'BELGIUM',	'BELGIO',	'BÉLGICA',	'BELGIQUE',	'BÉLGICA')," +
				"('eu_bel_001',	1,	'BELARUS',	'BIELORUSSIA',	'BIELORUSIA',	'BÉLARUS',	'BELARUS')," +
				"('eu_bos_001',	1,	'BOSNIA',	'BOSNIA',	'BOSNIA',	'BOSNIE',	'BÓSNIA')," +
				"('eu_bul_001',	1,	'BULGARIA',	'BULGARIA',	'BULGARIA',	'BULGARIE',	'BULGÁRIA')," +
				"('eu_cro_001',	1,	'CROATIA',	'CROAZIA',	'CROACIA',	'CROATIE',	'CROÁCIA')," +
				"('eu_cyp_001',	1,	'CYPRUS',	'CIPRO',	'CHIPRE',	'CHYPRE',	'CHIPRE')," +
				"('eu_cze_001',	1,	'CZECH REPUBLIC',	'REPUBBLICA CECA',	'REPÚBLICA CHECA',	'RÉPUBLIQUE TCHÈQUE',	'REPÚBLICA CHECA')," +
				"('eu_den_001',	1,	'DENMARK',	'DANIMARCA',	'DINAMARCA',	'DENMARK',	'DINAMARCA')," +
				"('eu_eng_001',	1,	'ENGLAND',	'INGHILTERRA',	'INGLATERRA',	'ANGLETERRE',	'INGLATERRA')," +
				"('eu_est_001',	1,	'ESTONIA',	'ESTONIA',	'ESTONIA',	'ESTONIE',	'ESTÔNIA')," +
				"('eu_fin_001',	1,	'FINLAND',	'FINLANDIA',	'FINLANDIA',	'FINLANDE',	'FINLÂNDIA')," +
				"('eu_fra_001',	1,	'FRANCE (ALSACE)',	'FRANCIA (ALSAZIA)',	'FRANCIA (ALSACIA)',	'FRANCE (ALSACE)',	'FRANÇA (ALSÁCIA)')," +
				"('eu_fra_002',	1,	'FRANCE (AQUITAINE)',	'FRANCE REGION (AQUITANIA)',	'FRANCIA (AQUITANIA)',	'FRANCE (AQUITAINE)',	'FRANÇA (AQUITÂNIA)')," +
				"('eu_fra_003',	1,	'FRANCE (AUVERGNE)',	'FRANCIA (AUVERGNE)',	'FRANCIA (AUVERNIA)',	'FRANCE (AUVERGNE)',	'FRANÇA (AUVERGNE)')," +
				"('eu_fra_004',	1,	'FRANCE (BASSE-NORMANDIE)',	'FRANCIA (BASSA-NORMANDIA)',	'FRANCIA (BAJA NORMANDIA)',	'FRANCE (BASSE-NORMANDIE)',	'FRANÇA (BAIXA-NORMANDIA)')," +
				"('eu_fra_005',	1,	'FRANCE (BOURGOGNE)',	'FRANCIA (BORGOGNA)',	'FRANCIA (BORGOÑA)',	'FRANCE (BOURGOGNE)',	'FRANÇA (BURGUNDY)')," +
				"('eu_fra_006',	1,	'FRANCE (BRETAGNE)',	'FRANCIA (BRETAGNA)',	'FRANCIA (BRETAÑA)',	'FRANCE (BRETAGNE)',	'FRANÇA (BRETANHA)')," +
				"('eu_fra_007',	1,	'FRANCE (CENTRE)',	'FRANCIA (CENTRO)',	'FRANCIA (CENTRE)',	'FRANCE (CENTRE)',	'FRANÇA (CENTRO)')," +
				"('eu_fra_008',	1,	'FRANCE (CHAMPAGNE-ARDENNE)',	'FRANCIA (CHAMPAGNE-ARDENNE)',	'FRANCIA (CHAMPAGNE-ARDENNE)',	'FRANCE (CHAMPAGNE-ARDENNE)',	'FRANÇA (CHAMPAGNE-ARDENNE)')," +
				"('eu_fra_009',	1,	'FRANCE (CORSE/CORSICA)',	'FRANCIA (CORSICA)',	'FRANCIA (CÓRCEGA)',	'FRANCE (CORSE)',	'FRANÇA (CÓRSEGA)')," +
				"('eu_fra_010',	1,	'FRANCE (FRANCHE-COMTE)',	'FRANCIA (FRANCHE-COMTE)',	'FRANCIA (FRANCHE-COMTE)',	'FRANCE (FRANCHE-COMTE)',	'FRANÇA (FRANCHE-COMTE)')," +
				"('eu_fra_011',	1,	'FRANCE (GUADELOUPE)',	'FRANCIA (GUADALUPE)',	'FRANCIA (GUADALUPE)',	'FRANCE (GUADELOUPE)',	'FRANÇA (GUADALUPE)')," +
				"('eu_fra_012',	1,	'FRANCE (GUYANE/FRENCH GUIANA)',	'FRANCIA (GUYANA FRANCESE)',	'FRANCIA (GUAYANA FRANCESA)',	'FRANCE (FRENCH GUIANA)',	'FRANÇA (GUIANA FRANCESA)')," +
				"('eu_fra_013',	1,	'FRANCE (HAUTE-NORMANDIE)',	'FRANCIA (ALTA NORMANDIA)',	'FRANCIA (ALTA NORMANDIA)',	'FRANCE (HAUTE-NORMANDIE)',	'FRANÇA (ALTA NORMANDIA)')," +
				"('eu_fra_014',	1,	'FRANCE (LANGUEDOC-ROUSSILLON)',	'FRANCIA (LANGUEDOC-ROUSSILLON)',	'FRANCIA (LANGUEDOC-ROUSSILLON)',	'FRANCE (LANGUEDOC-ROUSSILLON)',	'FRANÇA (LANGUEDOC-ROUSSILLON)')," +
				"('eu_fra_015',	1,	'FRANCE (LIMOUSIN)',	'FRANCIA (LIMOUSIN)',	'FRANCIA (LIMOUSIN)',	'FRANCE (LIMOUSIN)',	'FRANÇA (LIMOUSIN)')," +
				"('eu_fra_016',	1,	'FRANCE (LORRAINE)',	'FRANCIA (LORENA)',	'FRANCIA (LORRAINE)',	'FRANCE (LORRAINE)',	'FRANÇA (LORENA)')," +
				"('eu_fra_017',	1,	'FRANCE (MARTINIQUE)',	'FRANCIA (MARTINICA)',	'FRANCIA (MARTINICA)',	'FRANCE (MARTINIQUE)',	'FRANÇA (MARTINICA)')," +
				"('eu_fra_018',	1,	'FRANCE (MIDI-PYRENEES)',	'FRANCIA (PIRENEI)',	'FRANCIA (PIRINEOS)',	'FRANCE (MIDI-PYRÉNÉES)',	'FRANÇA (PIRINEUS)')," +
				"('eu_fra_019',	1,	'FRANCE (NORD-PAS-DE-CALAIS)',	'FRANCIA (NORD-PAS-DE-CALAIS)',	'FRANCIA (NORD-PAS-DE-CALAIS)',	'FRANCE (NORD-PAS-DE-CALAIS)',	'FRANÇA (NORD-PAS-DE-CALAIS)')," +
				"('eu_fra_020',	1,	'FRANCE (PARIS/ILE DE FRANCE)',	'FRANCIA (PARIGI/FRANCIA ISOLA)',	'FRANCIA (PARÍS/FRANCIA ISLA)',	'FRANCE (PARIS/ÎLE DE FRANCE)',	'FRANÇA (PARIS/FRANÇA ISLAND)')," +
				"('eu_fra_021',	1,	'FRANCE (PAYS-DE-LA-LOIRE)',	'FRANCIA (PAESE DELLA LOIRA)',	'FRANCIA (TIERRA DEL LOIRA)',	'FRANCE (PAYS-DE-LA-LOIRE)',	'FRANÇA (TERRA DO LOIRE)')," +
				"('eu_fra_022',	1,	'FRANCE (PICARDIE)',	'FRANCIA (PICCARDIA)',	'FRANCIA (PICARDÍA)',	'FRANCE (PICARDIE)',	'FRANÇA (PICARDIA)')," +
				"('eu_fra_023',	1,	'FRANCE (POITOU-CHARENTES)',	'FRANCIA (POITOU-CHARENTES)',	'FRANCIA (POITOU-CHARENTES)',	'FRANCE (POITOU-CHARENTES)',	'FRANÇA (POITOU-CHARENTES)')," +
				"('eu_fra_024',	1,	'FRANCE (PROVENCE-ALPES-COTE-D AZUR)',	'FRANCIA (PROVENZA-ALPI-COSTA AZZURRA)',	'FRANCIA (PROVENCE-ALPES-COTE-D AZUR)',	'FRANCE (PROVENCE-ALPES-CÔTÉ-D AZUR)',	'FRANÇA (PROVENCE-ALPES-CÔTE-D AZUR)')," +
				"('eu_fra_025',	1,	'FRANCE (REUNION)',	'FRANCIA (RIUNIONE)',	'FRANCIA (REUNIÓN)',	'FRANCE (REUNION)',	'FRANÇA (REUNIÃO)')," +
				"('eu_fra_026',	1,	'FRANCE (RHONE-ALPES)',	'FRANCIA (RHONE-ALPES)',	'FRANCIA (RÓDANO-ALPES)',	'FRANCE (RHONE-ALPES)',	'FRANÇA (RHÔNE-ALPES)')," +
				"('eu_fra_027',	1,	'FRANCE (SAINT-MARTIN)',	'FRANCIA (SAINT-MARTIN)',	'FRANCIA (SAINT-MARTIN)',	'FRANCE (SAINT-MARTIN)',	'FRANÇA (SAINT-MARTIN)')," +
				"('eu_gbt_001',	1,	'BRITAIN/UK',	'GRAN BRETAGNA',	'GRAN BRETAÑA',	'GRANDE BRETAGNE',	'GRÃ-BRETANHA')," +
				"('eu_geo_001',	1,	'GEORGIA',	'GEORGIA',	'GEORGIA',	'GÉORGIE',	'GEÓRGIA')," +
				"('eu_ger_001',	1,	'GERMANY(WOLFSBURG)',	'GERMANIA(WOLFSBURG)',	'ALEMANIA(WOLFSBURG)',	'ALEMAGNE(WOLFSBURG)',	'ALEMANHA(WOLFSBURG)')," +
				"('eu_ger_002',	1,	'GERMANY(MUNICH)',	'GERMANIA(MONACO)',	'ALEMANIA(MUNICH)',	'ALEMAGNE(MUNICH)',	'ALEMANHA(MUNIQUE)')," +
				"('eu_ger_003',	1,	'GERMANY(STUTTGART)',	'GERMANIA(STOCCARDA)',	'ALEMANIA(STUTTGART)',	'ALEMAGNE(STUTTGART)',	'ALEMANHA(ESTUGARDA)')," +
				"('eu_ger_004',	1,	'GERMANY(BERLIN)',	'GERMANIA(BERLINO)',	'ALEMANIA(BERLIN)',	'ALEMAGNE(BERLIN)',	'ALEMANHA(BERLIM)')," +
				"('eu_ger_005',	1,	'GERMANY(BRANDENBURG)',	'GERMANIA(BRANDENBURGO)',	'ALEMANIA(BRANDENBURGO)',	'ALEMAGNE(BRANDENBURG)',	'GERMAN(BRANDENBURG)')," +
				"('eu_ger_006',	1,	'GERMANY(BREMEN)',	'GERMANIA(BREMA)',	'ALEMANIA(BREMEN)',	'ALEMAGNE(BRÊME)',	'ALEMANHA(BREMA)')," +
				"('eu_ger_007',	1,	'GERMANY(HAMBURG)',	'GERMANIA(AMBURGO)',	'ALEMANIA(HAMBURGO)',	'ALEMAGNE(HAMBURG)',	'ALEMANHA(HAMBURGO)')," +
				"('eu_ger_008',	1,	'GERMANY(HESSEN/WIESBADEN)',	'GERMANIA(HESSEN/WIESBADEN)',	'ALEMANIA(HESSEN/WIESBADEN)',	'ALEMAGNE(HESSEN/WIESBADEN)',	'ALEMANHA(HESSEN/WIESBADEN)')," +
				"('eu_ger_009',	1,	'GERMANY(MECKLENBURG-VORPOMMERN)',	'GERMANIA(MECKLENBURG-VORPOMMERN)',	'ALEMANIA(MECKLENBURG-VORPOMMERN)',	'ALEMAGNE(MECKLENBURG-VORPOMMERN)',	'ALEMANHA(MECKLENBURG-VORPOMMERN)')," +
				"('eu_ger_010',	1,	'GERMANY NORDRHEIN-WESTFALEN(DÜSSELDORF)',	'GERMANIA NORDRHEIN-WESTFALEN(DÜSSELDORF)',	'ALEMANIA NORDRHEIN-WESTFALEN(DUSSELDORF)',	'ALEMAGNE NORDRHEIN-WESTFALEN(DUSSELDORF)',	'ALEMANHA NORDRHEIN-WESTFALEN(DUSSELDORF)')," +
				"('eu_ger_011',	1,	'GERMANY(RHEINLAND/PFALZ/MAINZ)',	'GERMANIA(RHEINLAND/PFALZ/MAINZ)',	'ALEMANIA(RHEINLAND/PFALZ/MAINZ)',	'ALEMAGNE(RHEINLAND/PFALZ/MAINZ)',	'ALEMANHA(RHEINLAND/PFALZ/MAINZ)')," +
				"('eu_ger_012',	1,	'GERMANY(SAARLAND/SAARBRÜCKEN)',	'GERMANIA(SAARLAND/SAARBRÜCKEN)',	'ALEMANIA(SAARLAND/SAARBRUCKEN)',	'ALEMAGNE(SAARLAND/SAARBRUCKEN)',	'ALEMANHA(SAARLAND/SAARBRUCKEN)')," +
				"('eu_ger_013',	1,	'GERMANY(SACHSEN)',	'GERMANIA(SACHSEN)',	'ALEMANIA(SACHSEN)',	'ALEMAGNE(SACHSEN)',	'ALEMANHA(SACHSEN)')," +
				"('eu_ger_014',	1,	'GERMANY(SACHSEN-ANHALT)',	'GERMANIA(SACHSEN-ANHALT)',	'ALEMANIA(SACHSEN-ANHALT)',	'ALEMAGNE(SACHSEN-ANHALT)',	'ALEMANHA(SACHSEN-ANHALT)')," +
				"('eu_ger_015',	1,	'GERMANY(SCHLESWIG-HOLSTEIN)',	'GERMANIA(SCHLESWIG-HOLSTEIN)',	'ALEMANIA(SCHLESWIG-HOLSTEIN)',	'ALEMAGNE(SCHLESWIG-HOLSTEIN)',	'ALEMANHA(SCHLESWIG-HOLSTEIN)')," +
				"('eu_ger_016',	1,	'GERMANY(THÜRINGEN)',	'GERMANIA(THÜRINGEN)',	'ALEMANIA(THURINGEN)',	'ALEMAGNE(THURINGEN)',	'ALEMANHA(THURINGEN)')," +
				"('eu_ger_017',	1,	'GERMANY(INGOLSTADT)',	'GERMANIA(INGOLSTADT)',	'ALEMANIA(INGOLSTADT)',	'ALEMAGNE(INGOLSTADT)',	'ALEMANHA(INGOLSTADT)')," +
				"('eu_gre_001',	1,	'GREECE',	'GRECIA',	'GRECIA',	'GRÈCE',	'GRÉCIA')," +
				"('eu_hun_001',	1,	'HUNGARY',	'UNGHERIA',	'HUNGRÍA',	'HONGRIE',	'HUNGRIA')," +
				"('eu_irl_001',	1,	'IRELAND',	'IRLANDA',	'IRLANDA',	'IRLANDE',	'IRLANDA')," +
				"('eu_isl_001',	1,	'ICELAND',	'ISLANDA',	'ISLANDIA',	'ISLANDE',	'ISLÂNDIA')," +
				"('eu_ism_001',	1,	'ISLE OF MAN',	'ISOLA DI MAN',	'ISLA DE MAN',	'ÎLE DE MAN',	'ILHA DE MAN')," +
				"('eu_ita_001',	1,	'ITALY - PROVINCE OF BOLOGNA',	'ITALIA - PROVINCIA DI BOLOGNA',	'ITALIA - LA PROVINCIA DE BOLOGNA',	'ITALIE - LA PROVINCE DE BOLOGNA',	'ITALIA - PROVÍNCIA DE BOLOGNA')," +
				"('eu_ita_002',	1,	'ITALY - PROVINCE OF CAGLIARI',	'ITALIA - PROVINCIA DI CAGLIARI',	'ITALIA - LA PROVINCIA DE CAGLIARI',	'ITALIE - LA PROVINCE DE CAGLIARI',	'ITALIA - PROVÍNCIA DE CAGLIARI')," +
				"('eu_ita_003',	1,	'ITALY - PROVINCE OF CHIETI',	'ITALIA - PROVINCIA DI CHIETI',	'ITALIA - LA PROVINCIA DE CHIETI',	'ITALIE - LA PROVINCE DE CHIETI',	'ITALIA - PROVÍNCIA DE CHIETI')," +
				"('eu_ita_004',	1,	'ITALY - PROVINCE OF FLORENCE',	'ITALIA - PROVINCIA DI FIRENZE',	'ITALIA - LA PROVINCIA DE FLORENCIA',	'ITALIE - LA PROVINCE DE FLORENCE',	'ITALIA - PROVÍNCIA DE FLORENÇA')," +
				"('eu_ita_005',	1,	'ITALY - PROVINCE OF GENOA',	'ITALIA - PROVINCIA DI GENOVA',	'ITALIA - LA PROVINCIA DE GENOVA',	'ITALIE - LA PROVINCE DE GENOA',	'ITALIA - PROVÍNCIA DE GÊNOVA')," +
				"('eu_ita_006',	1,	'ITALY - PROVINCE OF LATINA',	'ITALIA - PROVINCIA DI LATINA',	'ITALIA - LA PROVINCIA DE LATINA',	'ITALIE - LA PROVINCE DE LATINA',	'ITALIA - PROVÍNCIA DE LATINA')," +
				"('eu_ita_007',	1,	'ITALY - PROVINCE OF MESSINA',	'ITALIA - PROVINCIA DI MESSINA',	'ITALIA - LA PROVINCIA DE MESSINA',	'ITALIE - LA PROVINCE DE MESSINA',	'ITALIA - PROVÍNCIA DE MESSINA')," +
				"('eu_ita_008',	1,	'ITALY - PROVINCE OF MILAN',	'ITALIA - PROVINCIA DI MILANO',	'ITALIA - LA PROVINCIA DE MILAN',	'ITALIE - LA PROVINCE DE MILAN',	'ITALIA - PROVÍNCIA DE MILAN')," +
				"('eu_ita_009',	1,	'ITALY - PROVINCE OF MODENA',	'ITALIA - PROVINCIA DI MODENA',	'ITALIA - LA PROVINCIA DE MODENA',	'ITALIE - LA PROVINCE DE MODENA',	'ITALIA - PROVÍNCIA DE MODENA')," +
				"('eu_ita_010',	1,	'ITALY - PROVINCE OF NAPLES',	'ITALIA - PROVINCIA DI NAPOLI',	'ITALIA - LA PROVINCIA DE NÁPOLES',	'ITALIE - LA PROVINCE DE NAPLES',	'ITALIA - PROVÍNCIA DE NÁPOLES')," +
				"('eu_ita_011',	1,	'ITALY - PROVINCE OF PALERMO',	'ITALIA - PROVINCIA DI PALERMO',	'ITALIA - LA PROVINCIA DE PALERMO',	'ITALIE - LA PROVINCE DE PALERMO',	'ITALIA - PROVÍNCIA DE PALERMO')," +
				"('eu_ita_012',	1,	'ITALY - PROVINCE OF PISA',	'ITALIA - PROVINCIA DI PISA',	'ITALIA - LA PROVINCIA DE PISA',	'ITALIE - LA PROVINCE DE PISA',	'ITALIA - PROVÍNCIA DE PISA')," +
				"('eu_ita_013',	1,	'ITALY - PROVINCE OF POTENZA',	'ITALIA - PROVINCIA DI POTENZA',	'ITALIA - LA PROVINCIA DE POTENZA',	'ITALIE - LA PROVINCE DE POTENZA',	'ITALIA - PROVÍNCIA DE POTENZA')," +
				"('eu_ita_014',	1,	'ITALY - PROVINCE OF ROME',	'ITALIA - PROVINCIA DI ROMA',	'ITALIA - LA PROVINCIA DE ROMA',	'ITALIE - LA PROVINCE DE ROME',	'ITALIA - PROVÍNCIA DE ROMA')," +
				"('eu_ita_015',	1,	'ITALY - PROVINCE OF SALERNO',	'ITALIA - PROVINCIA DI SALERNO',	'ITALIA - LA PROVINCIA DE SALERNO',	'ITALIE - LA PROVINCE DE SALERNO',	'ITALIA - PROVÍNCIA DE SALERNO')," +
				"('eu_ita_016',	1,	'ITALY - PROVINCE OF TORINO',	'ITALIA - PROVINCIA DI TORINO',	'ITALIA - LA PROVINCIA DE TORINO',	'ITALIE - LA PROVINCE DE TORINO',	'ITALIA - PROVÍNCIA DE TORINO')," +
				"('eu_ita_017',	1,	'ITALY - PROVINCE OF VENICE',	'ITALIA - PROVINCIA DI VENEZIA',	'ITALIA - LA PROVINCIA DE VENECIA',	'ITALIE - LA PROVINCE DE VENISE',	'ITALIA - PROVÍNCIA DE VENEZA')," +
				"('eu_ita_018',	1,	'ITALY - PROVINCE OF VERONA',	'ITALIA - PROVINCIA DI VERONA',	'ITALIA - LA PROVINCIA DE VERONA',	'ITALIE - LA PROVINCE DE VERONA',	'ITALIA - PROVÍNCIA DE VERONA')," +
				"('eu_kos_001',	1,	'REPUBLIC OF KOSOVO',	'REPUBBLICA DEL KOSSOVO',	'REPÚBLICA DE KOSOVO',	'RÉPUBLIC DU KOSOVO',	'REPÚBLICA DO KOSOVO')," +
				"('eu_lat_001',	1,	'LATVIA',	'LETTONIA',	'LETONIA',	'LETTONIE',	'LETÔNIA')," +
				"('eu_lie_001',	1,	'LIECHTENSTEIN',	'LIECHTENSTEIN',	'LIECHTENSTEIN',	'LIECHTENSTEIN',	'LIECHTENSTEIN')," +
				"('eu_lit_001',	1,	'LITHUANIA',	'LITUANIA',	'LITUANIA',	'LITUANIE',	'LITUÂNIA')," +
				"('eu_lux_001',	1,	'LUXEMBOURG',	'LUSSEMBURGO',	'LUXEMBURGO',	'LUXEMBOURG',	'LUXEMBURGO')," +
				"('eu_mac_001',	1,	'MACEDONIA',	'MACEDONIA',	'MACEDONIA',	'MACÉDOINE',	'MACEDÔNIA')," +
				"('eu_mal_001',	1,	'MALTA',	'MALTA',	'MALTA',	'MALTE',	'MALTA')," +
				"('eu_mol_001',	1,	'MOLDOVA',	'MOLDAVIA',	'MOLDOVIA',	'MOLDOVIE',	'MOLDÁVIA')," +
				"('eu_mon_001',	1,	'MONACO',	'MONACO',	'MONACO',	'MONACO',	'MONACO')," +
				"('eu_mne_001',	1,	'MONTENEGRO',	'MONTENEGRO',	'MONTENEGRO',	'MONTENEGRO',	'MONTENEGRO')," +
				"('eu_net_001',	1,	'NETHERLANDS',	'PAESI BASSI',	'PAÍSES BAJOS',	'PAYS-BAS',	'PAÍSES BAIXOS')," +
				"('eu_nor_001',	1,	'NORWAY',	'NORVEGIA',	'NORUEGA',	'NORVÈGE',	'NORUEGA')," +
				"('eu_pol_001',	1,	'POLAND',	'POLONIA',	'POLONIA',	'POLOGNE',	'POLÓNIA')," +
				"('eu_por_001',	1,	'PORTUGAL',	'PORTOGALLO',	'PORTUGAL',	'PORTUGAL',	'PORTUGAL')," +
				"('eu_rom_001',	1,	'ROMANIA',	'ROMANIA',	'ROUMANIE',	'ROMANIA',	'ROUMANIE')," +
				"('eu_rus_001',	1,	'RUSSIA',	'RUSSIA',	'RUSIA',	'RUSSIE',	'RUSSIA')," +
				"('eu_rsm_001',	1,	'SAN MARINO',	'SAN MARINO',	'SAN MARINO',	'SAN MARINO',	'SAN MARINO')," +
				"('eu_sco_001',	1,	'SCOTLAND',	'SCOZIA',	'ESCOCIA',	'ECOSSE',	'ESCÓCIA')," +
				"('eu_slo_001',	1,	'SLOVAKIA',	'SLOVACCHIA',	'ESLOVAQUIA',	'SLOVAQUIE',	'ESLOVÁQUIA')," +
				"('eu_slv_001',	1,	'SLOVENIA',	'SLOVENIA',	'ESLOVENIA', 'SLOVÉNIE', 'ESLOVÉNIA')," +
				"('eu_spa_001',	1,	'SPAIN',	'SPAGNA',	'ESPAÑA',	'ESPAGNE',	'ESPANHA')," +
				"('eu_srb_001',	1,	'SERBIA',	'SERBIA',	'SERBIA',	'SERBIE',	'SÉRVIA')," +
				"('eu_swe_001',	1,	'SWEDEN',	'SVEZIA',	'SUECIA',	'SUÈDE',	'SUÉCIA')," +				
				"('eu_swi_001',	1,	'SWITZERLAND(AARGAU)',	'SVIZZERA(AARGAU)',	'SUIZA(AARGAU)',	'SUISSE(AARGAU)',	'SUÍÇA(AARGAU)')," +
				"('eu_swi_002',	1,	'SWITZERLAND(APPENZELL AUSSERRHODEN)',	'SVIZZERA(APPENZELL AUSSERRHODEN)',	'SUIZA(APPENZELL AUSSERRHODEN)',	'SUISSE(APPENZELL AUSSERRHODEN)',	'SUÍÇA(APPENZELL AUSSERRHODEN)')," +
				"('eu_swi_003',	1,	'SWITZERLAND(APPENZELL INNERRHODEN)',	'SVIZZERA(APPENZELL INNERRHODEN)',	'SUIZA(APPENZELL INNERRHODEN)',	'SUISSE(APPENZELL INNERRHODEN)',	'SUÍÇA(APPENZELL INNERRHODEN)')," +
				"('eu_swi_004',	1,	'SWITZERLAND(BASEL-LANDSCHAFT)',	'SVIZZERA(BASILEA-LANDSCHAFT)',	'SUIZA(BASILEA-LANDSCHAFT)',	'SUISSE(BÂLE-LANDSCHAFT)',	'SUÍÇA(BASEL-LANDSCHAFT)')," +
				"('eu_swi_005',	1,	'SWITZERLAND(BASEL-STADT)',	'SVIZZERA(BASILEA-STADT)',	'SUIZA(BASILEA-STADT)',	'SUISSE(BÂLE-STADT)',	'SUÍÇA(BASEL-STADT)')," +
				"('eu_swi_006',	1,	'SWITZERLAND(BERN)',	'SVIZZERA(BERNA)',	'SUIZA(BERNA)',	'SUISSE(BERN)',	'SUÍÇA(BERNA)')," +
				"('eu_swi_007',	1,	'SWITZERLAND(FRIBOURG)',	'SVIZZERA(FRIBURGO)',	'SUIZA(FRIBURGO)',	'SUISSE(FRIBOURG)',	'SUÍÇA(FRIBURGO)')," +
				"('eu_swi_009',	1,	'SWITZERLAND(GENEVE)',	'SVIZZERA(GINEVRA)',	'SUIZA(GINEBRA)',	'SUISSE(GENÈVE)',	'SUÍÇA(GENEBRA)')," +
				"('eu_swi_010',	1,	'SWITZERLAND(GLARUS)',	'SVIZZERA(GLARUS)',	'SUIZA(GLARIS)',	'SUISSE(GLARUS)',	'SUÍÇA(GLARUS)')," +
				"('eu_swi_011',	1,	'SWITZERLAND(GRAUBUNDEN)',	'SVIZZERA(GRIGIONI)',	'SUIZA(GRISONS)',	'SUISSE(GRISONS)',	'SUÍÇA(GRISONS)')," +
				"('eu_swi_012',	1,	'SWITZERLAND(JURA)',	'SVIZZERA(JURA)',	'SUIZA(JURA)',	'SUISSE(JURA)',	'SUÍÇA(JURA)')," +
				"('eu_swi_013',	1,	'SWITZERLAND(LUCERNE)',	'SVIZZERA(LUCERNA)',	'SUIZA(LUCERNA)',	'SUISSE(LUCERNE)',	'SUÍÇA(LUCERNA)')," +
				"('eu_swi_014',	1,	'SWITZERLAND(NEUCHATEL)',	'SVIZZERA(NEUCHATEL)',	'SUIZA(NEUCHATEL)',	'SUISSE(NEUCHATEL)',	'SUÍÇA(NEUCHATEL)')," +
				"('eu_swi_015',	1,	'SWITZERLAND(NIDWALDEN)',	'SVIZZERA(NIDWALDEN)',	'SUIZA(NIDWALDEN)',	'SUISSE(NIDWALDEN)',	'SUÍÇA(NIDWALDEN)')," +
				"('eu_swi_016',	1,	'SWITZERLAND(OBWALDEN)',	'SVIZZERA(OBWALDEN)',	'SUIZA(OBWALDEN)',	'SUISSE(OBWALDEN)',	'SUÍÇA(OBWALDEN)')," +
				"('eu_swi_017',	1,	'SWITZERLAND(SCHAFFHAUSEN)',	'SVIZZERA(SCHAFFHAUSEN)',	'SUIZA(SCHAFFHAUSEN)',	'SUISSE(SCHAFFHAUSEN)',	'SUÍÇA(SCHAFFHAUSEN)')," +
				"('eu_swi_018',	1,	'SWITZERLAND(SCHWYZ)',	'SVIZZERA(SCHWYZ)',	'SUIZA(SCHWYZ)',	'SUISSE(SCHWYZ)',	'SUÍÇA(SCHWYZ)')," +
				"('eu_swi_019',	1,	'SWITZERLAND(SOLOTHURN)',	'SVIZZERA(SOLOTHURN)',	'SUIZA(SOLEURE)',	'SUISSE(SOLEURE)',	'SUÍÇA(SOLEURE)')," +
				"('eu_swi_020',	1,	'SWITZERLAND(ST. GALLEN)',	'SVIZZERA(ST. GALLEN)',	'SUIZA(ST. GALLEN)',	'SUISSE(ST. GALL)',	'SUÍÇA(ST. GALLEN)')," +
				"('eu_swi_021',	1,	'SWITZERLAND(THURGAU)',	'SWITZERLAND(THURGAU)',	'SUIZA(THURGAU)',	'SUISSE(THURGAU)',	'SUÍÇA(THURGAU)')," +
				"('eu_swi_022',	1,	'SWITZERLAND(TICINO)',	'SVIZZERA(TICINO)',	'SUIZA(TICINO)',	'SUISSE(TICINO)',	'SUÍÇA(TICINO)')," +
				"('eu_swi_023',	1,	'SWITZERLAND(URI)',	'SVIZZERA(URI)',	'SUIZA(URI)',	'SUISSE(URI)',	'SUÍÇA(URI)')," +
				"('eu_swi_024',	1,	'SWITZERLAND(VALAIS)',	'SVIZZERA(VALAIS)',	'SUIZA(VALAIS)',	'SUISSE(VALAIS)',	'SUÍÇA(VALAIS)')," +
				"('eu_swi_025',	1,	'SWITZERLAND(VAUD)',	'SVIZZERA(VAUD)',	'SUIZA(VAUD)',	'SUISSE(VAUD)',	'SUÍÇA(VAUD)')," +
				"('eu_swi_026',	1,	'SWITZERLAND(ZUG)',	'SVIZZERA(ZUG)',	'SUIZA(ZUG)',	'SUISSE(ZUG)',	'SUÍÇA(ZUG)')," +
				"('eu_swi_027',	1,	'SWITZERLAND(ZURICH)',	'SVIZZERA(ZURIGO)',	'SUIZA(ZURICH)',	'SUISSE(ZURICH)',	'SUÍÇA(ZURICH)')," +
				"('eu_taj_001',	1,	'TAJIKISTAN',	'TAGIKISTAN',	'TAYIKISTÁN',	'TADJIKISTAN',	'TAJIKISTAN')," +
				"('eu_tur_001',	1,	'TURKEY',	'TURCHIA',	'TURQUÍA',	'TURQUIE',	'TURQUIA')," +
				"('eu_ukr_001',	1,	'UKRAINE',	'UCRAINA',	'UCRAINA',	'UKRAINE',	'UCRÂNIA')," +
				"('eu_uzb_001',	1,	'UZBEKISTAN',	'UZBEKISTAN',	'UZBEKISTÁN',	'OUZBEKISTAN',	'UZBEQUISTÃO')," +
				"('eu_vat_001',	1,	'VATICAN CITY',	'CITTÀ DEL VATICANO',	'CIUDAD DEL VATICANO',	'CITE DU VATICAN',	'CIDADE DO VATICANO')," +
				"('eu_wal_001',	1,	'WALES',	'GALLES',	'GALES',	'PAYS DE GALLES',	'PAÍS DE GALES')," +				
				"('us_alb_001',	1,	'ALABAMA',	'ALABAMA',	'ALABAMA',	'ALABAMA',	'ALABAMA')," +
				"('us_als_001',	1,	'ALASKA',	'ALASKA',	'ALASKA',	'ALASKA',	'ALASKA')," +
				"('us_ari_001',	1,	'ARIZONA',	'ARIZONA',	'ARIZONA',	'ARIZONA',	'ARIZONA')," +
				"('us_ark_001',	1,	'ARKANSAS',	'ARKANSAS',	'ARKANSAS',	'ARKANSAS',	'ARKANSAS')," +
				"('us_cal_001',	1,	'CALIFORNIA',	'CALIFORNIA',	'CALIFORNIA',	'CALIFORNIA',	'CALIFORNIA')," +
				"('us_col_001',	1,	'COLORADO',	'COLORADO',	'COLORADO',	'COLORADO',	'COLORADO')," +
				"('us_con_001',	1,	'CONNECTICUT',	'CONNECTICUT',	'CONNECTICUT',	'CONNECTICUT',	'CONNECTICUT')," +
				"('us_del_001',	1,	'DELAWARE',	'DELAWARE',	'DELAWARE',	'DELAWARE',	'DELAWARE')," +
				"('us_flo_001',	1,	'FLORIDA',	'FLORIDA',	'FLORIDA',	'FLORIDA',	'FLORIDA')," +
				"('us_geo_001',	1,	'GEORGIA',	'GEORGIA',	'GEORGIA',	'GEORGIA',	'GEORGIA')," +
				"('us_haw_001',	1,	'HAWAII',	'HAWAII',	'HAWAII',	'HAWAII',	'HAWAII')," +
				"('us_ida_001',	1,	'IDAHO',	'IDAHO',	'IDAHO',	'IDAHO',	'IDAHO')," +
				"('us_ill_001',	1,	'ILLINOIS',	'ILLINOIS',	'ILLINOIS',	'ILLINOIS',	'ILLINOIS')," +
				"('us_ind_001',	1,	'INDIANA',	'INDIANA',	'INDIANA',	'INDIANA',	'INDIANA')," +
				"('us_iow_001',	1,	'IOWA',	'IOWA',	'IOWA',	'IOWA',	'IOWA')," +
				"('us_kan_001',	1,	'KANSASAS',	'KANSASAS',	'KANSASAS',	'KANSASAS',	'KANSASAS')," +
				"('us_ken_001',	1,	'KENTUCKY',	'KENTUCKY',	'KENTUCKY',	'KENTUCKY',	'KENTUCKY')," +
				"('us_lou_001',	1,	'LOUSIANA',	'LOUSIANA',	'LOUSIANA',	'LOUSIANA',	'LOUSIANA')," +
				"('us_mai_001',	1,	'MAINE',	'MAINE',	'MAINE',	'MAINE',	'MAINE')," +
				"('us_mar_001',	1,	'MARYLAND',	'MARYLAND',	'MARYLAND',	'MARYLAND',	'MARYLAND')," +
				"('us_mas_001',	1,	'MASSACHUSETTS',	'MASSACHUSETTS',	'MASSACHUSETTS',	'MASSACHUSETTS',	'MASSACHUSETTS')," +
				"('us_mic_001',	1,	'MICHIGAN',	'MICHIGAN',	'MICHIGAN',	'MICHIGAN',	'MICHIGAN')," +
				"('us_min_001',	1,	'MINNESOTA',	'MINNESOTA',	'MINNESOTA',	'MINNESOTA',	'MINNESOTA')," +
				"('us_msi_001',	1,	'MISSISSIPPI',	'MISSISSIPPI',	'MISSISSIPPI',	'MISSISSIPPI',	'MISSISSIPPI')," +
				"('us_mso_001',	1,	'MISSOURI',	'MISSOURI',	'MISSOURI',	'MISSOURI',	'MISSOURI')," +
				"('us_mon_001',	1,	'MONTANA',	'MONTANA',	'MONTANA',	'MONTANA',	'MONTANA')," +
				"('us_neb_001',	1,	'NEBRASKA',	'NEBRASKA',	'NEBRASKA',	'NEBRASKA',	'NEBRASKA')," +
				"('us_nev_001',	1,	'NEVADA',	'NEVADA',	'NEVADA',	'NEVADA',	'NEVADA')," +
				"('us_neh_001',	1,	'NEWHAMPSHIRE',	'NEWHAMPSHIRE',	'NEWHAMPSHIRE',	'NEWHAMPSHIRE',	'NEWHAMPSHIRE')," +
				"('us_nej_001',	1,	'NEW JERSEY',	'NEW JERSEY',	'NEW JERSEY',	'NEW JERSEY',	'NEW JERSEY')," +
				"('us_nem_001',	1,	'NEW MEXICO',	'NEW MEXICO',	'NEW MEXICO',	'NEW MEXICO',	'NEW MEXICO')," +
				"('us_ney_001',	1,	'NEW YORK',	'NEW YORK',	'NEW YORK',	'NEW YORK',	'NEW YORK')," +
				"('us_nrc_001',	1,	'NORTH CAROLINA',	'NORTH CAROLINA',	'NORTH CAROLINA',	'NORTH CAROLINA',	'NORTH CAROLINA')," +
				"('us_nrd_001',	1,	'NORTH DAKOTA',	'NORTH DAKOTA',	'NORTH DAKOTA',	'NORTH DAKOTA',	'NORTH DAKOTA')," +
				"('us_ohi_001',	1,	'OHIO',	'OHIO',	'OHIO',	'OHIO',	'OHIO')," +
				"('us_okl_001',	1,	'OKLAHOMA',	'OKLAHOMA',	'OKLAHOMA',	'OKLAHOMA',	'OKLAHOMA')," +
				"('us_ore_001',	1,	'OREGON',	'OREGON',	'OREGON',	'OREGON',	'OREGON')," +
				"('us_pen_001',	1,	'PENNSYLVANIA',	'PENNSYLVANIA',	'PENNSYLVANIA',	'PENNSYLVANIA',	'PENNSYLVANIA')," +
				"('us_rho_001',	1,	'RHODEILSLAND',	'RHODEILSLAND',	'RHODEILSLAND',	'RHODEILSLAND',	'RHODEILSLAND')," +
				"('us_soc_001',	1,	'SOUTH CAROLINA',	'SOUTH CAROLINA',	'SOUTH CAROLINA',	'SOUTH CAROLINA',	'SOUTH CAROLINA')," +
				"('us_sod_001',	1,	'SOUTH DAKOTA',	'SOUTH DAKOTA',	'SOUTH DAKOTA',	'SOUTH DAKOTA',	'SOUTH DAKOTA')," +
				"('us_ten_001',	1,	'TENNESSEE',	'TENNESSEE',	'TENNESSEE',	'TENNESSEE',	'TENNESSEE')," +
				"('us_tex_001',	1,	'TEXAS',	'TEXAS',	'TEXAS',	'TEXAS',	'TEXAS')," +
				"('us_uth_001',	1,	'UTAH',	'UTAH',	'UTAH',	'UTAH',	'UTAH')," +
				"('us_ver_001',	1,	'VERMONT',	'VERMONT',	'VERMONT',	'VERMONT',	'VERMONT')," +
				"('us_vir_001',	1,	'VIRGINIA',	'VIRGINIA',	'VIRGINIA',	'VIRGINIA',	'VIRGINIA')," +
				"('us_was_001',	1,	'WASHINGTON',	'WASHINGTON',	'WASHINGTON',	'WASHINGTON',	'WASHINGTON')," +
				"('us_wes_001',	1,	'WEST VIRGINIA',	'WEST VIRGINIA',	'WEST VIRGINIA',	'WEST VIRGINIA',	'WEST VIRGINIA')," +
				"('us_wis_001',	1,	'WISCONSIN',	'WISCONSIN',	'WISCONSIN',	'WISCONSIN',	'WISCONSIN')," +
				"('us_wiy_001',	1,	'WYOMING',	'WYOMING',	'WYOMING',	'WYOMING',	'WYOMING');";
		return lang;*/
	}
}
