package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.List;
import java.util.TreeMap;

public class Main {

	public static void main(String[] args) throws IOException {

		/**
		 * String fileSymptoms is variable for import data file symptom
		 * LineSymptoms is a list for save "symptoms.txt"'s line
		 * mapSymptomsForCounter is map for manage data
		 */
		String fileSymptoms = "C:\\Users\\maxim\\eclipse-workspace\\symptoms.txt";

		try {
			/*
			 * STEP_01 Class for to read file symptoms.txt
			 * see readSymptomDataFromFile class
			 */
			readSymptomDataFromFile Read = new readSymptomDataFromFile();
			List<String> listSymptoms = Read.printSymptoms(fileSymptoms);

			/*
			 * STEP_02 Use Map for explode line to exploit lines
			 */
			analyticsCounter mapSymptoms = new analyticsCounter();
			TreeMap<String, Integer> mapSymptomsForCounter = mapSymptoms.BigMap(listSymptoms);

			/*
			 * STEP_03 it's a class to exploit information from map
			 */
			
			analyticsCounter analyticsCounters = new analyticsCounter();
			analyticsCounters.counter(mapSymptomsForCounter);

		} catch (IndexOutOfBoundsException e) {
			System.err.println("Caught IndexOutOfBoundsException: " + e.getMessage());
		}

		finally {
			System.out.println("Traitement termin�.");
		}

	}
}