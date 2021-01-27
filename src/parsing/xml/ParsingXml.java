package parsing.xml;

import java.io.File;
import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ParsingXml {

	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
        
		Document document = builder.parse(new File("/home/faheem/employees.xml"));
		document.getDocumentElement().normalize();
		
		//root element
		Element root = document.getDocumentElement();
		System.out.println(root.getNodeName());
		//get all employees
		NodeList nodeList = document.getElementsByTagName("employee");
		System.out.println("============================");
		
		for (int i = 0; i < nodeList.getLength(); i++)
		{
		 Node node = nodeList.item(i);
		 System.out.println("");    //Just a separator
		 if (node.getNodeType() == Node.ELEMENT_NODE)
		 {
		    //Print each employee's detail
		    Element eElement = (Element) node;
		    System.out.println("Employee id : "    + eElement.getAttribute("id"));
		    System.out.println("First Name : "  + eElement.getElementsByTagName("firstName").item(0).getTextContent());
		    System.out.println("Last Name : "   + eElement.getElementsByTagName("lastName").item(0).getTextContent());
		    System.out.println("Location : "    + eElement.getElementsByTagName("location").item(0).getTextContent());
		 }
		}
		
	}

}
