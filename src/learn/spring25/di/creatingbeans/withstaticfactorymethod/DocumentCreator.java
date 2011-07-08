package learn.spring25.di.creatingbeans.withstaticfactorymethod;

import learn.spring25.Document;

public class DocumentCreator {
	public static Document createDocument(String name) {
		return new Document("STATIC_CREATED => " + name);
	}
}