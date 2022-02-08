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

package com.sx.icecap.datatype.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.LocaleException;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.LocalizedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.model.WorkflowedModel;

import java.util.Date;
import java.util.Locale;
import java.util.Map;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the DataType service. Represents a row in the &quot;SXDatatype_DataType&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.sx.icecap.datatype.model.impl.DataTypeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.sx.icecap.datatype.model.impl.DataTypeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DataType
 * @generated
 */
@ProviderType
public interface DataTypeModel
	extends BaseModel<DataType>, GroupedModel, LocalizedModel, ShardedModel,
			StagedAuditedModel, WorkflowedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a data type model instance should use the {@link DataType} interface instead.
	 */

	/**
	 * Returns the primary key of this data type.
	 *
	 * @return the primary key of this data type
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this data type.
	 *
	 * @param primaryKey the primary key of this data type
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this data type.
	 *
	 * @return the uuid of this data type
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this data type.
	 *
	 * @param uuid the uuid of this data type
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the data type ID of this data type.
	 *
	 * @return the data type ID of this data type
	 */
	public long getDataTypeId();

	/**
	 * Sets the data type ID of this data type.
	 *
	 * @param dataTypeId the data type ID of this data type
	 */
	public void setDataTypeId(long dataTypeId);

	/**
	 * Returns the company ID of this data type.
	 *
	 * @return the company ID of this data type
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this data type.
	 *
	 * @param companyId the company ID of this data type
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the group ID of this data type.
	 *
	 * @return the group ID of this data type
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this data type.
	 *
	 * @param groupId the group ID of this data type
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the user ID of this data type.
	 *
	 * @return the user ID of this data type
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this data type.
	 *
	 * @param userId the user ID of this data type
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this data type.
	 *
	 * @return the user uuid of this data type
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this data type.
	 *
	 * @param userUuid the user uuid of this data type
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this data type.
	 *
	 * @return the user name of this data type
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this data type.
	 *
	 * @param userName the user name of this data type
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this data type.
	 *
	 * @return the create date of this data type
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this data type.
	 *
	 * @param createDate the create date of this data type
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this data type.
	 *
	 * @return the modified date of this data type
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this data type.
	 *
	 * @param modifiedDate the modified date of this data type
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the status of this data type.
	 *
	 * @return the status of this data type
	 */
	@Override
	public int getStatus();

	/**
	 * Sets the status of this data type.
	 *
	 * @param status the status of this data type
	 */
	@Override
	public void setStatus(int status);

	/**
	 * Returns the status by user ID of this data type.
	 *
	 * @return the status by user ID of this data type
	 */
	@Override
	public long getStatusByUserId();

	/**
	 * Sets the status by user ID of this data type.
	 *
	 * @param statusByUserId the status by user ID of this data type
	 */
	@Override
	public void setStatusByUserId(long statusByUserId);

	/**
	 * Returns the status by user uuid of this data type.
	 *
	 * @return the status by user uuid of this data type
	 */
	@Override
	public String getStatusByUserUuid();

	/**
	 * Sets the status by user uuid of this data type.
	 *
	 * @param statusByUserUuid the status by user uuid of this data type
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid);

	/**
	 * Returns the status by user name of this data type.
	 *
	 * @return the status by user name of this data type
	 */
	@AutoEscape
	@Override
	public String getStatusByUserName();

	/**
	 * Sets the status by user name of this data type.
	 *
	 * @param statusByUserName the status by user name of this data type
	 */
	@Override
	public void setStatusByUserName(String statusByUserName);

	/**
	 * Returns the status date of this data type.
	 *
	 * @return the status date of this data type
	 */
	@Override
	public Date getStatusDate();

	/**
	 * Sets the status date of this data type.
	 *
	 * @param statusDate the status date of this data type
	 */
	@Override
	public void setStatusDate(Date statusDate);

	/**
	 * Returns the data type name of this data type.
	 *
	 * @return the data type name of this data type
	 */
	@AutoEscape
	public String getDataTypeName();

	/**
	 * Sets the data type name of this data type.
	 *
	 * @param dataTypeName the data type name of this data type
	 */
	public void setDataTypeName(String dataTypeName);

	/**
	 * Returns the data type version of this data type.
	 *
	 * @return the data type version of this data type
	 */
	@AutoEscape
	public String getDataTypeVersion();

	/**
	 * Sets the data type version of this data type.
	 *
	 * @param dataTypeVersion the data type version of this data type
	 */
	public void setDataTypeVersion(String dataTypeVersion);

	/**
	 * Returns the display name of this data type.
	 *
	 * @return the display name of this data type
	 */
	public String getDisplayName();

	/**
	 * Returns the localized display name of this data type in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized display name of this data type
	 */
	@AutoEscape
	public String getDisplayName(Locale locale);

	/**
	 * Returns the localized display name of this data type in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized display name of this data type. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDisplayName(Locale locale, boolean useDefault);

	/**
	 * Returns the localized display name of this data type in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized display name of this data type
	 */
	@AutoEscape
	public String getDisplayName(String languageId);

	/**
	 * Returns the localized display name of this data type in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized display name of this data type
	 */
	@AutoEscape
	public String getDisplayName(String languageId, boolean useDefault);

	@AutoEscape
	public String getDisplayNameCurrentLanguageId();

	@AutoEscape
	public String getDisplayNameCurrentValue();

	/**
	 * Returns a map of the locales and localized display names of this data type.
	 *
	 * @return the locales and localized display names of this data type
	 */
	public Map<Locale, String> getDisplayNameMap();

	/**
	 * Sets the display name of this data type.
	 *
	 * @param displayName the display name of this data type
	 */
	public void setDisplayName(String displayName);

	/**
	 * Sets the localized display name of this data type in the language.
	 *
	 * @param displayName the localized display name of this data type
	 * @param locale the locale of the language
	 */
	public void setDisplayName(String displayName, Locale locale);

	/**
	 * Sets the localized display name of this data type in the language, and sets the default locale.
	 *
	 * @param displayName the localized display name of this data type
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDisplayName(
		String displayName, Locale locale, Locale defaultLocale);

	public void setDisplayNameCurrentLanguageId(String languageId);

	/**
	 * Sets the localized display names of this data type from the map of locales and localized display names.
	 *
	 * @param displayNameMap the locales and localized display names of this data type
	 */
	public void setDisplayNameMap(Map<Locale, String> displayNameMap);

	/**
	 * Sets the localized display names of this data type from the map of locales and localized display names, and sets the default locale.
	 *
	 * @param displayNameMap the locales and localized display names of this data type
	 * @param defaultLocale the default locale
	 */
	public void setDisplayNameMap(
		Map<Locale, String> displayNameMap, Locale defaultLocale);

	/**
	 * Returns the extension of this data type.
	 *
	 * @return the extension of this data type
	 */
	@AutoEscape
	public String getExtension();

	/**
	 * Sets the extension of this data type.
	 *
	 * @param extension the extension of this data type
	 */
	public void setExtension(String extension);

	/**
	 * Returns the sample file ID of this data type.
	 *
	 * @return the sample file ID of this data type
	 */
	public long getSampleFileId();

	/**
	 * Sets the sample file ID of this data type.
	 *
	 * @param sampleFileId the sample file ID of this data type
	 */
	public void setSampleFileId(long sampleFileId);

	/**
	 * Returns the description of this data type.
	 *
	 * @return the description of this data type
	 */
	public String getDescription();

	/**
	 * Returns the localized description of this data type in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized description of this data type
	 */
	@AutoEscape
	public String getDescription(Locale locale);

	/**
	 * Returns the localized description of this data type in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this data type. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getDescription(Locale locale, boolean useDefault);

	/**
	 * Returns the localized description of this data type in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized description of this data type
	 */
	@AutoEscape
	public String getDescription(String languageId);

	/**
	 * Returns the localized description of this data type in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized description of this data type
	 */
	@AutoEscape
	public String getDescription(String languageId, boolean useDefault);

	@AutoEscape
	public String getDescriptionCurrentLanguageId();

	@AutoEscape
	public String getDescriptionCurrentValue();

	/**
	 * Returns a map of the locales and localized descriptions of this data type.
	 *
	 * @return the locales and localized descriptions of this data type
	 */
	public Map<Locale, String> getDescriptionMap();

	/**
	 * Sets the description of this data type.
	 *
	 * @param description the description of this data type
	 */
	public void setDescription(String description);

	/**
	 * Sets the localized description of this data type in the language.
	 *
	 * @param description the localized description of this data type
	 * @param locale the locale of the language
	 */
	public void setDescription(String description, Locale locale);

	/**
	 * Sets the localized description of this data type in the language, and sets the default locale.
	 *
	 * @param description the localized description of this data type
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setDescription(
		String description, Locale locale, Locale defaultLocale);

	public void setDescriptionCurrentLanguageId(String languageId);

	/**
	 * Sets the localized descriptions of this data type from the map of locales and localized descriptions.
	 *
	 * @param descriptionMap the locales and localized descriptions of this data type
	 */
	public void setDescriptionMap(Map<Locale, String> descriptionMap);

	/**
	 * Sets the localized descriptions of this data type from the map of locales and localized descriptions, and sets the default locale.
	 *
	 * @param descriptionMap the locales and localized descriptions of this data type
	 * @param defaultLocale the default locale
	 */
	public void setDescriptionMap(
		Map<Locale, String> descriptionMap, Locale defaultLocale);

	/**
	 * Returns the tooltip of this data type.
	 *
	 * @return the tooltip of this data type
	 */
	public String getTooltip();

	/**
	 * Returns the localized tooltip of this data type in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param locale the locale of the language
	 * @return the localized tooltip of this data type
	 */
	@AutoEscape
	public String getTooltip(Locale locale);

	/**
	 * Returns the localized tooltip of this data type in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param locale the local of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized tooltip of this data type. If <code>useDefault</code> is <code>false</code> and no localization exists for the requested language, an empty string will be returned.
	 */
	@AutoEscape
	public String getTooltip(Locale locale, boolean useDefault);

	/**
	 * Returns the localized tooltip of this data type in the language. Uses the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @return the localized tooltip of this data type
	 */
	@AutoEscape
	public String getTooltip(String languageId);

	/**
	 * Returns the localized tooltip of this data type in the language, optionally using the default language if no localization exists for the requested language.
	 *
	 * @param languageId the ID of the language
	 * @param useDefault whether to use the default language if no localization exists for the requested language
	 * @return the localized tooltip of this data type
	 */
	@AutoEscape
	public String getTooltip(String languageId, boolean useDefault);

	@AutoEscape
	public String getTooltipCurrentLanguageId();

	@AutoEscape
	public String getTooltipCurrentValue();

	/**
	 * Returns a map of the locales and localized tooltips of this data type.
	 *
	 * @return the locales and localized tooltips of this data type
	 */
	public Map<Locale, String> getTooltipMap();

	/**
	 * Sets the tooltip of this data type.
	 *
	 * @param tooltip the tooltip of this data type
	 */
	public void setTooltip(String tooltip);

	/**
	 * Sets the localized tooltip of this data type in the language.
	 *
	 * @param tooltip the localized tooltip of this data type
	 * @param locale the locale of the language
	 */
	public void setTooltip(String tooltip, Locale locale);

	/**
	 * Sets the localized tooltip of this data type in the language, and sets the default locale.
	 *
	 * @param tooltip the localized tooltip of this data type
	 * @param locale the locale of the language
	 * @param defaultLocale the default locale
	 */
	public void setTooltip(String tooltip, Locale locale, Locale defaultLocale);

	public void setTooltipCurrentLanguageId(String languageId);

	/**
	 * Sets the localized tooltips of this data type from the map of locales and localized tooltips.
	 *
	 * @param tooltipMap the locales and localized tooltips of this data type
	 */
	public void setTooltipMap(Map<Locale, String> tooltipMap);

	/**
	 * Sets the localized tooltips of this data type from the map of locales and localized tooltips, and sets the default locale.
	 *
	 * @param tooltipMap the locales and localized tooltips of this data type
	 * @param defaultLocale the default locale
	 */
	public void setTooltipMap(
		Map<Locale, String> tooltipMap, Locale defaultLocale);

	/**
	 * Returns the has data structure of this data type.
	 *
	 * @return the has data structure of this data type
	 */
	public boolean getHasDataStructure();

	/**
	 * Returns <code>true</code> if this data type is has data structure.
	 *
	 * @return <code>true</code> if this data type is has data structure; <code>false</code> otherwise
	 */
	public boolean isHasDataStructure();

	/**
	 * Sets whether this data type is has data structure.
	 *
	 * @param hasDataStructure the has data structure of this data type
	 */
	public void setHasDataStructure(boolean hasDataStructure);

	/**
	 * Returns <code>true</code> if this data type is approved.
	 *
	 * @return <code>true</code> if this data type is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved();

	/**
	 * Returns <code>true</code> if this data type is denied.
	 *
	 * @return <code>true</code> if this data type is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied();

	/**
	 * Returns <code>true</code> if this data type is a draft.
	 *
	 * @return <code>true</code> if this data type is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft();

	/**
	 * Returns <code>true</code> if this data type is expired.
	 *
	 * @return <code>true</code> if this data type is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired();

	/**
	 * Returns <code>true</code> if this data type is inactive.
	 *
	 * @return <code>true</code> if this data type is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive();

	/**
	 * Returns <code>true</code> if this data type is incomplete.
	 *
	 * @return <code>true</code> if this data type is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete();

	/**
	 * Returns <code>true</code> if this data type is pending.
	 *
	 * @return <code>true</code> if this data type is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending();

	/**
	 * Returns <code>true</code> if this data type is scheduled.
	 *
	 * @return <code>true</code> if this data type is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled();

	@Override
	public String[] getAvailableLanguageIds();

	@Override
	public String getDefaultLanguageId();

	@Override
	public void prepareLocalizedFieldsForImport() throws LocaleException;

	@Override
	public void prepareLocalizedFieldsForImport(Locale defaultImportLocale)
		throws LocaleException;

}