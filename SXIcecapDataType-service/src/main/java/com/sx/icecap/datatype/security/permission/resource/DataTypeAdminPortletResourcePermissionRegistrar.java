package com.sx.icecap.datatype.security.permission.resource;

import com.liferay.exportimport.kernel.staging.permission.StagingPermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermission;
import com.liferay.portal.kernel.security.permission.resource.PortletResourcePermissionFactory;
import com.liferay.portal.kernel.security.permission.resource.StagedPortletPermissionLogic;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.sx.icecap.datatype.constants.IcecapDataTypeConstants;
import com.sx.icecap.datatype.constants.IcecapDataTypeWebPortletKeys;

import java.util.Dictionary;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component (
		immediate=true
)
public class DataTypeAdminPortletResourcePermissionRegistrar {
	
	private ServiceRegistration<PortletResourcePermission> _serviceRegistration;
	
	@Reference
	private StagingPermission _stagingPermission;
	
	@Activate
	public void activate(BundleContext bundleContext) {
		
		Dictionary<String, Object> properties = new HashMapDictionary<>();

		properties.put("resource.name", IcecapDataTypeConstants.RESOURCE_NAME);

		_serviceRegistration = bundleContext.registerService(
				PortletResourcePermission.class,
				PortletResourcePermissionFactory.create(
						IcecapDataTypeConstants.RESOURCE_NAME,
						new StagedPortletPermissionLogic(
								_stagingPermission, 
								IcecapDataTypeWebPortletKeys.DATATYPE_MANAGEMENT)),
				properties);
		
	};
		
	@Deactivate
	public void deactivate() {
		_serviceRegistration.unregister();
	}
}
