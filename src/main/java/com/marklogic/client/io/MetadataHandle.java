package com.marklogic.client.io;

import java.io.InputStream;
import java.util.Map;
import java.util.Set;

import com.marklogic.client.Format;
import com.marklogic.client.io.marker.AbstractReadHandle;
import com.marklogic.client.io.marker.AbstractWriteHandle;
import com.marklogic.client.io.marker.MetadataReadHandle;
import com.marklogic.client.io.marker.MetadataWriteHandle;

public class MetadataHandle
    implements
    	AbstractReadHandle<InputStream>, AbstractWriteHandle<InputStream>,
    	MetadataReadHandle<InputStream>, MetadataWriteHandle<InputStream>
{
	public interface DocumentCollections extends Set<String> {
	}
	public interface DocumentPermissions extends Map<String,Set<Capability>> {
	    public void add(String role, Capability... capabilities);
	}
	public enum Capability {
	    EXECUTE, INSERT, READ, UPDATE;
	}
	// The value must be a boxed primitive such as Boolean, Date, Number, or String
	public interface DocumentProperties extends Map<String,Object> {
	}

	public MetadataHandle() {
		super();
	}

	public DocumentCollections getCollections() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setCollections(DocumentCollections collections) {
		// TODO Auto-generated method stub
	}
    public void setCollections(String... collections) {
		// TODO Auto-generated method stub
	}

	public DocumentPermissions getPermissions() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPermissions(DocumentPermissions permissions) {
		// TODO Auto-generated method stub
	}

	public DocumentProperties getProperties() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setProperties(DocumentProperties properties) {
		// TODO Auto-generated method stub
	}

	private int quality = 0;
	public int getQuality() {
		return quality;
	}
	public void setQuality(int quality) {
		this.quality = quality;
	}

	public Format getFormat() {
		return Format.XML;
	}
	public void setFormat(Format format) {
		if (format != Format.XML)
			new RuntimeException("MetadataHandle supports the XML format only");
	}

	public Class<InputStream> receiveAs() {
		return InputStream.class;
	}
	public void receiveContent(InputStream content) {
		// TODO
	}
	public InputStream sendContent() {
		// TODO
		return null;
	}
}