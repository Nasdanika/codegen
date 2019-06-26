package org.nasdanika.codegen.provider;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;

/**
 * Base class for item providers.
 * @author Pavel
 *
 */
public class ItemProviderAdapterBase extends ItemProviderAdapter {

	protected ItemProviderAdapterBase(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}
	
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

}
