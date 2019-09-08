/**
 */
package org.nasdanika.codegen.impl;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.nasdanika.codegen.CodegenPackage;
import org.nasdanika.codegen.ReconcileAction;
import org.nasdanika.codegen.ResourceCollection;
import org.nasdanika.codegen.util.CodegenValidator;
import org.nasdanika.common.Context;
import org.nasdanika.common.ProgressMonitor;
import org.nasdanika.common.resources.BinaryResource;

import io.github.azagniotov.matcher.AntPathMatcher;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Collection</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getPath <em>Path</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getPrefix <em>Prefix</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getIncludes <em>Includes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getExcludes <em>Excludes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getInterpolationIncludes <em>Interpolation Includes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getInterpolationExcludes <em>Interpolation Excludes</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getInterpolationCharset <em>Interpolation Charset</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getReconcileAction <em>Reconcile Action</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getMerger <em>Merger</em>}</li>
 *   <li>{@link org.nasdanika.codegen.impl.ResourceCollectionImpl#getMergerArguments <em>Merger Arguments</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ResourceCollectionImpl extends GeneratorImpl<BinaryResource> implements ResourceCollection {
	/**
	 * The default value of the '{@link #getPath() <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPath()
	 * @generated
	 * @ordered
	 */
	protected static final String PATH_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getPrefix() <em>Prefix</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrefix()
	 * @generated
	 * @ordered
	 */
	protected static final String PREFIX_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getInterpolationCharset() <em>Interpolation Charset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterpolationCharset()
	 * @generated
	 * @ordered
	 */
	protected static final String INTERPOLATION_CHARSET_EDEFAULT = "";

	/**
	 * The default value of the '{@link #getReconcileAction() <em>Reconcile Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReconcileAction()
	 * @generated
	 * @ordered
	 */
	protected static final ReconcileAction RECONCILE_ACTION_EDEFAULT = ReconcileAction.OVERWRITE;

	/**
	 * The default value of the '{@link #getMerger() <em>Merger</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMerger()
	 * @generated
	 * @ordered
	 */
	protected static final String MERGER_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResourceCollectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CodegenPackage.Literals.RESOURCE_COLLECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPath() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__PATH, CodegenPackage.Literals.RESOURCE_COLLECTION__PATH, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPath(String newPath) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__PATH, CodegenPackage.Literals.RESOURCE_COLLECTION__PATH, newPath);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPrefix() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__PREFIX, CodegenPackage.Literals.RESOURCE_COLLECTION__PREFIX, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPrefix(String newPrefix) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__PREFIX, CodegenPackage.Literals.RESOURCE_COLLECTION__PREFIX, newPrefix);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getIncludes() {
		return (EList<String>)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getExcludes() {
		return (EList<String>)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__EXCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__EXCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getInterpolationIncludes() {
		return (EList<String>)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getInterpolationExcludes() {
		return (EList<String>)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getInterpolationCharset() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_CHARSET, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setInterpolationCharset(String newInterpolationCharset) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET, CodegenPackage.Literals.RESOURCE_COLLECTION__INTERPOLATION_CHARSET, newInterpolationCharset);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ReconcileAction getReconcileAction() {
		return (ReconcileAction)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION, CodegenPackage.Literals.RESOURCE_COLLECTION__RECONCILE_ACTION, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReconcileAction(ReconcileAction newReconcileAction) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION, CodegenPackage.Literals.RESOURCE_COLLECTION__RECONCILE_ACTION, newReconcileAction);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getMerger() {
		return (String)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__MERGER, CodegenPackage.Literals.RESOURCE_COLLECTION__MERGER, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setMerger(String newMerger) {
		eDynamicSet(CodegenPackage.RESOURCE_COLLECTION__MERGER, CodegenPackage.Literals.RESOURCE_COLLECTION__MERGER, newMerger);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public EList<String> getMergerArguments() {
		return (EList<String>)eDynamicGet(CodegenPackage.RESOURCE_COLLECTION__MERGER_ARGUMENTS, CodegenPackage.Literals.RESOURCE_COLLECTION__MERGER_ARGUMENTS, true, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CodegenPackage.RESOURCE_COLLECTION__PATH:
				return getPath();
			case CodegenPackage.RESOURCE_COLLECTION__PREFIX:
				return getPrefix();
			case CodegenPackage.RESOURCE_COLLECTION__INCLUDES:
				return getIncludes();
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				return getExcludes();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				return getInterpolationIncludes();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				return getInterpolationExcludes();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET:
				return getInterpolationCharset();
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
				return getReconcileAction();
			case CodegenPackage.RESOURCE_COLLECTION__MERGER:
				return getMerger();
			case CodegenPackage.RESOURCE_COLLECTION__MERGER_ARGUMENTS:
				return getMergerArguments();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CodegenPackage.RESOURCE_COLLECTION__PATH:
				setPath((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__PREFIX:
				setPrefix((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INCLUDES:
				getIncludes().clear();
				getIncludes().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				getExcludes().clear();
				getExcludes().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				getInterpolationIncludes().clear();
				getInterpolationIncludes().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				getInterpolationExcludes().clear();
				getInterpolationExcludes().addAll((Collection<? extends String>)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET:
				setInterpolationCharset((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
				setReconcileAction((ReconcileAction)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__MERGER:
				setMerger((String)newValue);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__MERGER_ARGUMENTS:
				getMergerArguments().clear();
				getMergerArguments().addAll((Collection<? extends String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CodegenPackage.RESOURCE_COLLECTION__PATH:
				setPath(PATH_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__PREFIX:
				setPrefix(PREFIX_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INCLUDES:
				getIncludes().clear();
				return;
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				getExcludes().clear();
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				getInterpolationIncludes().clear();
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				getInterpolationExcludes().clear();
				return;
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET:
				setInterpolationCharset(INTERPOLATION_CHARSET_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
				setReconcileAction(RECONCILE_ACTION_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__MERGER:
				setMerger(MERGER_EDEFAULT);
				return;
			case CodegenPackage.RESOURCE_COLLECTION__MERGER_ARGUMENTS:
				getMergerArguments().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CodegenPackage.RESOURCE_COLLECTION__PATH:
				return PATH_EDEFAULT == null ? getPath() != null : !PATH_EDEFAULT.equals(getPath());
			case CodegenPackage.RESOURCE_COLLECTION__PREFIX:
				return PREFIX_EDEFAULT == null ? getPrefix() != null : !PREFIX_EDEFAULT.equals(getPrefix());
			case CodegenPackage.RESOURCE_COLLECTION__INCLUDES:
				return !getIncludes().isEmpty();
			case CodegenPackage.RESOURCE_COLLECTION__EXCLUDES:
				return !getExcludes().isEmpty();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_INCLUDES:
				return !getInterpolationIncludes().isEmpty();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_EXCLUDES:
				return !getInterpolationExcludes().isEmpty();
			case CodegenPackage.RESOURCE_COLLECTION__INTERPOLATION_CHARSET:
				return INTERPOLATION_CHARSET_EDEFAULT == null ? getInterpolationCharset() != null : !INTERPOLATION_CHARSET_EDEFAULT.equals(getInterpolationCharset());
			case CodegenPackage.RESOURCE_COLLECTION__RECONCILE_ACTION:
				return getReconcileAction() != RECONCILE_ACTION_EDEFAULT;
			case CodegenPackage.RESOURCE_COLLECTION__MERGER:
				return MERGER_EDEFAULT == null ? getMerger() != null : !MERGER_EDEFAULT.equals(getMerger());
			case CodegenPackage.RESOURCE_COLLECTION__MERGER_ARGUMENTS:
				return !getMergerArguments().isEmpty();
		}
		return super.eIsSet(featureID);
	}
	
	/**
	 * @param path
	 * @return true if this path shall be included into the resource collection.
	 */
	protected boolean include(String path) {
		AntPathMatcher.Builder builder = new AntPathMatcher.Builder();
		AntPathMatcher matcher = builder.build();
		EList<String> includes = getIncludes();
		boolean included = includes.isEmpty(); 
		for (String pattern: includes) {
			if (matcher.isMatch(pattern, path)) {
				included = true;
				break;
			}
		}
		if (included) {
			for (String pattern: getExcludes()) {
				if (matcher.isMatch(pattern, path)) {
					included = false;
					break;
				}
			}
		}
		return included;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	@Override
	public boolean validate(DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = super.validate(diagnostics, context);
		if (diagnostics != null) {			
			if (ReconcileAction.MERGE == getReconcileAction() && getMerger() == null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 CodegenValidator.DIAGNOSTIC_SOURCE,
						 CodegenValidator.GENERATOR__VALIDATE,
						 "["+EObjectValidator.getObjectLabel(this, context)+"] Reconcile action is 'Merge' and merger is not set",
						 new Object [] { this, CodegenPackage.Literals.RESOURCE_COLLECTION__MERGER }));
				
				result = false;
			}
		}
		return result;
	}	
	
	/**
	 * @param path
	 * @return true if the resource shall be interpolated.
	 */
	protected boolean shouldInterpolate(String path) {
		System.out.println("*** Debugging, should interpolate: " + path+" "+getInterpolationIncludes()+", "+getInterpolationExcludes());
		AntPathMatcher.Builder builder = new AntPathMatcher.Builder();
		AntPathMatcher matcher = builder.build();
		boolean interpolate = false; 
		for (String pattern: getInterpolationIncludes()) {
			System.out.println("*** Debugging, matching: "+pattern+" --- "+ path);
			if (matcher.isMatch(pattern, path)) {
				interpolate = true;
				break;
			}
		}
		if (interpolate) {
			for (String pattern: getInterpolationExcludes()) {
				if (matcher.isMatch(pattern, path)) {
					return false;
				}
			}
		}
		return interpolate;		
	}
	
	/**
	 * Interpolates input stream if path matches interpolation includes and does not match interpolation exculdes.
	 * @param path
	 * @param contents
	 * @return
	 */
	protected InputStream interpolate(Context context, String path, InputStream in, ProgressMonitor progressMonitor) throws Exception {
		if (shouldInterpolate(path)) {
			StringWriter sw = new StringWriter();
			String charset = getInterpolationCharset();
			try (Reader reader = new BufferedReader(charset==null || charset.trim().length()==0 ? new InputStreamReader(in) : new InputStreamReader(in, charset))) {
				int ch;
				while ((ch = reader.read()) != -1) {
					sw.write(ch);
				}
			}
			sw.close();
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			try (Writer writer = charset==null || charset.trim().length()==0 ? new OutputStreamWriter(baos) : new OutputStreamWriter(baos, charset)) {
				String str = sw.toString();
				String interpolatedStr = context.interpolate(str);
				progressMonitor.worked(1, "Interpolated", str, interpolatedStr);
				writer.write(interpolatedStr);
			}
			baos.close();
			return new ByteArrayInputStream(baos.toByteArray());						
		}
		return in;
	}
	
} //ResourceCollectionImpl
