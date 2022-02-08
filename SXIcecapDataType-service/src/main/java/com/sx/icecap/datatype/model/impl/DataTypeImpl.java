/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.sx.icecap.datatype.model.impl;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.sx.icecap.datatype.model.DataTypeStructure;
import com.sx.icecap.datatype.service.DataTypeStructureLocalServiceUtil;

import java.util.Locale;

/**
 * @author Brian Wing Shun Chan
 */
public class DataTypeImpl extends DataTypeBaseImpl {
	
	public String getDisplayTitle( Locale locale ) {
		return getDisplayName( locale ) + " ver. " + getDataTypeVersion();
	}
	
	public String getDataStructure() {
		
		DataTypeStructure dataStructure = null;
		try {
			dataStructure = DataTypeStructureLocalServiceUtil.getDataTypeStructure(this.getDataTypeId());
			return dataStructure.getStructure();
		} catch (PortalException e) {
			return null;
		}
		
	}
	
	public JSONObject getDataStructureJSON() {
		
		DataTypeStructure dataStructure = null;
		try {
			dataStructure = DataTypeStructureLocalServiceUtil.getDataTypeStructure(this.getDataTypeId());
			return JSONFactoryUtil.createJSONObject( dataStructure.getStructure() );
		} catch (PortalException e) {
			return null;
		}
		
	}

}