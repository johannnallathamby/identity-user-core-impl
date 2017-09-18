package org.wso2.carbon.identity.user.core.internal;

import org.apache.commons.collections.MapUtils;
import org.wso2.carbon.user.api.Permission;
import org.wso2.carbon.user.api.Properties;
import org.wso2.carbon.user.api.RealmConfiguration;
import org.wso2.carbon.user.core.UserStoreException;
import org.wso2.carbon.user.core.UserStoreManager;
import org.wso2.carbon.user.core.claim.Claim;
import org.wso2.carbon.user.core.claim.ClaimManager;
import org.wso2.carbon.user.core.tenant.Tenant;

import java.util.Date;
import java.util.Map;


/**
 * Created by johann on 6/10/17.
 */
public class IdentityUserStoreManager implements UserStoreManager {

    protected RealmConfiguration realmConfiguration;
    protected ClaimManager claimManager;
    protected int tenantId;

    IdentityUserStoreManager(RealmConfiguration realmConfiguration, ClaimManager claimManager, int tenantId) {
        this.realmConfiguration = realmConfiguration;
        this.claimManager = claimManager;
        this.tenantId = tenantId;
    }

    @Override
    public boolean authenticate(String s, Object o) throws UserStoreException {
        return "admin".equals(s) && "admin".equals(o);
    }

    @Override
    public String[] listUsers(String s, int i) throws UserStoreException {
        return new String[]{"admin"};
    }

    @Override
    public boolean isExistingUser(String s) throws UserStoreException {
        return "admin".equals(s);
    }

    @Override
    public boolean isExistingRole(String s, boolean b) throws org.wso2.carbon.user.api.UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public boolean isExistingRole(String s) throws UserStoreException {
        return "admin".equals(s);
    }

    @Override
    public String[] getRoleNames() throws UserStoreException {
        return new String[]{"admin"};
    }

    @Override
    public String[] getRoleNames(boolean b) throws UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public String[] getProfileNames(String s) throws UserStoreException {
        return new String[0];
    }

    @Override
    public String[] getRoleListOfUser(String s) throws UserStoreException {
        return "admin".equals(s) ? new String[]{"admin"} : new String[0];
    }

    @Override
    public String[] getUserListOfRole(String s) throws UserStoreException {
        return "admin".equals(s) ? new String[]{"admin"} : new String[0];
    }

    @Override
    public String getUserClaimValue(String s, String s1, String s2) throws UserStoreException {
        return null;
    }

    @Override
    public Map<String, String> getUserClaimValues(String s, String[] strings, String s1) throws UserStoreException {
        return MapUtils.EMPTY_MAP;
    }

    @Override
    public Claim[] getUserClaimValues(String s, String s1) throws UserStoreException {
        return new Claim[0];
    }

    @Override
    public String[] getAllProfileNames() throws UserStoreException {
        return new String[0];
    }

    @Override
    public boolean isReadOnly() throws UserStoreException {
        return false;
    }

    @Override
    public void addUser(String s, Object o, String[] strings, Map<String, String> map, String s1)
            throws UserStoreException {

    }

    @Override
    public void addUser(String s, Object o, String[] strings, Map<String, String> map, String s1, boolean b)
            throws UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public void updateCredential(String s, Object o, Object o1) throws UserStoreException {

    }

    @Override
    public void updateCredentialByAdmin(String s, Object o) throws UserStoreException {

    }

    @Override
    public void deleteUser(String s) throws UserStoreException {

    }

    @Override
    public void addRole(String s, String[] strings, Permission[] permissions, boolean b)
            throws org.wso2.carbon.user.api.UserStoreException {

    }

    @Override
    public void addRole(String s, String[] strings, Permission[] permissions)
            throws org.wso2.carbon.user.api.UserStoreException {

    }

    @Override
    public void deleteRole(String s) throws UserStoreException {

    }

    @Override
    public void updateUserListOfRole(String s, String[] strings, String[] strings1) throws UserStoreException {

    }

    @Override
    public void updateRoleListOfUser(String s, String[] strings, String[] strings1) throws UserStoreException {

    }

    @Override
    public void setUserClaimValue(String s, String s1, String s2, String s3) throws UserStoreException {

    }

    @Override
    public void setUserClaimValues(String s, Map<String, String> map, String s1) throws UserStoreException {

    }

    @Override
    public void deleteUserClaimValue(String s, String s1, String s2) throws UserStoreException {

    }

    @Override
    public void deleteUserClaimValues(String s, String[] strings, String s1) throws UserStoreException {

    }

    @Override
    public String[] getHybridRoles() throws UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public String[] getAllSecondaryRoles() throws UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public Date getPasswordExpirationTime(String s) throws UserStoreException {
        return null;
    }

    @Override
    public int getUserId(String s) throws UserStoreException {
        if ("admin".equals(s)) {
            return 0;
        } else {
            throw new UserStoreException("Invalid User ID");
        }
    }

    @Override
    public int getTenantId(String s) throws UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public int getTenantId() throws UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public Map<String, String> getProperties(org.wso2.carbon.user.api.Tenant tenant)
            throws org.wso2.carbon.user.api.UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public Map<String, String> getProperties(Tenant tenant) throws UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public void updateRoleName(String s, String s1) throws UserStoreException {

    }

    @Override
    public boolean isMultipleProfilesAllowed() {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public void addRememberMe(String s, String s1) throws org.wso2.carbon.user.api.UserStoreException {

    }

    @Override
    public boolean isValidRememberMeToken(String s, String s1) throws org.wso2.carbon.user.api.UserStoreException {
        return false;
    }

    @Override
    public org.wso2.carbon.user.api.ClaimManager getClaimManager() throws org.wso2.carbon.user.api.UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public boolean isSCIMEnabled() throws org.wso2.carbon.user.api.UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public Properties getDefaultUserStoreProperties() {
        return null;
    }

    @Override
    public boolean isBulkImportSupported() throws UserStoreException {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public String[] getUserList(String s, String s1, String s2) throws UserStoreException {
        return new String[0];
    }

    @Override
    public UserStoreManager getSecondaryUserStoreManager() {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public void setSecondaryUserStoreManager(UserStoreManager userStoreManager) {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public UserStoreManager getSecondaryUserStoreManager(String s) {
        return this;
    }

    @Override
    public void addSecondaryUserStoreManager(String s, UserStoreManager userStoreManager) {
        throw new IllegalAccessError("Method Not Supported");
    }

    @Override
    public RealmConfiguration getRealmConfiguration() {
        return realmConfiguration;
    }

    public boolean isUserInRole(String userName, String roleName) throws UserStoreException {
        return ("admin".equals(userName) && "admin".equals(roleName));
    }
}
