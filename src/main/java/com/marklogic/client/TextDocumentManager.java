package com.marklogic.client;

import com.marklogic.client.docio.TextReadHandle;
import com.marklogic.client.docio.TextWriteHandle;

/**
 * A Text Document Manager supports database operations on text documents.
 */
public interface TextDocumentManager extends AbstractDocumentManager<TextReadHandle, TextWriteHandle> {

}
