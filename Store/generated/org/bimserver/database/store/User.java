/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.bimserver.database.store;

import java.util.Date;
import org.bimserver.emf.IdEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.bimserver.database.store.User#getName <em>Name</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getPassword <em>Password</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getHasRightsOn <em>Has Rights On</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getRevisions <em>Revisions</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getState <em>State</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getCreatedOn <em>Created On</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getCreatedBy <em>Created By</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getUserType <em>User Type</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getUsername <em>Username</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getLastSeen <em>Last Seen</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getValidationToken <em>Validation Token</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getValidationTokenCreated <em>Validation Token Created</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getAttr1 <em>Attr1</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getAttr2 <em>Attr2</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getAttr3 <em>Attr3</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getRef1 <em>Ref1</em>}</li>
 *   <li>{@link org.bimserver.database.store.User#getRef2 <em>Ref2</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.bimserver.database.store.StorePackage#getUser()
 * @model
 * @extends IdEObject
 * @generated
 */
public interface User extends IdEObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.bimserver.database.store.StorePackage#getUser_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Password</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Password</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Password</em>' attribute.
	 * @see #setPassword(String)
	 * @see org.bimserver.database.store.StorePackage#getUser_Password()
	 * @model
	 * @generated
	 */
	String getPassword();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getPassword <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Password</em>' attribute.
	 * @see #getPassword()
	 * @generated
	 */
	void setPassword(String value);

	/**
	 * Returns the value of the '<em><b>Has Rights On</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.database.store.Project}.
	 * It is bidirectional and its opposite is '{@link org.bimserver.database.store.Project#getHasAuthorizedUsers <em>Has Authorized Users</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Rights On</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Rights On</em>' reference list.
	 * @see org.bimserver.database.store.StorePackage#getUser_HasRightsOn()
	 * @see org.bimserver.database.store.Project#getHasAuthorizedUsers
	 * @model opposite="hasAuthorizedUsers"
	 * @generated
	 */
	EList<Project> getHasRightsOn();

	/**
	 * Returns the value of the '<em><b>Revisions</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.database.store.Revision}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revisions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revisions</em>' reference list.
	 * @see org.bimserver.database.store.StorePackage#getUser_Revisions()
	 * @model
	 * @generated
	 */
	EList<Revision> getRevisions();

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.database.store.ObjectState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see org.bimserver.database.store.ObjectState
	 * @see #setState(ObjectState)
	 * @see org.bimserver.database.store.StorePackage#getUser_State()
	 * @model
	 * @generated
	 */
	ObjectState getState();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see org.bimserver.database.store.ObjectState
	 * @see #getState()
	 * @generated
	 */
	void setState(ObjectState value);

	/**
	 * Returns the value of the '<em><b>Created On</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created On</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created On</em>' attribute.
	 * @see #setCreatedOn(Date)
	 * @see org.bimserver.database.store.StorePackage#getUser_CreatedOn()
	 * @model
	 * @generated
	 */
	Date getCreatedOn();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getCreatedOn <em>Created On</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created On</em>' attribute.
	 * @see #getCreatedOn()
	 * @generated
	 */
	void setCreatedOn(Date value);

	/**
	 * Returns the value of the '<em><b>Created By</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Created By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Created By</em>' reference.
	 * @see #setCreatedBy(User)
	 * @see org.bimserver.database.store.StorePackage#getUser_CreatedBy()
	 * @model
	 * @generated
	 */
	User getCreatedBy();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getCreatedBy <em>Created By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Created By</em>' reference.
	 * @see #getCreatedBy()
	 * @generated
	 */
	void setCreatedBy(User value);

	/**
	 * Returns the value of the '<em><b>User Type</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.database.store.UserType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Type</em>' attribute.
	 * @see org.bimserver.database.store.UserType
	 * @see #setUserType(UserType)
	 * @see org.bimserver.database.store.StorePackage#getUser_UserType()
	 * @model
	 * @generated
	 */
	UserType getUserType();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getUserType <em>User Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Type</em>' attribute.
	 * @see org.bimserver.database.store.UserType
	 * @see #getUserType()
	 * @generated
	 */
	void setUserType(UserType value);

	/**
	 * Returns the value of the '<em><b>Username</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Username</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Username</em>' attribute.
	 * @see #setUsername(String)
	 * @see org.bimserver.database.store.StorePackage#getUser_Username()
	 * @model
	 * @generated
	 */
	String getUsername();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getUsername <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Username</em>' attribute.
	 * @see #getUsername()
	 * @generated
	 */
	void setUsername(String value);

	/**
	 * Returns the value of the '<em><b>Last Seen</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Last Seen</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Last Seen</em>' attribute.
	 * @see #setLastSeen(Date)
	 * @see org.bimserver.database.store.StorePackage#getUser_LastSeen()
	 * @model
	 * @generated
	 */
	Date getLastSeen();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getLastSeen <em>Last Seen</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Last Seen</em>' attribute.
	 * @see #getLastSeen()
	 * @generated
	 */
	void setLastSeen(Date value);

	/**
	 * Returns the value of the '<em><b>Validation Token</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Token</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Token</em>' attribute.
	 * @see #setValidationToken(String)
	 * @see org.bimserver.database.store.StorePackage#getUser_ValidationToken()
	 * @model
	 * @generated
	 */
	String getValidationToken();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getValidationToken <em>Validation Token</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Token</em>' attribute.
	 * @see #getValidationToken()
	 * @generated
	 */
	void setValidationToken(String value);

	/**
	 * Returns the value of the '<em><b>Validation Token Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Validation Token Created</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Validation Token Created</em>' attribute.
	 * @see #setValidationTokenCreated(Date)
	 * @see org.bimserver.database.store.StorePackage#getUser_ValidationTokenCreated()
	 * @model
	 * @generated
	 */
	Date getValidationTokenCreated();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getValidationTokenCreated <em>Validation Token Created</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Validation Token Created</em>' attribute.
	 * @see #getValidationTokenCreated()
	 * @generated
	 */
	void setValidationTokenCreated(Date value);

	/**
	 * Returns the value of the '<em><b>Attr1</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr1</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr1</em>' attribute.
	 * @see #setAttr1(String)
	 * @see org.bimserver.database.store.StorePackage#getUser_Attr1()
	 * @model
	 * @generated
	 */
	String getAttr1();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getAttr1 <em>Attr1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr1</em>' attribute.
	 * @see #getAttr1()
	 * @generated
	 */
	void setAttr1(String value);

	/**
	 * Returns the value of the '<em><b>Attr2</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr2</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr2</em>' attribute list.
	 * @see org.bimserver.database.store.StorePackage#getUser_Attr2()
	 * @model
	 * @generated
	 */
	EList<String> getAttr2();

	/**
	 * Returns the value of the '<em><b>Attr3</b></em>' attribute.
	 * The literals are from the enumeration {@link org.bimserver.database.store.ObjectState}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attr3</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attr3</em>' attribute.
	 * @see org.bimserver.database.store.ObjectState
	 * @see #setAttr3(ObjectState)
	 * @see org.bimserver.database.store.StorePackage#getUser_Attr3()
	 * @model
	 * @generated
	 */
	ObjectState getAttr3();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getAttr3 <em>Attr3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attr3</em>' attribute.
	 * @see org.bimserver.database.store.ObjectState
	 * @see #getAttr3()
	 * @generated
	 */
	void setAttr3(ObjectState value);

	/**
	 * Returns the value of the '<em><b>Ref1</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref1</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref1</em>' reference.
	 * @see #setRef1(Project)
	 * @see org.bimserver.database.store.StorePackage#getUser_Ref1()
	 * @model
	 * @generated
	 */
	Project getRef1();

	/**
	 * Sets the value of the '{@link org.bimserver.database.store.User#getRef1 <em>Ref1</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref1</em>' reference.
	 * @see #getRef1()
	 * @generated
	 */
	void setRef1(Project value);

	/**
	 * Returns the value of the '<em><b>Ref2</b></em>' reference list.
	 * The list contents are of type {@link org.bimserver.database.store.Project}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref2</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref2</em>' reference list.
	 * @see org.bimserver.database.store.StorePackage#getUser_Ref2()
	 * @model
	 * @generated
	 */
	EList<Project> getRef2();

} // User
