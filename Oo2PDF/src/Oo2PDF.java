
import java.io.File;
import java.net.ConnectException;

import com.artofsolving.jodconverter.DocumentConverter;
import com.artofsolving.jodconverter.openoffice.connection.OpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.connection.SocketOpenOfficeConnection;
import com.artofsolving.jodconverter.openoffice.converter.OpenOfficeDocumentConverter;

public class Oo2PDF {

	public static void main(String[] args) throws ConnectException {
		// TODO Auto-generated method stub
		
		OpenOfficeConnection connection = null;	
		connection = new SocketOpenOfficeConnection(8100);
		
		connection.connect();		
        DocumentConverter converter = new OpenOfficeDocumentConverter(connection);
        
        File srcFile = new File("D://testpdf//1.doc"); 
        File desFile = new File("D://testpdf//1.pdf");        
        converter.convert(srcFile, desFile);   
        
        
        /** File Stearm Test
		DocumentFormat idf;
		DocumentFormat odf;
		DefaultDocumentFormatRegistry formatReg = new DefaultDocumentFormatRegistry();
		idf = formatReg.getFormatByFileExtension("doc");
		odf = formatReg.getFormatByFileExtension("pdf");
		converter.convert(iAtt, idf, outAtt, odf);        
		*/
        
	}
}
