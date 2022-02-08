package com.sx.icecap.datatype.search;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Field;
import com.liferay.portal.search.spi.model.index.contributor.ModelDocumentContributor;
import com.sx.icecap.datatype.constants.IcecapDataTypeAttributes;
import com.sx.icecap.datatype.model.DataType;

import org.osgi.service.component.annotations.Component;

/**
 * The contributor is a actual indexer when each DataType data is added or updated.
 * Super interface ModelDocumentContributor has only one unimplemented API.
 * 
**/
@Component(
		immediate = true,
		property = "indexer.class.name=com.sx.icecap.datatype.model.DataType",
		service = ModelDocumentContributor.class
)
public class DataTypeModelDocumentContributor implements ModelDocumentContributor<DataType> {
	private static final Log _log = LogFactoryUtil.getLog(DataTypeModelDocumentContributor.class);
	
	@Override
	public void contribute(Document document, DataType dataType) {
//			System.out.println("TermModelDocumentContributor.......");
			document.addDate(Field.MODIFIED_DATE, dataType.getModifiedDate());
			document.addKeyword(IcecapDataTypeAttributes.DATATYPE_NAME, dataType.getDataTypeName());
			document.addLocalizedKeyword(IcecapDataTypeAttributes.DESCRIPTION, dataType.getDescriptionMap(), true);
			document.addLocalizedKeyword(IcecapDataTypeAttributes.DISPLAY_NAME, dataType.getDisplayNameMap(), true);
			document.addKeyword(IcecapDataTypeAttributes.STATUS, dataType.getStatus());
	}
	
}
