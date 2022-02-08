create index IX_A381F861 on SXDatatype_DataType (dataTypeName[$COLUMN_LENGTH:75$], dataTypeVersion[$COLUMN_LENGTH:75$]);
create index IX_45A5E610 on SXDatatype_DataType (groupId, status);
create index IX_20AF9A4A on SXDatatype_DataType (groupId, userId, status);
create index IX_E843B266 on SXDatatype_DataType (status);
create index IX_2DBEB0A0 on SXDatatype_DataType (userId, status);
create index IX_CE59574 on SXDatatype_DataType (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_D1FCE8F6 on SXDatatype_DataType (uuid_[$COLUMN_LENGTH:75$], groupId);

create index IX_FDE5B45D on SX_DataType (dataTypeName[$COLUMN_LENGTH:75$], dataTypeVersion[$COLUMN_LENGTH:75$]);
create index IX_F79C0B0C on SX_DataType (groupId, status);
create index IX_F9F0346 on SX_DataType (groupId, userId, status);
create index IX_7ECC1EA on SX_DataType (status);
create index IX_A31FC24 on SX_DataType (userId, status);
create index IX_99B40FF8 on SX_DataType (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_AE70347A on SX_DataType (uuid_[$COLUMN_LENGTH:75$], groupId);