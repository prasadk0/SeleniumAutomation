package TextNG;

public class ExcelfileReader {
	static 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object[][] obj = new Object[rowCount][colCount];
		for(int row=0;row<rowCount;row++) {
			for(int col=0;col<colCount;col++) {
				obj[row][col]=sheet.getRow(row).getCell(col);
			}
		}
		return obj;

	}

}
