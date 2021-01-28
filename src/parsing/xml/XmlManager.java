package parsing.xml;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class XmlManager {

	
	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
		
		try {
			//read();
			//write();
			writeFromList();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	

	private static List<Utente> allUsersInList() {
		List<Utente> userList = new ArrayList<>();
		userList.add(new Utente("1","faheem"));
		userList.add(new Utente("2","pippo"));
		userList.add(new Utente("3","Luca"));
		userList.add(new Utente("4","Angelo"));
		return userList;
	}
	
	public static void writeFromList() throws ParserConfigurationException, TransformerException {
		List<Utente> userList = allUsersInList();
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
		
        Document document = builder.newDocument();
        Element utenti = null;
        Element utente = null;
        Element name = null;
        
        utenti = document.createElement("utenti");
        document.appendChild(utenti);
        
        //...
       
        
        for(Utente utenteInList : userList) {
        	utente = document.createElement("utente");
        	utente.setAttribute("id", utenteInList.getId());
        	
        	name = document.createElement("name");
        	name.setTextContent(utenteInList.getName());
        	
        	utente.appendChild(name);
        	utenti.appendChild(utente);
        }
        
        
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		
		StreamResult result = new StreamResult(new File("/home/faheem/utenti.xml"));

		StreamResult syso = new StreamResult(System.out);

		transformer.transform(source, result);
		transformer.transform(source, syso);

		System.out.println("File saved!");
	}
	//Write method
	public static void write() throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = factory.newDocumentBuilder();
		
        Document document = builder.newDocument();
        Element utenti = document.createElement("utenti");
        document.appendChild(utenti);
        
        //...
        Element utente = null;
        Element name = null;
        for (int i = 0; i < 5; i++) {
        	utente = document.createElement("utente");
        	utente.setAttribute("id", Integer.toString(i));//meglio che i + ""
        	
        	name = document.createElement("name");
        	name.setTextContent("nome"+i);
        	utente.appendChild(name);
        	utenti.appendChild(utente);
        }
        
        System.out.println(utenti.getChildNodes().getLength());
        
		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		DOMSource source = new DOMSource(document);
		
		StreamResult result = new StreamResult(new File("/home/faheem/utenti.xml"));

		StreamResult syso = new StreamResult(System.out);

		transformer.transform(source, result);
		transformer.transform(source, syso);

		System.out.println("File saved!");
	}
	
	
	//Read method
	public static void read() throws ParserConfigurationException, SAXException, IOException {
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
		 System.out.println("");    
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
