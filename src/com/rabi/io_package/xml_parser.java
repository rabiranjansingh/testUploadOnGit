package com.rabi.io_package;

import java.io.File;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.dom4j.*;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.io.SAXReader;




public class xml_parser {

	public static void main(String[] args) 
	{
		
		Foo  obj= new Foo();
		//obj.parse("");  // this method will parse url xml 
		 
		
		try {
			
		Document document=	obj.parseXml("E:\\cpptutorial\\cpp\\io_package\\src\\com\\rabi\\io_package\\emp.xml");
		
		obj.bar(document);
		
		obj.experiment(document);
			
			
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
class Foo {

	
	
	public Document parseXml(String path) throws DocumentException
	{
		   File inputFile = new File(path);
	       SAXReader reader = new SAXReader();
	       Document document = reader.read(inputFile); // it throw exception 

	       //System.out.println("Root element :" + document.getRootElement().getName());
	       
	       return document;
	}
	
	
	
	
	
	// parsing xml  this is for parse url based xml 
    public Document parse(URL url) throws DocumentException {
        SAXReader reader = new SAXReader();
        Document document = reader.read(url);
        return document;
    }
    
    
    public void bar(Document document) throws DocumentException {

        Element root = document.getRootElement();

        // iterate through child elements of root
        for (Iterator<Element> it = root.elementIterator(); it.hasNext();) {
            Element element = it.next();
            System.out.println("Root element :" +element.getName());
            System.out.println("attribute  :" +element.attributeValue("id"));
            // do something
        }

        // iterate through child elements of root with element name "foo"
        for (Iterator<Element> it = root.elementIterator("employee"); it.hasNext();) {
            Element foo = it.next();
            System.out.println(" data is  :" +foo.getName());
            // do something
        }

        // iterate through attributes of root
        for (Iterator<Attribute> it = root.attributeIterator(); it.hasNext();) {
            Attribute attribute = it.next();
            // do something
        }
     }//bar
    
    
    public void  experiment(Document doc)
    {
    	
         System.out.println(" output from experiment control ");
        Map map = new HashMap();
    	if (doc == null)
    		System.out.println(" Document is null " );

    	Element root = doc.getRootElement();
    	for (Iterator iterator = root.elementIterator(); iterator.hasNext();) 
        {
    		Element e = (Element) iterator.next();
    		System.out.println(" e . get name data "+e.getName());
    		List list = e.elements();


           // get the attribute values 
            String a = e.attributeValue("id");

            System.out.println("attribute values is "+ a);

    	
            System.out.println(" LIST SIZE IS "+ list.size() + " "+ list.getClass() +"  ");

            Iterator<Integer>  list_itr= list.iterator();
          
            while(list_itr.hasNext())
            {
            	
            	
                System.out.println(list_itr.next());
            }

    	}// for loop 
    	
    
    }
    
    
}