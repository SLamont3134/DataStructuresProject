package com.stlamont3134;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Arrays;

 class CSVParsing {
  private String fileName;

  CSVParsing(String fileName) {
    this.fileName = fileName;
  }

  void printFile() {
    try {
      CSVReader reader = new CSVReader(new FileReader(fileName));
      String[] nextLine;
      while ((nextLine = reader.readNext()) != null) {
        if ((nextLine != null)) {
          System.out.println(Arrays.toString(nextLine));
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("Couldn't Find File");
    } catch (CsvValidationException e) {
      System.out.println("Couldn't Validate CSV");
    } catch (Exception e) {
      System.out.println("Unknown Exception");
    }
  }
}
