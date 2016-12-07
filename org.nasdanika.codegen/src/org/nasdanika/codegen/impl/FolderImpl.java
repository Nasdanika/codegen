/**
 */
package org.nasdanika.codegen.impl;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.resources.IContainer;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.CodegenUtil;
import org.nasdanika.codegen.Context;
import org.nasdanika.codegen.Folder;
import org.nasdanika.codegen.MutableContext;
import org.nasdanika.codegen.Resource;
import org.nasdanika.codegen.Work;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Folder</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.FolderImpl#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FolderImpl extends ResourceImpl<IFolder> implements Folder {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FolderImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.FOLDER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Resource<IResource>> getChildren() {
		return (EList<Resource<IResource>>)eGet(CodegenPackage.Literals.FOLDER__CHILDREN, true);
	}

	@Override
	public Work<IFolder> createWorkItem() throws Exception {
		List<Work<List<IResource>>> rWork = new ArrayList<>();
		int[] workSize = { 1 };
		for (Resource<IResource> r: getChildren()) {
			Work<List<IResource>> rw = r.createWork();
			workSize[0] += rw.size();
			rWork.add(rw);
		}
		
		return new Work<IFolder>() {

			@Override
			public int size() {
				return workSize[0];
			}

			@Override
			public IFolder execute(Context context, SubMonitor monitor) throws Exception {
				IContainer container = context.get(IContainer.class);
				String name = CodegenUtil.interpolate(getName(), context);
				IFolder folder = CodegenUtil.createFolder(container, name, monitor);
				MutableContext sc = context.createSubContext().set(IContainer.class, folder);
				for (Work<List<IResource>> rw: rWork) {
					rw.execute(sc, monitor);
				}
				return folder;
			}
		};
	}

} //FolderImpl
