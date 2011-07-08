package learn.spring25.di.creatingbeans.withinstancefactorymethod;

import learn.spring25.Document;

public class DocumentCreator {
	public Document createDocument(String name) {
		return new Document("STATIC_CREATED => " + name);
	}
}