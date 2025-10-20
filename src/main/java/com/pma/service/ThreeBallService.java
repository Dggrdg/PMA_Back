package com.pma.service;

import java.io.InputStream;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class ThreeBallService {

	public ResponseEntity<?> threeBall(MultipartFile file) {

		try {
			InputStream inputStream = file.getInputStream();

			Workbook workBook = new XSSFWorkbook(inputStream);

			for (int sheetNum = 0; sheetNum < workBook.getNumberOfSheets(); sheetNum++) {

//				XSSFSheet sheet = workBook.getSheetAt(sheetNum);
			}

			return null;
		} catch (Exception e) {
			return ResponseEntity.badRequest().body(e.getMessage());
		}
	}
}
