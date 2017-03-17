package beproject;

import java.io.IOException;

public class Hypernyms {

	public void setup(String review_excel, String lem) {
		// TODO Auto-generated method stub
		NewExcel ne = new NewExcel();
		ne.setInputFile(review_excel);
		String[][] arr;
        arr = new String[100][100];
		try {
            arr = ne.read();
        }
        catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
	}

}
