package com.sx.icecap.datatype.constants;

public class IcecapDataTypeConstants {
	public static final String RESOURCE_NAME = "com.sx.icecap.datatype";
	public static final String VIEW_TEMPLATE = "/html/DataTypeManagement/datatype-list.jsp";
	public static final String DATATYPE_ELEMENTS_DEFAULT_EVENT_HANDLER =
			"DATATYPE_ELEMENTS_DEFAULT_EVENT_HANDLER";

	public static final String DATATYPE_CLASS_NAME = "com.sx.icecap.datatype.model.DataType";
	public static final String DATATYPE_ASSET_ENTRY = "DATATYPE_ASSET_ENTRY";
	public static final String DATATYPE_MANAGEMENT_TOOLBAR_COMPONENT_ID = "dataTypeManagementToolbar";

	public static final String DATATYPE_PORTLET_INSTANCE_CONFIGURATION =
		"DATATYPE_PORTLET_INSTANCE_CONFIGURATION";
	
	public static final String SEARCH_CONTAINER_ID="searchedDataTypesContainer";
	public static final String DEFAULT_SEARCH_CONTAINER_EVENT_NAME="defaultSearchContainerEventName";
	
	public static final String DATATYPE_API_SYMBOLIC_NAME="com.sx.icecap.datatype.api";
	public static final String DATATYPE_SERVICE_SYMBOLIC_NAME="com.sx.icecap.datatype.service";
	public static final String DATA_MARKET_SYMBOLIC_NAME="com.sx.datamarket.web";
	
	public static final String ASC = "asc";
	public static final String DESC = "desc";
	
	public static final String NAVIGATION_ALL = "all";
	public static final String NAVIGATION_MINE = "mine";
	public static final String NAVIGATION_GROUP = "group";
	public static final String NAVIGATION_GROUP_MINE = "groupMine";
	
	public static final String VIEW_TYPE_LIST = "descriptive";
	public static final String VIEW_TYPE_CARDS = "icon";
	public static final String VIEW_TYPE_TABLE = "table";
	
	public static final String DATATYPE_MANAGEMENT_JSP_ROOT = "/html/DataTypeManagement";
	public static final String JSP_DATATYPE_LIST_VIEW = "/html/DataTypeManagement/datatype-list.jsp";
	public static final String JSP_DATATYPE_EDIT = "/html/DataTypeManagement/edit-datatype.jsp";
	public static final String JSP_DATATYPE_DEFINE_STRUTURE = "/html/DataTypeManagement/define-data-structure.jsp";
	public static final String JSP_DATATYPE_VIEW = "/html/DataTypeManagement/asset/full_content.jsp";
	public static final String JSP_DATATYPE_SEARCH_VIEW = "/html/DataTypeManagement/view-search-datatypes.jsp";
	public static final String JSP_DATATYPE_ACTIONS = "/html/DataTypeManagement/datatype-actions.jsp";

	public static final String DEFAULT_CMD = "add";
	public static final String RENDER_TERM = "renderTerm";
	public static final String RENDER_DATATYPE = "renderDataType";
	public static final String CMD_REDIRECT_TO_DEFINE_STRUCTURE = "redirectToDefineStructure";
	
	public static final String LIST_DISPLAY_STYLE_SELECT = "select";
	public static final String LIST_DISPLAY_STYLE_RADIO = "radio";
	public static final String LIST_DISPLAY_STYLE_CHECK = "check";
	
	
	public static final String[] NAVIGATION_KEYS() {
		return new String[] { NAVIGATION_ALL, NAVIGATION_GROUP, NAVIGATION_MINE };
	}

}
