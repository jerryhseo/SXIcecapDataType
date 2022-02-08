package com.sx.icecap.datatype.search.impl;

import com.liferay.portal.kernel.dao.orm.Property;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.search.batch.BatchIndexingActionable;
import com.liferay.portal.search.indexer.IndexerDocumentBuilder;
import com.liferay.portal.search.indexer.IndexerWriter;
import com.sx.icecap.datatype.model.DataType;
import com.sx.icecap.datatype.search.DataTypeBatchReindexer;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(
		immediate = true, 
		service = DataTypeBatchReindexer.class
)
public class DataTypeBatchReindexerImpl implements DataTypeBatchReindexer {

	@Override
	public void reindex(long termId, long companyId) {
		BatchIndexingActionable batchIndexingActionable = _indexerWriter.getBatchIndexingActionable();

		batchIndexingActionable.setAddCriteriaMethod(dynamicQuery -> {
			Property termIdProperty = PropertyFactoryUtil.forName("termId");
			dynamicQuery.add(termIdProperty.eq(termId));
		});

		batchIndexingActionable.setCompanyId(companyId);

		batchIndexingActionable.setPerformActionMethod((DataType term) -> {
			Document document = _indexerDocumentBuilder.getDocument(term);
			batchIndexingActionable.addDocuments(document);
		});

		batchIndexingActionable.performActions();
	}

	@Reference(
			target = "(indexer.class.name=com.sx.icecap.datatype.model.DataType)"
	)
	protected IndexerDocumentBuilder _indexerDocumentBuilder;

	@Reference(
			target = "(indexer.class.name=com.sx.icecap.datatype.model.DataType)"
	)
	protected IndexerWriter<DataType> _indexerWriter;
}
