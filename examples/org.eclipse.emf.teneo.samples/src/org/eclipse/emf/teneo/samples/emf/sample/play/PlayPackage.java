/**
 * <copyright>
 * </copyright>
 *
 * $Id: PlayPackage.java,v 1.1 2006/07/11 16:57:04 mtaal Exp $
 */
package org.eclipse.emf.teneo.samples.emf.sample.play;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayFactory
 * @model kind="package"
 * @generated
 */
public interface PlayPackage extends EPackage{
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "play";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/emf/teneo/samples/emf/sample/play";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "play";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PlayPackage eINSTANCE = org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.ActTypeImpl <em>Act Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.ActTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl#getActType()
	 * @generated
	 */
	int ACT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_TYPE__SCENE = 0;

	/**
	 * The feature id for the '<em><b>Pindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_TYPE__PINDEX = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_TYPE__TITLE = 2;

	/**
	 * The number of structural features of the the '<em>Act Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.DocumentRootImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Act</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ACT = 3;

	/**
	 * The feature id for the '<em><b>Fm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FM = 4;

	/**
	 * The feature id for the '<em><b>Group Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__GROUP_DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINE = 6;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__P = 7;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSONA = 8;

	/**
	 * The feature id for the '<em><b>Personae</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSONAE = 9;

	/**
	 * The feature id for the '<em><b>Persona Group</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PERSONA_GROUP = 10;

	/**
	 * The feature id for the '<em><b>Play</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAY = 11;

	/**
	 * The feature id for the '<em><b>Play Sub Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PLAY_SUB_TITLE = 12;

	/**
	 * The feature id for the '<em><b>Scene</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCENE = 13;

	/**
	 * The feature id for the '<em><b>Scene Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SCENE_DESCRIPTION = 14;

	/**
	 * The feature id for the '<em><b>Speaker</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPEAKER = 15;

	/**
	 * The feature id for the '<em><b>Speech</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SPEECH = 16;

	/**
	 * The feature id for the '<em><b>Stage Directions</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STAGE_DIRECTIONS = 17;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 18;

	/**
	 * The number of structural features of the the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.FmTypeImpl <em>Fm Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.FmTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl#getFmType()
	 * @generated
	 */
	int FM_TYPE = 2;

	/**
	 * The feature id for the '<em><b>P</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FM_TYPE__P = 0;

	/**
	 * The number of structural features of the the '<em>Fm Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaeTypeImpl <em>Personae Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaeTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl#getPersonaeType()
	 * @generated
	 */
	int PERSONAE_TYPE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAE_TYPE__PERSONA = 2;

	/**
	 * The feature id for the '<em><b>Persona Group</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAE_TYPE__PERSONA_GROUP = 3;

	/**
	 * The number of structural features of the the '<em>Personae Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONAE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaGroupTypeImpl <em>Persona Group Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PersonaGroupTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl#getPersonaGroupType()
	 * @generated
	 */
	int PERSONA_GROUP_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Persona</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_GROUP_TYPE__PERSONA = 0;

	/**
	 * The feature id for the '<em><b>Group Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_GROUP_TYPE__GROUP_DESCRIPTION = 1;

	/**
	 * The number of structural features of the the '<em>Persona Group Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONA_GROUP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayTypeImpl <em>Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl#getPlayType()
	 * @generated
	 */
	int PLAY_TYPE = 5;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Fm</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE__FM = 1;

	/**
	 * The feature id for the '<em><b>Personae</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE__PERSONAE = 2;

	/**
	 * The feature id for the '<em><b>Scene Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE__SCENE_DESCRIPTION = 3;

	/**
	 * The feature id for the '<em><b>Play Sub Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE__PLAY_SUB_TITLE = 4;

	/**
	 * The feature id for the '<em><b>Act</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE__ACT = 5;

	/**
	 * The number of structural features of the the '<em>Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PLAY_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SceneTypeImpl <em>Scene Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.SceneTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl#getSceneType()
	 * @generated
	 */
	int SCENE_TYPE = 6;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Stage Directions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__STAGE_DIRECTIONS = 1;

	/**
	 * The feature id for the '<em><b>Speech</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__SPEECH = 2;

	/**
	 * The feature id for the '<em><b>Pindex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__PINDEX = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE__TITLE = 4;

	/**
	 * The number of structural features of the the '<em>Scene Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCENE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.teneo.samples.emf.sample.play.impl.SpeechTypeImpl <em>Speech Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.SpeechTypeImpl
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl#getSpeechType()
	 * @generated
	 */
	int SPEECH_TYPE = 7;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Speaker</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_TYPE__SPEAKER = 1;

	/**
	 * The feature id for the '<em><b>Line</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_TYPE__LINE = 2;

	/**
	 * The feature id for the '<em><b>Stage Directions</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_TYPE__STAGE_DIRECTIONS = 3;

	/**
	 * The number of structural features of the the '<em>Speech Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPEECH_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '<em>Pindex Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.impl.PlayPackageImpl#getPindexType()
	 * @generated
	 */
	int PINDEX_TYPE = 8;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType <em>Act Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Act Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.ActType
	 * @generated
	 */
	EClass getActType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scene</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getScene()
	 * @see #getActType()
	 * @generated
	 */
	EReference getActType_Scene();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getPindex <em>Pindex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pindex</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getPindex()
	 * @see #getActType()
	 * @generated
	 */
	EAttribute getActType_Pindex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.ActType#getTitle()
	 * @see #getActType()
	 * @generated
	 */
	EAttribute getActType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Act</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getAct()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Act();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getFm <em>Fm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fm</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getFm()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Fm();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getGroupDescription <em>Group Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getGroupDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_GroupDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Line</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getLine()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Line();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>P</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getP()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_P();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Persona</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersona()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Persona();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersonae <em>Personae</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personae</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersonae()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Personae();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersonaGroup <em>Persona Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Persona Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPersonaGroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_PersonaGroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPlay <em>Play</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Play</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPlay()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Play();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPlaySubTitle <em>Play Sub Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Play Sub Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getPlaySubTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_PlaySubTitle();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getScene <em>Scene</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Scene</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getScene()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Scene();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSceneDescription <em>Scene Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSceneDescription()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_SceneDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSpeaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Speaker</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSpeaker()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Speaker();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSpeech <em>Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Speech</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getSpeech()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Speech();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getStageDirections <em>Stage Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Stage Directions</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getStageDirections()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_StageDirections();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.play.FmType <em>Fm Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fm Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.FmType
	 * @generated
	 */
	EClass getFmType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.FmType#getP <em>P</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>P</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.FmType#getP()
	 * @see #getFmType()
	 * @generated
	 */
	EAttribute getFmType_P();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType <em>Personae Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personae Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType
	 * @generated
	 */
	EClass getPersonaeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getGroup()
	 * @see #getPersonaeType()
	 * @generated
	 */
	EAttribute getPersonaeType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getTitle()
	 * @see #getPersonaeType()
	 * @generated
	 */
	EAttribute getPersonaeType_Title();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Persona</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getPersona()
	 * @see #getPersonaeType()
	 * @generated
	 */
	EAttribute getPersonaeType_Persona();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getPersonaGroup <em>Persona Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Persona Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PersonaeType#getPersonaGroup()
	 * @see #getPersonaeType()
	 * @generated
	 */
	EReference getPersonaeType_PersonaGroup();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType <em>Persona Group Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persona Group Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType
	 * @generated
	 */
	EClass getPersonaGroupType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType#getPersona <em>Persona</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Persona</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType#getPersona()
	 * @see #getPersonaGroupType()
	 * @generated
	 */
	EAttribute getPersonaGroupType_Persona();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType#getGroupDescription <em>Group Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Group Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PersonaGroupType#getGroupDescription()
	 * @see #getPersonaGroupType()
	 * @generated
	 */
	EAttribute getPersonaGroupType_GroupDescription();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayType
	 * @generated
	 */
	EClass getPlayType();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getTitle()
	 * @see #getPlayType()
	 * @generated
	 */
	EAttribute getPlayType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getFm <em>Fm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fm</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getFm()
	 * @see #getPlayType()
	 * @generated
	 */
	EReference getPlayType_Fm();

	/**
	 * Returns the meta object for the containment reference '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getPersonae <em>Personae</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personae</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getPersonae()
	 * @see #getPlayType()
	 * @generated
	 */
	EReference getPlayType_Personae();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getSceneDescription <em>Scene Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scene Description</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getSceneDescription()
	 * @see #getPlayType()
	 * @generated
	 */
	EAttribute getPlayType_SceneDescription();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getPlaySubTitle <em>Play Sub Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Play Sub Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getPlaySubTitle()
	 * @see #getPlayType()
	 * @generated
	 */
	EAttribute getPlayType_PlaySubTitle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getAct <em>Act</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Act</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.PlayType#getAct()
	 * @see #getPlayType()
	 * @generated
	 */
	EReference getPlayType_Act();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType <em>Scene Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Scene Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SceneType
	 * @generated
	 */
	EClass getSceneType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getGroup()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getStageDirections <em>Stage Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stage Directions</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getStageDirections()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_StageDirections();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getSpeech <em>Speech</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Speech</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getSpeech()
	 * @see #getSceneType()
	 * @generated
	 */
	EReference getSceneType_Speech();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getPindex <em>Pindex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pindex</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getPindex()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Pindex();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Title</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SceneType#getTitle()
	 * @see #getSceneType()
	 * @generated
	 */
	EAttribute getSceneType_Title();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType <em>Speech Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Speech Type</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType
	 * @generated
	 */
	EClass getSpeechType();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getGroup()
	 * @see #getSpeechType()
	 * @generated
	 */
	EAttribute getSpeechType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getSpeaker <em>Speaker</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Speaker</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getSpeaker()
	 * @see #getSpeechType()
	 * @generated
	 */
	EAttribute getSpeechType_Speaker();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getLine <em>Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Line</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getLine()
	 * @see #getSpeechType()
	 * @generated
	 */
	EAttribute getSpeechType_Line();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getStageDirections <em>Stage Directions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Stage Directions</em>'.
	 * @see org.eclipse.emf.teneo.samples.emf.sample.play.SpeechType#getStageDirections()
	 * @see #getSpeechType()
	 * @generated
	 */
	EAttribute getSpeechType_StageDirections();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Pindex Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Pindex Type</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 *        extendedMetaData="name='pindex_._type' baseType='http://www.eclipse.org/emf/2003/XMLType#NMTOKEN' enumeration='1 2'" 
	 * @generated
	 */
	EDataType getPindexType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PlayFactory getPlayFactory();

} //PlayPackage
