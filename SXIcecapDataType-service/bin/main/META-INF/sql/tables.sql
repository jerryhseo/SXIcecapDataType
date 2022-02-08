create table SXDatatype_DataType (
	uuid_ VARCHAR(75) null,
	dataTypeId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	dataTypeName VARCHAR(75) null,
	dataTypeVersion VARCHAR(75) null,
	displayName STRING null,
	extension VARCHAR(75) null,
	sampleFileId LONG,
	description STRING null,
	tooltip STRING null,
	hasDataStructure BOOLEAN
);

create table SXDatatype_DataTypeStructure (
	dataTypeId LONG not null primary key,
	structure VARCHAR(75) null
);

create table SX_DataType (
	uuid_ VARCHAR(75) null,
	dataTypeId LONG not null primary key,
	companyId LONG,
	groupId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	status INTEGER,
	statusByUserId LONG,
	statusByUserName VARCHAR(75) null,
	statusDate DATE null,
	dataTypeName VARCHAR(75) null,
	dataTypeVersion VARCHAR(75) null,
	displayName STRING null,
	extension VARCHAR(75) null,
	sampleFileId LONG,
	description STRING null,
	tooltip STRING null,
	hasDataStructure BOOLEAN
);

create table SX_DataTypeStructure (
	dataTypeId LONG not null primary key,
	structure VARCHAR(75) null
);